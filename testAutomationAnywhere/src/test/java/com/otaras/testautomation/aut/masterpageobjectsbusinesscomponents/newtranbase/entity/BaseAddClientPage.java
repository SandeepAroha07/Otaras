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

public class BaseAddClientPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.AddClientPage_PrimarySector)	
	    public WebElement PrimarySector;
//	   @FindBy(xpath = OR.EntitySelectionPage_CityIssuer)
//			   public WebElement CityIssuer;

	   
	   public boolean Exists(){
	    	return super.Exists(PrimarySector); 
	    	
		}
	   public String NameKeyToQueryDB() 
	    {
	    	return(testData.get("NameKeyToQueryDB").toString());
	    }
	   
	   
	   
	    public String enterNewUserClientData(Map<Object, Object> testData) 
	    {
	    	
	    	try{
//	    		if (testData.get("entityClientProspect").toString().equalsIgnoreCase("prospect"))
//	    			if (Exists(driver.findElement(By.xpath("//input[@value='Prospect']"))))
//	    				driver.findElement(By.xpath("//input[@value='Prospect']")).click();

	    		this.selectCombobox(OR.AddClientPage_EntityType, testData.get("entityType").toString());
	    		
//	    		if (testData.get("entityType").toString().equalsIgnoreCase("corporation"))
//	    			enterInputValue(driver.findElement(By.xpath("//*[contains(text(),'"+labels.AddClientPage_EntityNameLbl+"')]/parent::div//input")),testData.get("entityName").toString());
//	    		else
//	    			this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+labels.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div/div/div[@role='combobox']")), testData.get("entityName").toString());
//	    		
	    		
	    		//WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']"));
	    		WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"input[@name='borrower']"));
	    		
	    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
	    		String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
	    		Actions builder=new Actions(driver);
	    		Action seriesofactions=builder
	    				.moveToElement(wb1)
	    				.click()
	    				.sendKeys(wb1,testData.get("entityName").toString()+randomString)
	    				.sendKeys(Keys.TAB)
	    				.build();
	    		seriesofactions.perform();
	    		
	    		this.selectCombobox(OR.AddClientPage_PrimarySector, testData.get("primarySector").toString());
	    		this.selectCombobox(OR.AddClientPage_SecondarySector, testData.get("secondarySector").toString());
	    		//driver.findElement(By.xpath("//*[contains(text(),'Tax ID')]/parent::div//"+"following-sibling::div//input"))
	    		enterInput(OR.AddClientPage_TaxID,testData.get("taxID").toString());
	    		
	    		this.Click("//*[contains(text(),'"+"Save Client"+"')]");
	    		this.waitForElementExists("//div/*[contains(text(),'"+"Save Contact Information"+"')]");
	    		
	    		
	    		//driver.findElement(By.xpath("//*[contains(text(),\\"Firm's Lead Advisor\\")]/parent::div/div/div")).getAttribute("id")    ---- WORKINg XPATH
	    		
	    		//CityIssuer.click();
//	    		String entityType="";
//	    		if (testData.get("entityType").toString().equalsIgnoreCase("governmental entity / issuer")){
//		    		entityType=testData.get("entityType1").toString();
//		    		String array1[]= entityType.split(";");
//		    	       for (String temp: array1){
//		    	          System.out.println(temp);
//		    	          driver.findElement(By.xpath("//input[@value= '"+" "+temp+"']")).click();
//		    	       }
//	    	     }
	    		
//	    		if  (Exists(driver.findElement(By.xpath("//*[contains(text(),'Previous Advisor Contact Information')]")))==true){
//	    			driver.findElement(By.xpath("//*[contains(text(),'Previous Advisor Contact Information')]")).click();
//	    			Exists(driver.findElement(By.xpath("//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div")));
//	    		}
	    		
	    		//this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div")), testData.get("leadAdvisor").toString());
	    		this.selectCombobox(OR.AddClientPage_FirmsLeadAdvisor, testData.get("leadAdvisor").toString());
	    		
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
	      		testData.put("NameKeyToQueryDB",testData.get("previousLeadAdvisor").toString()+timestamp);
	    		enterInput(OR.AddClientPage_PreviousLeadAdvisor,testData.get("previousLeadAdvisor").toString()+timestamp);
	    		enterInput(OR.AddClientPage_PreviousAdvisorFirm,testData.get("previousAdvisorFirm").toString());
	    		enterDate(OR.AddClientPage_PreviousAdvisoryContractExpiry, testData.get("previousAdvisoryContractExpiry").toString(), ""); 
	    		enterInput(OR.AddClientPage_PrimaryContactNameinEmma,testData.get("PrimaryContactNameinEmma").toString());
	    		enterInput(OR.AddClientPage_PrimaryContactPhone,testData.get("primaryContactPhone").toString());
	    		enterInput(OR.AddClientPage_PrimaryContactEmail,testData.get("primaryContactEmail").toString());
