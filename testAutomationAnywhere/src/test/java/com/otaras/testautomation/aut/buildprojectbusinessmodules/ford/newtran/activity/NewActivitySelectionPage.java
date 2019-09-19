package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.newtran.activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.menubase.BaseMenuPage;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.activity.BaseNewActivitySelectionPage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.uielement.fieldDecorator;

public class NewActivitySelectionPage extends BaseNewActivitySelectionPage{
	
	public NewActivitySelectionPage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}
	

}