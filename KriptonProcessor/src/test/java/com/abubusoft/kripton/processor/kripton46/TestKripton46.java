package com.abubusoft.kripton.processor.kripton46;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.abubusoft.kripton.processor.BaseProcessorTest;

@RunWith(JUnit4.class)
public class TestKripton46 extends BaseProcessorTest {

	/**
	 * No @BindType is put in bean definition
	 * 
	 * @throws IOException
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test
	public void testNoDao() throws IOException, InstantiationException, IllegalAccessException {
		buildDataSourceProcessorTest(AppPreferences.class, UserAccessToken.class);
	}

}
