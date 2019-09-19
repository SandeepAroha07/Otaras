package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.toolsbase.billing;

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


public class BaseToolsDashboardPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.ToolsDashboardPage_AddNewExpenseDetails)	
	    public WebElement AddNewExpenseDetails;

	   

	   
	   public boolean Exists(){
	    	return super.Exists(AddNewExpenseDetails); 
	    	
		}
	   

	    
	    
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
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
	      		//IssueName.sendKeys(issueName+timestamp);
	      		testData.put("issueNameKey",testData.get("issueName").toString()+timestamp);
	    		
	      		enterInput(OR.AddDebtPage_IssueName,testData.get("issueName").toString()+timestamp);
	    		//enterProjectDescription(testData.get("projectDescription").toString());
	      		enterInput(OR.AddDebtPage_ProjectDescription,testData.get("projectDescription").toString());
	    		//selectDropdownValue("Related transactions:",testData.get("relatedTransactionType").toString());
	    		
//	    		this.selectRelatedTransactionType(RelatedTransactionType, testData.get("relatedTransactionType").toString());
//	    		this.selectRelatedTransactionIds( RelatedTransactionIds, testData.get("relatedTransactionsIds").toString());
//	    		//enterNotes(testData.get("notes").toString());
//	    		enterNotes(Notes, testData.get("notes").toString()+testData.get("issueNameKey").toString());
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
