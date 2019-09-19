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

public class BaseTradeSwapPage  extends BasePage{
	   public Map<Object, Object> testData;
		

	   @FindBy(xpath = OR.TradeSwapPage_ClientPayLeg_Currency)	
	    public WebElement ClientPayLeg_Currency;

	   
	   

	   
	   public boolean Exists(){
	    	return super.Exists(ClientPayLeg_Currency); 
	    	
		}
	   
	    public void enterCPLTradeSwap(Map<Object, Object> testData) 
	    {
	    	
	    	try{
    		
	    		this.selectDropdown(OR.TradeSwapPage_ClientPayLeg_Currency, testData.get("cplCurrency").toString());
	    		this.selectDropdown(OR.TradeSwapPage_ClientPayLeg_PaymentType, testData.get("cplPaymentType").toString());
	    		this.enterInput(OR.TradeSwapPage_ClientPayLeg_UpfrontPayment,testData.get("cplUpfrontPayment").toString());
	    		this.enterDate(OR.TradeSwapPage_ClientPayLeg_TradeDate, testData.get("cplTradeDate").toString(), "");
	    		this.enterDate(OR.TradeSwapPage_ClientPayLeg_EffectiveDate, testData.get("cplEffectiveDate").toString(), "");
	    		this.enterInput(OR.TradeSwapPage_ClientPayLeg_FixedRate,testData.get("cplFixedRate").toString());
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterTradeSwap Transaction Page - enterCPLTradeSwap - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterCPLTradeSwap - Deal data enty failed");
	    	}
	    }

	    public void enterDPLTradeSwap(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		//this.selectCombobox(OR.TradeSwapPage_DealerPayLeg_Payor, testData.get("dplPayor").toString());
	    		String randomString=RandomStringUtils.randomAlphabetic(5).toUpperCase();    
                Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Payor"+"')]/parent::div//"+"div[@role='combobox']")));
                WebElement wb1=driver.findElement(By.xpath("//*[contains(text(),'"+"Payor"+"')]/parent::div//"+"div[@role='combobox']"));
                
                    Actions builder=new Actions(driver);
                    Action seriesofactions=builder
                            .moveToElement(wb1)
                            .click()
                            .pause(900)
                            .sendKeys(wb1,testData.get("dplPayor").toString()+randomString)
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
                    WebElement wb11=driver.findElement(By.xpath("//*[contains(text(),'"+"Payor"+"')]/parent::div//"+"div[@role='combobox']//ul[2]/li"));
                    builder=new Actions(driver);
                    seriesofactions=builder
                            .moveToElement(wb11)
                            .pause(100)
                            .click()
                            .pause(100)
//                          .sendKeys(wb1,testData.get("entityName").toString()+randomString)
//                          .sendKeys(Keys.TAB)
                            .build();
                    seriesofactions.perform();
                    
                    Thread.sleep(200);
	    		this.selectDropdown(OR.TradeSwapPage_DealerPayLeg_Currency, testData.get("dplCurrency").toString());
	    		this.selectDropdown(OR.TradeSwapPage_DealerPayLeg_PaymentType, testData.get("dplPaymentType").toString());
	    		this.enterInput(OR.TradeSwapPage_DealerPayLeg_UpfrontPayment,testData.get("dplUpfrontPayment").toString());
	    		this.enterDate(OR.TradeSwapPage_DealerPayLeg_TradeDate, testData.get("dplTradeDate").toString(), "");
	    		this.enterDate(OR.TradeSwapPage_DealerPayLeg_EffectiveDate, testData.get("dplEffectiveDate").toString(), "");
	    		this.enterInput(OR.TradeSwapPage_DealerPayLeg_FixedRate,testData.get("dplFixedRate").toString());
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterDPLTradeSwap Transaction Page - enterDPLTradeSwap - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDPLTradeSwap - Deal data enty failed");
	    	}
	    } 
	
   public void verifyDataEntered(Map<Object, Object> verifytestData){
	    	
	    }
	
}
