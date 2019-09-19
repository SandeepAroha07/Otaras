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
import com.codoid.products.fillo.Recordset;
import com.mongodb.client.MongoCollection;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.labels.labels;
import com.otaras.testautomation.objectrepository.OR;

public class BaseDebtRatingPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.DebtRatingPage_Add)	
	    public WebElement Add;

	   
	   public boolean Exists(){
	    	return super.Exists(Add); 
	    	
		}
	   
	

	    
	
	   
	    //public void enterDebtParticipants_BondIssue(Map<Object, Object> testData, Object[][] tranData) 
	    public void enterDebtRating_BondIssue(Map<Object, Object> testData, Recordset recordsubsetTestData) 
	    {
	    	
	    	try{
//	    		while()
//	    		{
//	    			driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//tr[2]/td[1]//input")).getAttribute("value")
//	    		}
	    		//Thread.sleep(10000);
	    		int lastRowNumTransactions=recordsubsetTestData.getCount();
	    		int j=1;
	    		//int k=j-1;
	    		
	    		int tblSize=0;
//	    		try{
//	    		tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+OR.DebtRatingPage_DealRatingsLbl+"')]/parent::div/following-sibling::div//tbody")).size();
//	    		}catch(Exception e){}
//	    			
////	    		if (tblSize==3)
////	    			j=1;
////	    		else
////	    			j=tblSize-2;
//	    		j=tblSize-1;
	    		while(lastRowNumTransactions>0)
	    		{
	    			recordsubsetTestData.next();
	    			//testReport.log(Status.INFO,"Entered - enterDebtParticipants_BondIssue");
	    			//String action	=recordsubsetTestData.getField("action");
	    			
	    			String seriesCode="";
	    			
	    			
	    			seriesCode=	"fromtestdatasheet";
	    			String ratingAgency=	"fromtestdatasheet";
	    			String longTermRating=	"fromtestdatasheet";
	    			String longTermOutlook	="fromtestdatasheet";
	    			String shortTermRating="fromtestdatasheet";
	    			String shortTermOutlook="fromtestdatasheet";

	    			String tblName="";
	    			
	    			
	    			if (testData.get("Activity").toString().equalsIgnoreCase("bond issue"))
		    			tblName=OR.DebtRatingPage_DealRatingsLbl;
//		    		else if (testData.get("Activity").toString().equalsIgnoreCase("bank loan"))
//		    			tblName=OR.DebtParticipantsPage_AddLoanParticipantsLbl;
//		    		else if (testData.get("TranName").toString().equalsIgnoreCase("derivative"))
//		    			tblName=OR.DebtDocumentsPage_UploadDerivativeDocumentsTblNameLbl;
//		    		else if (testData.get("TranName").toString().equalsIgnoreCase("ma-rfp"))
//		    			tblName="Add Ma-RFP Participants";
		    		else if (testData.get("TranName").toString().equalsIgnoreCase("other activity"))
		    			tblName="Other Ratings";	
	    			
	    			//tblName=OR.DebtRatingPage_DealRatingsLbl;
	    			
	    			//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div//button[contains(text(),'Reset')]")));
	    			//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtPricingPage_AddSeriesTblNameLbl+"')]/parent::div//button[contains(text(),'Reset')]")).click();
	    			//if (action.equalsIgnoreCase("add"))
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div//button")).click();
	    				//Thread.sleep(2000);
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div//button[contains(text(),'Add')]")));
	    				//Thread.sleep(2000);
	    				try{
	    				driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div//button[contains(text(),'Add')]")).click();
	    				tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody")).size();
	    	    		j=tblSize-1;
	    				}catch(Exception e){}
	    				//Thread.sleep(2000);
	    				j=1;   //Change as shows on top - always set to 1. If bottom, comment this line
	    				this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[1]//div[@role='combobox']", seriesCode);
	    				this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//div[@role='combobox']", ratingAgency);
	    				this.selectDropdown("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[3]//select", longTermRating);
	    				this.selectDropdown("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[4]//select", longTermOutlook);
	    				this.selectDropdown("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[5]//select", shortTermRating);
	    				this.selectDropdown("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[6]//select", shortTermOutlook);
	    				
	    				Click("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[7]//i");

	    				//verifySpecifiedElementExistsByLabel("Added agency rating successfully");
	    	
	    				
	    			lastRowNumTransactions=lastRowNumTransactions-1;
	    			j=j+1;
	    			//k=k+1;
	    		}
	    		

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtPricing_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - enterDebtParticipants_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtPricing_BondIssue - Deal data enty failed");
	    	}
	    }
	   
	    
	    public void enterDebtCEPRating_BondIssue(Map<Object, Object> testData, Recordset recordsubsetTestData) 
	    {
	    	
	    	try{
//	    		while()
//	    		{
//	    			driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//tr[2]/td[1]//input")).getAttribute("value")
//	    		}
	    		//Thread.sleep(10000);
	    		int lastRowNumTransactions=recordsubsetTestData.getCount();
	    		int j=1;
	    		//int k=j-1;
	    		
	    		int tblSize=0;
//	    		try{
//	    		tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+OR.DebtRatingPage_DealCEPRatingsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]")).size();
//	    		}catch(Exception e){}
//	    			
//	    		if (tblSize==3)
//	    			j=1;
//	    		else
//	    			j=tblSize-2;
	    		
	    		
	    		while(lastRowNumTransactions>0)
	    		{
	    			recordsubsetTestData.next();
	    			//testReport.log(Status.INFO,"Entered - enterDebtParticipants_BondIssue");
	    			//String action	=recordsubsetTestData.getField("action");
	    			
	    			String seriesCode="";
	    			
	    			
	    			seriesCode=	"fromtestdatasheet";
	    			String ratingAgency=	"fromtestdatasheet";
	    			String longTermRating=	"fromtestdatasheet";
	    			String longTermOutlook	="fromtestdatasheet";
	    			String shortTermRating="fromtestdatasheet";
	    			String shortTermOutlook="fromtestdatasheet";

	    			String tblName="";
//	    			tblName=OR.DebtRatingPage_DealCEPRatingsLbl;
	    			
	    			if (testData.get("Activity").toString().equalsIgnoreCase("bond issue"))
		    			tblName=OR.DebtRatingPage_DealCEPRatingsLbl;
//		    		else if (testData.get("Activity").toString().equalsIgnoreCase("bank loan"))
//		    			tblName=OR.DebtParticipantsPage_AddLoanParticipantsLbl;
//		    		else if (testData.get("TranName").toString().equalsIgnoreCase("derivative"))
//		    			tblName=OR.DebtDocumentsPage_UploadDerivativeDocumentsTblNameLbl;
//		    		else if (testData.get("TranName").toString().equalsIgnoreCase("ma-rfp"))
//		    			tblName="Add Ma-RFP Participants";
		    		else if (testData.get("TranName").toString().equalsIgnoreCase("other activity"))
		    			tblName="Other CEP Ratings";	
	    			
	    			
	    			//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div//button[contains(text(),'Reset')]")));
	    			//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtPricingPage_AddSeriesTblNameLbl+"')]/parent::div//button[contains(text(),'Reset')]")).click();
	    			//if (action.equalsIgnoreCase("add"))
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div//button")).click();
	    				//Thread.sleep(2000);
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div//button[contains(text(),'Add')]")));
	    				//Thread.sleep(2000);
	    				try{
	    				driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div//button[contains(text(),'Add')]")).click();
	    				tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody")).size();
	    	    		j=tblSize-1;
	    				}catch(Exception e){}
	    				//Thread.sleep(2000);
	    				
	    				j=1;  //set this to 1 as new row added on top
	    				
	    				this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[1]//div[@role='combobox']", seriesCode);
	    				//this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//div[@role='combobox']", ratingAgency);
	    				
	    				Exists(driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//div[@role='combobox']")));
	    	    		WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//div[@role='combobox']"));
	    	    		//WebElement wb11=driver.findElement(By.xpath("//li/*[contains(text(),'"+testData.get("entityName").toString()+randomString+"')]"));
	    	    		
	    		    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
	    	    		String randomString=RandomStringUtils.randomAlphabetic(10).toUpperCase();
	    		    		Actions builder=new Actions(driver);
	    		    		Action seriesofactions=builder
	    		    				.moveToElement(wb1)
	    		    				.click()
	    		    				.pause(900)
	    		    				.sendKeys(wb1,ratingAgency+randomString)
	    		    				.pause(900)
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
	    		    		WebElement wb11=driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//div[@role='combobox']//ul[2]/li"));
	    		    		builder=new Actions(driver);
	    		    		seriesofactions=builder
	    		    				.moveToElement(wb11)
	    		    				.pause(100)
	    		    				.click()
	    		    				.pause(100)
//	    		    				.sendKeys(wb1,testData.get("entityName").toString()+randomString)
//	    		    				.sendKeys(Keys.TAB)
	    		    				.build();
	    		    		seriesofactions.perform();
	    		    		
	    		    		Thread.sleep(200);
	    				
	    				this.selectDropdown("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[3]//select", longTermRating);
	    				this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[4]//div[@role='combobox']", longTermOutlook);
	    				this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[5]//div[@role='combobox']", shortTermRating);
	    				this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[6]//div[@role='combobox']", shortTermOutlook);
	    				this.selectCombobox("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[7]//div[@role='combobox']", shortTermOutlook);
	    				Thread.sleep(2000);
	    				Click("//*[contains(text(),'"+tblName+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[8]//i");

	    					Thread.sleep(2000);
	    				//verifySpecifiedElementExistsByLabel("Added cep ratings successfully");
	    	
	    				
	    			lastRowNumTransactions=lastRowNumTransactions-1;
	    			j=j+1;
	    			//k=k+1;
	    		}
	    		

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtPricing_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - enterDebtParticipants_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtPricing_BondIssue - Deal data enty failed");
	    	}
	    }

//	    public void performAction(String action) 
//	    {
//	    	WebElement Save=driver.findElement(By.xpath("//*[contains(text(),'"+"Save"+"')]/parent::div"));
//	    	//WebElement Cancel=driver.findElement(By.xpath("//*[contains(text(),'"+"Cancel"+"')]/parent::div"));
//	    	try{
//	    		if (Exists(Save)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+Save.toString());
//	    		if (action.equalsIgnoreCase("save"))
//	    			Save.click();
////	    		else if (action.equalsIgnoreCase("cancel"))
////	    			Cancel.click();
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - Action Performed: "+action+" Successful - "+"Save: "+Save.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - performAction - unable to click"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("performAction not entered");
//	    	}
//	    }
	    
	    public void verifyDataEntered(Map<Object, Object> verifytestData){
	    	
	    }
	   
}

