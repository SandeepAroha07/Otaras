package com.otaras.testautomation.aut.buildprojectbusinessmodules.ford;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.commonbusinesscode.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.dashboard.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.home.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.invokeapp.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.login.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.main.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.menu.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.newtran.activity.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.compliance.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.admin.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.newtran.entity.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.newtran.task.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.masterlist.MasterEntityClientsProspectsPage;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.masterlist.MasterEntityThirdPartyPage;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.tools.billing.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.tools.documents.*;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.compliance.complianceactioncenter.*;
//import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.newtran.DebtParticipntsPage.*;
import com.otaras.testautomation.common.GuiValidation;
import com.otaras.testautomation.common.uielement.fieldDecorator;

public class Pages{
  
	private WebDriver driver;
	private ExtentTest testReport;
	
	public CommonBusinessComponentPage CommonBusinessComponentPage;
	public GuiValidation GuiValidation;
	

	public MainPage MainPage;
	public InvokeApplicationPage InvokeApplicationPage;
	public LoginPage LoginPage;
	public HomePage HomePage;
	public MenuPage MenuPage;
	public NewActivitySelectionPage NewActivitySelectionPage;
	public AddTransactionPage AddTransactionPage;
	public AddDebtPage AddDebtPage;
	public ActivityDashboardPage ActivityDashboardPage;
	public ProjectsDashboardPage ProjectsDashboardPage;
	public DebtSummaryPage DebtSummaryPage;
	public DebtDetailPage DebtDetailPage;
	public DebtPricingPage DebtPricingPage;
	public DebtRatingPage DebtRatingPage;
	public DebtParticipantsPage DebtParticipantsPage;
	public DebtDocumentsPage DebtDocumentsPage;
	public TradeSwapPage TradeSwapPage;
	public ContactPage ContactPage;
	public ComplianceChecksPage ComplianceChecksPage;
	public AddDerivativePage AddDerivativePage;
	public AddMARFPPage AddMARFPPage;
	public AddManageClientRFPPage AddManageClientRFPPage;
	public AddBusinessDevelopmentPage AddBusinessDevelopmentPage;
	public AddOtherActivityPage AddOtherActivityPage;
	
	public AdminFeaturesSelectionPage AdminFeaturesSelectionPage;
	public AdminAddUsersPage AdminAddUsersPage;
	public AdminUsersDetailsPage AdminUsersDetailsPage;
	public AdminUsersListPage AdminUsersListPage;
	public AdminClientProspectSelectionPage AdminClientProspectSelectionPage;
	public AdminAddClientProspectPage AdminAddClientProspectPage;
	public AdminAddThirdPartyPage AdminAddThirdPartyPage;
	public AdminThirdPartySelectionPage AdminThirdPartySelectionPage;
	
	public AddClientPage AddClientPage;
	public AddThirdPartyPage AddThirdPartyPage;
	public EntitySelectionPage EntitySelectionPage;
	
	public TaskPage TaskPage;
	
	public MasterEntityClientsProspectsPage MasterEntityClientsPropsectsPage;
	public MasterEntityThirdPartyPage MasterEntityThirdPartyPage;
	
	public ToolsContractPage ToolsContractPage;
	public ToolsDashboardPage ToolsDashboardPage;
	public ToolsExpenseDetailPage ToolsExpenseDetailPage;
	public ToolsTimeTrackerPage ToolsTimeTrackerPage;
	public ToolsDocumentsPage ToolsDocumentsPage;
	
	public ComplianceActionCenterTasksPage ComplianceActionCenterTasksPage;
	public ComplianceAddEditControlPage ComplianceAddEditControlPage;
	public ComplianceControlsPage ComplianceControlsPage;
	public ComplianceMonitorPage ComplianceMonitorPage;
	
