package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.compliance.complianceactioncenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.compliancebase.complianceactioncenter.BaseComplActCtrTasksPage;
import com.otaras.testautomation.common.uielement.fieldDecorator;

public class ComplianceActionCenterTasksPage extends BaseComplActCtrTasksPage
{

	public ComplianceActionCenterTasksPage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}
	

}
