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

public class BaseAddBusinessDevelopmentPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.AddBusinessDevelopmentPage_ActivitySubtype)	
	    public WebElement ActivitySubtype;
//	   @FindBy(xpath = OR.AddBusinessDevelopmentPage_Issuer)	
//	    public WebElement Issuer;
//	   @FindBy(xpath = OR.AddBusinessDevelopmentPage_LeadAdvisor)	
//	    public WebElement LeadAdvisor;
//	   @FindBy(xpath = OR.AddBusinessDevelopmentPage_IssueName)	
//	    public WebElement IssueName;
	   @FindBy(xpath = OR.AddBusinessDevelopmentPage_RelatedTransactionType)	
	    public WebElement RelatedTransactionType; 
	   @FindBy(xpath = OR.AddBusinessDevelopmentPage_RelatedTransactionIds)	
	    public WebElement RelatedTransactionIds; 
	   
	   

	   
	   public boolean Exists(){
	    	return super.Exists(ActivitySubtype); 
	    	
		}
	   
//	    public void selectIssuer(String activityType) 
//	    {
//	    	try{
//	      		if (Exists(Issuer)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+Issuer.toString());
//	      		//String webelementName="Assigned to";
//	      		//String eType="input";
//	      		Thread.sleep(400);
//	      		Issuer.click();
//	      		Thread.sleep(400);
//	      		driver.findElement(By.xpath("//li[contains(text(),'"+activityType+"')]")).click();
//	      		Thread.sleep(1000);
////	      		Issuer.click();
////	      		Thread.sleep(1000);
//	    	
//		}
//   	catch (Exception e)
//   	{
//   		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Derivative Transaction-Deal Page - selectIssuer - unable to select combobox value"+e+ErrorFontColorSuffix);
//   		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//   		throw new NoSuchElementException ("selectIssuer not selected");
//   	}
//	}
//	   
//	    public void selectLeadAdvisor(String leadAdvisor) 
//	    {
//	    	try{
//	      		if (Exists(LeadAdvisor)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+LeadAdvisor.toString());
//	      		//String webelementName="Assigned to";
//	      		//String eType="input";
//	      		Thread.sleep(400);
//	      		LeadAdvisor.click();
//	      		Thread.sleep(400);
//	      		driver.findElement(By.xpath("//li[contains(text(),'"+leadAdvisor+"')]")).click();
//	      		Thread.sleep(1000);
////	      		Issuer.click();
////	      		Thread.sleep(1000);
//	    	
//		}
//   	catch (Exception e)
//   	{
//   		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Derivative Transaction-Deal Page - selectLeadAdvisor - unable to select combobox value"+e+ErrorFontColorSuffix);
//   		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//   		throw new NoSuchElementException ("selectLeadAdvisor not selected");
//   	}
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
	    
//	    public void selectRelatedTransactionType(String relatedTransactionType) 
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
//	    public void selectRelatedTransactionIds(String relatedTransactionIds) 
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
//	    
//	    public void enterNotes(String notes) 
//	    {
//	    	try{
//	    		WebElement Notes=driver.findElement(By.xpath("//*[contains(text(),'Notes / Instructions')]/parent::div//"+"following-sibling::div//textarea"));
//	    		if (Exists(Notes)==false)
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
	    
	    
	    
	    public void enterDebtDetail_BusinessDevelopment(Map<Object, Object> testData) 
	    {
	    	
	    	try{

	    		selectDropdown(OR.AddBusinessDevelopmentPage_ActivitySubtype,testData.get("activity").toString());
	    		
	    		
	    		//	enterInputValue(labels.AddBusinessDevelopmentPage_OtherActivitySubtypeLbl,testData.get("otherActivitySubtype").toString());
	    		
	    			this.selectCombobox(OR.AddBusinessDevelopmentPage_Issuer, testData.get("issuer").toString());

	    		selectDropdown(OR.AddBusinessDevelopmentPage_PrimarySector,testData.get("primarySector").toString());
	    		selectDropdown(OR.AddBusinessDevelopmentPage_SecondarySector,testData.get("secondarySector").toString());
	    		this.selectCombobox(OR.AddBusinessDevelopmentPage_LeadAdvisor, testData.get("leadAdvisor").toString());
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
	      		//IssueName.sendKeys(issueName+timestamp);
	      		//testData.put("issueNameKey",testData.get("issueName").toString()+timestamp);
	    		
	    		enterInput(OR.AddBusinessDevelopmentPage_IssueName,testData.get("issueNameKey").toString());
	    		//enterInputValue("Issue Name (if available)",testData.get("issueName").toString());
	    		enterInput(OR.AddBusinessDevelopmentPage_ProjectDescription,testData.get("projectDescription").toString());
	    		//selectRelatedTransactionType(RelatedTransactionType, testData.get("relatedTransactionType").toString());
	    		//selectRelatedTransactionIds(RelatedTransactionIds,testData.get("relatedTransactionsIds").toString());
	    		//enterInputValue("Notes / Instructions",testData.get("notes").toString());
	    		enterNotes(driver.findElement(By.xpath(OR.AddBusinessDevelopmentPage_Notes)), testData.get("notes").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDetail_BusinessDevelopment: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Derivative Transaction Page - enterDebtDetail_Derivative - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BusinessDevelopment - Deal data enty failed");
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
	    
	    public void verifyDatabase(Map<Object, Object> verifytestData, Document Trandocument){
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
	    public void verifyDataEntered(Map<Object, Object> verifytestData){
	    	
	    }
	   
}