//	    		selectDropdownValue("Activity Subtype",testData.get("activitySubtype").toString());
//	    		
//	    		if (testData.get("activitySubtype").toString().equalsIgnoreCase("Other (please specify)"))
//	    			enterInputValue("Other Activity Subtype",testData.get("otherActivitySubtype").toString());
//	    		
//	    		selectIssuer(testData.get("issuer").toString());
//
//	    		selectDropdownValue("Primary Sector",testData.get("primarySector").toString());
//	    		selectDropdownValue("Secondary Sector",testData.get("secondarySector").toString());
//	    		selectLeadAdvisor(testData.get("leadAdvisor").toString());
//	    		enterIssueName(testData.get("issueName").toString());
//	    		enterInputValue("Project Description / Transaction Name",testData.get("projectDescription").toString());
//	    		selectRelatedTransactionType(testData.get("relatedTransactionType").toString());
//	    		selectRelatedTransactionIds(testData.get("relatedTransactionsIds").toString());
//	    		//enterInputValue("Notes / Instructions",testData.get("notes").toString());
//	    		enterNotes(testData.get("notes").toString());
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
	    
	
	    
	    public String enterAdminNewUserClientData(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		
	    		if (testData.get("entityClientProspect").toString().equalsIgnoreCase("prospect"))
	    			if (Exists(driver.findElement(By.xpath("//input[@value='Prospect']")))){
	    				Thread.sleep(300);
	    				waitElementClickable("//input[@value='Prospect']");
	    				driver.findElement(By.xpath("//input[@value='Prospect']")).click();}

	    		//this.selectComboboxByName(labels.AddClientPage_EntityTypeLbl, testData.get("entityType").toString());
	    		this.selectDropdown(OR.AddClientPage_EntityType, testData.get("entityType").toString());
	    		
 //sandeep	    		
	    		String s="Governmental Entity / Issuer";
	    		String s1="501c3 - Obligor";
	    		

	    		if(s.equalsIgnoreCase(testData.get("entityType").toString()) || s1.equalsIgnoreCase(testData.get("entityType").toString())) 
	    		{
	    	
	    		WebElement wb2=driver.findElement(By.xpath(OR.Issuertype1));
	    		Actions builder1=new Actions(driver);
	    		Action seriesofactions1=builder1
	    		        .moveToElement(wb2)
	    			   // .click()
	    				.pause(900)
	    				.sendKeys(wb2,testData.get("issuertype").toString())
	    				.click()
	    			    .build();
			    	    seriesofactions1.perform();
			    		Thread.sleep(2000);
			    		
			    		wb2.click();
			    		
			    		
			    		WebElement wb3=driver.findElement(By.xpath("//*[@id='rw_4_listbox_active_option']"));
			    		builder1=new Actions(driver);
			   		            seriesofactions1=builder1
			    				.moveToElement(wb3)
			    				.pause(100)
			    				.click()
			    				.pause(100)
			    				.build();
					    		seriesofactions1.perform();
			  
			    		
			    		
			    		
			    		
	                         		
				  Thread.sleep(2000);  		
	    		
	    		}		
	    		
	    		
	    			
                
	    		
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+labels.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']")).click();
	    		
	    		//WebElement wb = driver.findElement(By.xpath("//*[contains(text(),'"+labels.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']/span"));
	    		//JavascriptExecutor jse = (JavascriptExecutor)driver;
	    		//jse.executeScript("arguments[0].value='anil';", wb);
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+labels.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']")).sendKeys("anil");
	    		
	    		
	    		//wb1.sendKeys(Keys.TAB);
//	    		Actions action = new Actions(driver); 
//	    		action.sendKeys(wb1, Keys.ENTER).build().perform();
	    		
	    		
	    		//if (testData.get("entityType").toString().equalsIgnoreCase("corporation"))
	    		//	enterInputValue(driver.findElement(By.xpath("//*[contains(text(),'"+labels.AddClientPage_EntityNameLbl+"')]/parent::div//input")),testData.get("entityName").toString());
	    		//else
	    		//{
	    			//this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+labels.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div/div/div[@role='combobox']")), testData.get("entityName").toString());
	    		String randomString=RandomStringUtils.randomAlphabetic(5).toUpperCase();	
	    		//WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']"));
	    		
	    		Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"div[@role='combobox']")));
	    		WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"div[@role='combobox']"));
	    		//WebElement wb11=driver.findElement(By.xpath("//li/*[contains(text(),'"+testData.get("entityName").toString()+randomString+"')]"));
	    		
		    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
		    		Actions builder=new Actions(driver);
		    		Action seriesofactions=builder
		    				.moveToElement(wb1)
		    				.click()
		    				.pause(1200)
		    				.sendKeys(wb1,testData.get("entityName").toString()+randomString)
		    				.pause(2000)
		    				//.sendKeys(wb1,testData.get("entityName").toString()+randomString)
		    				//.pause(2000)
		    				.sendKeys(Keys.TAB)
		    				.pause(700)
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
		    		//testData.put("NameKeyToQueryDB",testData.get("entityName").toString()+randomString);
		    		String sFirmname=driver.findElement(By.xpath("//*[contains(text(),'"+"Entity Name"+"')]/parent::div//"+"following-sibling::div//div[@class='rw-input rw-dropdown-list-input']")).getText();
		    		testData.put("NameKeyToQueryDB",sFirmname);
		    		;
		    		
		    		
		    	//sandeep	
		    		
		    		driver.findElement(By.xpath(OR.Save_add_alias_issuername)).click();
		    		enterInput(OR.AliasName,testData.get("entityNameAlias").toString());
		    		
		    		
		    		
	    		this.selectDropdown(OR.AddClientPage_PrimarySector, testData.get("primarySector").toString());
	    		this.selectDropdown(OR.AddClientPage_SecondarySector, testData.get("secondarySector").toString());
	    		//driver.findElement(By.xpath("//*[contains(text(),'Tax ID')]/parent::div//"+"following-sibling::div//input"))
	    		enterInput(OR.AddClientPage_TaxID,testData.get("taxID").toString());
	    		//driver.findElement(By.xpath("//*[contains(text(),\\"Firm's Lead Advisor\\")]/parent::div/div/div")).getAttribute("id")    ---- WORKINg XPATH
	    		
	    		//CityIssuer.click();
