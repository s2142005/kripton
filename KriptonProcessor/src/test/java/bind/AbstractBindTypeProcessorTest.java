package bind;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import com.abubusoft.kripton.BinderType;
import com.abubusoft.kripton.KriptonBinder;
import com.abubusoft.kripton.KriptonCborContext;
import com.abubusoft.kripton.KriptonPropertiesContext;
import com.abubusoft.kripton.KriptonXmlContext;
import com.abubusoft.kripton.KriptonYamlContext;
import com.abubusoft.kripton.common.KriptonByteArrayOutputStream;

import base.BaseProcessorTest;
import edu.emory.mathcs.backport.java.util.Arrays;

public class AbstractBindTypeProcessorTest extends BaseProcessorTest {

	@Before
	public void setup() {
		KriptonBinder.registryBinder(new KriptonYamlContext());
		KriptonBinder.registryBinder(new KriptonPropertiesContext());
		KriptonBinder.registryBinder(new KriptonXmlContext());
		KriptonBinder.registryBinder(new KriptonCborContext());
		
		if (developmentMode) {
			testType = TestType.PREPARE_TEST_JAVA_LIBRARY;
			destinationPath = PathSourceType.DEST_TEST_JAVA_LIBRARY;
		} else {
			testType = TestType.NONE;
		}
	}

	protected void check(Object bean, BinderType... checks) {
		int max = 0;
		int[] values = new int[BinderType.values().length];

		boolean all = false;
		@SuppressWarnings("unchecked")
		List<BinderType> checkList = Arrays.asList(checks);
		if (checks.length == 0)
			all = true;

		int i = 0;
		for (BinderType checkType : BinderType.values()) {
			if (all || checkList.contains(checkType)) {
				if (checkType == BinderType.CBOR) {
					values[i] = serializeAndParseBinary(bean, checkType);
				} else {
					values[i] = serializeAndParse(bean, checkType);
				}
				max = Math.max(max, values[i]);
				i++;
			}
		}

		i = 0;
		for (BinderType checkType : BinderType.values()) {
			if (all || checkList.contains(checkType)) {
				if (developmentMode)
					System.out.print(String.format("%s: %s bytes (%.0f%%) ", checkType.toString(), values[i], values[i] * 100.0 / max));
				i++;
			}
		}

		if (developmentMode)
			System.out.println();
	}

	protected <E> void checkCollection(Collection<E> collection, Class<E> beanClazz, BinderType... checks) {
		int max = 0;
		int[] values = new int[BinderType.values().length];

		boolean all = false;
		@SuppressWarnings("unchecked")
		List<BinderType> checkList = Arrays.asList(checks);
		if (checks.length == 0)
			all = true;

		int i = 0;
		for (BinderType checkType : BinderType.values()) {
			if (all || checkList.contains(checkType)) {
				if (checkType == BinderType.CBOR) {
					values[i] = serializeAndParseCollectionBinary(collection, beanClazz, checkType);
				} else {
					values[i] = serializeAndParseCollection(collection, beanClazz, checkType);
				}
				max = Math.max(max, values[i]);
				i++;
			}
		}

		i = 0;
		for (BinderType checkType : BinderType.values()) {
			if (all || checkList.contains(checkType)) {
				if (developmentMode)
					System.out.print(String.format("%s: %s bytes (%.0f%%) ", checkType.toString(), values[i], values[i] * 100.0 / max));
				i++;
			}
		}

		if (developmentMode)
			System.out.println();
	}

	/**
	 * @param bean
	 * @param type
	 * @return
	 */
	public int serializeAndParse(Object bean, BinderType type) {
		String output1 = KriptonBinder.getBinder(type).serialize(bean);
		if (developmentMode)
			System.out.println(output1);

		Object bean2 = KriptonBinder.getBinder(type).parse(output1, bean.getClass());

		String output2 = KriptonBinder.getBinder(type).serialize(bean2);
		if (developmentMode)
			System.out.println(output2);

		Assert.assertTrue(type.toString(), output1.length() == output2.length());

		ReflectionAssert.assertReflectionEquals(bean, bean2, ReflectionComparatorMode.LENIENT_ORDER);

		return output2.length();
	}

	public <E> int serializeAndParseCollection(Collection<E> list, Class<E> clazz, BinderType type) {
		String value1 = KriptonBinder.getBinder(type).serializeCollection(list, clazz);
		Collection<E> list2 = KriptonBinder.getBinder(type).parseCollection(new ArrayList<E>(), clazz, value1);

		String value2 = KriptonBinder.getBinder(type).serializeCollection(list2, clazz);

		if (developmentMode)
			System.out.println(value1);
		if (developmentMode)
			System.out.println(value2);
		//
		Assert.assertTrue(value1.length() == value2.length());
		ReflectionAssert.assertReflectionEquals(type.toString(), list, list2, ReflectionComparatorMode.LENIENT_ORDER);
		//
		return value1.length();
	}

	public <E> int serializeAndParseCollectionBinary(Collection<E> list, Class<E> clazz, BinderType type) {
		KriptonByteArrayOutputStream bar = new KriptonByteArrayOutputStream();
		KriptonBinder.getBinder(type).serializeCollection(list, clazz, bar);
		String value1 = toString(bar.getByteBuffer());

		Collection<E> list2 = KriptonBinder.getBinder(type).parseCollection(new ArrayList<E>(), clazz, bar.getByteBufferCopy());

		KriptonByteArrayOutputStream bar2 = new KriptonByteArrayOutputStream();
		KriptonBinder.getBinder(type).serializeCollection(list2, clazz, bar2);
		String value2 = toString(bar2.getByteBuffer());

		if (developmentMode)
			System.out.println(value1);
		if (developmentMode)
			System.out.println(value2);

		Assert.assertTrue(value1.length() == value2.length());
		ReflectionAssert.assertReflectionEquals(type.toString(), list, list2, ReflectionComparatorMode.LENIENT_ORDER);
		//
		return bar.getCount();
	}

	public int serializeAndParseBinary(Object bean, BinderType type) {
		KriptonByteArrayOutputStream bar = new KriptonByteArrayOutputStream();
		KriptonBinder.getBinder(type).serialize(bean, bar);
		String value1 = toString(bar.getByteBuffer());

		if (developmentMode)
			System.out.println(value1);
		Object bean2 = KriptonBinder.getBinder(type).parse(new ByteArrayInputStream(bar.getByteBuffer()), bean.getClass());

		KriptonByteArrayOutputStream bar2 = new KriptonByteArrayOutputStream();
		KriptonBinder.getBinder(type).serialize(bean2, bar2);
		String value2 = toString(bar2.getByteBuffer());
		if (developmentMode)
			System.out.println(value2);

		Assert.assertTrue(value1.length() == value2.length());
		// ReflectionAssert.assertReflectionEquals(type.toString(), bean,
		// bean2);

		return bar.getCount();
	}

	String toString(byte[] input) {
		StringBuilder buffer = new StringBuilder();
		for (int j = 0; j < input.length; j++) {
			buffer.append(String.format("%02X", input[j]));
		}
		return buffer.toString();
	}
}
