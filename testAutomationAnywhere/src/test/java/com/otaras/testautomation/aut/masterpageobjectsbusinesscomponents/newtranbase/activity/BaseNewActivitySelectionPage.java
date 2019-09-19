package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.activity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseNewActivitySelectionPage  extends BasePage{
	
	
	   @FindBy(xpath = OR.NewActivitySelection_Debt)	
	    public WebElement Debt;

	   
	   public boolean Exists(){
	    	return super.Exists(Debt); 
	    	
		}
	   
	   
	   
		//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
		
		
	    public void clickDebt() 
	    {
	    	try{
	    		//Debt.click();
	    		WebElement element = Debt;//driver.findElement(By.xpath("//div/div/div/div/div[1]/div/section/div[1]/div[1]/article/a"));
	    		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    		executor.executeScript("arguments[0].click();", element);
	    		driver.navigate().refresh();
	    		this.Exists(Debt);
	    		//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Client Contacts Page - clickDebt Successful - "+Debt.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Client Contacts Page - clickDebt - unable to select combobox value"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
//	    public void clickSpecifiedTransaction(String sLabelName) 
//	    {
//	    	try{
//	    		//Debt.click();
//	    		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+sLabelName+"')]"));
//	    		JavascriptExecutor executor = (JavascriptExecutor)driver;
//	    		executor.executeScript("arguments[0].click();", element);
//	    		//driver.navigate().refresh();
//	    		this.Exists(element);
//	    		//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
//	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Client Contacts Page - Click"+sLabelName+"  - Successful - "+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"clickElementByLabel - unable to select Element"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("clickElementByLabel not launched");
//	    	}
//	    }
	   
}
