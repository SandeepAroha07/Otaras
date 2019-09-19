package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.newtran.entity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.menubase.BaseMenuPage;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.entity.BaseAddClientPage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.uielement.fieldDecorator;

public class AddClientPage extends BaseAddClientPage{
	
	public AddClientPage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}
	

}
