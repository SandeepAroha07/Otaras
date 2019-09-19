package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.activity;

import java.io.File;
import java.util.Date;
import java.util.Map;
import java.util.Random;

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

public class BaseDebtDocumentsPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.DebtDocumentsPage_Add)	
	    public WebElement Add;
	   @FindBy(xpath = OR.DebtDocumentsPage_PickStatus)	
	    public WebElement PickStatus;
	   

	   
	   public boolean Exists(){
	    	return super.Exists(Add); 
	    	
		}

	    public void enterDebtDocuments_ForAllTrans(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		int j=1;
	    		
	    		String tblName="";
	    		
	    		if (testData.get("Activity").toString().equalsIgnoreCase("bond issue"))
	    			tblName=OR.DebtDocumentsPage_UploadDealsDocumentsLbl;
	    		else if (testData.get("Activity").toString().equalsIgnoreCase("bank loan"))
	    			tblName=OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl;
	    		else if (testData.get("TranName").toString().equalsIgnoreCase("derivative"))
	    			tblName=OR.DebtDocumentsPage_UploadDerivativeDocumentsTblNameLbl;
	    		else if (testData.get("TranName").toString().equalsIgnoreCase("ma-rfp"))
	    			tblName=OR.DebtDocumentsPage_UploadMARFPDocumentsTblNameLbl;
	    		else if (testData.get("TranName").toString().equalsIgnoreCase("other activity"))
	    			tblName=OR.DebtDocumentsPage_UploadOtherPDocumentsTblNameLbl;
	    		
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+"Upload Transaction Documents"+"')]/parent::div//"+"following-sibling::div//tr["+1+"]/td[1]//span[@class='rw-select']")).get
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+"Upload MaRfp Documents"+"')]/parent::div//"+"following-sibling::div")).getAttribute("class");
	    		
	//WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']"));
