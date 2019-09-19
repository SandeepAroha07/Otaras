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

public class BaseDebtParticipantsPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.DebtParticipantsPage_Add)	
	    public WebElement Add;

	   
	   public boolean Exists(){
	    	return super.Exists(Add); 
	    	
		}
	   
	
//	    public void selectFirmName(String leadAdvisor) 
//	    {
//	    	try{
//	    		Thread.sleep(1000);
//	    		if (Exists(LeadAdvisor)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+LeadAdvisor.toString());
//	      		//String webelementName="Assigned to";
//	      		//String eType="input";
//	      	
//	      		LeadAdvisor.click();
//	      		Thread.sleep(1000);
//	      		driver.findElement(By.xpath("//li[contains(text(),'"+leadAdvisor+"')]")).click();
//	      		Thread.sleep(1200);
//	      		LeadAdvisor.click();
//	      		Thread.sleep(1000);
////	      		LeadAdvisor.sendKeys(Keys.TAB);
////	      		Thread.sleep(400);
//	      		LeadAdvisor.click();
//	      		Thread.sleep(900);
//	      		//IssueName.click();
//	      		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectLeadAdvisor Successful - "+LeadAdvisor.toString()+SuccessFontColorSuffix);
//		}
//   	catch (Exception e)
//   	{
//   		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectLeadAdvisor - unable to select combobox value"+e+ErrorFontColorSuffix);
//   		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//   		throw new NoSuchElementException ("selectLeadAdvisor not selected");
//   	}
//	}
	    
	
	   
	    //public void enterDebtParticipants_BondIssue(Map<Object, Object> testData, Object[][] tranData) 
	    public void enterDebtParticipants_BondIssue(Map<Object, Object> testData, Recordset recordsubsetTestData) 
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
	    		
	    		
	    		while(lastRowNumTransactions>0)
	    		{
	    			recordsubsetTestData.next();
	    			testReport.log(Status.INFO,"Entered - enterDebtParticipants_BondIssue");
	    			String uwt_add	=recordsubsetTestData.getField("uwt_add");
	    			String uwt_addtodl=	recordsubsetTestData.getField("uwt_addtodl");
	    			String uwt_firmname=	recordsubsetTestData.getField("uwt_firmname");
	    			String uwt_roleinsyndicate=	recordsubsetTestData.getField("uwt_roleinsyndicate");
	    			String uwt_liability	=recordsubsetTestData.getField("uwt_liability");
	    			String uwt_managementfee=	recordsubsetTestData.getField("uwt_managementfee");
	    			String uwt_action	=recordsubsetTestData.getField("uwt_action");
	    			String uwt_actionstatus=recordsubsetTestData.getField("uwt_actionstatus");
	    			
//	    			String odp_participanttype	=recordsubsetTestData.getField("odp_participanttype");
//	    			String odp_firmname=	recordsubsetTestData.getField("odp_firmname");
//	    			String odp_contactname	=recordsubsetTestData.getField("odp_contactname");
//	    			String odp_addresses=recordsubsetTestData.getField("odp_addresses");
	    			
	    						

	    			
	    			this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Reset')]")));
	    			driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Reset')]")).click();
	    			if (uwt_add.equalsIgnoreCase("add"))
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div//button")).click();
	    				//Thread.sleep(2000);
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Add')]")));
	    				//Thread.sleep(2000);
	    				try{
	    				driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Add')]")).click();
	    				tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody")).size();
	    	    		j=tblSize;
	    				}catch(Exception e){}
	    				//Thread.sleep(2000);
	    				
	    				j=1;   //display order changed. New row is always 1.
	    				
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[1]//input")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//input")).click();
	    				this.Click("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[1]//input");
	    				
//	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")));
//	    				driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")).click();
//	    				
//	    				//this.Exists(driver.findElement(By.xpath("//li[contains(text(),'"+uwt_firmname+"')]")));
//	    				//driver.findElement(By.xpath("//li[contains(text(),'"+uwt_firmname+"')]")).click();
//	    				this.Exists(driver.findElement(By.xpath("(//li[contains(text(),'"+uwt_firmname+"')])["+j+"]")));
//	    				driver.findElement(By.xpath("(//li[contains(text(),'"+uwt_firmname+"')])["+j+"]")).click();
	    				
	    				
	    				this.selectCombobox("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[2]//div[@role='combobox']", uwt_firmname);
	    				
	    				this.selectDropdown("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[3]//select[@name='roleInSyndicate']", uwt_roleinsyndicate);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select[@name='roleInSyndicate']")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select[@name='roleInSyndicate']")).sendKeys(uwt_roleinsyndicate);
	    				
	    				
	    				this.enterInput("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[4]//input[@name='liabilityPerc']", uwt_liability);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[4]//input[@name='liabilityPerc']")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[4]//input[@name='liabilityPerc']")).sendKeys(uwt_liability);
	    				
	    				this.enterInput("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[5]//input[@name='managementFeePerc']", uwt_managementfee);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[5]//input[@name='managementFeePerc']")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[5]//input[@name='managementFeePerc']")).sendKeys(uwt_managementfee);
	    				
	    				
	    				Click("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[6]//i");
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//i")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//i")).click();
	    				
	    				verifySpecifiedElementExistsByLabel(uwt_actionstatus);
	    				
	    			//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//button[contains(text(),'Add')]")).getAttribute("class");
	    			System.out.println(recordsubsetTestData.getField("uwt_add"));
	    			System.out.println(recordsubsetTestData.getField("uwt_add"));
	    			lastRowNumTransactions=lastRowNumTransactions-1;
	    			j=j+1;
	    			//k=k+1;
	    		}
	    		