//	    		String entityType="";
//	    		if (testData.get("entityType").toString().equalsIgnoreCase("governmental entity / issuer")){
//		    		entityType=testData.get("entityType1").toString();
//		    		String array1[]= entityType.split(";");
//		    	       for (String temp: array1){
//		    	          System.out.println(temp);
//		    	          driver.findElement(By.xpath("//input[@value= '"+" "+temp+"']")).click();
//		    	       }
//	    	     }
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+"Client"+"')]/parent::div|//*[contains(text(),'"+"Prospect"+"')]/parent::div")).click();
	    		driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save"+"')]/parent::div")).click();
	    		
	    		//sandeep
	    		
	   
	    		//this.waitForElementExists(OR.SuccessMessage_Greencolor);
	    		this.waitForElementExists(OR.Advisor_PrimaryContactInformation);
	    		
	    		//start lead advisor
	    		driver.findElement(By.xpath(OR.Advisor_PrimaryContactInformation)).click();
	    		driver.findElement(By.xpath(OR.LeadAdvisor)).click();
	    		Thread.sleep(1000);
	    		
	    		WebElement wb4=driver.findElement(By.xpath("(//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//"+"ul//li)[1]"));//driver.findElement(By.xpath(OR.LeadAdvisor));
	    		Actions builder3=new Actions(driver);
	            	Action seriesofactions3=builder3
	    	            .moveToElement(wb4)
	    		        //.sendKeys(wb4,testData.get("leadAdvisor").toString())
	    			    .build();
			    	    seriesofactions3.perform();
			    		Thread.sleep(2000);
	    		
			          	wb4.click();
			          
			          	
			          
			    		
			    		
			          
			    	
			    	    
		//Anil commented below code	    	    