//	WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div//"+"following-sibling::div//tr["+j+"]/td[1]//div[@class='Select-value']"));
//	    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
//	    		//String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
//	    		Actions builder=new Actions(driver);
//	    		Action seriesofactions=builder
//	    				.moveToElement(wb1)
//	    				.click()
//	    				.sendKeys(wb1,testData.get("category").toString())
//	    				.sendKeys(Keys.TAB)
//	    				.build();
//	    		seriesofactions.perform();
	    		
	    		//was working - selectComboboxCustom("//*[contains(text(),'"+tblName+"')]/parent::div//"+"following-sibling::div//tr["+j+"]/td[1]//div[@class='Select-value']",testData.get("category").toString());
	    		selectComboboxCustom("//*[contains(text(),'"+tblName+"')]/parent::div//"+"following-sibling::div//tr["+j+"]/td[1]//span[@class='rw-select']",testData.get("category").toString());
	    		
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")).sendKeys(testData.get("category").toString());
				this.selectComboboxCustom("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@class='Select-value']", testData.get("category").toString());
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")));
				this.selectComboboxCustom("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@class='Select-value']", testData.get("subcategory").toString());
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")).sendKeys(testData.get("subcategory").toString());
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']//li[contains(text(),'"+testData.get("subcategory").toString()+"')]")).click();
				
				Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
				String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				Exists(driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@class='Select-value']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")).click();
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']//li[contains(text(),'"+testData.get("type").toString()+"')]"))
				
				//working - this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")), testData.get("type").toString());
				this.selectComboboxCustom("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@class='Select-value']", testData.get("type").toString());
				
				
				
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")).sendKeys(testData.get("type").toString()+randomString);
				
				randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")).sendKeys(testData.get("note").toString()+randomString);
				this.enterInput("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input",testData.get("note").toString()+randomString);
				
	
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDocuments_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	   
	
	   
	    public void enterDebtDocuments_BondIssue(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		int j=1;
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")).sendKeys(testData.get("category").toString());
				this.selectCombobox("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']", testData.get("category").toString());
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")));
				this.selectCombobox("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']", testData.get("subcategory").toString());
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")).sendKeys(testData.get("subcategory").toString());
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']//li[contains(text(),'"+testData.get("subcategory").toString()+"')]")).click();
				
				Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
				String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")).click();
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']//li[contains(text(),'"+testData.get("type").toString()+"')]"))
				
				//working - this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")), testData.get("type").toString());
				this.selectCombobox("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']", testData.get("type").toString());
				
				
				
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")).sendKeys(testData.get("type").toString()+randomString);
				
				randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")).sendKeys(testData.get("note").toString()+randomString);
				this.enterInput("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input",testData.get("note").toString()+randomString);
				
	
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDocuments_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterDebtDocuments_BankLoanIssue(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		int j=1;
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")).sendKeys(testData.get("category").toString());
				this.selectCombobox("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']",testData.get("category").toString());
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")).sendKeys(testData.get("subcategory").toString());
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']//li[contains(text(),'"+testData.get("subcategory").toString()+"')]")).click();
				this.selectCombobox("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']",testData.get("subcategory").toString());
				Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
				String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				//Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")).click();
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']//li[contains(text(),'"+testData.get("type").toString()+"')]"))
				this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")), testData.get("type").toString());
				
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")).sendKeys(testData.get("type").toString()+randomString);
				
				randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")).sendKeys(testData.get("note").toString()+randomString);
				enterInput("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input",testData.get("note").toString()+randomString);
				
				
	
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDocuments_BankLoanIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
//	    public void enterDebtDocuments_BankLoanIssue(Map<Object, Object> testData) 
//	    {
//	    	
//	    	try{
//	    		int j=1;
//				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//select")));
//				driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//select")).sendKeys(testData.get("category").toString());
//				
//				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//select")));
//				driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//select")).sendKeys(testData.get("subcategory").toString());
//				
//				Date d=new Date();
//				String timestamp=d.toString().replace(":", "").replace(" ", "");
//				String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
//				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")));
//				driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")).sendKeys(testData.get("type").toString()+randomString);
//				
//				randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
//				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")));
//				driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")).sendKeys(testData.get("note").toString()+randomString);
//				
//	
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDocuments_BankLoanIssue: Successful - "+SuccessFontColorSuffix);
//	  
//	    		
//
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
//	    	}
//	    }
	    

	    public void performAction(String action) 
	    {
	    	WebElement Save=driver.findElement(By.xpath("//*[contains(text(),'"+"Save"+"')]/parent::div"));
	    	//WebElement Cancel=driver.findElement(By.xpath("//*[contains(text(),'"+"Cancel"+"')]/parent::div"));
	    	try{
	    		if (Exists(Save)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+Save.toString());
	    		if (action.equalsIgnoreCase("save"))
	    			Save.click();
//	    		else if (action.equalsIgnoreCase("cancel"))
//	    			Cancel.click();
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - Action Performed: "+action+" Successful - "+"Save: "+Save.toString()+SuccessFontColorSuffix);
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - performAction - unable to click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("performAction not entered");
	    	}
	    }
	    
	    public void uploadDocument() throws InterruptedException 
	    {    
	    	//ExistsCheck(driver.findElement(By.xpath("//input[@type='file']")));
	    	//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[6]//input")));
	    	//this.Exists(driver.findElement(By.xpath("//input[@type='file']")));
	    	WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
		  
		  File classpathRoot = new File(System.getProperty("user.dir"));
		  File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
		   int size = 15; //was 10
		    String [] fileArray = new String[size];
		    File[] files = dir.listFiles();
		    int idz = (int)(Math.random()*size);
		    fileArray[0]=files[idz].getName();

			  // File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", "EA706427.pdf");
		    File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", fileArray[0]);
			String sFilename=app.toString();  // enter the file path onto the file-selection input field
		  
//			File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
//		   int size = 10;
//		    String [] fileArray = new String[size];
//		    File[] files = dir.listFiles();
//		    for(int i =0; i<size;i++){
//		        int idz = (int)(Math.random()*size);
//		        fileArray[i]=files[idz].getName();
//		        System.out.print(fileArray[i]);
//		    }
			
	    // uploadElement.sendKeys("C://mywork//seleniumgit//munivisorautomatedtestSelenium//testAutomationAnywhere//src//test//resources//testReport//expectedscreenshots//RFQPage_firefox.png");
		
			 uploadElement.sendKeys(sFilename);
			 boolean sExists=false;
			 try{
				 sExists=this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//div")));
			 }catch(Exception e){
				 if (ExistsCheck(driver.findElement(By.xpath("//*[@id='my-table']/tbody/tr//div[1]/button")))==true)
					 driver.findElement(By.xpath("//*[@id='my-table']/tbody/tr//div[1]/button")).click();
			 }

			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//div")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//div")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//div")));
			 Thread.sleep(200);
			 
			 Random ran = new Random();
			// Assumes max and min are non-negative.
			int randomInt = idz + ran.nextInt(15 - idz + 1);
	    }
	    
	    public void uploadDocumentByIndex(int docIndex) throws InterruptedException 
	    {    
	    	//ExistsCheck(driver.findElement(By.xpath("//input[@type='file']")));
	    	this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[6]//input")));
	    	WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
		  
		  File classpathRoot = new File(System.getProperty("user.dir"));
		  File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
		   int size = 15; //was 10
		    String [] fileArray = new String[size];
		    File[] files = dir.listFiles();
		    //int idz = (int)(Math.random()*size);
		    int idz=docIndex;
		    fileArray[0]=files[idz].getName();

			  // File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", "EA706427.pdf");
		    File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", fileArray[0]);
			String sFilename=app.toString();  // enter the file path onto the file-selection input field
		  
//			File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
//		   int size = 10;
//		    String [] fileArray = new String[size];
//		    File[] files = dir.listFiles();
//		    for(int i =0; i<size;i++){
//		        int idz = (int)(Math.random()*size);
//		        fileArray[i]=files[idz].getName();
//		        System.out.print(fileArray[i]);
//		    }
			
	    // uploadElement.sendKeys("C://mywork//seleniumgit//munivisorautomatedtestSelenium//testAutomationAnywhere//src//test//resources//testReport//expectedscreenshots//RFQPage_firefox.png");
		
			 uploadElement.sendKeys(sFilename);
			 boolean sExists=this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 Thread.sleep(200);
			 
			 //Random ran = new Random();
			// Assumes max and min are non-negative.
			 //int randomInt = idz + ran.nextInt(15 - idz + 1);
	    }
	    
	    
	    public void uploadDocumentBankLoan() throws InterruptedException 
	    {    
	    	//ExistsCheck(driver.findElement(By.xpath("//input[@type='file']")));
	    	this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[6]//input")));
	    	WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
		  
		  File classpathRoot = new File(System.getProperty("user.dir"));
		  File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
		   int size = 15;
		    String [] fileArray = new String[size];
		    File[] files = dir.listFiles();
		    int idz = (int)(Math.random()*size);
		    fileArray[0]=files[idz].getName();

			  // File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", "EA706427.pdf");
		    File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", fileArray[0]);
			String sFilename=app.toString();  // enter the file path onto the file-selection input field
		  
//			File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
//		   int size = 10;
//		    String [] fileArray = new String[size];
//		    File[] files = dir.listFiles();
//		    for(int i =0; i<size;i++){
//		        int idz = (int)(Math.random()*size);
//		        fileArray[i]=files[idz].getName();
//		        System.out.print(fileArray[i]);
//		    }
			
	    // uploadElement.sendKeys("C://mywork//seleniumgit//munivisorautomatedtestSelenium//testAutomationAnywhere//src//test//resources//testReport//expectedscreenshots//RFQPage_firefox.png");
		
			 uploadElement.sendKeys(sFilename);
			 boolean sExists=this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 Thread.sleep(200);
	    }
	    
	    public void uploadDocumentBankLoanVyIndex(int docIndex) throws InterruptedException 
	    {    
	    	//ExistsCheck(driver.findElement(By.xpath("//input[@type='file']")));
	    	this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[6]//input")));
	    	WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
		  
		  File classpathRoot = new File(System.getProperty("user.dir"));
		  File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
		   int size = 15;
		    String [] fileArray = new String[size];
		    File[] files = dir.listFiles();
		    //int idz = (int)(Math.random()*size);
		    int idz=docIndex;
		    fileArray[0]=files[idz].getName();

			  // File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", "EA706427.pdf");
		    File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", fileArray[0]);
			String sFilename=app.toString();  // enter the file path onto the file-selection input field
		  
//			File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
//		   int size = 10;
//		    String [] fileArray = new String[size];
//		    File[] files = dir.listFiles();
//		    for(int i =0; i<size;i++){
//		        int idz = (int)(Math.random()*size);
//		        fileArray[i]=files[idz].getName();
//		        System.out.print(fileArray[i]);
//		    }
			
	    // uploadElement.sendKeys("C://mywork//seleniumgit//munivisorautomatedtestSelenium//testAutomationAnywhere//src//test//resources//testReport//expectedscreenshots//RFQPage_firefox.png");
		
			 uploadElement.sendKeys(sFilename);
			 boolean sExists=this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadBankDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 Thread.sleep(200);
	    }
	    
	    
	    public void verifyDataEntered(Map<Object, Object> verifytestData){
	    	
	    }
	    
	    
	    public void uploadRandomDocument() 
	    {    
		  WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));

		 
		  
		  File classpathRoot = new File(System.getProperty("user.dir"));
			   File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//expectedscreenshots//", "RFQPage_firefox.png");
			String sFilename=app.toString();  // enter the file path onto the file-selection input field
		  
//		    File[] files = dir.listFiles();
//
//		    Random rand = new Random();
//
//		    File file = files[rand.nextInt(files.length)];
			
			
	    // uploadElement.sendKeys("C://mywork//seleniumgit//munivisorautomatedtestSelenium//testAutomationAnywhere//src//test//resources//testReport//expectedscreenshots//RFQPage_firefox.png");
		
			 uploadElement.sendKeys(sFilename);
	    }
	    

	   
}



