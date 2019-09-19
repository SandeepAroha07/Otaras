package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.activity;

import java.util.Date;
import java.util.Map;

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
import com.mongodb.client.MongoCollection;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.labels.labels;
import com.otaras.testautomation.objectrepository.OR;

public class BaseContactPage  extends BasePage{
	   public Map<Object, Object> testData;
		

	   @FindBy(xpath = OR.ContactPage_FirstName)	
	    public WebElement FirstName;

	   
	   

	   
	   public boolean Exists(){
	    	return super.Exists(FirstName); 
	    	
		}
	   
	    public String enterNewUserClientData(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	           //  sleep();
	    		
	    		
	    		
	    		//driver.findElement(By.xpath("//*[contains(text(),'Associated Entity / Firm ')]/parent::div//"+"following-sibling::div//div[@role='combobox']")).getAttribute("class")
	    		//Thread.sleep(300);
	    		
	    		//selectCombobox("//*[contains(text(),'"+"Firm Name"+"')]/parent::div//span[@class='rw-select rw-select-bordered']",testData.get("associatedFirm").toString());
	    		//Thread.sleep(300);
	    		this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+"Firm Name"+"')]/parent::div//span[@class='rw-select rw-select-bordered']")));
	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Firm Name"+"')]/parent::div//span[@class='rw-select rw-select-bordered']")).click();
	    		//Thread.sleep(300);
	    		this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+"Firm Name"+"')]/parent::div//"+"li[contains(text(),'"+testData.get("associatedFirm").toString()+"')]")));
	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Firm Name"+"')]/parent::div//"+"li[contains(text(),'"+testData.get("associatedFirm").toString()+"')]")).click();
	    		Thread.sleep(300);
//	    		selectCombobox(OR.ContactPage_AssociatedEntity,testData.get("associatedFirm").toString());
	    		
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
	    		
//	    		String contactType="";
//	    		contactType=testData.get("contactType").toString();
//		    		String array1[]= contactType.split(";");
//		    	       for (String temp: array1){
//		    	          System.out.println(temp);
//		    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
//		    	       }
//		    	       
//			    		String accessLevel="";
//			    		accessLevel=testData.get("accessLevel").toString();
//				    		String array2[]= accessLevel.split(";");
//				    	       for (String temp: array2){
//				    	          System.out.println(temp);
//				    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
//				    	       }
				
				
				//sandeep
	    		
	    		enterInput(OR.ContactPage_FirstName,testData.get("firstName").toString());
	    		enterInput(OR.ContactPage_MiddleName,testData.get("middleName").toString());
	    		//enterInputValue(labels.ContactPage_LastNameLbl,testData.get("lastName").toString());
	    		String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
	    		enterInput(OR.ContactPage_LastName,testData.get("lastName").toString()+randomString+timestamp);
	    		testData.replace("lastName", testData.get("lastName").toString()+randomString+timestamp);
	    		
	    		enterInput(OR.ContactPage_Email,randomString+"@autotest.com");
	    	//	this.selectDropdown(OR.AdminAddUsersPage_SystemAccessLevel, "test");
	    		
	    		
                 this.selectDropdown(OR.AdminAddUsersPage_SystemAccessLevel, testData.get("accessLevel").toString());
	    		
	    	//	Thread.sleep(2000);
	    		
	    		   String s="Financial Advisor 1";
		    		String add="Add";
		    		String s1=testData.get("contactType").toString();    
		    		String[] arrOfStr = s1.split(",", 22);
		    		
		    		WebElement wb2=driver.findElement(By.xpath(OR.Contact_type));
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
				    		WebElement wb4=driver.findElement(By.xpath("(//button[@class='rw-btn rw-btn-select'])[2]"));
				    		
				    		WebElement wb3=driver.findElement(By.xpath("//*[@id='rw_4_listbox_active_option']"));
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
			    		
			    		WebElement wb7=driver.findElement(By.xpath(OR.Contact_secondtype));
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
					    		WebElement wb8=driver.findElement(By.xpath("(//button[@class='rw-btn rw-btn-select'])[2]"));
					    		
					    		WebElement wb9=driver.findElement(By.xpath("//li[@id='rw_4_listbox_active_option']"));
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
		    		
		    		
	    		
	    		
	    		
	    		 driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Primary Details"+"')]/parent::div")).click();
	    		 
	    		 
	    		 //this.waitForElementExists(OR.SuccessMessage_Greencolor);
	    		 
	    		 
				 waitForElementExists("//div/*[contains(text(),'"+"Other Details"+"')]");
				 
				 driver.findElement(By.xpath("//div/*[contains(text(),'"+"Other Details"+"')]")).click();
				 enterInput(OR.Contact_otherEmail,randomString+"@FirstEmail.com");
				 if(add.equalsIgnoreCase(testData.get("AddmoreOtherEmails").toString()))
		    		{
				 driver.findElement(By.xpath(OR.Add_otherEmailButton)).click();
				 enterInput(OR.Contact_secondOtherEmail,randomString+"@SecondEmail.com");
		    		}
	
	    		
	    	
				 
				 enterInput(OR.ContactPage_Phone,testData.get("phone").toString());
	    		if(add.equalsIgnoreCase(testData.get("AddmorePhoneNumbers").toString()))
	    		{
	    		 driver.findElement(By.xpath(OR.Add_phoneButton)).click();
	    		 enterInput(OR.Second_phnoNumber,testData.get("SecondPhoneNumbers").toString()); 
	    		}
	    		
	    		
	    		
	    		
	    		enterInput(OR.ContactPage_Fax,testData.get("fax").toString());
	    		if(add.equalsIgnoreCase(testData.get("AddmoreFax").toString()))
	    		{
	    		 driver.findElement(By.xpath(OR.Add_faxButton)).click();
	    		 enterInput(OR.Contact_secondFax,testData.get("SecondFax").toString());
	    		}
	    		
	    		
	    		
	    		 
	    		 if(s.equalsIgnoreCase(testData.get("associatedFirm").toString()) )
		    		{
	    		 enterInput(OR.Contact_employeeId,testData.get("employeeID").toString());
	    		 enterInput(OR.Contact_JobTitle,testData.get("jobTitle").toString());
	    		 enterInput(OR.Contact_managerEmail,testData.get("managersEmail").toString());
	    		 enterDate(OR.Contact_joindate,testData.get("joiningDate").toString(), "");
	    		 enterDate(OR.Contact_exitDate,testData.get("exitDate").toString(),"");
	    		 enterInput(OR.ContactPage_CostCenter,testData.get("costCenter").toString());
		    		}
	
	    		 
	    		 
	    		
	    	//	enterInput(OR.ContactPage_Phone,testData.get("phone").toString());
	    	//	enterInput(OR.ContactPage_Fax,testData.get("fax").toString());
	    		 
	    		 
				  driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Other Details"+"')]/parent::div")).click();
				 // this.waitForElementExists(OR.SuccessMessage_Greencolor);
				  waitForElementExists("//div/*[contains(text(),'"+"Other Details"+"')]");
				  
				  
				  
             
				  driver.findElement(By.xpath("//*[@id='main']/section/article[3]/div/div/div[1]/button")).click();
				 
				  driver.findElement(By.xpath(OR.OfficeAdress)).click();
				 
				  driver.findElement(By.xpath(OR.Contact_AddressSave)).click();
				 // this.waitForElementExists(OR.SuccessMessage_Greencolor);
				
				  this.waitForElementExists("//div[@class='control']/*[contains(text(),'"+"Save Other Details"+"')]/parent::div");
				  System.out.println("succesfull");
				  
				  
	    		
				testData.put("NameKeyToQueryDB",testData.get("lastName").toString());
