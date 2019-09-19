package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.codoid.products.fillo.Recordset;
import com.mongodb.client.MongoCollection;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.common.ReadTestData;
import com.otaras.testautomation.labels.labels;
import com.otaras.testautomation.objectrepository.OR;

public class BaseAddThirdPartyPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.EntityThirdPartyAddPage_TypeHeader)	
	    public WebElement TypeHeader;


	   
	   public boolean Exists(){
	    	return super.Exists(TypeHeader); 
	    	
		}

	   
	    public String enterNewUserClientData(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//if (!testData.get("entityName").toString().trim().equalsIgnoreCase("")){
	    			//this.selectComboboxByName(OR.AddClientPage_EntityNameLbl, testData.get("entityName").toString());
	    			WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']"));
		    		
		    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
		    		Actions builder=new Actions(driver);
		    		Action seriesofactions=builder
		    				.moveToElement(wb1)
		    				.click()
		    				.sendKeys(wb1,testData.get("entityName").toString())
		    				.sendKeys(Keys.TAB)
		    				.build();
		    		seriesofactions.perform();
	    		//}
	    		enterInput(OR.AdminAddThirdPartyPage_TaxID,testData.get("taxID").toString());
	    		
	    	
	    		
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
				testData.put("NameKeyToQueryDB",timestamp);
				
//				if (!testData.get("firmName").toString().trim().equalsIgnoreCase(""))
//	    			enterInputValue(OR.AddClientPage_EntityNameLbl,testData.get("firmName").toString()+timestamp);
				
				String entityType="";
	    		//if (testData.get("entityType").toString().equalsIgnoreCase("governmental entity / issuer")){
		    		entityType=testData.get("entityType").toString();
		    		String array1[]= entityType.split(";");
		    	       for (String temp: array1){
		    	          System.out.println(temp);
		    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
		    	       }
	    	    // }

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterNewUserClientData: Successful - "+SuccessFontColorSuffix);
	  
	    		return(testData.get("NameKeyToQueryDB").toString());

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Derivative Transaction Page - enterNewUserClientData - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterNewUserClientData - Deal data enty failed");
	    	}
	    }
	    
	    public String enterAdminNewThirdPartyData(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//if (!testData.get("entityName").toString().trim().equalsIgnoreCase("")){
	    			//this.selectComboboxByName(OR.AddThirdPartyPage_EntityNameLbl, testData.get("entityName").toString());
//		WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddThirdPartyPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']"));
//		    		
//		    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
//		    		Actions builder=new Actions(driver);
//		    		Action seriesofactions=builder
//		    				.moveToElement(wb1)
//		    				.click()
//		    				.sendKeys(wb1,testData.get("entityName").toString())
//		    				.sendKeys(Keys.TAB)
//		    				.build();
//		    		seriesofactions.perform();
	    		//}
	    		
	    		
	    		
	    		
	    	//sandeep	
	    		
	    		
	    		String s1=testData.get("marketRole").toString();    	
	    		
	    		String[] arrOfStr = s1.split(",", 20);
	    		
	    		
	    		
	    		
	    		
	    		WebElement wb2=driver.findElement(By.xpath(OR.Thirdparty_marketRole));
	    		Actions builder1=new Actions(driver);
	    		Action seriesofactions1=builder1
	    		        .moveToElement(wb2)
	    			   // .click()
	    				.pause(900)
	    				.sendKeys(wb2,arrOfStr[0].toString())
	    				.click()
	    			    .build();
			    	    seriesofactions1.perform();
			    		Thread.sleep(2000);
			    		
			    		wb2.click();
			    		WebElement wb4=driver.findElement(By.xpath("(//button[@class='rw-btn rw-btn-select'])[1]"));
			    		
			    		WebElement wb3=driver.findElement(By.xpath("(//li[@role='option'])[1]"));
			    		builder1=new Actions(driver);
			   		            seriesofactions1=builder1
			    				.moveToElement(wb3)
			    				.pause(400)
			    				.click()
			    				.moveToElement(wb4)
			    				.click()
			    				.build();
					    		seriesofactions1.perform();
			  	
	                         		
				  Thread.sleep(4000);  		
				  
				  
	    		
	    		
	    		
	    		
				  
				  
				  for(int i=1;i<=arrOfStr.length-1;i++)
	                {
		    		System.out.println( arrOfStr[i]);	   
	                
		    		//int z=i+1;
		    		
		    		//String sq="(//li[@role='option'])[]";
		    		
		    		WebElement wb7=driver.findElement(By.xpath(OR.Thirdparty_secondmarketRole));
		    		Actions builder7=new Actions(driver);
		    		Action seriesofactions7=builder7
		    		        .moveToElement(wb2)
		    			   // .click()
		    				.pause(900)
		    				.sendKeys(wb7,arrOfStr[i].toString())
		    				.click()
		    			    .build();
				    	    seriesofactions7.perform();
				    		Thread.sleep(2000);
				    		
				    		wb2.click();
				    		WebElement wb8=driver.findElement(By.xpath("(//button[@class='rw-btn rw-btn-select'])[1]"));
				    		
				    		WebElement wb9=driver.findElement(By.xpath("//li[@ class='rw-list-option rw-state-focus']"));
				    		builder7=new Actions(driver);
				   		            seriesofactions7=builder7
				    				.moveToElement(wb9)
				    				.pause(400)
				    				.click()
				    				.moveToElement(wb8)
				    				.click()
				    				.build();
						    		seriesofactions7.perform();
				  	
		                         		
					  Thread.sleep(4000);  		
					  
					  
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
	                }
				  
				  
	    		
	    		String randomString=RandomStringUtils.randomAlphabetic(5).toUpperCase();	
	    		//WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']"));
	    		this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"div[@role='combobox']")));
	    		WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"div[@role='combobox']"));
	    		//WebElement wb11=driver.findElement(By.xpath("//li/*[contains(text(),'"+testData.get("entityName").toString()+randomString+"')]"));
	    		
		    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
		    		Actions builder=new Actions(driver);
		    		Action seriesofactions=builder
		    				.moveToElement(wb1)
		    				.click()
		    				.pause(2000)
		    				.sendKeys(wb1,testData.get("entityName").toString()+randomString)
		    				.pause(2000)
		    				.sendKeys(wb1,testData.get("entityName").toString()+randomString)
		    				.pause(2000)
		    				.sendKeys(Keys.TAB)
		    				.pause(300)
		    				.build();
		    		seriesofactions.perform();
	    		//}
		    		//driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"div[@role='combobox']")).click();
		    		//driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"div[@role='combobox']")).sendKeys(testData.get("entityName").toString()+randomString);
		    		Thread.sleep(300);
		    		wb1.click();
		    		Thread.sleep(300);
		    		WebElement wb11=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"div[@role='combobox']//ul[2]/li"));
		    		builder=new Actions(driver);
		    		seriesofactions=builder
		    				.moveToElement(wb11)
		    				.pause(100)
		    				.click()
		    				.pause(100)
