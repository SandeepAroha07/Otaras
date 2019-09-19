package com.otaras.testautomation.common;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadTestConfig {
	 public static String Get(String sPropName)
	   {
		   return GetProperty(sPropName);
		   
		   
	   }
	public static String GetProperty(String sKeyName){   
	       File classpathRoot = new File(System.getProperty("user.dir"));
	       File app = new File(classpathRoot, "src//test//resources//testConfig//testConfig.properties");
	       //File app = new File(classpathRoot, "src"+File.separator+"test"+File.separator+"resources"+File.separator+"testConfig"+File.separator+"testConfig.properties");
	       String PROP_FILE = app.getAbsolutePath();

		   String sValue=null;
		   try{   
	 
	         Properties props = new Properties();
	         props.load(new FileInputStream(PROP_FILE.toString()));
	         sValue = props.getProperty(sKeyName); 
	         

	         //return sValue;
	      /* code to use values read from the file*/  
	       }catch(Exception e){   
	         System.out.println("Failed to read from " + PROP_FILE + " file.");   
	       } 
	       return sValue;
	   }  
}