//	    		enterInput(OR.ContactPage_EmployeeID,testData.get("employeeID").toString()+timestamp);
//	    		enterInput(OR.ContactPage_JobTitle,testData.get("jobTitle").toString()+timestamp);
//	    		//enterInputValue("Manager's Email",testData.get("managersEmail").toString()+timestamp);
//	    		//enterInputValue(driver.findElement(By.xpath("//*[contains(text(),\"Manager's Email\")]/parent::div//input")), testData.get("managersEmail").toString());
//	    		//enterInputValue(driver.findElement(By.xpath("//*[contains(text(),\"Managers Email\")]/parent::div//input")), testData.get("managersEmail").toString());
//	    		//enterInputValue(driver.findElement(By.xpath("//*[contains(text(),\"'+ContactPage_ManagersEmailLbl+"'\")]/parent::div//input")), testData.get("managersEmail").toString());
//	    		enterInput(OR.ContactPage_ManagersEmail,testData.get("managersEmail").toString()+timestamp);
//	    		//enterDateInput("Joining Date",testData.get("joiningDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		//enterDateInput("Exit Date",testData.get("exitDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		if (!testData.get("associatedFirm").toString().equalsIgnoreCase("financial advisor 1")){
//	    		enterInput(OR.ContactPage_Department,testData.get("department").toString());
//	    		enterInput(OR.ContactPage_EmployeeType,testData.get("employeeType").toString());}
//	    		
//	    		enterInput(OR.ContactPage_CostCenter,testData.get("costCenter").toString());

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterNewUserClientData: Successful - "+SuccessFontColorSuffix);
	  
	    		return(testData.get("NameKeyToQueryDB").toString());

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterNewUserClientData Transaction Page - enterDebtDetail_Derivative - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterNewUserClientData - Deal data enty failed");
	    	}
	    }

	   
	    public String editExistUserClientData(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//driver.findElement(By.xpath("//*[contains(text(),'Associated Entity / Firm ')]/parent::div//"+"following-sibling::div//div[@role='combobox']")).getAttribute("class")
	    		driver.navigate().refresh();
	    		selectCombobox(OR.ContactPage_AssociatedEntity,testData.get("associatedFirm").toString());
	    		//selectCombobox("//*[contains(text(),'"+"contact already exists in your database"+"')]/parent::div//div[@role='combobox']",testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString());
	    		selectCombobox(OR.ContactPage_ContactName,testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString());
	    		
//	    		//working code
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"contact already exists in your database"+"')]/parent::div//div[@role='combobox']")).click();
//	    		Exists(driver.findElement(By.xpath("//li[contains(text(),'"+testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString()+"')]")));
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"contact already exists in your database"+"')]/parent::div//div[@role='combobox']//input[@class='rw-input-reset']")).sendKeys(testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString());
//	    		WebElement wb1=driver.findElement(By.xpath("//li[contains(text(),'"+testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString()+"')]"));
//	    		
//	    		Actions builder=new Actions(driver);
//	    		Action seriesofactions=builder
//	    				.moveToElement(wb1)
//	    				//.click()
//	    				//.sendKeys(wb1,testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString())
//	    				.sendKeys(Keys.ENTER)
//	    				.build();
//	    		seriesofactions.perform();
//	    		//working code ends here
	    		
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+"contact already exists in your database"+"')]/parent::div//div[@role='combobox']")).click();
	    		//Exists(driver.findElement(By.xpath("//li[contains(text(),'"+testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString()+"')]")));
	    		//clickByJS("//li[contains(text(),'"+testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString()+"')]");
	    		//driver.findElement(By.xpath("//li[contains(text(),'"+testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString()+"')]")).click();
	    		//this.selectCombobox("//*[contains(text(),'"+"contact already exists in your database"+"')]/parent::div//div[@role='combobox']",testData.get("firstName").toString().trim()+" "+testData.get("lastName").toString());
	    		
