package com.abubusoft.kripton.processor.sqlite.transform;

import static com.abubusoft.kripton.processor.core.reflect.PropertyUtility.setter;

import com.abubusoft.kripton.processor.core.ModelProperty;
import com.squareup.javapoet.MethodSpec.Builder;


/**
 * Transformer between a base64 encoded string and a byte[]
 * 
 * @author bulldog
 *
 */
public class ByteArrayTransform extends AbstractCompileTimeTransform {

	@Override
	public void generateReadProperty(Builder methodBuilder, ModelProperty property, String beanName, String cursorName, String indexName) {
		methodBuilder.addCode("$L."+setter(property, "$L.getBlob($L)"), beanName,cursorName, indexName);			
	}
	
	@Override
	public void generateRead(Builder methodBuilder, String cursorName, String indexName) {
		methodBuilder.addCode("$L.getBlob($L)", cursorName, indexName);		
	}
	
	@Override
	public void generateDefaultValue(Builder methodBuilder)
	{
		methodBuilder.addCode("null");		
	}

	@Override
	public void generateResetProperty(Builder methodBuilder, ModelProperty property, String beanName, String cursorName, String indexName) {
		methodBuilder.addCode("$L."+setter(property, "null"), beanName);
	}
	
	@Override
	public String generateColumnType(ModelProperty property) {
		return "BLOB";
	}

}
