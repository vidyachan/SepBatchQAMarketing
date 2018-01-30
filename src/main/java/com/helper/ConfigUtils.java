package com.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.internal.Constants;

public class ConfigUtils {
	
	public static Properties loadproperties(String filename)
	{
		Properties prop=new Properties();
		try{
			prop.load(new FileInputStream(Constans.path+filename));
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return prop;
	}

}
