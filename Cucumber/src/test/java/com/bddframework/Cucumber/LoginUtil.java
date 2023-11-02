package com.bddframework.Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginUtil {
	String strUserName,strPassword,StrUrl;
	
	public LoginUtil() {
		login2();
	}
	public void login2(){
		File file = new File("C:\\Users\\aricharddaniel\\eclipse-workspace\\Cucumber\\src\\test\\resources\\data.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		StrUrl = prop.getProperty("url");
		strUserName = prop.getProperty("username");
		strPassword = prop.getProperty("password");

	}
}