//	    		Date d=new Date();
//				String timestamp=d.toString().replace(":", "").replace(" ", "");
//	    		
//	    		String contactType="";
//	    		contactType=testData.get("contactType").toString();
//		    		String array1[]= contactType.split(";");
//		    	       for (String temp: array1){
//		    	          System.out.println(temp);
//		    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
//		    	       }
//		    	       
//			    		String accessLevel="";
//			    		accessLevel=testData.get("accessLevel").toString();
//				    		String array2[]= accessLevel.split(";");
//				    	       for (String temp: array2){
//				    	          System.out.println(temp);
//				    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
//				    	       }
	    		
	    		enterInput(OR.ContactPage_FirstName,"Updated");
	    		enterInput(OR.ContactPage_MiddleName,"M");
//	    		//enterInputValue(labels.ContactPage_LastNameLbl,testData.get("lastName").toString());
	    		enterInput(OR.ContactPage_LastName,"Updated");
//	    		
	    		this.clearInput(OR.ContactPage_Email);
	    		enterInput(OR.ContactPage_Email,"Updated"+testData.get("email").toString());
//	    		enterInput(OR.ContactPage_Phone,testData.get("phone").toString());
//	    		enterInput(OR.ContactPage_Fax,testData.get("fax").toString());
//	    		
//	    		
//				testData.put("NameKeyToQueryDB",testData.get("employeeID").toString()+timestamp);
	    		this.clearInput(OR.ContactPage_EmployeeID);
	    		enterInput(OR.ContactPage_EmployeeID,"Upd"+testData.get("employeeID").toString());
	    		this.clearInput(OR.ContactPage_JobTitle);
	    		enterInput(OR.ContactPage_JobTitle,"Upd"+testData.get("jobTitle").toString());
//	    		//enterInputValue("Manager's Email",testData.get("managersEmail").toString()+timestamp);
//	    		//enterInputValue(driver.findElement(By.xpath("//*[contains(text(),\"Manager's Email\")]/parent::div//input")), testData.get("managersEmail").toString());
//	    		//enterInputValue(driver.findElement(By.xpath("//*[contains(text(),\"Managers Email\")]/parent::div//input")), testData.get("managersEmail").toString());
//	    		//enterInputValue(driver.findElement(By.xpath("//*[contains(text(),\"'+ContactPage_ManagersEmailLbl+"'\")]/parent::div//input")), testData.get("managersEmail").toString());
	    		this.clearInput(OR.ContactPage_ManagersEmail);
	    		enterInput(OR.ContactPage_ManagersEmail,"Upd"+testData.get("managersEmail").toString());
//	    		//enterDateInput("Joining Date",testData.get("joiningDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		//enterDateInput("Exit Date",testData.get("exitDate").toString(),testData.get("TestBrowser").toString().trim());
	    		if (!testData.get("associatedFirm").toString().equalsIgnoreCase("financial advisor 1")){
		    		this.clearInput(OR.ContactPage_Department);
		    		enterInput(OR.ContactPage_Department,"Upd"+testData.get("department").toString());
		    		this.clearInput(OR.ContactPage_EmployeeType);
		    		enterInput(OR.ContactPage_EmployeeType,"Upd"+testData.get("employeeType").toString());
		    		this.clearInput(OR.ContactPage_CostCenter);
		    		enterInput(OR.ContactPage_CostCenter,"Upd"+testData.get("costCenter").toString());}
//
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterNewUserClientData: Successful - "+SuccessFontColorSuffix);
//	  
	    		return(testData.get("NameKeyToQueryDB").toString());

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"editExistUserClientData Transaction Page - editExistUserClientData - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("editExistUserClientData - Deal data enty failed");
	    	}
	    }
	   
}
