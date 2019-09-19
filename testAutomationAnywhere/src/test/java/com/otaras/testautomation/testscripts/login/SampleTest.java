package com.otaras.testautomation.testscripts.login;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.otaras.testautomation.common.InitializeDriver;

import java.util.*;

//http://toolsqa.com/selenium-webdriver/testng-parameters-data-provider/
//http://www.techbeamers.com/testng-parameters-and-dataprovider-annotations/

public class SampleTest {

	private InitializeDriver initializeDriver;
	private WebDriver driver;
	public String testBrowserXML="";
	 // https://automationtalks.com/2017/11/03/map-hashmap-testng-dataprovider/
		//  https://testingtechhunt.wordpress.com/2016/05/23/passing-hashmap-in-data-provider-fetching-from-excel-sheet/
			
	  @DataProvider(name = "Passing List Of Maps",parallel = true)
	    public Iterator<Object[]> createDataforTest3() {
	        List<Map<String,String>> lom = new ArrayList<Map<String,String>>();
	        Map<String,String> map1 = new HashMap<String,String>();
	        Map<String,String> map2 = new HashMap<String,String>();
	        map1.put("name","Amit");
	        map2.put("name","Sarbjit");
	        lom.add(map1);
	        lom.add(map2);
	        Collection<Object[]> dp = new ArrayList<Object[]>();
	        for(Map<String,String> map:lom){
	            dp.add(new Object[]{map});
	        }
	        return dp.iterator();
	    }
	    
		@Parameters({"testBrowserXML"})
	    @Test(dataProvider = "Passing List Of Maps")
	    public void test1(Map<String,String> map, String testBrowserXML) throws Exception{
			//testBrowserXML1=testBrowserXML;
			 initializeDriver=new InitializeDriver();
			  //InitializeTestDriver.SetTestBrowser(testBrowserFromXML);
			  this.driver=initializeDriver.initializeDriver();
	        System.out.println("Value in first Map:" + map.get("name"));
	        if (testBrowserXML.equalsIgnoreCase("chrome"))
	        	driver.get("https://google.com");
	        else
	        	driver.get("https://www.mozilla.org/en-US/firefox/new/");
	        System.out.println("Browser Launched:" + testBrowserXML);
	    }

}
