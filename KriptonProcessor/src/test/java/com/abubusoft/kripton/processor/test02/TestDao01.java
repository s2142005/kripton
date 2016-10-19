package com.abubusoft.kripton.processor.test02;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.abubusoft.kripton.processor.BaseProcessorTest;

/**
 * @author xcesco
 *
 */
@RunWith(JUnit4.class)
public class TestDao01 extends BaseProcessorTest {

	/**
	 *  No DAO definition with @BindDaoDefinition annotation was found for class Dummy01DatabaseSchema with @BindDatabaseSchema annotation
	 * 
	 * @throws IOException
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test(expected = AssertionError.class)
	public void test01() throws IOException, InstantiationException, IllegalAccessException {
		buildDataSourceProcessorTest(Dummy01Database.class, Bean01.class);
	}
	
	/**
	 *  Class %s: only interfaces can be annotated with @%s annotation
	 * 
	 * @throws IOException
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test(expected = AssertionError.class)
	public void test02() throws IOException, InstantiationException, IllegalAccessException {
		buildDataSourceProcessorTest(Dummy02Database.class, Bean02.class, DaoBean02.class);
	}
	
	/**
	 *  InvalidSQLDaoDefinitionException: In class DaoBean03 is used @SQLDao annotation for unmanaged bean type com.abubusoft.kripton.processor.test02.Bean03B.
	 * 
	 * @throws IOException
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test(expected = AssertionError.class)
	public void test03() throws IOException, InstantiationException, IllegalAccessException {
		buildDataSourceProcessorTest(Dummy03Database.class, Bean03A.class, DaoBean03.class);
	}
	
	/**
	 * Dao definition DaoBean04 contains no methods to bind with queries
	 * 
	 * @throws IOException
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test(expected = AssertionError.class)
	public void test04() throws IOException, InstantiationException, IllegalAccessException {
		buildDataSourceProcessorTest(Dummy04Database.class, Bean04.class, DaoBean04.class);
	}
	
	/**
	 * Method 'notWorking' of class 'DaoBean05' is not marked with any valid annotation
	 * 
	 * @throws IOException
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test(expected = AssertionError.class)
	public void test05() throws IOException, InstantiationException, IllegalAccessException {
		buildDataSourceProcessorTest(Dummy05Database.class, Bean05.class, DaoBean05.class);
	}


}