//	    		selectDropdownValue("Borrower or Obligor Name",testData.get("borrowerName").toString());
//	    		selectDropdownValue("Guarantor Name",testData.get("guarantorName").toString());
//	    		selectDropdownValue("Transaction Type",testData.get("transactionType").toString());
//	    		selectDropdownValue("Transaction Status",testData.get("transactionStatus").toString());
//	    		selectDropdownValue("State",testData.get("state").toString());
//	    		selectDropdownValue("County",testData.get("county").toString());
//	    		selectDropdownValue("Primary Sector",testData.get("primarySector").toString());
//	    		selectDropdownValue("Secondary Sector",testData.get("secondarySector").toString());
//	    		selectDropdownValue("Offering Type",testData.get("offeringType").toString());
//	    		selectDropdownValue("Security Type",testData.get("securityType").toString());
//	    		selectDropdownValue("Bank Qualified",testData.get("bankQualified").toString());
//	    		selectDropdownValue("Corp Type",testData.get("corpType").toString());
//	    		enterInputValue("Par Amount",testData.get("parAmount").toString());
//	    		enterDateInput("Pricing Date",testData.get("pricingDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		enterDateInput("Expected Award Date",testData.get("expectedAwardDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		enterDateInput("Actual Award Date",testData.get("actualAwardDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		enterInputValue("SDLC Credit %",testData.get("sdlcCredit").toString());
//	    		enterInputValue("Estimated Revenue",testData.get("estimatedRevenue").toString());
//	    		selectDropdownValue("Use of Proceeds",testData.get("useOfProceeds").toString());
//	    		enterInputValue("Placeholder",testData.get("placeholder").toString());
	    		
