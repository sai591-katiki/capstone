package com.Magento.Browser;

import java.io.FileReader;
import java.util.Properties;

public class Utility {
	/*
	 *    method to Reads data from properties file and returns data 
	 */
	public static String properties(String data) throws Exception {
		
		String propertiesData = null;
		try {
			String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Browser.properties";
			FileReader reader = new FileReader(filePath);
			Properties p = new Properties();
			p.load(reader);
			propertiesData = p.getProperty(data);   
		} catch (Exception e) {
			System.out.println("Properties : " + e);
		}
		return propertiesData;   
	}
}

