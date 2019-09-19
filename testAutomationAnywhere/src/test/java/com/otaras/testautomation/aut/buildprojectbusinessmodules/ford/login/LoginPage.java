package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.login;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.Pages;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.loginbase.*;
import com.otaras.testautomation.common.uielement.TestWebElement;
import com.otaras.testautomation.common.uielement.fieldDecorator;
import com.otaras.testautomation.objectrepository.OR;


public class LoginPage extends BaseLoginPage
{

	
	public LoginPage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}

    
}