//	    		selectBorrowerName(testData.get("borrowerName").toString());
//	    		selectGuarantorName(testData.get("guarantorName").toString());
//	    		selectTransactionType(testData.get("transactionType").toString());
//	    		selectPrimarySector(testData.get("primarySector").toString());
//	    		selectSecondarySector(testData.get("secondarySector").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtParticipants_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - enterDebtParticipants_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtParticipants_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterDebtParticipants_Derivatives(Map<Object, Object> testData, Recordset recordsubsetTestData) 
	    {
	    	
	    	try{

	    		int lastRowNumTransactions=recordsubsetTestData.getCount();
	    		String CounterpartiesLbl="CounterParties";//OR.DebtParticipantsPage_CounterpartiesLbl;
	    		//int tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+CounterpartiesLbl+"')]/parent::div/following-sibling::div//table//tbody//tr")).size();
	    		
	    		int j=1;
	    		//int k=j-1;
	    		int tblSize=0;
	    		while(lastRowNumTransactions>0)
	    		{
	    			recordsubsetTestData.next();
//	    			testReport.log(Status.INFO,"Entered - enterDebtParticipants_BondIssue");
//	    			String uwt_add	=recordsubsetTestData.getField("uwt_add");

	    			
	    			String firmType="notInDatasheet";
	    			String firmName="notInDatasheet";
	    			String Moodys="notInDatasheet";
	    			String Fitch="notInDatasheet";
	    			String Kroll="notInDatasheet";
	    			String SandP="notInDatasheet";
	    			
	    			
    	    		
//    	    		try{
//	    				driver.findElement(By.xpath("//*[contains(text(),'"+CounterpartiesLbl+"')]/parent::div//button[contains(text(),'Add')]")).click();
//	    				tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+CounterpartiesLbl+"')]/parent::div/following-sibling::div//tbody")).size();
//	    	    		j=tblSize;
//	    				}catch(Exception e){}
	    			
	    			this.selectDropdown(OR.DebtParticipantsPage_FirmType, firmType);
	    			this.selectDropdown(OR.DebtParticipantsPage_FirmName2, firmName);
	    			this.selectDropdown(OR.DebtParticipantsPage_Moodys, Moodys);
	    			this.selectDropdown(OR.DebtParticipantsPage_Fitch, Fitch);
	    			this.selectDropdown(OR.DebtParticipantsPage_Kroll, Kroll);
	    			this.selectDropdown(OR.DebtParticipantsPage_SandP, SandP);
	    	
	    			j=1;  //set this to 1 as new row added on top
	    			Click("//*[contains(text(),'"+CounterpartiesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[7]//i[@class='far fa-save']");

	    			
	    			this.clickElementExists("//*[contains(text(),'"+CounterpartiesLbl+"')]/parent::div/following-sibling::div//tbody["+j+"]/tr["+1+"]/td[7]//i[@class='fas fa-pencil-alt']");
	    			//	verifySpecifiedElementExistsByLabel("Added Counter Parties successfully");

	    			lastRowNumTransactions=lastRowNumTransactions-1;
	    			j=j+1;
	    			//k=k+1;
	    		}

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtParticipants_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - enterDebtParticipants_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtParticipants_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    public void enterDebtParticipants_Others(Map<Object, Object> testData, Recordset recordsubsetTestData) 
	    {
	    	
	    	try{

	    		int lastRowNumTransactions=recordsubsetTestData.getCount();
	    		int j=1;
	    		//int k=j-1;
	    		int tblSize=0;
	    		while(lastRowNumTransactions>0)
	    		{
	    			recordsubsetTestData.next();
	    			testReport.log(Status.INFO,"Entered - enterDebtParticipants_BondIssue");
	    			//String addToDl	=recordsubsetTestData.getField("uwt_add");
	    			String addToDl=	"fromDatasheet";
	    			String firmName=	"fromDatasheet";
	    			String roleInSyndicate=	"fromDatasheet";
	    			String uwt_liability	=recordsubsetTestData.getField("uwt_liability");
	    			String uwt_managementfee=	recordsubsetTestData.getField("uwt_managementfee");
	    			String uwt_action	=recordsubsetTestData.getField("uwt_action");
	    			String uwt_actionstatus=recordsubsetTestData.getField("uwt_actionstatus");

	    							    							    			
	    			this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Reset')]")));
	    			driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Reset')]")).click();
	    			//if (uwt_add.equalsIgnoreCase("add"))
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div//button")).click();
	    				//Thread.sleep(2000);
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Add')]")));
	    				//Thread.sleep(2000);
	    				try{
	    				driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div//button[contains(text(),'Add')]")).click();
	    				tblSize=driver.findElements(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr")).size();
	    	    		j=tblSize;
	    				}catch(Exception e){}
	    				//Thread.sleep(2000);
	    				j=1;  //set this to 1 as new row added on top
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr["+j+"]/td[1]//input")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//input")).click();
	    				this.Click("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr["+j+"]/td[1]//input");
	    				
	    				
	    				
	    				this.selectCombobox("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr["+j+"]/td[2]//div[@role='combobox']", firmName);
	    				
	    				this.selectDropdown("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr["+j+"]/td[3]//select[@name='roleInSyndicate']", roleInSyndicate);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select[@name='roleInSyndicate']")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select[@name='roleInSyndicate']")).sendKeys(uwt_roleinsyndicate);
	    				
	    				
	    				this.enterInput("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr["+j+"]/td[4]//input[@name='liabilityPerc']", uwt_liability);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[4]//input[@name='liabilityPerc']")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[4]//input[@name='liabilityPerc']")).sendKeys(uwt_liability);
	    				
	    				this.enterInput("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr["+j+"]/td[5]//input[@name='managementFeePerc']", uwt_managementfee);
	    				
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[5]//input[@name='managementFeePerc']")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[5]//input[@name='managementFeePerc']")).sendKeys(uwt_managementfee);
	    				
	    				
	    				Click("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tbody/tr["+j+"]/td[6]//i");
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//i")));
	    				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//i")).click();
	    				
	    				verifySpecifiedElementExistsByLabel("Other Underwriting Team has been updated");
	    				//this.clickElementExists("//*[contains(text(),'"+OR.DebtParticipantsPage_UnderwritingLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[7]//i[@class='fas fa-pencil-alt']");
		    			
	    			//driver.findElement(By.xpath("//*[contains(text(),'"+"Underwriting Team"+"')]/parent::div/following-sibling::div//button[contains(text(),'Add')]")).getAttribute("class");

	    			lastRowNumTransactions=lastRowNumTransactions-1;
	    			j=j+1;
	    			//k=k+1;
	    		}

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtParticipants_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - enterDebtParticipants_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtParticipants_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterDebtParticipants_Participants(Map<Object, Object> testData, Recordset recordsubsetTestData) 
	    {
	    	
	    	try{

	    		int lastRowNumTransactions=recordsubsetTestData.getCount();
	    		int j=1;

	    		while(lastRowNumTransactions>0)
	    		{
	    			recordsubsetTestData.next();
	    			testReport.log(Status.INFO,"Entered - enterDebtParticipants_BondIssue");
	    			
	    			String odp_addtodl	=recordsubsetTestData.getField("odp_addtodl");
	    			String odp_participanttype	=recordsubsetTestData.getField("odp_participanttype");
	    			String odp_firmname=	recordsubsetTestData.getField("odp_firmname");
	    			String odp_contactname	=recordsubsetTestData.getField("odp_contactname");
	    			String odp_addresses=recordsubsetTestData.getField("odp_addresses");
	    			
	    			String tblName="";
	    			if (testData.get("Activity").toString().equalsIgnoreCase("bond issue"))
		    			tblName=OR.DebtParticipantsPage_DealParticipantsLbl;
		    		else if (testData.get("Activity").toString().equalsIgnoreCase("bank loan"))
		    			tblName=OR.DebtParticipantsPage_AddLoanParticipantsLbl;
		    		else if (testData.get("TranName").toString().equalsIgnoreCase("derivative"))
		    			tblName=OR.DebtDocumentsPage_UploadDerivativeDocumentsTblNameLbl;
		    		else if (testData.get("TranName").toString().equalsIgnoreCase("ma-rfp"))
		    			tblName="Add Ma-RFP Participants";
		    		else if (testData.get("TranName").toString().equalsIgnoreCase("other activity"))
		    			tblName="Other Participants";	

	    			
	    			//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_DealParticipantsLbl+"')]/parent::div//button[contains(text(),'Reset')]")));
	    			//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_DealParticipantsLbl+"')]/parent::div//button[contains(text(),'Reset')]")).click();
	    			if (odp_addtodl.equalsIgnoreCase("add"))
	    				this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div//button[contains(text(),'Add')]")));
	    				try{
	    				driver.findElement(By.xpath("//*[contains(text(),'"+tblName+"')]/parent::div//button[contains(text(),'Add')]")).click();
	    				}catch(Exception e){}
	    				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtParticipantsPage_DealParticipantsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//input")));
	    				//this.Click("//*[contains(text(),'"+OR.DebtParticipantsPage_DealParticipantsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//input");
	    				
	    				this.Exists(driver.findElement(By.xpath(OR.DebtParticipantsPage_ParticipantType)));
	    				
	    				this.selectCombobox(OR.DebtParticipantsPage_ParticipantType, odp_participanttype);
	    				//this.selectCombobox(OR.DebtParticipantsPage_FirmName, odp_firmname);
	    				selectComboboxNoException(OR.DebtParticipantsPage_FirmName, odp_firmname);
	    				this.selectCombobox(OR.DebtParticipantsPage_ContactName, odp_contactname);
	    				this.selectCombobox(OR.DebtParticipantsPage_Addresses, odp_addresses);
	    				
	    				driver.findElement(By.xpath(OR.DebtParticipantsPage_Addresses)).sendKeys(Keys.PAGE_DOWN);
	    				Click("//*[contains(text(),'"+tblName+"')]/parent::div//"+"following-sibling::div//a/span/i[@class='far fa-save']");
	    				
	    				this.clickElementExists("//*[contains(text(),'"+tblName+"')]/parent::div//button[contains(text(),'Add')]");
	    				
	    				
	    				//this.clickElementExists("//*[contains(text(),'"+tblName+"')]/parent::div//"+"following-sibling::div//a/span/i[@class='fas fa-pencil-alt']");
	    				
	    				//verifySpecifiedElementExistsByLabel(uwt_actionstatus);
	    			//System.out.println(recordsubsetTestData.getField("uwt_add"));
	    			//System.out.println(recordsubsetTestData.getField("uwt_add"));
	    			lastRowNumTransactions=lastRowNumTransactions-1;
	    			j=j+1;
	    			
	    		}

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - enterDebtParticipants_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtParticipants_BondIssue - Deal data enty failed");
	    	}
	    }
	    
//	    public void performAction(String action) 
//	    {
//	    	WebElement Save=driver.findElement(By.xpath("//*[contains(text(),'"+"Save"+"')]/parent::div"));
//	    	WebElement Cancel=driver.findElement(By.xpath("//*[contains(text(),'"+"Cancel"+"')]/parent::div"));
//	    	try{
//	    		if (Exists(Save)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+Save.toString());
//	    		if (action.equalsIgnoreCase("save"))
//	    			Save.click();
//	    		else if (action.equalsIgnoreCase("cancel"))
//	    			Cancel.click();
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

