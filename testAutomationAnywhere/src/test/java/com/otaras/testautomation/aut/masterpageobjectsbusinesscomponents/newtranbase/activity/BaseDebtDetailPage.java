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

public class BaseDebtDetailPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	  // @FindBy(xpath = OR.DebtDetailsPage_County)
	  // public WebElement County;
	   @FindBy(xpath = OR.DebtDetailsPage_PrimarySector)
	    public WebElement PrimarySector;
	   
//	   @FindBy(xpath = OR.AddDebtPage_GuarantorName)	
//	    public WebElement GuarantorName;
//	   @FindBy(xpath = OR.AddDebtPage_TransactionType)	
//	    public WebElement TransactionType; 
//	   @FindBy(xpath = OR.AddDebtPage_TransactionStatus)	
//	    public WebElement TransactionStatus; 
//	   @FindBy(xpath = OR.AddDebtPage_State)	
//	    public WebElement State; 
//	   @FindBy(xpath = OR.AddDebtPage_County)	
//	    public WebElement County; 
//	   
//	   @FindBy(xpath = OR.AddDebtPage_PrimarySector1)	
//	    public WebElement PrimarySector1; 
//	   @FindBy(xpath = OR.AddDebtPage_SecondarySector1)	
//	    public WebElement SecondarySector1; 
//	   @FindBy(xpath = "//anil")	
//	    public WebElement anil; 
	   
	   public boolean Exists(){
	    	return super.Exists(PrimarySector); 
	    	
		}
	   
	
	    
