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


public class BaseAddTransactionPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.AddTransactionPage_PrimarySector)	
	    public WebElement PrimarySector;


	   
	   public boolean Exists(){
	    	return super.Exists(PrimarySector); 
	    	
		}
	   
 
	    
	    public String tranIssueNameKeyValue() 
	    {
	    	return(testData.get("issueNameKey").toString());
	    }
	    

	    public void verifyDataEntered(Map<Object, Object> verifytestData){
	    	
	    }
	
	    
	    
	    public void verifyDatabase(Map<Object, Object> verifytestData, Document Trandocument){
	    	try{
	    		MongoDBUtil mongodbutil=new MongoDBUtil();
	    		System.out.println("Attribute from document is "+Trandocument.get("dealIssueTranAssignedTo"));
	        	  String dealIssueTranAssignedTo=Trandocument.get("dealIssueTranAssignedTo").toString().replace("[", "").replace("]", "").trim();
	        	  Document TrandocumentObj= mongodbutil.getDocumentObject("entityusers","_id", dealIssueTranAssignedTo);
	    		//MongoCollection<Document> myCollection = database.getCollection("myCollection");
	    		System.out.println("Attribute from document is "+Trandocument.get("dealIssueTranName"));
	    		//Document document = myCollection.find(eq("_id", new ObjectId("4f693d40e4b04cde19f17205"))).first();
//	    		if (document == null) {
//	    		    //Document does not exist
//	    		} else {
//	    		    //We found the document
//	    		}
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - verifyDatabase - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("addDebt - Deal data enty failed");
	    	}
	    }
	    

	   
}