//		    				.sendKeys(wb1,testData.get("entityName").toString()+randomString)
//		    				.sendKeys(Keys.TAB)
		    				.build();
		    		seriesofactions.perform();
		    		
		    		Thread.sleep(200);
	    		

		    		driver.findElement(By.xpath(OR.Save_add_alias_issuername)).click();
		    		enterInput(OR.AliasName,testData.get("entityNameAlias").toString());
	    		
	    		enterInput(OR.AdminAddThirdPartyPage_TaxID,testData.get("taxID").toString());
	    		
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
				
				
				String sFirmname=driver.findElement(By.xpath("//*[contains(text(),'"+"Entity Name"+"')]/parent::div//"+"following-sibling::div//div[@class='rw-input rw-dropdown-list-input']")).getText();
	    		testData.put("NameKeyToQueryDB",sFirmname);
				//testData.put("NameKeyToQueryDB",timestamp);
				

				
//	    		driver.findElement(By.xpath(OR.AddThirdPartyPage_MarketRole)).click();
//	    		Exists(driver.findElement(By.xpath("(//div[@name='marketRole']//li)[2]")));
//	    		Exists(driver.findElement(By.xpath("(//div[@name='marketRole']//li)[2]")));
//	    		driver.findElement(By.xpath("(//div[@name='marketRole']//li)[2]")).click();
////	    		Thread.sleep(500);
//	    		//Exists(driver.findElement(By.xpath(OR.AddThirdPartyPage_MarketRole)));
//	    		//driver.findElement(By.xpath(OR.AddThirdPartyPage_MarketRole)).click();
////	    		clickButton("Entity Type");
////	    		clickButton("Entity Type");
//	    		Exists(driver.findElement(By.xpath(OR.AddThirdPartyPage_MarketRole)));
////	    		if (testData.get("entityName").toString().trim().equalsIgnoreCase(""))
////	    			enterInputValue(OR.AddClientPage_EntityNameLbl,testData.get("firmName").toString()+timestamp);
//	    		
//	    		
//	    		
//				
//				clickButton(OR.AddThirdPartyPage_EntityTypeLbl);
//				Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddThirdPartyPage_MarketRoleLbl+"')]/parent::div//"+"div//span")));
//				driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddThirdPartyPage_MarketRoleLbl+"')]/parent::div//"+"div//span/button")).click();
//				
//				Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddThirdPartyPage_MarketRoleLbl+"')]/parent::div//"+"div//li[contains(text(),'"+testData.get("entityType").toString()+"')]")));
//				driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddThirdPartyPage_MarketRoleLbl+"')]/parent::div//"+"div//li[contains(text(),'"+testData.get("entityType").toString()+"')]")).click();
//				
//				driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddThirdPartyPage_MarketRoleLbl+"')]/parent::div//"+"div//span/button")).click();
//				
//				
////				String entityType="";
////	    		//if (testData.get("entityType").toString().equalsIgnoreCase("governmental entity / issuer")){
////		    		entityType=testData.get("entityType").toString();
////		    		String array1[]= entityType.split(";");
////		    	       for (String temp: array1){
////		    	          System.out.println(temp);
////		    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
////		    	       }
////	    	    // }

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterAdminNewThirdPartyData: Successful - "+SuccessFontColorSuffix);
	  
	    		return(testData.get("NameKeyToQueryDB").toString());

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Derivative Transaction Page - enterAdminNewThirdPartyData - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterAdminNewThirdPartyData - Deal data enty failed");
	    	}
	    }
	    