//			    		WebElement wb5=driver.findElement(By.xpath("//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//input[@placeholder=' Select lead advisor']"));
//			    		builder3=new Actions(driver);
//			   		seriesofactions3=builder3
//			   				    
//			    				.moveToElement(wb5)
//			    				.pause(100)
//			    				.click()
//			    				.pause(100)
//			    				.build();
//					  		seriesofactions3.perform();
			    		
					    		
					    		Thread.sleep(1500);
					    		driver.findElement(By.xpath(OR.SaveleadAdvisor)).click();
					  //  		sleep();
					  //  		Thread.sleep(2000);
					    		//this.waitForElementExists(OR.SuccessMessage_Greencolor);
					  
	    		                this.waitForElementExists("//div/*[contains(text(),'"+"Business Contact Information"+"')]");
	    		
//	    		if  (Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_PreviousAdvisorContactInformationLbl+"')]")))==true){
//	    			driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_PreviousAdvisorContactInformationLbl+"')]")).click();
//	    			Exists(driver.findElement(By.xpath("//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div")));
//	    		}
//	    		
//	    		//this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div")), testData.get("leadAdvisor").toString());
//	    		this.selectCombobox(OR.AddClientPage_FirmsLeadAdvisor, testData.get("leadAdvisor").toString());
//	    		Date d=new Date();
//				String timestamp=d.toString().replace(":", "").replace(" ", "");
//	      		testData.put("NameKeyToQueryDB",testData.get("previousLeadAdvisor").toString()+timestamp);
//	    		enterInput(OR.AddClientPage_PreviousLeadAdvisor,testData.get("previousLeadAdvisor").toString()+timestamp);
//	    		enterInput(OR.AddClientPage_PreviousAdvisorFirm,testData.get("previousAdvisorFirm").toString());
//	    		enterDate(OR.AddClientPage_PreviousAdvisoryContractExpiry, testData.get("previousAdvisoryContractExpiry").toString(), ""); 
//	    		enterInput(OR.AddClientPage_PrimaryContactNameinEmma,testData.get("PrimaryContactNameinEmma").toString());
//	    		enterInput(OR.AddClientPage_PrimaryContactPhone,testData.get("primaryContactPhone").toString());
//	    		enterInput(OR.AddClientPage_PrimaryContactEmail,testData.get("primaryContactEmail").toString());
//	    		selectDropdownValue("Activity Subtype",testData.get("activitySubtype").toString());
//	    		
//	    		if (testData.get("activitySubtype").toString().equalsIgnoreCase("Other (please specify)"))
//	    			enterInputValue("Other Activity Subtype",testData.get("otherActivitySubtype").toString());
//	    		
//	    		selectIssuer(testData.get("issuer").toString());
//
//	    		selectDropdownValue("Primary Sector",testData.get("primarySector").toString());
//	    		selectDropdownValue("Secondary Sector",testData.get("secondarySector").toString());
//	    		selectLeadAdvisor(testData.get("leadAdvisor").toString());
//	    		enterIssueName(testData.get("issueName").toString());
//	    		enterInputValue("Project Description / Transaction Name",testData.get("projectDescription").toString());
//	    		selectRelatedTransactionType(testData.get("relatedTransactionType").toString());
//	    		selectRelatedTransactionIds(testData.get("relatedTransactionsIds").toString());
//	    		//enterInputValue("Notes / Instructions",testData.get("notes").toString());
//	    		enterNotes(testData.get("notes").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterAdminNewUserClientData: Successful - "+SuccessFontColorSuffix);
	  
	    		return(testData.get("NameKeyToQueryDB").toString());

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Derivative Transaction Page - enterAdminNewUserClientData - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterAdminNewUserClientData - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterMaster_LinkCusipData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
	    {
	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
	    	ReadTestData readtestdata=new ReadTestData();
	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
	    	
	    //	Exists(driver.findElement(By.xpath(OR.AddClientPage_PrimaryContactEmail)));
	    	
//	    	WebElement tblName=driver.findElement(By.xpath("//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table"));
//	    	List<WebElement> tblRows=tblName.findElements(By.tagName("tr"));
//	    	int tblRowsCount=tblRows.size();
//	    	
//	    	path("//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table//td[2]/div/input")).getAttribute("class")
//	    	//Loop will execute till the last row of table.
//	    	for (int row = 1; row < tblRowsCount; row++) {
//	    	    //To locate columns(cells) of that specific row.
//	    	    List < WebElement > Columns_row = tblRows.get(row).findElements(By.tagName("td"));
//	    	    //To calculate no of columns (cells). In that specific row.
//	    	    int columns_count = Columns_row.size();
//	    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
//	    	    //Loop will execute till the last cell of that specific row.
//	    	    
////	    	    Columns_row.get(1).findElement(By.xpath("(//div[[@name='rw-input rw-dropdown-list-input']])[1]")).sendKeys("APPROPRIATIONS");
////	    	    Columns_row.get(1).findElement(By.xpath("(//input[[@name='associatedCusip6']])[1]")).sendKeys("AnilK");
//	    	    //Columns_row.get(1).findElement(By.xpath("//div[[@name='rw-input rw-dropdown-list-input']]")).sendKeys("APPROPRIATIONS");
//	    	    Columns_row.get(1).findElement(By.xpath("//input[[@name='associatedCusip6']]")).sendKeys("AnilK");
//	    	    for (int column = 0; column < columns_count; column++) {
//	    	        // To retrieve text from that specific cell.
//	    	        String celtext = Columns_row.get(column).getText();
//	    	        String celtext1 = Columns_row.get(column).getAttribute("value");
//	    	       // Columns_row.get(column).findElement(by)
//	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
//	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext1);
//	    	    }
//	    	    System.out.println("-------------------------------------------------- ");
//	    	}
	    	
	    	//working xpath - driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table//td[2]//input)[2]")).getAttribute("class");
	    //	int i=1; 
	   // 	selectCombobox(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkCUSIPTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr["+i+"]/td[1]//div[@role='combobox'])[1]")),MasterTestDataMap.get("debtType").toString());
	   // 	enterInputValue(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkCUSIPTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr["+i+"]/td[2]//input)[1]")),MasterTestDataMap.get("debtType").toString());
	//sanddep
	    	
	    		    	
	  	    selectDropdown(OR.linkdebt_type,MasterTestDataMap.get("debtType").toString() );
	  		
	  	    enterInput(OR.Linkdebt_description,MasterTestDataMap.get("debtdescription").toString());
	  	    enterInput(OR.Cusip_data,MasterTestDataMap.get("Cusip").toString());
	  	    driver.findElement(By.xpath(OR.save_cusip)).click();
	  	//	sleep();
	  	  //this.waitForElementExists("//div[@class='Toastify__toast Toastify__toast--success']");  
	    	Thread.sleep(1500);
	    	
	    	
	    
	    }
	    
	    // Working code - driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]//li[contains(text(),'Obligor')]")).getAttribute("class")
	    public void enterMaster_LinkBorrowersData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
	    {
	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
	    	ReadTestData readtestdata=new ReadTestData();
	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
	    /*	
	    	Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_RelationshipLbl+"')]")));
	    	
	    	WebElement cCombobox=driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]"));
	    	cCombobox.click();
	    	Exists(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("relationship").toString().trim()+"')]")));
	    	WebElement sListItem=driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("relationship").toString().trim()+"')]"));
	    	//selectCombobox(cCombobox);
	    	sListItem.click();
	    	
	    	enterInputValue(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[2]//input)[1]")),MasterTestDataMap.get("firmName").toString());
	    	
	    	cCombobox=driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[3]//div[@role='combobox'])[1]"));
	    	cCombobox.click();
	    	Exists(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[3]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("debtType").toString().trim()+"')]")));
	    	sListItem=driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[3]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("debtType").toString().trim()+"')]"));
	    	sListItem.click();

	    	enterInputValue(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[4]//input)[1]")),MasterTestDataMap.get("associatedCusip6").toString());
	    	
	    	enterDateInput(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[5]//input)[1]")), MasterTestDataMap.get("startDate").toString(), "");
	    	
	    	enterDateInput(driver.findElement(By.xpath("(//*[contains(text(),'"+OR.AddClientPage_LinkBorrowersObligorsTblLbl+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[6]//input)[1]")), MasterTestDataMap.get("endDate").toString(), "");
	    
	    */
	    	String randomString1=RandomStringUtils.randomAlphabetic(4).toUpperCase();
	    	
	    	//sandeep
	    	 selectDropdown(OR.Relationship_Dropdown,MasterTestDataMap.get("relationship").toString() );
              String b= MasterTestDataMap.get("firmName").toString();
	    	 










WebElement wb14=driver.findElement(By.xpath(OR.linkObligor_firmName));
Actions builder14=new Actions(driver);
Action seriesofactions14=builder14
        .moveToElement(wb14)
	   // .click()
		.pause(1500)
		.click()
		.pause(1500)
		.sendKeys(wb14,b+randomString1)
		.pause(2000)
		.click()
		.pause(4000)
	    .build();
	    seriesofactions14.perform();
		Thread.sleep(4000);
		
		wb14.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='rw-list-option rw-state-focus' and contains(text(),'Create option')]"));
		
		
		
		WebElement wb15=driver.findElement(By.xpath("//li[@class='rw-list-option rw-state-focus' and contains(text(),'Create option')]"));
		builder14=new Actions(driver);
		            seriesofactions14=builder14
		            		//.pause(200)
				.moveToElement(wb15)
				.pause(100)
				.sendKeys(Keys.ENTER)
				.pause(100)
				.build();
	    		seriesofactions14.perform();
		 	
	
						Thread.sleep(4000);
					    		
					    	
	    	 
	    	 selectDropdown(OR.link0bligors_Debttype,MasterTestDataMap.get("debtType").toString() );
	    	 
	    	 
	     	 enterInput(OR.linkObligors_AssociatedCusip,MasterTestDataMap.get("associatedCusip6").toString());
	    	
	    	 
	    //	 enterDate(OR.linkObligors_Startdate,MasterTestDataMap.get("startDate").toString().trim(),"");
	   // 	 WebElement datebox=driver.findElement(By.xpath(OR.linkObligors_AssociatedCusip));
	   // 	 datebox.sendKeys(MasterTestDataMap.get("associatedCusip6"));
	   // 	 datebox.sendKeys(Keys.TAB);
	  // enterDateInput(OR.linkObligors_Enddate,MasterTestDataMap.get("endDate").toString(),testData.get("TestBrowser").toString().trim());

	    	  
	   	      driver.findElement(By.xpath(OR.linkObligors_savebutton)).click();
	    	 
	    	 
	    	Thread.sleep(2000);
	    
	    	
	   	   //this.waitForElementExists("//div[@class='Toastify__toast Toastify__toast--success']");
	    	
	    	
	    	
	    
	    }
	    

	    
	    
