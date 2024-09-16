package com.thepric.Genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {
	
	
	public static String logindata(String key) throws IOException  {
		Properties pro= new Properties();
		FileInputStream fi=new FileInputStream(".\\ConfiugerFile\\signin.properties");
		pro.load(fi);
		String data= pro.getProperty(key);
		return data;
		
	}
	
}