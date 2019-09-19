package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.activity;

import java.util.Date;
import java.util.Map;

import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mongodb.client.MongoCollection;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.labels.labels;
import com.otaras.testautomation.objectrepository.OR;


public class BaseAddDebtPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.AddDebtPage_ActivitySubtype)	
	    public WebElement ActivitySubtype;
//	   @FindBy(xpath = OR.AddDebtPage_Issuer)	
//	    public WebElement Issuer;
//	   @FindBy(xpath = OR.AddDebtPage_PrimarySector)	
//	    public WebElement PrimarySector; 
//	   @FindBy(xpath = OR.AddDebtPage_SecondarySector)	
//	    public WebElement SecondarySector;
//	   @FindBy(xpath = OR.AddDebtPage_LeadAdvisor)	
//	    public WebElement LeadAdvisor;
//	   @FindBy(xpath = OR.AddDebtPage_IssueName)	
//	    public WebElement IssueName; 
//	   @FindBy(xpath = OR.AddDebtPage_ProjectDescription)	
//	    public WebElement ProjectDescription; 
//
//		public final static String AddDebtPage_IssuerLbl="Issuer/Client Name";
//		public final static String AddDebtPage_LeadAdvisorLbl="Lead Advisor";
//		public final static String AddDebtPage_PrimarySectorLbl="Primary Sector";
//		public final static String AddDebtPage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddDebtPage_IssueNameLbl="Issue Name(if available)";
//		public final static String AddDebtPage_ProjectDescriptionLbl="Project Description";
//	   
	   
//	   @FindBy(xpath = OR.AddDebtPage_Issuer)	
//	    public WebElement Issuer;
//	   @FindBy(xpath = OR.AddDebtPage_ClientMSRBRegistered)	
//	    public WebElement ClientMSRBRegistered;
//	   
//	   @FindBy(xpath = OR.AddDebtPage_ClientIsBorrower)	
//	    public WebElement ClientIsBorrower;
//	   @FindBy(xpath = OR.AddDebtPage_ClientIsConduit)	
//	    public WebElement ClientIsConduit;
//	   @FindBy(xpath = OR.AddDebtPage_ClientIsNotApplicable)	
//	    public WebElement ClientIsNotApplicable;
//
//	   @FindBy(xpath = OR.AddDebtPage_AssignedTo)	
//	    public WebElement AssignedTo; 
//	   @FindBy(xpath = OR.AddDebtPage_PurposeofRFP)	
//	    public WebElement PurposeofRFP; 
//	   @FindBy(xpath = OR.AddDebtPage_PrimarySector)	
//	    public WebElement PrimarySector; 
//	   @FindBy(xpath = OR.AddDebtPage_SecondarySector)	
//	    public WebElement SecondarySector;
//	   @FindBy(xpath = OR.AddDebtPage_LeadAdvisor)	
//	    public WebElement LeadAdvisor;
//	   @FindBy(xpath = OR.AddDebtPage_IssueName)	
//	    public WebElement IssueName; 
//	   @FindBy(xpath = OR.AddDebtPage_ProjectDescription)	
//	    public WebElement ProjectDescription; 
	   @FindBy(xpath = OR.AddDebtPage_RelatedTransactionType)	
	    public WebElement RelatedTransactionType; 
	   @FindBy(xpath = OR.AddDebtPage_RelatedTransactionIds)	
	    public WebElement RelatedTransactionIds; 
//	   
	   @FindBy(xpath = OR.AddDebtPage_Notes)	
	    public WebElement Notes; 
//	   @FindBy(css = OR.AddDebtPage_Save)	
//	    public WebElement Save; 
//	   @FindBy(xpath = OR.AddDebtPage_Cancel)	
//	    public WebElement Cancel; 
	   

	   
	   public boolean Exists(){
	    	return super.Exists(ActivitySubtype); 
	    	
		}
	   