//	    public void enterMaster_LinkBorrowersData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
//	    {
//	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
//	    	ReadTestData readtestdata=new ReadTestData();
//	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
//	    	
//	    	selectComboboxByName("Relationship",MasterTestDataMap.get("relationship").toString());
//	    	enterInputValue("Firm Name",MasterTestDataMap.get("firmName").toString());
//	    
//	    }
	    
//	    public String NameKeyToQueryDB() 
//	    {
//	    	return(testData.get("NameKeyToQueryDB").toString());
//	    }

//	    public void getMasterData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
//	    {
//	    	Recordset recordsetTestData;
//	    	ArrayList<String> arrayListTestDataColumns;
//	    	//ReadTestData xyz=new ReadTestData();
//	    	HashMap<String, String> tableColumnNames=new HashMap<>();
//	    	HashMap<String, String> mastertestdata=new HashMap<>();
//	    	
//	    	recordsetTestData=ReadTestData.readMasterDataTestDataBySpecifiedColumnName(sTabName, "key", sColumnValue);
//	    	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns(sTabName);
//	    	tableColumnNames=ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
//	    	
//       	 //Map<Object, Object> datamap = new HashMap<>();
//	    	
//	        	// for (int j = 0; j < lastCellNum; j++) {
//	        		 //datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
//	        			recordsetTestData.next();
//	        		    Set set = tableColumnNames.entrySet();
//	        		    Iterator iterator = set.iterator();
//	        		 while(iterator.hasNext()) {
//	        	         Map.Entry mentry = (Map.Entry)iterator.next();
//	        	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//	        	         System.out.println(mentry.getValue());
//	        	         sColumnName=mentry.getValue().toString();
//	        	         
//	        	         try{
//	        	         if (!sColumnName.contains("COLUMN_"))
//	        	        	 System.out.print(recordsetTestData.getField(sColumnName));
//	        	         mastertestdata.put(sColumnName, recordsetTestData.getField(sColumnName).trim());
//	        	         }catch(Exception e){}
//	        	         
//	        	         
//	        		 }
//	        		 System.out.print("Master Test Data: "+mastertestdata);
//	    }
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
