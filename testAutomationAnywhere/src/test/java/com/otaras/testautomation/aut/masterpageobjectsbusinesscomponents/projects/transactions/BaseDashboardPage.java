package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.projects.transactions;
//package com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.projects.transactions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.Status;
//import com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
//import com.companyname.testautomation.aut.testdatarec.TestDataRec;
//import com.companyname.testautomation.objectrepository.OR;
//
//public class BaseDashboardPage  extends BasePage{
//
//	
//	   @FindBy(xpath = OR.TransactionsDashboardPage_NewTransaction)	
//	    public WebElement NewTransaction;
//	   @FindBy(xpath = OR.TransactionsDashboardPage_ParticipantsTab)	
//	    public WebElement ParticipantTab;
//	   
//	   
//	   
//	   public boolean Exists(){
//	    	return super.Exists(NewTransaction); 	
//		}
//	   
//	   
//	   public void clickNewTransaction() 
//	    {
//	    	try{
//	    		NewTransaction.click();
//	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects Dashboard Page - clickNewTransaction Successful - "+NewTransaction.toString()+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects Dashboard Page - clickNewTransaction - unable to Click"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("clickNewTransaction not clicked");
//	    	}
//	    }
//	   
//	   
//	   public void selectTransaction() 
//	    {
//	    	try{
//	    		Thread.sleep(200);
//	    		driver.findElement(By.xpath("//a[@href='/deals/5b3e2399cba89f6a996884dc/details']")).click();
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects Dashboard Page - selectTransaction Successful - "+NewTransaction.toString()+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects Dashboard Page - selectTransaction - unable to Click"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectTransaction not clicked");
//	    	}
//	    } 
//	   
//	   public void clickParticipantsTab() 
//	    {
//	    	try{
//	    		ParticipantTab.click();
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects Dashboard Page - ParticipantTab Successful - "+ParticipantTab.toString()+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects Dashboard Page - clickParticipantsTab - unable to Click"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("clickParticipantsTab not clicked");
//	    	}
//	    }
//	   
//}