//	    public void selectIssuer(String issuer) 
//	    {
//	    	try{
//	    		//Thread.sleep(300);
//	    		if (Exists(driver.findElement(By.cssSelector(".rw-input-reset")))==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+"Issuer");
//	    		if (issuer.equalsIgnoreCase(""))
//	    			issuer=testData.get("issuer").toString();
//	    		testReport.log(Status.INFO,"Issuer To Select:"+issuer);
//	    		Issuer.click();
////	    		WebElement countryUL= driver.findElement(By.xpath("//[@id='rw_1_input']/div/div/div/ul"));
////	    		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
////	    		for (WebElement li : countriesList) {
////	    		if (li.getText().equals("Florda State")) {
////	    		     li.click();
////	    		   }
////	    		}
//	    		
//	    		//FirmName.sendKeys("Florda State");
//	    		Thread.sleep(300);
//	    		
//	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys(issuer);
//	    		Thread.sleep(200);
//	    		driver.findElement(By.xpath("//li[contains(text(),'"+issuer+"')]")).click();
////	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Florda State");
//	    		//driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys(Keys.TAB);
//	    		Thread.sleep(500);
//	    	//testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Firm Page - clickNewMenu Successful - "+New.toString()+SuccessFontColorSuffix);
//	    	
//		}
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectIssuer - unable to select combobox value"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("selectIssuer not selected");
//    	}
//	}
//	    
//	    
//	    public void checkClientMsrbRegistered(String clientMsrbRegistered) 
//	    {
//	    	if (clientMsrbRegistered.equalsIgnoreCase("no"))
//		    	try{
//		    		if (Exists(ClientMSRBRegistered)==false)
//		    			throw new NoSuchElementException ("Element Not Found: "+ClientMSRBRegistered.toString());
//		    		ClientMSRBRegistered.click();
//		    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectActivitySubtype Successful - "+ClientMSRBRegistered.toString()+SuccessFontColorSuffix);
//		    	}
//		    	catch (Exception e)
//		    	{
//		    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - checkClientMsrbRegistered - unable to Enter"+e+ErrorFontColorSuffix);
//		    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		    		throw new NoSuchElementException ("checkClientMsrbRegistered not worked");
//		    	}
//	    }
//	    
//	    public void checkClientType(String clientType) 
//	    {
//	    	if (!clientType.equalsIgnoreCase(""))
//		    	try{
//		    		switch (clientType) {
//		            case "Borrower":  
//		            	if (Exists(ClientIsBorrower)==false)
//			    			throw new NoSuchElementException ("Element Not Found: "+ClientIsBorrower.toString());			    		
//		            	ClientIsBorrower.click();
//		                break;
//		            case "Conduit":  
//		            	if (Exists(ClientIsConduit)==false)
//			    			throw new NoSuchElementException ("Element Not Found: "+ClientIsConduit.toString());		
//		            	ClientIsConduit.click();
//		                break;
//		            case "NotApplicable":  
//		               	//if (Exists(ClientIsConduit)==false)
//			    		//	throw new NoSuchElementException ("Element Not Found: "+ClientIsConduit.toString());		
//		            	//ClientIsNotApplicable.click();
//	                     break;
//		    		}
//		    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - checkClientType Successful - "+clientType+SuccessFontColorSuffix);
//		    	}
//		    	catch (Exception e)
//		    	{
//		    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - checkClientType - unable to Enter"+e+ErrorFontColorSuffix);
//		    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		    		throw new NoSuchElementException ("checkClientType not worked");
//		    	}
//	    }
//	    
//		   
//		   
//	    
//	    public void selectActivitySubtype(String activitySubtype) 
//	    {
//	    	try{
//	    		if (Exists(ActivitySubtype)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+ActivitySubtype.toString());
//	    		//ActivitySubtype.sendKeys(activitySubtype);
//	    		Select oSelect = new Select(driver.findElement(By.xpath(OR.AddDebtPage_ActivitySubtype)));
//	    		oSelect.selectByVisibleText(activitySubtype);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectActivitySubtype Successful - "+ActivitySubtype.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectActivitySubtype - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectRelatedTransactionsAction not entered");
//	    	}
//	    }
//	
//	    public void selectAssignedTo(String assignedTo) 
//	    {
//	    	try{
//	      		if (Exists(AssignedTo)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+AssignedTo.toString());
//	      		String webelementName="Assigned to";
//	      		//String eType="input";
//	      		Thread.sleep(400);
//	      		AssignedTo.click();
//	      		Thread.sleep(400);
//	      		driver.findElement(By.xpath("//li[contains(text(),'"+assignedTo+"')]")).click();
//	      		Thread.sleep(1000);
//	      		AssignedTo.click();
//	      		Thread.sleep(1000);
//	      		//driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//span[@class='rw-select']")).click();
//	      		
//	      		//Thread.sleep(200);
//	    		//AssignedTo.click();
////	    		WebElement countryUL= driver.findElement(By.xpath("//[@id='rw_1_input']/div/div/div/ul"));
////	    		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
////	    		for (WebElement li : countriesList) {
////	    		if (li.getText().equals("Florda State")) {
////	    		     li.click();
////	    		   }
////	    		}
//	    		
//	    		//FirmName.sendKeys("Florda State");
//	    		//driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Brice");
////	    		Thread.sleep(200);
////	    		driver.findElement(By.xpath("//li[contains(text(),'"+assignedTo+"')]")).click();
////	    		driver.findElement(By.cssSelector("div.columns:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(2) > button:nth-child(1)")).click();
////	    		
////	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Florda State");
//	    		//driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys(Keys.TAB);
//	    		//Thread.sleep(500);
//	    	//testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Firm Page - clickNewMenu Successful - "+New.toString()+SuccessFontColorSuffix);
//	    	
//		}
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectAssignedTo - unable to select combobox value"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("selectAssignedTo not selected");
//    	}
//	}
//	    
//	    public void selectPurposeofRFP( String purposeofRFP) 
//	    {
//	    	try{
//	      		if (Exists(PurposeofRFP)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+PurposeofRFP.toString());
//	    		PurposeofRFP.sendKeys(purposeofRFP);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectPurposeofRFP Successful - "+PurposeofRFP+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectPurposeofRFP - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectPurposeofRFP not entered");
//	    	}
//	    }
//	    
//	    public void selectPrimarySector(String primarySector) 
//	    {
//	    	try{
//	      		if (Exists(PrimarySector)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+PrimarySector.toString());
//	    		PrimarySector.sendKeys(primarySector);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectPrimarySector Successful - "+PrimarySector.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectPrimarySector - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectPrimarySector not entered");
//	    	}
//	    }   
//	    
//	    
//	    public void selectSecondarySector(String secondarySector) 
//	    {
//	    	try{
//	      		if (Exists(SecondarySector)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+SecondarySector.toString());
//	    		SecondarySector.sendKeys(secondarySector);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectSecondarySector Successful - "+SecondarySector.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectSecondarySector - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectSecondarySector not entered");
//	    	}
//	    }   
//	    
//	    public void selectLeadAdvisor(String leadAdvisor) 
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
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectLeadAdvisor - unable to select combobox value"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("selectLeadAdvisor not selected");
//    	}
//	}
//	    
//	    public void enterIssueName(String issueName) 
//	    {
//	    	try{
//	      		if (Exists(IssueName)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+IssueName.toString());
//	      		Date d=new Date();
//				String timestamp=d.toString().replace(":", "").replace(" ", "");
//	      		IssueName.sendKeys(issueName+timestamp);
//	      		testData.put("issueNameKey",issueName+timestamp);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterIssueName Successful - "+IssueName.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterIssueName - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterIssueName not entered");
//	    	}
//	    }   
	    
	    public String tranIssueNameKeyValue() 
	    {
	    	return(testData.get("issueNameKey").toString());
	    }
	    
