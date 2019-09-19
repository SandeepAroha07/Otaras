package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.activity;

import java.util.Date;
import java.util.Map;

import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
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

public class BaseDebtPricingPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.DebtPricingPage_Add)	
	    public WebElement Add;

	   
	   public boolean Exists(){
	    	return super.Exists(Add); 
	    	
		}
	   
	

	    
	
	   
	    //public void enterDebtParticipants_BondIssue(Map<Object, Object> testData, Object[][] tranData) 
	    public void enterDebtPricing_BondIssue(Map<Object, Object> testData, Recordset recordsubsetTestData) 
	    {
	    	
	    	try{
//	    		while()
//	    		{
//	    			driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//tr[2]/td[1]//input")).getAttribute("value")
//	    		}
	    		//Thread.sleep(10000);
	    		int lastRowNumTransactions=recordsubsetTestData.getCount();
	    		int j=1;
	    		int tblSize=0;
	    		try{
	    		tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tr["+1+"]")).size();
	    		}catch(Exception e){
	    			
	    		}
	    			
	    		if (tblSize==0)
	    			j=1;
	    		else
	    			j=tblSize;
	    		//int k=j-1;
	    		while(lastRowNumTransactions>0)
	    		{
	    			recordsubsetTestData.next();
	    			//testReport.log(Status.INFO,"Entered - enterDebtParticipants_BondIssue");
	    			String action	=recordsubsetTestData.getField("action");
	    			String seriesCode=	recordsubsetTestData.getField("seriesCode");
	    			String description=	recordsubsetTestData.getField("description");
	    			String tag=	recordsubsetTestData.getField("tag");
	    			String addSeries_action	=recordsubsetTestData.getField("addSeries_action");
	    			String actionstatus=recordsubsetTestData.getField("addSeries_actionstatus");
	    			
	    			
	    			String pc_principal	=recordsubsetTestData.getField("pc_principal");
	    			String pc_securityType=	recordsubsetTestData.getField("pc_securityType");
	    			
	    			String pageAction=recordsubsetTestData.getField("pageAction");
	    			
	    			
	    			//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div//button[contains(text(),'Reset')]")));
	    			//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtPricingPage_AddSeriesTblNameLbl+"')]/parent::div//button[contains(text(),'Reset')]")).click();
	    			if (action.equalsIgnoreCase("add"))
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div//button")).click();
	    				//Thread.sleep(2000);
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div//button[contains(text(),'Add')]")));
	    				//Thread.sleep(2000);
	    				try{
	    				driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div//button[contains(text(),'Add')]")).click();
	    				}catch(Exception e){}
	    				//Thread.sleep(2000);
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[1]//input")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[1]//input")).sendKeys(seriesCode+j);
	    				
	    				j=1;  //set this to 1 as new row added on top
	    				this.enterInput("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[1]//input", seriesCode+j);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//input")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//input")).sendKeys(description);
	    				this.enterInput("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//input", description);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//li[contains(text(),'"+uwt_firmname+"')]")));
	    				//driver.findElement(By.xpath("//li[contains(text(),'"+uwt_firmname+"')]")).click();
//	    				this.Exists(driver.findElement(By.xpath("(//li[contains(text(),'"+uwt_firmname+"')])["+j+"]")));
//	    				driver.findElement(By.xpath("(//li[contains(text(),'"+uwt_firmname+"')])["+j+"]")).click();
//	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[3]//input")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[3]//input")).sendKeys(tag);
	    				this.enterInput("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[3]//input", tag);
	    				
	    				
//	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//tr["+j+"]/td[4]//input[@name='liabilityPerc']")));
//	    				driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtBondParticipantsPage_UnderwritingTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[4]//input[@name='liabilityPerc']")).sendKeys(uwt_liability);
//	    				
//	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//tr["+j+"]/td[5]//input[@name='managementFeePerc']")));
//	    				driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtBondParticipantsPage_UnderwritingTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[5]//input[@name='managementFeePerc']")).sendKeys(uwt_managementfee);
//	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[4]//i")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[4]//i")).click();
	    				this.Click("//*[contains(text(),'"+OR.DebtPricingPage_AddSeriesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[4]//i");
	    				
	    				
	    				verifySpecifiedElementExistsByLabel(seriesCode);
	    				this.Exists(driver.findElement(By.xpath("//li/a/*[contains(text(),'"+seriesCode+"')]")));
//	    				if (j==1)
//	    					driver.findElement(By.xpath("//li/a/*[contains(text(),'"+seriesCode+"')]")).click();
//	    				else
	    					//driver.findElement(By.xpath("//li/a/*[contains(text(),'"+seriesCode+j+"')]")).click();
	    					this.Click("//li/a/*[contains(text(),'"+seriesCode+j+"')]");
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Principal"+"')]")));
	    				
	    				enterInput(OR.DebtDocumentsPage_Principal,pc_principal);
	    				this.selectDropdown(OR.DebtDocumentsPage_SecurityType,pc_securityType);
	    				
	    				this.performAction(pageAction);
	    				verifySpecifiedElementExistsByLabel(seriesCode);
	    				
	    			//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//button[contains(text(),'Add')]")).getAttribute("class");
//	    			System.out.println(recordsubsetTestData.getField("uwt_add"));
//	    			System.out.println(recordsubsetTestData.getField("uwt_add"));
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
	    
	    public void verifyDataEntered(Map<Object, Object> verifytestData){
	    	
	    }
	   
}

