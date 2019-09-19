package com.otaras.testautomation.aut.buildprojectbusinessmodules.core;
//package com.companyname.testautomation.aut.buildprojectbusinessmodules.core;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.login.*;
//import com.companyname.testautomation.common.uielement.fieldDecorator;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.home.*;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.invokeaut.*;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.commonbusinesscode.*;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.menu.*;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.newentity.entity.*;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.projects.transactions.*;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.main.*;
//import com.companyname.testautomation.common.GuiValidation;
//
//public class Pages{
//  
//	private WebDriver driver;
//	private ExtentTest testReport;
//	
//	public CommonBusinessComponentPage CommonBusinessComponentPage;
//	public GuiValidation GuiValidation;
//	
//
//	public MainPage MainPage;
//	public InvokeApplicationPage InvokeApplicationPage;
//	public LoginPage LoginPage;
//	public HomePage HomePage;
//	public MenuPage MenuPage;
//	public DashboardPage DashboardPage;
//	public CreateEntitySelectionPage CreateEntitySelectionPage;
//	public ClientFirmPage ClientFirmPage;
//	public ClientContactsPage ClientContactsPage;
//	public NewTransactionPage NewTransactionPage;
//	public DetailsPage DetailsPage;
//	public ParticipantsPage ParticipantsPage;
//	
//	public Pages(WebDriver driver,ExtentTest testReport)
//	{
//		 this.driver=driver;
//		 this.testReport=testReport;
//		
//		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
//		 //PageFactory.initElements(driver, this);
//		 GuiValidation=new GuiValidation(driver,testReport);
//		 //CommonBusinessComponentPage=new CommonBusinessComponentPage(driver,testReport); 
//		 CommonBusinessComponentPage=new CommonBusinessComponentPage(driver,testReport);
//		 MainPage=new MainPage(driver,testReport);
//		 InvokeApplicationPage=new InvokeApplicationPage(driver,testReport);
//		 LoginPage = new LoginPage(driver,testReport);
//		 HomePage = new HomePage(driver,testReport);
//		 
//		 MenuPage=new MenuPage(driver,testReport);
//		 CreateEntitySelectionPage=new CreateEntitySelectionPage(driver,testReport);
//		 ClientFirmPage=new ClientFirmPage(driver,testReport);
//		 ClientContactsPage=new ClientContactsPage(driver,testReport);
//		 DashboardPage=new DashboardPage(driver,testReport);
//		 NewTransactionPage=new NewTransactionPage(driver,testReport);
//		 DetailsPage=new DetailsPage(driver,testReport);
//		 ParticipantsPage=new ParticipantsPage(driver,testReport);
//	}
//}
