package com.base;

import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.helper.ConfigUtils;

public class BaseApiTest {
	
	protected String endpoint;
	@BeforeSuite
	public void beforeSuite()
	{
		Properties prop=ConfigUtils.loadproperties("config.properties");
		endpoint=prop.getProperty("TSurl");
	}
	

}