	public Pages(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
		 //PageFactory.initElements(driver, this);
		 GuiValidation=new GuiValidation(driver,testReport);
		 //CommonBusinessComponentPage=new CommonBusinessComponentPage(driver,testReport); 
		 CommonBusinessComponentPage=new CommonBusinessComponentPage(driver,testReport);
		 MainPage=new MainPage(driver,testReport);
		 InvokeApplicationPage=new InvokeApplicationPage(driver,testReport);
		 LoginPage = new LoginPage(driver,testReport);
		 HomePage = new HomePage(driver,testReport);
		 
		 MenuPage=new MenuPage(driver,testReport);
		 NewActivitySelectionPage=new NewActivitySelectionPage(driver,testReport);
		 AddTransactionPage=new AddTransactionPage(driver,testReport);
		 AddDebtPage=new AddDebtPage(driver,testReport);
		 ActivityDashboardPage=new ActivityDashboardPage(driver,testReport);
		 ProjectsDashboardPage=new ProjectsDashboardPage(driver,testReport);
		 DebtSummaryPage=new DebtSummaryPage(driver,testReport);
		 DebtDetailPage=new DebtDetailPage(driver,testReport);
		 DebtParticipantsPage=new DebtParticipantsPage(driver,testReport);
		 DebtPricingPage=new DebtPricingPage(driver,testReport);
		 DebtRatingPage=new DebtRatingPage(driver,testReport);
		 DebtDocumentsPage=new DebtDocumentsPage(driver,testReport);
		 TradeSwapPage=new TradeSwapPage(driver,testReport);
		 AddDerivativePage=new AddDerivativePage(driver,testReport);
		 ContactPage=new ContactPage(driver,testReport);
		 ComplianceChecksPage=new ComplianceChecksPage(driver,testReport);
		 AddMARFPPage=new AddMARFPPage(driver,testReport);
		 AddManageClientRFPPage=new AddManageClientRFPPage(driver,testReport);
		 AddBusinessDevelopmentPage=new AddBusinessDevelopmentPage(driver,testReport);
		 AddOtherActivityPage=new AddOtherActivityPage(driver,testReport);
		 AdminFeaturesSelectionPage=new AdminFeaturesSelectionPage(driver,testReport);
		 AdminAddUsersPage=new AdminAddUsersPage(driver,testReport);
		 AdminUsersDetailsPage=new AdminUsersDetailsPage(driver,testReport);
		 AdminUsersListPage=new AdminUsersListPage(driver,testReport);
		 AdminClientProspectSelectionPage=new AdminClientProspectSelectionPage(driver,testReport);
		 AdminAddClientProspectPage=new AdminAddClientProspectPage(driver,testReport);
		 AdminAddThirdPartyPage=new AdminAddThirdPartyPage(driver,testReport);
		 AdminThirdPartySelectionPage=new AdminThirdPartySelectionPage(driver,testReport);
		 
		 AddClientPage=new AddClientPage(driver,testReport);
		 AddThirdPartyPage=new AddThirdPartyPage(driver,testReport);
		 EntitySelectionPage=new EntitySelectionPage(driver,testReport);
		 MasterEntityClientsPropsectsPage=new MasterEntityClientsProspectsPage(driver,testReport);
		 MasterEntityThirdPartyPage=new MasterEntityThirdPartyPage(driver,testReport);
		 
		 TaskPage=new TaskPage(driver,testReport);
		 
		 ToolsContractPage=new ToolsContractPage(driver,testReport);
		 ToolsDashboardPage=new ToolsDashboardPage(driver,testReport);
		 ToolsExpenseDetailPage=new ToolsExpenseDetailPage(driver,testReport);
		 ToolsTimeTrackerPage=new ToolsTimeTrackerPage(driver,testReport);
		 ToolsDocumentsPage=new ToolsDocumentsPage(driver,testReport);
		 
		 ComplianceMonitorPage=new ComplianceMonitorPage(driver,testReport);
		 ComplianceActionCenterTasksPage=new ComplianceActionCenterTasksPage(driver,testReport);
		 ComplianceAddEditControlPage=new ComplianceAddEditControlPage(driver,testReport);
		 ComplianceControlsPage=new ComplianceControlsPage(driver,testReport);
		 

	}
}
