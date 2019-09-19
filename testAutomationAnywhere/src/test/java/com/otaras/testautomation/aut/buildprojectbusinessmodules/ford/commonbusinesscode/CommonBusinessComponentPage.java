package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.commonbusinesscode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.Pages;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.commonbusinesscodebase.BaseCommonBusinessComponentPage;
import com.otaras.testautomation.common.uielement.fieldDecorator;

//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.Pages;


public class CommonBusinessComponentPage extends BaseCommonBusinessComponentPage{
	
//	private WebDriver driver;
//	  Pages ppages=new Pages(driver,testReport);
	public Pages pages;
	//public ExtentTest testReport;
	
	public CommonBusinessComponentPage(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
	}
	
	
	public CommonBusinessComponentPage(Pages pages)
	{
		this.pages=pages;
	}
	
//	@Test
  public void f() {
	  pages.InvokeApplicationPage.launchApplication();
//	  pages.InvokeApplicationPage.launchApplication();
//	  pages.HomePage.testFunction();
//	  //pages./testAutomationAnywhere/src/main/java/com/companyname/testautomation/aut/buildprojectbusinessmodules/core/login/LoginPage.java
  }
  
  public void LoginToApplication() throws Exception 
  {
	  pages.InvokeApplicationPage.launchApplication();
	 
//	  pages.InvokeApplicationPage.WaitForPage(pages.MainPage);
//	  pages.MainPage.clickLoginIcon();
	  pages.MainPage.WaitForPage(pages.LoginPage);
	  pages.LoginPage.loginToApplication();
	  pages.LoginPage.WaitForPage(pages.HomePage);
  }
  
  public void SelectProjectsMenu() throws Exception 
  {
  	  //pages.LoginPage.loginToApplication();
	  //pages.LoginPage.WaitForPage(pages.HomePage);
	  pages.MenuPage.clickNewMenu();
	  pages.MenuPage.clickActivitySubMenu();
	  pages.MenuPage.WaitForPage(pages.NewActivitySelectionPage);
  }
  
  public void SelectContactsMenu() throws Exception 
  {
  	  //pages.LoginPage.loginToApplication();
	  //pages.LoginPage.WaitForPage(pages.HomePage);
	  pages.MenuPage.clickNewMenu();
	  pages.MenuPage.clickContactSubMenu();
	  pages.MenuPage.WaitForPage(pages.ContactPage);
	  pages.MenuPage.WaitForPage(pages.ContactPage);
  }
  
  public void SelectAdminMenu() throws Exception 
  {
  	  //pages.LoginPage.loginToApplication();
	  //pages.LoginPage.WaitForPage(pages.HomePage);
	  //pages.MenuPage.clickNewMenu();
	  pages.MenuPage.clickAdminMenu();
	  pages.MenuPage.WaitForPage(pages.AdminFeaturesSelectionPage);
  }
  
  public void SelectEntityMenu() throws Exception 
  {
  	  //pages.LoginPage.loginToApplication();
	  //pages.LoginPage.WaitForPage(pages.HomePage);
	  pages.MenuPage.clickNewMenu();
	  pages.MenuPage.clickEntitySubMenu();
	  pages.MenuPage.WaitForPage(pages.EntitySelectionPage);
  }
  
  public void SelectToolsMenu() throws Exception 
  {
  	  //pages.LoginPage.loginToApplication();
	  //pages.LoginPage.WaitForPage(pages.HomePage);
	  pages.MenuPage.clickToolsMenu();
	  pages.MenuPage.clickBillingSubMenu();
	  pages.MenuPage.WaitForPage(pages.ToolsDashboardPage);
  }
  
  public void SelectToolsDocumentsMenu() throws Exception 
  {
  	  //pages.LoginPage.loginToApplication();
	  //pages.LoginPage.WaitForPage(pages.HomePage);
	  pages.MenuPage.clickToolsMenu();
	  pages.MenuPage.clickDocumentsSubMenu();
	  pages.MenuPage.WaitForPage(pages.ToolsDocumentsPage);
  }
  
  public void SelectComplianceActionCenterMenu() throws Exception 
  {
  	  //pages.LoginPage.loginToApplication();
	  //pages.LoginPage.WaitForPage(pages.HomePage);
	  pages.MenuPage.clickomplianceMenu();
	  pages.MenuPage.clickComplianceActionCenterSubMenu();
	  pages.MenuPage.WaitForPage(pages.ComplianceMonitorPage);
  }
  
}