//	    public void enterProjectDescription(String projectDescription) 
//	    {
//	    	try{
//	      		if (Exists(ProjectDescription)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+ProjectDescription.toString());
//	      		ProjectDescription.sendKeys(projectDescription);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterProjectDescription Successful - "+ProjectDescription.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterProjectDescription - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterProjectDescription not entered");
//	    	}
//	    }   
	    
//	    public void selectRelatedTransactionType(WebElement RelatedTransactionType, String relatedTransactionType) 
//	    {
//	    	try{
//	      		if (Exists(RelatedTransactionType)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+RelatedTransactionType.toString());
//	      		RelatedTransactionType.sendKeys(relatedTransactionType);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionType Successful - "+RelatedTransactionType.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionType - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectRelatedTransactionType not entered");
//	    	}
//	    }   
//	    
//	    public void selectRelatedTransactionIds(WebElement RelatedTransactionIds, String relatedTransactionIds) 
//	    {
//	    	try{
//	     		if (Exists(RelatedTransactionIds)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+RelatedTransactionIds.toString());
//	      		//String webelementName="Assigned to";
//	      		//String eType="input";
//	     		
//	     		if(relatedTransactionIds.contains(";"))
//	     		{
//	     			String [] arrOfStr = relatedTransactionIds.split(";");
//	     			for (int i=0; i < arrOfStr.length; i++) {
//	     				Thread.sleep(400);
//	    	      		RelatedTransactionIds.click();
//	    	      		Thread.sleep(400);
//	    	      		driver.findElement(By.xpath("//li[contains(text(),'"+arrOfStr[i]+"')]")).click();
//	    	      		Thread.sleep(400);
//	    	      		RelatedTransactionIds.click();
//	    	      		Thread.sleep(400);
//	     	        }
//	     		}else if (!relatedTransactionIds.equalsIgnoreCase(""))
//	     		{
//	      		Thread.sleep(400);
//	      		RelatedTransactionIds.click();
//	      		Thread.sleep(400);
//	      		driver.findElement(By.xpath("//li[contains(text(),'"+relatedTransactionIds+"')]")).click();
//	      		Thread.sleep(400);
//	      		RelatedTransactionIds.click();
//	      		Thread.sleep(400);
//	     		}
//	      		
//	      		//RelatedTransactionIds.click();
//	      		//Thread.sleep(400);
//	      		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionIds Successful - "+RelatedTransactionIds.toString()+SuccessFontColorSuffix);
//		}
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectRelatedTransactionIds - unable to select combobox value"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("selectRelatedTransactionIds not selected");
//    	}
//	}
	    
	    
//	    public void enterNotes(String notes) 
//	    {
//	    	try{
//	      		if (Exists(Notes)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+Notes.toString());
//	      		Notes.sendKeys(notes+" : "+testData.get("issueNameKey").toString());
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterNotes Successful - "+Notes.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterNotes - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterNotes not entered");
//	    	}
//	    }   
	    