//	    public void selectDropdown1(String objname, String selectValue) 
//	    {
//	    	try{
//	    		WebElement testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//select"));
//	    		if (Exists(testElement)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
//	    		//ActivitySubtype.sendKeys(activitySubtype);
//	    		Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//select")));
//	    		oSelect.selectByVisibleText(selectValue);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Debt Bond Detail Page - selectDropdown Successful - "+objname+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Debt Bond Detail Page - selectDropdown - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectDropdown not selected specified value");
//	    	}
//	    }
//	    
//	    public void enterInputValue1(String objname, String selectValue) 
//	    {
//	    	try{
//	    		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
//	    		WebElement testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
//	    		if (Exists(testElement)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
//	    		testElement.sendKeys(selectValue);
//	    		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
//	    		//oSelect.selectByVisibleText(selectValue);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterInputValue Successful - "+objname+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterInputValue not selected specified value");
//	    	}
//	    }
	    
	
	   
	    public void enterDebtDetail_BondIssue(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//selectDropdownValue("Borrower or Obligor Name",testData.get("borrowerName").toString());
	    		//selectDropdownValue("Guarantor Name",testData.get("guarantorName").toString());
	    		//selectDropdownValue(labels.DebtDetailPage_TransactionTypeLbl,testData.get("transactionType").toString());
	    		//selectDropdownValue("Transaction Status",testData.get("transactionStatus").toString());
	    		//selectDropdown(OR.DebtDetailsPage_State,testData.get("state").toString());
	    		//selectDropdown(OR.DebtDetailsPage_County,testData.get("county").toString());
	    		selectDropdown(OR.DebtDetailsPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.DebtDetailsPage_SecondarySector,testData.get("secondarySector").toString());
	    		selectDropdown(OR.DebtDetailsPage_OpportunityType,testData.get("offeringType").toString());
	    		//selectDropdown(OR.DebtDetailsPage_SecurityType,testData.get("securityType").toString());
	    		selectDropdown(OR.DebtDetailsPage_BankQualified,testData.get("bankQualified").toString());
	    		selectDropdown(OR.DebtDetailsPage_CorpType,testData.get("corpType").toString());
	    		enterInput(OR.DebtDetailsPage_ParAmount,testData.get("parAmount").toString());
	    		enterDate(OR.DebtDetailsPage_PricingDate,testData.get("pricingDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_ExpectedAwardDate,testData.get("expectedAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_ActualAwardDate,testData.get("actualAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		//enterInput(OR.DebtDetailsPage_SDLCCredit,testData.get("sdlcCredit").toString());
	    		enterInput(OR.DebtDetailsPage_EstimatedRevenue,testData.get("estimatedRevenue").toString());
	    		selectDropdown(OR.DebtDetailsPage_UseofProceeds,testData.get("useOfProceeds").toString());
	    		//enterInputValue(labels.DebtDetailPage_PlaceholderLbl,testData.get("placeholder").toString());
	    		
//	    		selectBorrowerName(testData.get("borrowerName").toString());
//	    		selectGuarantorName(testData.get("guarantorName").toString());
//	    		selectTransactionType(testData.get("transactionType").toString());
//	    		selectPrimarySector(testData.get("primarySector").toString());
//	    		selectSecondarySector(testData.get("secondarySector").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDetail_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterDebtDetail_BankLoanIssue(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//selectDropdown(OR.DebtDetailsPage_State,testData.get("state").toString());
	    		//selectDropdown(OR.DebtDetailsPage_County,testData.get("county").toString());
	    		selectDropdown(OR.DebtDetailsPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.DebtDetailsPage_SecondarySector,testData.get("secondarySector").toString());
	    		//selectDropdown(OR.DebtDetailsPage_OfferingType,testData.get("offeringType").toString());
	    		//selectDropdown(OR.DebtDetailsPage_SecurityType,testData.get("securityType").toString());
	    		//selectDropdown(OR.DebtDetailsPage_BankQualified,testData.get("bankQualified").toString());
	    		//selectDropdown(OR.DebtDetailsPage_CorpType,testData.get("corpType").toString());
	    		//enterInput(OR.DebtDetailsPage_ParAmount,testData.get("parAmount").toString());
	    		//enterDate(OR.DebtDetailsPage_PricingDate,testData.get("pricingDate").toString(),testData.get("TestBrowser").toString().trim());
	    		//enterDate(OR.DebtDetailsPage_ExpectedAwardDate,testData.get("expectedAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		//enterDate(OR.DebtDetailsPage_ActualAwardDate,testData.get("actualAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		//enterInput(OR.DebtDetailsPage_SDLCCredit,testData.get("sdlcCredit").toString());
	    		enterDate(OR.DebtDetailsPage_ClosingDate,testData.get("ClosingDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterInput(OR.DebtDetailsPage_EstimatedRevenue,testData.get("estimatedRevenue").toString());
	    		//selectDropdown(OR.DebtDetailsPage_UseofProceeds,testData.get("useOfProceeds").toString());
	    		this.enterInput(OR.DebtDetailsPage_ParAmount,testData.get("parAmount").toString());
	    		selectDropdown(OR.DebtDetailsPage_PaymentDay,testData.get("paymentDay").toString());
	    		//enterInputValue(labels.DebtDetailPage_PlaceholderLbl,testData.get("placeholder").toString());
	    		
//	    		selectBorrowerName(testData.get("borrowerName").toString());
//	    		selectGuarantorName(testData.get("guarantorName").toString());
//	    		selectTransactionType(testData.get("transactionType").toString());
//	    		selectPrimarySector(testData.get("primarySector").toString());
//	    		selectSecondarySector(testData.get("secondarySector").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDetail_BankLoanIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BankLoanIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterDebtDetail_OthersActivity(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//selectDropdownValue("Borrower or Obligor Name",testData.get("borrowerName").toString());
	    		//selectDropdownValue("Guarantor Name",testData.get("guarantorName").toString());
	    		//selectDropdownValue(labels.DebtDetailPage_TransactionTypeLbl,testData.get("transactionType").toString());
	    		//selectDropdownValue("Transaction Status",testData.get("transactionStatus").toString());
	    		//selectDropdown(OR.DebtDetailsPage_State,testData.get("state").toString());
	    		//selectDropdown(OR.DebtDetailsPage_County,testData.get("county").toString());
	    		selectDropdown(OR.DebtDetailsPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.DebtDetailsPage_SecondarySector,testData.get("secondarySector").toString());
	    		//selectDropdown(OR.DebtDetailsPage_OfferingType,testData.get("offeringType").toString());
	    		//selectDropdown(OR.DebtDetailsPage_SecurityType,testData.get("securityType").toString());
	    		selectDropdown(OR.DebtDetailsPage_BankQualified,testData.get("bankQualified").toString());
	    		selectDropdown(OR.DebtDetailsPage_CorpType,testData.get("corpType").toString());
	    		enterInput(OR.DebtDetailsPage_ParAmount,testData.get("parAmount").toString());
	    		enterDate(OR.DebtDetailsPage_PricingDate,testData.get("pricingDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_ExpectedAwardDate,testData.get("expectedAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_ActualAwardDate,testData.get("actualAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterInput(OR.DebtDetailsPage_SDLCCredit,testData.get("sdlcCredit").toString());
	    		enterInput(OR.DebtDetailsPage_EstimatedRevenue,testData.get("estimatedRevenue").toString());
	    		//selectDropdown(OR.DebtDetailsPage_UseofProceeds,testData.get("useOfProceeds").toString());
	    		//enterInputValue(labels.DebtDetailPage_PlaceholderLbl,testData.get("placeholder").toString());
	    		
//	    		selectBorrowerName(testData.get("borrowerName").toString());
//	    		selectGuarantorName(testData.get("guarantorName").toString());
//	    		selectTransactionType(testData.get("transactionType").toString());
//	    		selectPrimarySector(testData.get("primarySector").toString());
//	    		selectSecondarySector(testData.get("secondarySector").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDetail_OthersActivity: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterDebtDetail_MARFP(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//selectDropdownValue("Borrower or Obligor Name",testData.get("borrowerName").toString());
	    		//selectDropdownValue("Guarantor Name",testData.get("guarantorName").toString());
	    		//selectDropdownValue(labels.DebtDetailPage_TransactionTypeLbl,testData.get("transactionType").toString());
	    		//selectDropdownValue("Transaction Status",testData.get("transactionStatus").toString());
	    		//selectDropdown(OR.DebtDetailsPage_State,testData.get("state").toString());
	    		//selectDropdown(OR.DebtDetailsPage_County,testData.get("county").toString());
	    		selectDropdown(OR.DebtDetailsPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.DebtDetailsPage_SecondarySector,testData.get("secondarySector").toString());
	    		//selectDropdown(OR.DebtDetailsPage_OfferingType,testData.get("offeringType").toString());
	    		selectDropdown(OR.DebtDetailsPage_SecurityType,testData.get("securityType").toString());
	    		selectDropdown(OR.DebtDetailsPage_BankQualified,testData.get("bankQualified").toString());
	    		selectDropdown(OR.DebtDetailsPage_CorpType,testData.get("corpType").toString());
	    		enterInput(OR.DebtDetailsPage_ParAmount,testData.get("parAmount").toString());
	    		enterDate(OR.DebtDetailsPage_PricingDate,testData.get("pricingDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_ExpectedAwardDate,testData.get("expectedAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_ActualAwardDate,testData.get("actualAwardDate").toString(),testData.get("TestBrowser").toString().trim());
	    		//enterInput(OR.DebtDetailsPage_SDLCCredit,testData.get("sdlcCredit").toString());
	    		enterInput(OR.DebtDetailsPage_EstimatedRevenue,testData.get("estimatedRevenue").toString());
	    		
	    		//selectDropdown(OR.DebtDetailsPage_OpportunityType,testData.get("opportunityType").toString());
	    		//selectDropdown(OR.DebtDetailsPage_OfferingStatus,testData.get("opportunityStatus").toString());
	    		//enterInput(OR.DebtDetailsPage_OpportunityName,testData.get("opportunityName").toString());
	    		//selectDropdown(OR.DebtDetailsPage_UseofProceeds,testData.get("useOfProceeds").toString());
	    		//enterInputValue(labels.DebtDetailPage_PlaceholderLbl,testData.get("placeholder").toString());
	    		
//	    		selectBorrowerName(testData.get("borrowerName").toString());
//	    		selectGuarantorName(testData.get("guarantorName").toString());
//	    		selectTransactionType(testData.get("transactionType").toString());
//	    		selectPrimarySector(testData.get("primarySector").toString());
//	    		selectSecondarySector(testData.get("secondarySector").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDetail_OthersActivity: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void enterDebtDetail_Derivative(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//selectDropdownValue("Borrower or Obligor Name",testData.get("borrowerName").toString());
	    		//selectDropdownValue("Guarantor Name",testData.get("guarantorName").toString());
	    		//selectDropdownValue(labels.DebtDetailPage_TransactionTypeLbl,testData.get("transactionType").toString());
	    		//selectDropdownValue("Transaction Status",testData.get("transactionStatus").toString());
//	    		selectDropdown(OR.DebtDetailsPage_State,testData.get("state").toString());
//	    		selectDropdown(OR.DebtDetailsPage_County,testData.get("county").toString());
	    		selectDropdown(OR.DebtDetailsPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.DebtDetailsPage_SecondarySector,testData.get("secondarySector").toString());
	    		selectDropdown(OR.DebtDetailsPage_TransactionType,testData.get("transactionType").toString());
	    		enterInput(OR.DebtDetailsPage_NotionalAmount,testData.get("notionalAmount").toString());
	    		enterDate(OR.DebtDetailsPage_TradeDate,testData.get("tradeDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_EffectiveDate,testData.get("effectiveDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.DebtDetailsPage_EndDate,testData.get("endDate").toString(),testData.get("TestBrowser").toString().trim());
	    		//enterInput(OR.DebtDetailsPage_CounterpartyClient,testData.get("counterpartyClient").toString());
	    		//this.selectCombobox(OR.DebtDetailsPage_CounterpartyClient,testData.get("counterpartyClient").toString());
	    		
	    		String randomString=RandomStringUtils.randomAlphabetic(5).toUpperCase();	
	    		//WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']"));
	    		
	    		Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Counterparty-Client"+"')]/parent::div//"+"div[@role='combobox']")));
	    		WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+"Counterparty-Client"+"')]/parent::div//"+"div[@role='combobox']"));
	    		//WebElement wb11=driver.findElement(By.xpath("//li/*[contains(text(),'"+testData.get("entityName").toString()+randomString+"')]"));
	    		
		    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
		    		Actions builder=new Actions(driver);
		    		Action seriesofactions=builder
		    				.moveToElement(wb1)
		    				.click()
		    				.pause(900)
		    				.sendKeys(wb1,testData.get("counterpartyClient").toString()+randomString)
		    				.pause(1500)
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
		    		WebElement wb11=driver.findElement(By.xpath("//*[contains(text(),'"+"Counterparty-Client"+"')]/parent::div//"+"div[@role='combobox']//ul[2]/li"));
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
	    		
	    		selectDropdown(OR.DebtDetailsPage_CounterpartyType,testData.get("counterpartyType").toString());
	    		//selectDropdown(OR.DebtDetailsPage_CounterpartyDealer,testData.get("counterpartyDealer").toString());
	    		
	    		randomString=RandomStringUtils.randomAlphabetic(5).toUpperCase();	
	    		//WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_EntityNameLbl+"')]/parent::div//"+"following-sibling::div//div[@class='Select-value']"));
	    		
	    		Exists(driver.findElement(By.xpath("(//*[contains(text(),'"+"Counterparty"+"')]/parent::div//"+"div[@role='combobox'])[2]")));
	    		wb1=driver.findElement(By.xpath("(//*[contains(text(),'"+"Counterparty"+"')]/parent::div//"+"div[@role='combobox'])[2]"));
	    		//WebElement wb11=driver.findElement(By.xpath("//li/*[contains(text(),'"+testData.get("entityName").toString()+randomString+"')]"));
	    		
		    		//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
		    		builder=new Actions(driver);
		    		seriesofactions=builder
		    				.moveToElement(wb1)
		    				.click()
		    				.pause(1200)
		    				.sendKeys(wb1,testData.get("counterpartyDealer").toString()+randomString)
		    				.pause(1500)
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
		    		wb11=driver.findElement(By.xpath("//*[contains(text(),'"+"Counterparty"+"')]/parent::div//"+"div[@role='combobox']//ul[2]/li"));
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
		    		enterInput(OR.DebtDetailsPage_EstimatedRevenue,testData.get("notionalAmount").toString());
		    		//driver.findElement(By.xpath("input[@name='tranEstimatedRev']")).sendKeys(testData.get("notionalAmount").toString());
	    		
	    		
	    		//selectDropdown(OR.DebtDetailsPage_CounterpartyDealer,testData.get("primarySector").toString());
	    		
//	    		//selectDropdown(OR.DebtDetailsPage_OfferingType,testData.get("offeringType").toString());
//	    		selectDropdown(OR.DebtDetailsPage_SecurityType,testData.get("securityType").toString());
//	    		selectDropdown(OR.DebtDetailsPage_BankQualified,testData.get("bankQualified").toString());
//	    		selectDropdown(OR.DebtDetailsPage_CorpType,testData.get("corpType").toString());
//	    		enterInput(OR.DebtDetailsPage_ParAmount,testData.get("parAmount").toString());
//	    		enterDate(OR.DebtDetailsPage_PricingDate,testData.get("pricingDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		enterDate(OR.DebtDetailsPage_ExpectedAwardDate,testData.get("expectedAwardDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		enterDate(OR.DebtDetailsPage_ActualAwardDate,testData.get("actualAwardDate").toString(),testData.get("TestBrowser").toString().trim());
//	    		//enterInput(OR.DebtDetailsPage_SDLCCredit,testData.get("sdlcCredit").toString());
//	    		enterInput(OR.DebtDetailsPage_EstimatedRevenue,testData.get("estimatedRevenue").toString());
//	    		
//	    		selectDropdown(OR.DebtDetailsPage_OpportunityType,testData.get("opportunityType").toString());
//	    		selectDropdown(OR.DebtDetailsPage_OfferingStatus,testData.get("opportunityStatus").toString());
//	    		enterInput(OR.DebtDetailsPage_OpportunityName,testData.get("opportunityName").toString());
	    		//selectDropdown(OR.DebtDetailsPage_UseofProceeds,testData.get("useOfProceeds").toString());
	    		//enterInputValue(labels.DebtDetailPage_PlaceholderLbl,testData.get("placeholder").toString());
	    		
//	    		selectBorrowerName(testData.get("borrowerName").toString());
//	    		selectGuarantorName(testData.get("guarantorName").toString());
//	    		selectTransactionType(testData.get("transactionType").toString());
//	    		selectPrimarySector(testData.get("primarySector").toString());
//	    		selectSecondarySector(testData.get("secondarySector").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDetail_OthersActivity: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void verifyDataEntered(Map<Object, Object> verifytestData){
	    	
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
	   
}




//public void selectBorrowerName(String borrowerName) 
//{
//	try{
//		if (Exists(BorrowerName)==false)
//			throw new NoSuchElementException ("Element Not Found: "+BorrowerName.toString());
//		//ActivitySubtype.sendKeys(activitySubtype);
//		Select oSelect = new Select(driver.findElement(By.xpath(OR.AddDebtPage_BorrowerName)));
//		oSelect.selectByVisibleText(borrowerName);
//		testReport.log(Status.PASS,SuccessFontColorPrefix+"Debt Bond Detail Page - selectBorrowerName Successful - "+BorrowerName.toString()+SuccessFontColorSuffix);
//	}
//	catch (Exception e)
//	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Debt Bond Detail Page - selectBorrowerName - unable to Enter"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("selectBorrowerName not entered");
//	}
//}

//public void selectGuarantorName(String gurantorName) 
//{
//	try{
//		if (Exists(GuarantorName)==false)
//			throw new NoSuchElementException ("Element Not Found: "+GuarantorName.toString());
//		//ActivitySubtype.sendKeys(activitySubtype);
//		Select oSelect = new Select(driver.findElement(By.xpath(OR.AddDebtPage_GuarantorName)));
//		oSelect.selectByVisibleText(gurantorName);
//		testReport.log(Status.PASS,SuccessFontColorPrefix+"Debt Bond Detail Page - selectBorrowerName Successful - "+GuarantorName.toString()+SuccessFontColorSuffix);
//	}
//	catch (Exception e)
//	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Debt Bond Detail Page - selectGuarantorName - unable to Enter"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("selectBorrowerName not entered");
//	}
//}
//
//public void selectTransactionType(String transactionType) 
//{
//	try{
//		if (Exists(TransactionType)==false)
//			throw new NoSuchElementException ("Element Not Found: "+TransactionType.toString());
//		//ActivitySubtype.sendKeys(activitySubtype);
//		Select oSelect = new Select(driver.findElement(By.xpath(OR.AddDebtPage_TransactionType)));
//		oSelect.selectByVisibleText(transactionType);
//		testReport.log(Status.PASS,SuccessFontColorPrefix+"Debt Bond Detail Page - selectTransactionType Successful - "+GuarantorName.toString()+SuccessFontColorSuffix);
//	}
//	catch (Exception e)
//	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Debt Bond Detail Page - selectTransactionType - unable to Enter"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("selectTransactionType not entered");
//	}
//}
//
//
//
//
//public void selectPrimarySector(String primarySector) 
//{
//	try{
//		if (Exists(PrimarySector1)==false)
//			throw new NoSuchElementException ("Element Not Found: "+PrimarySector1.toString());
//		//ActivitySubtype.sendKeys(activitySubtype);
//		Select oSelect = new Select(driver.findElement(By.xpath(OR.AddDebtPage_PrimarySector1)));
//		oSelect.selectByVisibleText(primarySector);
//		testReport.log(Status.PASS,SuccessFontColorPrefix+"Debt Bond Detail Page - selectPrimarySector Successful - "+PrimarySector1.toString()+SuccessFontColorSuffix);
//	}
//	catch (Exception e)
//	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Debt Bond Detail Page - selectPrimarySector - unable to Enter"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("selectPrimarySector not entered");
//	}
//}
//
//
//public void selectSecondarySector(String secondarySector) 
//{
//	try{
//		if (Exists(SecondarySector1)==false)
//			throw new NoSuchElementException ("Element Not Found: "+SecondarySector1.toString());
//		//ActivitySubtype.sendKeys(activitySubtype);
//		Select oSelect = new Select(driver.findElement(By.xpath(OR.AddDebtPage_SecondarySector1)));
//		oSelect.selectByVisibleText(secondarySector);
//		testReport.log(Status.PASS,SuccessFontColorPrefix+"Debt Bond Detail Page - selectPrimarySector Successful - "+SecondarySector1.toString()+SuccessFontColorSuffix);
//	}
//	catch (Exception e)
//	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Debt Bond Detail Page - selectSecondarySector - unable to Enter"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("selectSecondarySector not entered");
//	}
//}
