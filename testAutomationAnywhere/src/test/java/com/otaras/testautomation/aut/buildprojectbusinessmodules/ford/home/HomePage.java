package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.homebase.BaseHomePage;
import com.otaras.testautomation.common.uielement.fieldDecorator;

public class HomePage extends BaseHomePage
{

	public HomePage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}
	

}