//	    public void performAction(String action) 
//	    {
//	    	
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
	    
//	    public void verifyActionStatus() 
//	    {
//	    	
//	    	try{
//	    		WebElement actionStatusElement=driver.findElement(By.xpath("//*[contains(text(),'"+testData.get("actionStatus").toString()+"')]"));
//	    		
//	    		if (Exists(actionStatusElement)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+actionStatusElement.toString());
//	    		else if (Exists(actionStatusElement)==true)
//	    			testReport.log(Status.PASS,SuccessFontColorPrefix+"Submit Transaction Data - Action Performed: "+testData.get("actionStatus").toString()+" Successful - "+"Save: "+actionStatusElement.toString()+SuccessFontColorSuffix);
//	    		this.takeScreenShot();
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Submit Transaction Data - verifyActionStatus - unable to verify"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("verifyActionStatus not entered");
//	    	}
//	    }
	    
	    
	    public void addDebt_BondIssue(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//String a=labels.AddDebtPage_ActivitySubtypeLbl;
	    		//working code - selectDropdownValue("Activity Subtype",testData.get("activity").toString());
	    		selectDropdown(OR.AddDebtPage_ActivitySubtype,testData.get("activity").toString());
	    		//selectActivitySubtype(testData.get("activity").toString());
	    		this.selectCombobox(OR.AddDebtPage_Issuer, testData.get("issuer").toString());
	    		//selectIssuer(testData.get("issuer").toString());
	    		//checkClientMsrbRegistered(testData.get("isClientMSRBregistered").toString());
	    		//checkClientType(testData.get("clientType").toString());
	    		this.selectCombobox(OR.AddDebtPage_LeadAdvisor, testData.get("leadAdvisor").toString());
	    		//selectLeadAdvisor(testData.get("leadAdvisor").toString());
	    		//selectAssignedTo(testData.get("assignedTo").toString());
	    		//selectPurposeofRFP(testData.get("purposeOfRfp").toString());
	    		selectDropdown(OR.AddDebtPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.AddDebtPage_SecondarySector,testData.get("secondarySector").toString());
	    		//selectPrimarySector(testData.get("primarySector").toString());
	    		//selectSecondarySector(testData.get("secondarySector").toString());
	    		
	    		//enterIssueName(testData.get("issueName").toString());
	    		//Date d=new Date();
				//String timestamp=d.toString().replace(":", "").replace(" ", "");
	      		//IssueName.sendKeys(issueName+timestamp);
	      		//testData.put("issueNameKey",testData.get("issueNameKey").toString());
	    		
	      		enterInput(OR.AddDebtPage_IssueName,testData.get("issueNameKey").toString());
	    		//enterProjectDescription(testData.get("projectDescription").toString());
	      		enterInput(OR.AddDebtPage_ProjectDescription,testData.get("projectDescription").toString());
	    		//selectDropdownValue("Related transactions:",testData.get("relatedTransactionType").toString());
	    		
	    		//this.selectRelatedTransactionType(RelatedTransactionType, testData.get("relatedTransactionType").toString());
	    		//this.selectRelatedTransactionIds( RelatedTransactionIds, testData.get("relatedTransactionsIds").toString());
	    		//enterNotes(testData.get("notes").toString());
	    		enterNotes(Notes, testData.get("notes").toString()+testData.get("issueNameKey").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Add DebtPage: Successful - "+SuccessFontColorSuffix);
	  
	    		
//				selectTransactionType(testData.get("transactionType").toString());
//				enterOtherTransactionType(testData.get("otherTransactionType").toString());
//				selectPurposeofRFP(testData.get("purposeOfRFP").toString());
//				selectAssignedTo(testData.get("assignedTo").toString());
//				selectState(testData.get("state").toString());
//				selectCounty(testData.get("county").toString());
//				selectPrimarySector(testData.get("primarySector").toString());
//				selectSecondarySector(testData.get("secondarySector").toString());
//				enterDateHired(testData.get("dateHired").toString());
//				enterStartDate(testData.get("startDate").toString());
//				enterExpectedEndDate(testData.get("expectedEndDate").toString());
//				selectRelatedTransactionsAction(testData.get("relatedTransactionsIds").toString());
//				enterNotes(testData.get("notes").toString());
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("addDebt_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void addDebt_BankLoanIssue(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//selectActivitySubtype(testData.get("activity").toString());
	    		selectDropdown(OR.AddDebtPage_ActivitySubtype,testData.get("activity").toString());
	    		//selectIssuer(testData.get("issuer").toString());
	    		this.selectCombobox(OR.AddDebtPage_Issuer, testData.get("issuer").toString());
	    		//checkClientMsrbRegistered(testData.get("isClientMSRBregistered").toString());
	    		//checkClientType(testData.get("clientType").toString());
	    		//selectLeadAdvisor(testData.get("leadAdvisor").toString());
	    		this.selectCombobox(OR.AddDebtPage_LeadAdvisor, testData.get("leadAdvisor").toString());
	    		//selectAssignedTo(testData.get("assignedTo").toString());
	    		//selectPurposeofRFP(testData.get("purposeOfRfp").toString());
	    		//selectPrimarySector(testData.get("primarySector").toString());
	    		//selectSecondarySector(testData.get("secondarySector").toString());
	    		selectDropdown(OR.AddDebtPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.AddDebtPage_SecondarySector,testData.get("secondarySector").toString());
	    		
	    		//enterIssueName(testData.get("issueName").toString());
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
	      		//IssueName.sendKeys(issueName+timestamp);
	      		testData.put("issueNameKey",testData.get("issueName").toString()+timestamp);
	      		enterInput(OR.AddDebtPage_IssueName,testData.get("issueName").toString()+timestamp);
	      		enterInput(OR.AddDebtPage_ProjectDescription,testData.get("projectDescription").toString());
	      		
	    		//enterProjectDescription(testData.get("projectDescription").toString());
	    		selectRelatedTransactionType(RelatedTransactionType, testData.get("relatedTransactionType").toString());
	    		selectRelatedTransactionIds(RelatedTransactionIds, testData.get("relatedTransactionsIds").toString());
	    		enterNotes(Notes, testData.get("notes").toString()+testData.get("issueNameKey").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Add DebtPage - addDebt_BankLoanIssue: Successful - "+SuccessFontColorSuffix);
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BankLoanIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("addDebt_BankLoanIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void verifyDatabase(Map<Object, Object> verifytestData, Document Trandocument){
	    	try{
//	    		MongoDBUtil mongodbutil=new MongoDBUtil();
//	    		System.out.println("Attribute from document is "+Trandocument.get("dealIssueTranAssignedTo"));
//	        	  String dealIssueTranAssignedTo=Trandocument.get("dealIssueTranAssignedTo").toString().replace("[", "").replace("]", "").trim();
//	        	  Document TrandocumentObj= mongodbutil.getDocumentObject("entityusers","_id", dealIssueTranAssignedTo);
//	    		//MongoCollection<Document> myCollection = database.getCollection("myCollection");
//	    		System.out.println("Attribute from document is "+Trandocument.get("dealIssueTranName"));
//	    		//Document document = myCollection.find(eq("_id", new ObjectId("4f693d40e4b04cde19f17205"))).first();
////	    		if (document == null) {
////	    		    //Document does not exist
////	    		} else {
////	    		    //We found the document
//	    		}
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - verifyDatabase - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("addDebt - Deal data enty failed");
	    	}
	    }
	    
	    public void verifyBankLoanDataEntered(Map<Object, Object> verifytestData){
	    	
	    }
	    
	    public void verifyDatabaseBankLoan(Map<Object, Object> verifytestData, Document Trandocument){
//	    	try{
//	    		MongoDBUtil mongodbutil=new MongoDBUtil();
//	    		System.out.println("Attribute from document is "+Trandocument.get("dealIssueTranAssignedTo"));
//	        	  String dealIssueTranAssignedTo=Trandocument.get("dealIssueTranAssignedTo").toString().replace("[", "").replace("]", "").trim();
//	        	  Document TrandocumentObj= mongodbutil.getDocumentObject("entityusers","_id", dealIssueTranAssignedTo);
//	    		//MongoCollection<Document> myCollection = database.getCollection("myCollection");
//	    		System.out.println("Attribute from document is "+Trandocument.get("dealIssueTranName"));
//	    		//Document document = myCollection.find(eq("_id", new ObjectId("4f693d40e4b04cde19f17205"))).first();
////	    		if (document == null) {
////	    		    //Document does not exist
////	    		} else {
////	    		    //We found the document
////	    		}
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - verifyDatabase - unable to enter data"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("addDebt - Deal data enty failed");
//	    	}
	    }
	   
}
