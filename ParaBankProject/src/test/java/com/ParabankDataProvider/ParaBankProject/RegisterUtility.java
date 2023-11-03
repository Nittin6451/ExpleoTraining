package com.ParabankDataProvider.ParaBankProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RegisterUtility {
	
	String strpassword,strurl,strfirstname,strlastname,straddress,strcity,strstate,strzipcode,strphonenumber,strssn,
	strusername,strconfirmpassword;
	
	public RegisterUtility() {
		Register();
	}
	
	public void Register(){
		File file = new File("C:\\Users\\aricharddaniel\\eclipse-workspace\\ParaBankProject\\src\\test\\resources\\RegisterData.properties");
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
		strurl = prop.getProperty("url");
		strfirstname = prop.getProperty("firstname");
		strlastname = prop.getProperty("lastname");
		straddress =prop.getProperty("address");
		strcity = prop.getProperty("city");
		strstate = prop.getProperty("state");
		strzipcode = prop.getProperty("zipcode");
		strphonenumber = prop.getProperty("phonenumber");
		strssn = prop.getProperty("ssn");
		strusername = prop.getProperty("username");
		strpassword = prop.getProperty("password");
		strconfirmpassword= prop.getProperty("confirmpassword");
		}
}
