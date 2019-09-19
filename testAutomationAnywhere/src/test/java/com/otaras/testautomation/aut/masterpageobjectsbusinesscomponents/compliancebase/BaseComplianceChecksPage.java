package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.compliancebase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.common.ReadTestConfig;
import com.otaras.testautomation.common.uielement.TestWebElement;
import com.otaras.testautomation.objectrepository.OR;


public class BaseComplianceChecksPage extends BasePage{
  


    @FindBy(xpath = OR.ComplianceChecksPage_Save)	
    public WebElement Save;
  
    public boolean Exists(){
      	return super.Exists(Save); 
    	
	}
  
  
}