//	    public void enterMaster_BusinessAddressData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
//	    {
//	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
//	    	ReadTestData readtestdata=new ReadTestData();
//	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
//	    	
//	    	Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Address Name"+"')]")));
//	    	
//	    	
//	    	
//	    	enterInputValue("Address Name",MasterTestDataMap.get("addressName").toString());
//	    	if (MasterTestDataMap.get("addressName").toString().equalsIgnoreCase("no"))
//	    		driver.findElement(By.xpath("//input[@name= 'isPrimary']")).click();
//	    		
//	    	enterInputValue("Website(s)",MasterTestDataMap.get("website").toString());
//	    	enterInputValue("Office Phone",MasterTestDataMap.get("officePhone1").toString());
//	    	enterInputValue("Office Fax",MasterTestDataMap.get("officeFax1").toString());
//	    	
//	    	enterInputValue("Office Email",MasterTestDataMap.get("officeEmail1").toString());
//	    	enterInputValue("Address Line 1",MasterTestDataMap.get("addressLine1").toString());
//	    	selectComboboxByName("Country",MasterTestDataMap.get("country").toString());
//	    	selectComboboxByName("State",MasterTestDataMap.get("state").toString());
////	    	driver.findElement(By.xpath("//*[contains(text(),'"+"State"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']")).click();
////	    	WebElement sListItem=	driver.findElement(By.xpath("//*[contains(text(),'"+"State"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']//li[contains(text(),'"+MasterTestDataMap.get("state").toString().trim()+"')]"));
////	    	sListItem.click();
//	    	
//	    	enterInputValue("City",MasterTestDataMap.get("city").toString());
//	    	enterInputValue("Zip Code",MasterTestDataMap.get("zipcode").toString());
//	    }
	
	   
}
