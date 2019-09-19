package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.compliance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.compliancebase.BaseComplianceChecksPage;
import com.otaras.testautomation.common.uielement.fieldDecorator;

public class ComplianceChecksPage extends BaseComplianceChecksPage
{

	public ComplianceChecksPage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}
	

}
