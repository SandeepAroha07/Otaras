package com.otaras.testautomation.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.otaras.testautomation.labels.labels;


public class OR {
	
	
//	public final static String homePage_productSearchText="//input[@name='search_query']";
//	public final static String homePage_productSearchButton="//button[@name='submit_search']";
//	public final static String homePage_signIn="//a[@class='login']";
//	
//
//	public final static String loginPage_newCustEmailAddresslabel="//label[@for='email_create']";
//	//public static final String loginPage_newCustemailAddress="//input[@id='email_create']";
//	public final static String loginPage_newCustemailAddress= "//input[@id='email_create']";	
//	public final static String loginPage_createAnAccount="//button[@id='SubmitCreate']";
//	public final static String loginPage_existCustEmailAddresslabel="//label[@for='email']";
//	public final static String loginPage_existCustemailAddress="//input[@id='email']";
//	public final static String loginPage_passwordlabel="//label[@for='passwd']";
//	public final static String loginPage_password="//input[@id='passwd']";
//	public final static String loginPage_forgotYourPassword="//a[@rel='nofollow']";
//	public final static String loginPage_signIn="//button[@id='SubmitLogin']";
//	public final static String loginPage_homeIcon="//img[@alt='My Store']";
	
	
	//---------------------------------------------------------------------------------------------------------------------
	
	// Dropdown Values
	public final static String DP_TranName_BondIssue="Bond Issue";
	public final static String DP_TranName_BankLoan="Bank Loan";
	public final static String DP_TranName_Derivative="Derivative";
	public final static String DP_TranName_OtherActivity="Other Activity";
	
	
	
	//Landing Page
	public final static String MainPage_LoginIcon="//p[@class='title innerPgTitle']";
	
	//Login
	public final static String LoginPage_UserName="//input[@name='email']";
	public final static String LoginPage_Password="//input[@name='password']";
	public final static String LoginPage_SignIn="//*[contains(text(),'Sign In')]";
	
	// Dashboard
	public final static String HomePage_SignOutIcon="//i[@class='fas fa-cog']";
	public final static String HomePage_MunivisorIcon="//img[@src='/images/munivisor.png']";
	
	// ACTIVITY DASHBOARD
	public final static String DashboardPage_SaveAsDefaultViewButton=".button"; //'Save as my default view' button
	public final static String DashboardPage_DashboardTab="//a[@href='/dashboard']"; //'Dashboard Tab'
	public final static String DashboardPage_ProjectsTab="//a[@href='/dash-projects']"; //'Projects Tab'
	public final static String DashboardPage_PatrticipantsTab="//a[contains(text(),'Participants')]";
	public final static String DashboardPage_MARequestForProposalsLbl="MA Request For Proposals";
	public final static String DashboardPage_ProjectsLbl="Projects";
	
	
	// PROJECTS DASHBOARD
	public final static String DashboardPage_SearchField="//div[@class='searchContainer']//input[@placeholder='Search..']|//input[@placeholder='Search..']";//"//input[@class='input customInput css-dnqvel ep3169p0']";
	public final static String DashboardPage_TranTypes="//select[@id='tran-types']";
	public final static String DashboardPage_TransactionsLbl="//span[contains(text(),'transactions')]";
	
	// Menu
	public final static String MenuPage_UserDashboard="//a[contains(text(),'User Dashboard')]";
	public final static String MenuPage_Projects="//a[contains(text(),'Projects')]";
	//public final static String MenuPage_New="//a[contains(text(),'New')]";
	public final static String MenuPage_New="//div[@id='navMenuDocumentation']//a[contains(text(),'New')]";;//"div.navbar-item:nth-child(2) > a:nth-child(1)";
	public final static String MenuPage_NewEntity="//a[@href='/addnew-entity']";
	public final static String MenuPage_NewActivity="//a[@href='/addnew-activity']";
	public final static String MenuPage_NewTask="//a[@href='/addnew-task']";
	
	public final static String MenuPage_Admin="//i[@class='fab fa-adn']";
	public final static String MenuPage_Contact="//a[@href='/addnew-contact']";
	//public final static String MenuPage_NewEntity="//a[contains(text(),'Entity')]";
	public final static String MenuPage_Tools="//div[@id='navMenuDocumentation']//a[contains(text(),'Tools')]";
	public final static String MenuPage_Billing="//a[@href='/tools-billing']";
	public final static String MenuPage_Documents="//a[@href='/tools-docs']";
	public final static String MenuPage_Compliance="//div[@id='navMenuDocumentation']//a[contains(text(),'Compliance')]";
	public final static String MenuPage_ComplianceActionCenter="//a[@href='/cac']";
	
	// New-Entity Selection Page
	public final static String NewActivitySelection_Debt="//a[@href='/createTran/debt']";;//"//*[contains(text(),'Debt')]";
	public final static String NewActivitySelection_ManageClientRFP="//a[@href='/createTran/rfp']";
	public final static String NewActivitySelection_Derivative="//a[@href='/createTran/derivative']";
	public final static String NewActivitySelection_MARfp="//a[@href='/createTran/marfp']";
	public final static String NewActivitySelection_OtherActivity="//a[@href='/createTran/others']";
	public final static String NewActivitySelection_Business="//a[@href='/createTran/businessDevelopment']";
	
	
	// ########## New-Activity-Add Debt Page
	
	public final static String AddTransactionPage_ActivitySubtype="//select[@name='actTranSubType']|//select[@name='actSubType']";
    public final static String AddTransactionPage_Issuer="//*[contains(text(),'"+"Issuer/Client Name"+"')]/parent::div//"+"div[@role='combobox']";
	public final static String AddTransactionPage_PrimarySector="//select[@name='actTranPrimarySector']|//select[@name='actPrimarySector']";
	public final static String AddTransactionPage_SecondarySector="//select[@name='actTranSecondarySector']|//select[@name='actSecondarySector']";
	public final static String AddTransactionPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"') or contains(text(),'"+"Swap (or Lead) Advisor"+"')]/parent::div//div[@role='combobox']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//button[@role='presentational']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//span[@class='rw-select']";
	public final static String AddTransactionPage_IssueName="//input[@name='actTranIssueName']|//input[@name='actIssueName']";
	public final static String AddTransactionPage_ProjectDescription="//input[@name='actTranProjectDescription']|//input[@name='actProjectName']";
	public final static String AddTransactionPage_RelatedTransactionType="//select[@name='actTranRelatedType']|//select[@name='actRelatedType']";
	public final static String AddTransactionPage_RelatedTransactionIds="//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"following-sibling::div//span[@class='rw-select']";//*[contains(text(),'TXRFP4182545.0723')]";//"//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"span"+"//following-sibling::button";//"//*[contains(text(),'"+"Related transactions"+"')]/parent::div//button[@class='rw-btn rw-btn-select']"    ;//"//span[@id='rw_3_notify_area']/parent::div//span[@class='rw-select']";
	public final static String AddTransactionPage_RelatedTransactionSearchByName="//*[contains(text(),'"+"Search by name"+"')]/parent::div/parent::div/parent::div[@role='combobox']";//"//*[contains(text(),'"+"Search by name"+"')]/parent::div//following-sibling::span[@class='rw-select']/button";
	//driver.findElement(By.xpath("//*[contains(text(),'"+"Search by name"+"')]/parent::div//following-sibling::span[@class='rw-select']/button")).getAttribute("class")
			public final static String AddTransactionPage_Notes="//textarea[@name='actTranNotes']|//textarea[@name='actNotes']";
	public final static String AddTransactionPage_OtherActivitySubtype="//input[@name='actOtherSubtype']";
	
	
	
	
	
	
	// ########## New-Activity-Add Debt Page
	public final static String AddDebtPage_ActivitySubtype="//select[@name='actTranSubType']";

	
//	public final static String AddDebtPage_Issuer="//div[@id='rw_1_input']";
//	public final static String AddDebtPage_ClientMSRBRegistered="//input[@name='actTranIsClientMsrbRegistered']";
//	public final static String AddDebtPage_ClientIsBorrower="//input[@id='Borrower']";
//	public final static String AddDebtPage_ClientIsConduit="//input[@id='Conduit']";
//	public final static String AddDebtPage_ClientIsNotApplicable="//input[@id='NA']";
//	public final static String AddDebtPage_AssignedTo="//*[contains(text(),'"+"Assigned to"+"')]/parent::div//span[@class='rw-select']";//"div.columns:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1)";
//	public final static String AddDebtPage_PurposeofRFP="//select[@name='rfpTranPurposeOfRequest']";
    public final static String AddDebtPage_Issuer="//*[contains(text(),'"+"Client Name"+"')]/parent::div//"+"div[@role='combobox']";
	public final static String AddDebtPage_PrimarySector="//select[@name='actTranPrimarySector']";
	public final static String AddDebtPage_SecondarySector="//select[@name='actTranSecondarySector']";
	public final static String AddDebtPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//div[@role='combobox']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//button[@role='presentational']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//span[@class='rw-select']";
	public final static String AddDebtPage_IssueName="//input[@name='actTranIssueName']";
	public final static String AddDebtPage_ProjectDescription="//input[@name='actTranProjectDescription']";
	public final static String AddDebtPage_RelatedTransactionType="//select[@name='actTranRelatedType']";
	public final static String AddDebtPage_RelatedTransactionIds="//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"following-sibling::div//span[@class='rw-select']";//*[contains(text(),'TXRFP4182545.0723')]";//"//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"span"+"//following-sibling::button";//"//*[contains(text(),'"+"Related transactions"+"')]/parent::div//button[@class='rw-btn rw-btn-select']"    ;//"//span[@id='rw_3_notify_area']/parent::div//span[@class='rw-select']";
//	//driver.findElement(By.xpath("//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"following-sibling::div//li/*[contains(text(),'TXRFP4182545.0723')]")).getText() - working code
	public final static String AddDebtPage_Notes="//textarea[@name='actTranNotes']";
//	public final static String AddDebtPage_Save=".is-link";//"//button[contains(@text(),'Save')]";
//	public final static String AddDebtPage_Cancel="//button[contains(@text(),'Cancel')]";
	
	
	// ########## New-Activity-Add Other Activity Page
	public final static String AddOtherActivityPage_ActivitySubtype="//select[@name='actTranSubType']";
	public final static String AddOtherActivityPage_Issuer="//*[contains(text(),'"+"Client Name"+"')]/parent::div//"+"div[@role='combobox']";
	public final static String AddOtherActivityPage_PrimarySector="//select[@name='actTranPrimarySector']";
	public final static String AddOtherActivityPage_SecondarySector="//select[@name='actTranSecondarySector']";
	public final static String AddOtherActivityPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//div[@role='combobox']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//button[@role='presentational']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//span[@class='rw-select']";
	public final static String AddOtherActivityPage_IssueName="//input[@name='actTranIssueName']";
	public final static String AddOtherActivityPage_ProjectDescription="//input[@name='actTranProjectDescription']";
	public final static String AddOtherActivityPage_RelatedTransactionType="//select[@name='actTranRelatedType']";
	public final static String AddOtherActivityPage_RelatedTransactionIds="//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"following-sibling::div//span[@class='rw-select']";//*[contains(text(),'TXRFP4182545.0723')]";//"//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"span"+"//following-sibling::button";//"//*[contains(text(),'"+"Related transactions"+"')]/parent::div//button[@class='rw-btn rw-btn-select']"    ;//"//span[@id='rw_3_notify_area']/parent::div//span[@class='rw-select']";
	public final static String AddOtherActivityPage_Notes="//textarea[@name='actTranNotes']";
	
	
	
	// ########## Debt DETAIL PAGE
	public final static String ComplianceChecksPage_Save="//*[contains(text(),'"+"Save"+"')]";
	public final static String ComplianceChecksPage_Message="//*[contains(text(),'"+"Save"+"')]";
	public final static String ComplianceChecksPage_ValidContract="//label[contains(text(),'"+"valid contract"+"')]//span";
	
	// ########## Debt DETAIL PAGE
		public final static String DebtDetailsPage_County="//select[@name='dealIssueTranCounty']|//select[@name='actTranCounty']|//select[@name='actCounty']|//select[@name='actTranCounty']";
		public final static String DebtDetailsPage_State="//select[@name='dealIssueTranState']|//select[@name='actTranState']|//select[@name='actState']";
		public final static String DebtDetailsPage_PrimarySector="//select[@name='dealIssueTranPrimarySector']|//select[@name='actTranPrimarySector']|//select[@name='actPrimarySector']";
		public final static String DebtDetailsPage_SecondarySector="//select[@name='dealIssueTranSecondarySector']|//select[@name='actTranSecondarySector']|//select[@name='actSecondarySector']";
		public final static String DebtDetailsPage_UseofProceeds="//select[@name='dealIssueUseOfProceeds']|//select[@name='actTranUseOfProceeds']|//select[@name='actUseOfProceeds']";
		public final static String DebtDetailsPage_SecurityType="//select[@name='dealIssueSecurityType']|//select[@name='actTranSecurityType']|//select[@name='actSecurityType']";
		public final static String DebtDetailsPage_BankQualified="//select[@name='dealIssueBankQualified']|//select[@name='actTranBankQualified']|//select[@name='actBankQualified']";
		public final static String DebtDetailsPage_CorpType="//select[@name='dealIssueCorpType']|//select[@name='actTranCorpType']|//select[@name='actCorpType']";
		public final static String DebtDetailsPage_ParAmount="//input[@name='dealIssueParAmount']|//input[@name='parAmount']|//input[@name='actTranParAmount']|//input[@name='actParAmount']";
		public final static String DebtDetailsPage_PricingDate="//input[@name='dealIssuePricingDate']|//input[@name='actTranPricingDate']|//input[@name='actPricingDate']";
		public final static String DebtDetailsPage_ExpectedAwardDate="//input[@name='dealIssueExpAwardDate']|//input[@name='actTranExpAwardDate']|//input[@name='actExpAwaredDate']";
		public final static String DebtDetailsPage_ActualAwardDate="//input[@name='dealIssueActAwardDate']|//input[@name='actTranActAwardDate']|//input[@name='actActAwardDate']";
		public final static String DebtDetailsPage_SDLCCredit="//input[@name='dealIssueSdlcCreditPerc']|//input[@name='actTranSdlcCreditPerc']|//input[@name='actSdlcCreditPerc']";
		public final static String DebtDetailsPage_EstimatedRevenue="//input[@name='dealIssueEstimatedRev']|//input[@name='actTranEstimatedRev']|//input[@name='actEstRev']|//input[@name='tranEstimatedRev']";
		public final static String DebtDetailsPage_OpportunityType="//select[@name='dealIssueofferingType']|//select[@name='actTranOfferingType']|//select[@name='actOppType']";
		public final static String DebtDetailsPage_OfferingStatus="//select[@name='actOppStatus']";
		public final static String DebtDetailsPage_TransactionType="//select[@name='dealIssueTranType']|//select[@name='actTranType']|//select[@name='actType']|//select[@name='tranType']";
		public final static String DebtDetailsPage_ClosingDate="//input[@name='actTranClosingDate']";
		
		public final static String DebtDetailsPage_InitialPrincipal="//input[@name='parAmount']";
		public final static String DebtDetailsPage_OpportunityName="//input[@name='actOppName']";
		public final static String DebtDetailsPage_PaymentDay="//select[@name='prinPaymentDay']";
		public final static String DebtDetailsPage_LoanTermsLbl="Loan Terms";
		public final static String DebtDetailsPage_LinkCusipLbl="Link CUSIP (if applicable)";
		public final static String DebtDetailsPage_NotionalAmount="//input[@name='tranNotionalAmt']";
		public final static String DebtDetailsPage_TradeDate="//input[@name='tranTradeDate']";
		public final static String DebtDetailsPage_EffectiveDate="//input[@name='tranEffDate']";
		public final static String DebtDetailsPage_EndDate="//input[@name='tranEndDate']";
		//public final static String DebtDetailsPage_CounterpartyClient="//input[@name='tranCounterpartyClient']";
		public final static String DebtDetailsPage_CounterpartyClient="//*[contains(text(),'"+"Counterparty-Client"+"')]/parent::div//div[@role='combobox']";
		public final static String DebtDetailsPage_CounterpartyDealer="//select[@name='tranCounterpartyDealer']";
		public final static String DebtDetailsPage_CounterpartyType="//select[@name='tranCounterpartyType']";
		
	// ########## Debt LOAN DETAIL PAGE
		public final static String DebtLoanDetailsPage_InitialPrincipal="//input[@name='parAmount']";
		public final static String DebtLoanDetailsPage_PaymentDay="//select[@name='intPaymentFreq']";
		
//		public final static String AddDebtPage_GuarantorName="//select[@name='dealIssueGuarantorName']";
//		public final static String AddDebtPage_TransactionType="//select[@name='dealIssueTranType']";
//		public final static String AddDebtPage_TransactionStatus="//*[contains(text(),'"+"Transaction Status"+"')]/parent::div//select";
//		public final static String AddDebtPage_State="//*[contains(text(),'"+"State"+"')]/parent::div//select";
//		public final static String AddDebtPage_County="//*[contains(text(),'"+"County"+"')]/parent::div//select";
//		public final static String AddDebtPage_PrimarySector1="//*[contains(text(),'"+"Primary Sector"+"')]/parent::div//select";
//		public final static String AddDebtPage_SecondarySector1="//*[contains(text(),'"+"Secondary Sector"+"')]/parent::div//select";
		
		
		// ########## Debt Summary PAGE
		public final static String DebtSummaryPage_TransactionStatus="//*[contains(text(),'"+"Transaction status:"+"')]";
		
		// Debt Participants Page
		public final static String DebtParticipantsPage_Add="//*[contains(text(),'"+"Add"+"')]/parent::div";
		public final static String DebtParticipantsPage_UnderwritingLbl="Underwriting Team";
		public final static String DebtParticipantsPage_CounterpartiesLbl="Counterparties";
		public final static String DebtParticipantsPage_DealParticipantsLbl="Deal Participants";
		public final static String DebtParticipantsPage_AddLoanParticipantsLbl="Add Loan Participants";
		public final static String DebtParticipantsPage_ParticipantType="//*[contains(text(),'"+"Participant Type"+"')]/parent::div//div[@role='combobox']";
		public final static String DebtParticipantsPage_FirmName="//*[contains(text(),'"+"Firm Name"+"')]/parent::div//div[@role='combobox']";
		public final static String DebtParticipantsPage_ContactName="//*[contains(text(),'"+"Contact Name"+"')]/parent::div//div[@role='combobox']";
		public final static String DebtParticipantsPage_Addresses="//*[contains(text(),'"+"Addresses"+"')]/parent::div//div[@role='combobox']";
		public final static String DebtParticipantsPage_FirmType="//select[@name='cntrPartyFirmtype']";
		public final static String DebtParticipantsPage_FirmName2="//select[@name='cntrPartyFirmName']";
		public final static String DebtParticipantsPage_Moodys="//select[@name='cntrPartyMoodysRating']";
		public final static String DebtParticipantsPage_Fitch="//select[@name='cntrPartyFitchRating']";
		public final static String DebtParticipantsPage_Kroll="//select[@name='cntrPartyKrollRating']";
		public final static String DebtParticipantsPage_SandP="//select[@name='cntrPartySPRating']";
		
		// Debt Pricing Page
		public final static String DebtPricingPage_Add="//*[contains(text(),'"+"Add"+"')]/parent::div";	
		public final static String DebtPricingPage_AddSeriesLbl="Add Series";	
		public final static String DebtDocumentsPage_Principal="//input[@name='dealSeriesPrincipal']|//input[@name='seriesPrincipal']";
		public final static String DebtDocumentsPage_SecurityType="//select[@name='dealSeriesSecurityType']|//select[@name='seriesSecurityType']";
		
		// Debt Rating Page
		public final static String DebtRatingPage_Add="//*[contains(text(),'"+"Add"+"')]/parent::div";	
		public final static String DebtRatingPage_DealRatingsLbl="Deal Ratings";
		public final static String DebtRatingPage_DealCEPRatingsLbl="Deal CEP Ratings";
//		public final static String DebtRatingPage_DealCEPRatingsSeriesCodeLbl="Series Code";
//		public final static String DebtRatingPage_DealCEPRatingsRatingAgencyLbl="Rating Agency";
		
		// Debt Documents Page
		public final static String DebtDocumentsPage_Add="//*[contains(text(),'"+"Add"+"')]/parent::div";	
		public final static String DebtDocumentsPage_PickStatus="//select[@name='docStatus']";
		public final static String DebtDocumentsPage_UploadDealsDocumentsLbl="Upload Transaction Documents";
		public final static String DebtDocumentsPage_UploadBankDocumentsTblNameLbl="Upload Bank Loan Documents";
		public final static String DebtDocumentsPage_UploadDerivativeDocumentsTblNameLbl="Upload Derivative Documents";
		public final static String DebtDocumentsPage_UploadMARFPDocumentsTblNameLbl="Upload MaRfp Documents";
		public final static String DebtDocumentsPage_UploadOtherPDocumentsTblNameLbl="Upload Others Documents";
		
		// Debt Derivative Page
		public final static String AddDerivativePage_ActivitySubtype="//*[contains(text(),'"+"Activity Subtype"+"')]/parent::div//"+"following-sibling::div//select";
		public final static String AddDerivativePage_Issuer="//*[contains(text(),'"+"Client Name"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String AddDerivativePage_PrimarySector="//select[@name='actTranPrimarySector']";
		public final static String AddDerivativePage_SecondarySector="//select[@name='actTranSecondarySector']";
		public final static String AddDerivativePage_LeadAdvisor="//*[contains(text(),'"+"Swap (or Lead) Advisor"+"')]/parent::div//div[@role='combobox']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//button[@role='presentational']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//span[@class='rw-select']";
		public final static String AddDerivativePage_IssueName="//input[@name='actTranIssueName']";
		public final static String AddDerivativePage_ProjectDescription="//input[@name='actTranProjectDescription']";
		//		public final static String AddDerivativePage_Issuer="//*[contains(text(),'"+"Issuer/Client Name"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
//		public final static String AddDerivativePage_LeadAdvisor="//*[contains(text(),'"+"Swap (or Lead) Advisor"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
//		public final static String AddDerivativePage_IssueName="//*[contains(text(),'"+"Issue Name(if available)"+"')]/parent::div//"+"following-sibling::input";
		
		
		// Debt Trade(Swap) Page
		public final static String TradeSwapPage_ClientPayLeg_Currency="(//select[@name='currency'])[1]";
		public final static String TradeSwapPage_ClientPayLeg_PaymentType="(//select[@name='paymentType'])[1]";
		public final static String TradeSwapPage_ClientPayLeg_UpfrontPayment="(//input[@name='upfrontPayment'])[1]";
		public final static String TradeSwapPage_ClientPayLeg_TradeDate="(//input[@name='tradeDate'])[1]";
		public final static String TradeSwapPage_ClientPayLeg_EffectiveDate="(//input[@name='effDate'])[1]";
		public final static String TradeSwapPage_ClientPayLeg_FixedRate="(//input[@name='fixedRate'])[1]";
		
		public final static String TradeSwapPage_DealerPayLeg_Payor="//*[contains(text(),'"+"Payor"+"')]/parent::div//div[@role='combobox']";
		public final static String TradeSwapPage_DealerPayLeg_Currency="(//select[@name='currency'])[2]";
		public final static String TradeSwapPage_DealerPayLeg_PaymentType="(//select[@name='paymentType'])[2]";
		public final static String TradeSwapPage_DealerPayLeg_UpfrontPayment="(//input[@name='upfrontPayment'])[2]";
		public final static String TradeSwapPage_DealerPayLeg_TradeDate="(//input[@name='tradeDate'])[2]";
		public final static String TradeSwapPage_DealerPayLeg_EffectiveDate="(//input[@name='effDate'])[2]";
		public final static String TradeSwapPage_DealerPayLeg_FixedRate="(//input[@name='fixedRate'])[2]";
		
		
		// Debt MA RFP Page
		//public final static String AddMARFPPage_Issuer="//*[contains(text(),'"+"Issuer/Client Name"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
		//public final static String AddMARFPPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
		//public final static String AddMARFPPage_IssueName="//*[contains(text(),'"+"Activity (or RFP) Name"+"')]/parent::div//"+"following-sibling::input";
		public final static String AddMARFPPage_Issuer="//*[contains(text(),'"+"Client Name"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String AddMARFPPage_PrimarySector="//select[@name='actPrimarySector']";
		public final static String AddMARFPPage_SecondarySector="//select[@name='actSecondarySector']";
		public final static String AddMARFPPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//div[@role='combobox']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//button[@role='presentational']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//span[@class='rw-select']";
		public final static String AddMARFPPage_IssueName="//input[@name='actIssueName']";
		public final static String AddMARFPPage_ProjectDescription="//input[@name='actProjectName']";
		
		public final static String AddMARFPPage_RelatedTransactionType="//select[@name='actRelatedType']";
		public final static String AddMARFPPage_RelatedTransactionIds="//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"following-sibling::div//span[@class='rw-select']";
		public final static String AddMARFPPage_Notes="//textarea[@name='actNotes']";
		
		// Debt Manage RFP for Client Page
		public final static String AddManageClientRFPPage_ActivitySubtype="//*[contains(text(),'"+"Activity Subtype"+"')]/parent::div//"+"following-sibling::div//select";
		
		//public final static String AddDerivativePage_ActivitySubtype="//*[contains(text(),'"+"Activity Subtype"+"')]/parent::div//"+"following-sibling::div//select";
		public final static String AddManageClientRFPPage_Issuer="//*[contains(text(),'"+"Client Name"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String AddManageClientRFPPage_PrimarySector="//select[@name='actTranPrimarySector']";
		public final static String AddManageClientRFPPage_SecondarySector="//select[@name='actTranSecondarySector']";
		public final static String AddManageClientRFPPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//div[@role='combobox']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//button[@role='presentational']";//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//span[@class='rw-select']";
		public final static String AddManageClientRFPPage_IssueName="//input[@name='actTranIssueName']";
		public final static String AddManageClientRFPPage_ProjectDescription="//input[@name='actTranProjectDescription']";
		//public final static String AddManageClientRFPPage_Issuer="//*[contains(text(),'"+"Issuer/Client Name"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
		//public final static String AddManageClientRFPPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
		//public final static String AddManageClientRFPPage_IssueName="//*[contains(text(),'"+"Issue Name(if available)"+"')]/parent::div//"+"following-sibling::input";
		
		
		// Debt Business Development Page
		public final static String AddBusinessDevelopmentPage_ActivitySubtype="//select[@name='actSubType']";//"//*[contains(text(),'"+"Activity Subtype"+"')]/parent::div//"+"following-sibling::div//select";
		public final static String AddBusinessDevelopmentPage_Issuer="//*[contains(text(),'"+"Client Name"+"')]/parent::div//"+"div[@role='combobox']";//"//*[contains(text(),'"+"Issuer/Client Name"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
		public final static String AddBusinessDevelopmentPage_LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//div[@role='combobox']";;//"//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";
		public final static String AddBusinessDevelopmentPage_IssueName="//input[@name='actIssueName']";
		public final static String AddBusinessDevelopmentPage_ProjectDescription="//input[@name='actProjectName']";
		public final static String AddBusinessDevelopmentPage_PrimarySector="//select[@name='actPrimarySector']";
		public final static String AddBusinessDevelopmentPage_SecondarySector="//select[@name='actSecondarySector']";
		//		public final static String AddBusinessDevelopmentPage_IssueName="//*[contains(text(),'"+"Issue Name (if available)"+"')]/parent::div//"+"following-sibling::input";
		public final static String AddBusinessDevelopmentPage_RelatedTransactionType="//select[@name='actRelatedType']";
		public final static String AddBusinessDevelopmentPage_RelatedTransactionIds="//*[contains(text(),'"+"Related transactions"+"')]/parent::div//"+"following-sibling::div//span[@class='rw-select']";
		public final static String AddBusinessDevelopmentPage_Notes="//*[contains(text(),'"+"Notes / Instructions"+"')]/parent::div//"+"following-sibling::div//textarea";
		//public final static String AddBusinessDevelopmentPage_BusinessAddressLbl="Business Development";
		




		
		// Contact Page
		public final static String ContactPage_AssociatedEntity="//*[contains(text(),'"+"Associated Entity / Firm"+"')]/parent::div//div[@role='combobox']";
		public final static String ContactPage_ContactName="//*[contains(text(),'"+"contact already exists in your database"+"')]/parent::div//div[@role='combobox']";
		//public final static String ContactPage_FirstName="//*[contains(text(),'First Name')]/parent::div//"+"input";
		public final static String ContactPage_FirstName="//input[@name='userFirstName']";
		public final static String ContactPage_MiddleName="//input[@name='userMiddleName']";
		public final static String ContactPage_LastName="//input[@name='userLastName']";
		public final static String ContactPage_Email="//input[@name='userEmailId']";
		public final static String ContactPage_Phone="//input[@name='phoneNumber']";
		public final static String ContactPage_Fax="//input[@name='faxNumber']";
		public final static String ContactPage_EmployeeID="//input[@name='userEmployeeID']";
		public final static String ContactPage_JobTitle="//input[@name='userJobTitle']";
		public final static String ContactPage_ManagersEmail="//input[@name='userManagerEmail']";
		public final static String ContactPage_Department="//input[@name='userDepartment']";
		public final static String ContactPage_EmployeeType="//input[@name='userEmployeeType']";
		public final static String ContactPage_CostCenter="//input[@name='userCostCenter']";
		public final static String ContactPage_AddressLbl="Address";
		
		
		// Admin Features Selection Home Page
		public final static String AdminMainPage_Firm="//*[contains(text(),'"+"Firm"+"')]";
		public final static String AdminUsersListPage_AddNewContact="//button[contains(text(),'"+"Add new contact"+"')]";//"//a[@href='/admin-users']";
		public final static String AdminUsersListPage_SearchUsers="//input[@placeholder='search users']";


		public final static String AdminClientProspectMasterListPage_AddClient="//*[contains(text(),'"+"Add Client"+"')]";
		public final static String AdminAddClientProspectPage_TaxID="//input[@name='taxId']";
		public final static String AdminThirdPartyMasterListPage_AddThirdParty="//*[contains(text(),'"+"Add 3rd Party"+"')]";
		public final static String AdminAddThirdPartyPage_TaxID="//input[@name='taxId']";
		public final static String AddThirdPartyPage_BusinessAddressLbl="Business Address";
		public final static String AddThirdPartyPage_EntityNameLbl="Entity Name";
		public final static String AddThirdPartyPage_EntityTypeLbl="Entity Type";
		public final static String AddThirdPartyPage_MarketRoleLbl="Market Role / Participant Type";
		public final static String AddThirdPartyPage_MarketRole="//div[@name='marketRole']/div/span/button";
		public final static String AddThirdPartyPage_Add3rdParty="//*[contains(text(),'"+"Add 3rd Party"+"')]";
		
		
		public final static String AdminAddUsersPage_FirstName="//input[@name='userFirstName']";
		public final static String AdminAddUsersPage_MiddleName="//input[@name='userMiddleName']";
		public final static String AdminAddUsersPage_LastName="//input[@name='userLastName']";
		public final static String AdminAddUsersPage_Email="//input[@name='userEmailId']";
		public final static String AdminAddUsersPage_SystemAccessLevel="//select[@name='userEntitlement']";
		public final static String AdminAddUsersPage_Phone="//input[@name='phoneNumber']";
		public final static String AdminAddUsersPage_Fax="//input[@name='faxNumber']";
		public final static String AdminAddUsersPage_EmployeeID="//input[@name='userEmployeeID']";
		public final static String AdminAddUsersPage_JobTitle="//input[@name='userJobTitle']";
		public final static String AdminAddUsersPage_ManagersEmail="//input[@name='userManagerEmail']";
		public final static String AdminAddUsersPage_JoiningDate="//input[@name='userJoiningDate']";
		public final static String AdminAddUsersPage_ExitDate="//input[@name='userExitDate']";
		public final static String AdminAddUsersPage_CostCenter="//input[@name='userCostCenter']";

		public final static String AdminAddUsersPage_State="//*[contains(text(),'"+"State"+"')]/parent::div//div[@role='combobox']";
		public final static String AdminAddUsersPage_AddressName="//input[@name='addressName']";
		public final static String AdminAddUsersPage_AddressLine1="//input[@name='addressLine1']";
		public final static String AdminAddUsersPage_Country="//*[contains(text(),'"+"Country"+"')]/parent::div//div[@role='combobox']";
		public final static String AdminAddUsersPage_City="//*[contains(text(),'"+"City"+"')]/parent::div//div[@role='combobox']";
		public final static String AdminAddUsersPage_Zipcode11="//input[@name='zip1']";
		public final static String AdminAddUsersPage_Zipcode12="//input[@name='zip2']";
		public final static String AdminAddUsersPage_Users="//a[@href='/admin-users']";
		public final static String AdminAddUsersPage_DocumentsLbl="Documents";
		//public final static String AdminAddUsersPage_FirstName="//input[@name='userFirstName']";
		


		public final static String AddClientPage_EntityTypeLbl="Entity Type";
		public final static String AddClientPage_EntityNameLbl="Entity Name";
		public final static String AddClientPage_BusinessAddressLbl="Business Address";
		public final static String AddClientPage_BusinessContactInformationLbl="Business Contact Information";
		public final static String AddClientPage_OtherDetailsLbl="Other Details";
		public final static String AddClientPage_EntityType="//select[@name='entityType']";//"//*[contains(text(),'"+"Entity Type"+"')]/parent::div//div[@role='combobox']";
		public final static String AddClientPage_PrimarySector="//select[@name='primarySectors']";//"//*[contains(text(),'"+"Primary Sectors"+"')]/parent::div//div[@role='combobox']";
		public final static String AddClientPage_SecondarySector="//select[@name='secondarySectors']";//"//*[contains(text(),'"+"Secondary Sectors"+"')]/parent::div//div[@role='combobox']";
		public final static String AddClientPage_TaxID="//input[@name='taxId']";
		public final static String AddClientPage_PreviousAdvisorContactInformationLbl="Previous Advisor Contact Information";
		public final static String AddClientPage_FirmsLeadAdvisor="//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div";
		public final static String AddClientPage_PreviousLeadAdvisor="//input[@name='prevLeadAdvisor']";
		public final static String AddClientPage_PreviousAdvisorFirm="//input[@name='prevAdvisorFirm']";
		public final static String AddClientPage_PreviousAdvisoryContractExpiry="//input[@name='prevAdvisorContractExpire']";
		public final static String AddClientPage_PrimaryContactNameinEmma="//input[@name='primaryContactNameInEmma']";
		public final static String AddClientPage_PrimaryContactPhone="//input[@name='primaryContactPhone']";
		public final static String AddClientPage_PrimaryContactEmail="//input[@name='primaryContactEmail']";
		public final static String AddClientPage_DebtTypeLbl="Primary Contact Email";
		public final static String AddClientPage_LinkCUSIPTblLbl="LINK CUSIP";
		public final static String AddClientPage_RelationshipLbl="Relationship";
		public final static String AddClientPage_LinkBorrowersObligorsTblLbl="Link Borrowers / Obligors";
		//public final static String AddClientPage_LinkCUSIP="(//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table//tr["+i+"]/td[1]//div[@role='combobox'])[1])";		
		
		
		// Entity Features Selection Home Page
		public final static String EntitySelectionPage_Client="//a[@href='/addnew-client']"   ;//"//p[@class='title mgmtConTitle']";//"//a[@href='/addnew-client']";
		public final static String EntitySelectionPage_Prospect=  "//a[@href='/addnew-prospect']" ; //"(//p[@class='title mgmtConTitle'])[2]";
		public final static String EntitySelectionPage_ThirdParty="//a[@href='/addnew-thirdparty']"  ;//"(//p[@class='title mgmtConTitle'])[3]";
		public final static String EntitySelectionPage_PreviousLeadAdvisor="//*[contains(text(),'"+"Previous Lead Advisor"+"')]/parent::div//"+"following-sibling::div//input";		
		public final static String EntitySelectionPage_CityIssuer="//input[@value=' City Issuer']";	
		
		
		// Business Address Page
		public final static String BusinessAddressPage_AddressName="//input[@name='addressName']";
		public final static String BusinessAddressPage_IsPrimary="//input[@name='isPrimary']";
		public final static String BusinessAddressPage_Website="//input[@name='website']";
		public final static String BusinessAddressPage_OfficePhone="//input[@name='phoneNumber']";
		public final static String BusinessAddressPage_OfficeFax="//input[@name='faxNumber']";
		public final static String BusinessAddressPage_Email="//input[@name='emailId']";
		public final static String BusinessAddressPage_AddressLine1="//input[@name='addressLine1']";
		public final static String BusinessAddressPage_Country="//*[contains(text(),'"+"Country"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";	
		public final static String BusinessAddressPage_State="//input[@name='countryState']";//"//*[contains(text(),'"+"State"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";	
		public final static String BusinessAddressPage_City="//*[contains(text(),'"+"City"+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']";	
		public final static String BusinessAddressPage_Zipcode="//input[@name='zip1']";	
		
	//sandeep
		// Entity Clients and Prospects Masters Page
		public final static String EntityMasterPage_TypeHeader="//*[contains(text(),'"+"Type"+"')]";
        public final static String Issuertype="(//button[@role='presentational'])[1]";
		public final static String Issuertype1="//input[@ placeholder=' Select issuer types']";
		public final static String Save_add_alias_issuername="(//button[@ class='button is-link is-small'])[1]";
		public final static String AliasName="//input[@placeholder='alias']";
		public final static String DelAlias="(//i[@class='far fa-trash-alt'])[1]";
		public final static String ConfirmDel="(//button[@type='button'])[4]";
		public final static String Addbutton_linkcusip="(//button[@class='button is-link is-small'])[3]";
		public final static String linkdebt_type="//select[@name='debtType']";
		public final static String Linkdebt_description="//input[@name='debtDescription']";
		public final static String Cusip_data="//input[@name='associatedCusip6']";
		public final static String save_cusip="(//button[@class='button is-link'])[3]";
		public final static String Addbutton_linkObligors="(//button[@class='button is-link is-small'])[4]";
		public final static String Relationship_Dropdown="//select[@name='borOblRel']";
		public final static String link0bligors_firmname="(//div[@class='rw-input rw-dropdown-list-input'])[2]";
		public final static String link0bligors_Debttype="//select[@ name='borOblDebtType']";
		public final static String linkObligors_AssociatedCusip="//input[@name='borOblCusip6']";
		public final static String linkObligors_Startdate="//input[@name='borOblStartDate']";
		public final static String linkObligors_Enddate="//input[@name='borOblEndDate']";
		public final static String linkObligors_savebutton="//button[@class='button is-link' and contains(text(),'Save Borrowers')]";
		public final static String Admin_addclient="//button[@class='button is-link is-small']";//"//button[@class='button is-link']";
		public final static String Admin_addthirdparty="//button[@class='button is-link is-small']";//"//button[@class='button is-link']";
		public final static String Add_otherEmailButton="(//button[@class='button is-link is-small'])[1]";
		public final static String Add_phoneButton="(//button[@class='button is-link is-small'])[2]";
		public final static String Add_faxButton="(//button[@class='button is-link is-small'])[3]";
		public final static String Second_phnoNumber="(//input[@name='phoneNumber'])[2]";
		public final static String Contact_otherEmail="(//input[@type='email'])[2]";
		public final static String Contact_secondOtherEmail="(//input[@type='email'])[3]";
		public final static String Contact_secondFax="(//input[@name='faxNumber'])[2]";
		public final static String Contact_employeeId="//input[@placeholder='Emplyee Id']";
		public final static String Contact_JobTitle="//input[@placeholder='Job Title']";
		public final static String Contact_managerEmail="//input[@name='userManagerEmail']";
		public final static String Contact_joindate="//input[@name='userJoiningDate']";
		public final static String Contact_exitDate="//input[@name='userExitDate']";
		public final static String Contact_type="//input[@placeholder=' Select contact types']";
		public final static String Contact_secondtype="(//input[@size='2'])[1]";
		public final static String Contact_firmname="(//input[@role='combobox'])[2]";
		public final static String OfficeAdress="(//button[@class='button is-link is-small'])[5]";
		public final static String Contact_AddressSave="(//button[@class='button is-link'])[3]";
		public final static String linkObligor_firmName="(//button[@role='presentational' and @title='open dropdown'])[2]";
		public final static String linkObligor_sendFirmName="(//input[@class='rw-input-reset'])[2]";
		public final static String SuccessMessage_Greencolor="//div[@class='Toastify__toast Toastify__toast--success']";
		public final static String loader_image="//img[@alt='loader' and @width='100']";












//sandeep





		// Entity Third Party Page
		public final static String EntityThirdPartyAddPage_TypeHeader="//*[contains(text(),'"+"Entity Name"+"')]";
                                public final static String Thirdparty_marketRole="//input[@placeholder=' Select market role']";
		public final static String Thirdparty_entityName="//div[@ class='rw-input rw-dropdown-list-input']";
		public final static String Thirdparty_secondmarketRole="(//input[@size='2'])[1]";
		public final static String Thirdparty_address_save="(//button[@class='button is-link'])[2]";


		//sandeep
                              // Lead Advisor 

		public final static String Advisor_PrimaryContactInformation="//*[@id=\"main\"]/section/article[2]/div[1]/p";
		public final static String LeadAdvisor="//*[contains(text(),'"+"Lead Advisor"+"')]/parent::div//"+"div//button[@type='button']";//"//input[@placeholder=' Select lead advisor']";
		public final static String SaveleadAdvisor="(//button[@class='button is-link'])[2]";
		



		
		// New Task Page
		public final static String TaskPage_TaskName="//input[@name='taskDescription']";
		public final static String TaskPage_TaskType="//select[@name='taskType']";//"//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']";	
		public final static String TaskPage_TaskPriority="//select[@name='taskPriority']";//"//*[contains(text(),'"+"Task Priority"+"')]/parent::div//"+"div[@role='combobox']";	
		public final static String TaskPage_StartDate="//input[@name='taskStartDate']";	
		public final static String TaskPage_DueDate="//input[@name='taskEndDate']";	
		public final static String TaskPage_AssignedTo="(//div/span/button)[3]";///"//*[contains(text(),'"+"Assigned To"+"')]/parent::div//"+"following-sibling::div//span[@class='rw-sr']";//"//*[contains(text(),'"+"Assigned To"+"')]/parent::div//"+"span[@class='rw-sr']";	
		public final static String TaskPage_AssignedToValue="//*[contains(text(),'"+"Assigned To"+"')]/parent::div//"+"ul/li[2]";
		public final static String TaskPage_Notes="//textarea[@name='taskNotes']";
		public final static String TaskPage_AddFile="//i[@class='fas fa-plus link-pointer']";
		
		
		
		// ########## Tools
		public final static String ToolsDashboardPage_AddNewExpenseDetails="//*[contains(text(),'"+"Add New Expense Details"+"')]";
		public final static String ToolsExpenseDetailPage_SelectIssuer="//*[contains(text(),'"+"Select Issuer"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsExpenseDetailPage_TransactionIssueName="//*[contains(text(),'"+"Transaction / Issue Name"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsExpenseDetailPage_SelectFirmUser="//*[contains(text(),'"+"Select Firm User"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsExpenseDetailPage_ExpenseType="//select[@name='expenseType']";	
		public final static String ToolsExpenseDetailPage_TotalAmount="//input[@name='expenseAmount']";
		public final static String ToolsExpenseDetailPage_Date="//input[@name='expenseDate']";
		public final static String ToolsExpenseDetailPage_MeetingType="//select[@name='expenseContextType']";
		public final static String ToolsExpenseDetailPage_Detail="//select[@name='expenseDetail']";
		public final static String ToolsExpenseDetailPage_ExpenseAddIcon="//a/i[@class='far fa-plus-square']";
		public final static String ToolsExpenseDetailPage_SaveDetails="//*[contains(text(),'"+"Save Details"+"')]";
		public final static String ToolsExpenseDetailPage_TimeTrackerTab="//*[contains(text(),'"+"Time Tracker"+"')]";
		
		public final static String ToolsTimeTrackerPage_SelectIssuer="//*[contains(text(),'"+"Select Issuer"+"')]/parent::div//"+"div[@role='combobox']";
		//public final static String ToolsTimeTrackerPage_SelectIssuer="//*[contains(text(),'"+"Issuer"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsTimeTrackerPage_TransactionIssueName="//*[contains(text(),'"+"Transaction / Issue Name"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsTimeTrackerPage_SelectFirmUser="//*[contains(text(),'"+"Select Firm User"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsTimeTrackerPage_ExpenseAddIcon="//a/i[@class='far fa-plus-square']";
		public final static String ToolsTimeTrackerPage_RoleType="//select[@name='roleType']";
		public final static String ToolsTimeTrackerPage_SaveDetails="//*[contains(text(),'"+"Save Details"+"')]";
		public final static String ToolsContractPage_Issuer="//*[contains(text(),'"+"Issuer"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsContractPage_TransactionIssueName="//*[contains(text(),'"+"Transaction / Issue Name"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsContractPage_ContractTab="//*[contains(text(),'"+"Contract"+"')]";
		public final static String ToolsContractPage_AddNewContract="//a[contains(text(),'"+"Add new contract"+"')]";
		
		public final static String ToolsDocumentsPage_Category="//*[contains(text(),'"+"Category"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsDocumentsPage_SubCategory="//*[contains(text(),'"+"Sub Category"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsDocumentsPage_Type="//*[contains(text(),'"+"Type"+"')]/parent::div//"+"div[@role='combobox']";
		public final static String ToolsDocumentsPage_SearchFirmName="//input[@placeholder='search firm name (multi-select)']";//"//input[@placeholder='search firm name (multi-select)']/parent::div"+"//following-sibling::span//button";
		//public final static String ToolsDocumentsPage_SearchFirmName="//input[@placeholder='search contacts (multi-select)']";
		
		public final static String TaskPage_SearchFirmNameValue="//input[@placeholder='search firm name (multi-select)']/parent::div"+"//following-sibling::div//ul/li[2]";//"//input[@placeholder='search firm name (multi-select)']/parent::div"+"//following-sibling::span//button";//"//*[contains(text(),'"+"Link the document to a firm(s)?"+"')]/parent::div"+"following-sibling::div//"+"ul/li[2]";
		///"//*[contains(text(),'"+"Assigned To"+"')]/parent::div//"+"following-sibling::div//span[@class='rw-sr']";//"//*[contains(text(),'"+"Assigned To"+"')]/parent::div//"+"span[@class='rw-sr']";	
		public final static String ToolsDocumentsPage_SearchContacts="//input[@placeholder='search contacts (multi-select)']";
		public final static String ToolsDocumentsPage_SearchTransaction="//input[@placeholder='search transaction name (multi-select)']";
		
		
		public final static String ComplianceActionCenterTasksPage_IDLbl="//*[contains(text(),'"+"ID"+"')]";
		public final static String ComplianceAddEditControlPage_Type="//select[@name='type']";
		public final static String ComplianceControlsPage_IDLbl="//*[contains(text(),'"+"ID"+"')]";
		public final static String ComplianceControlsPage_ControlsLbl="//*[contains(text(),'"+"Controls"+"')]";
		public final static String ComplianceControlsPage_AddnewControl="//*[contains(text(),'"+"Add new control"+"')]";
		public final static String ComplianceMonitorPage_ControlNameLbl="//*[contains(text(),'"+"Control Name"+"')]";
		
		public final static String ComplianceAddEditControlPage_Target="//*[contains(text(),'"+"Target or Recipients?"+"')]/parent::div//"+"select";
		public final static String ComplianceAddEditControlPage_Notifications="//select[@name='recurringType']";
		public final static String ComplianceAddEditControlPage_Name="//input[@name='name']";
		public final static String ComplianceAddEditControlPage_NotificationStartDate="//input[@name='startDate']";
		public final static String ComplianceAddEditControlPage_NotificationEndDate="//input[@name='endDate']";
	//---------------------------------------------------------------------------------------------------------------------
	
//	//Login
//		public final static String LoginPage_UserName="//input[@name='email']";
//		public final static String LoginPage_Password="//input[@name='password']";
//		public final static String LoginPage_SignIn="//*[contains(text(),'Sign In')]";
//		
//		// Dashboard
//		public final static String HomePage_SignOutIcon="//i[@class='fas fa-cog']";
//		
//		
//		// Menu
//		public final static String MenuPage_UserDashboard="//a[contains(text(),'User Dashboard')]";
//		public final static String MenuPage_Projects="//a[contains(text(),'Projects')]";
//		//public final static String MenuPage_New="//a[contains(text(),'New')]";
//		public final static String MenuPage_New="div.navbar-item:nth-child(2) > a:nth-child(1)";
//		public final static String MenuPage_NewEntity="//a[@href='/addnew-entity']";
//		public final static String MenuPage_NewActivity="//a[@href='/addnew-activity']";
		//public final static String MenuPage_NewEntity="//a[contains(text(),'Entity')]";
	
	// New-Entity Selection Page
//	public final static String CreateEntitySelectionPage_Client="//p[contains(text(),'Client')]";
//	
//	//Client Firm page
//	public final static String ClientFirmPage_ClientFirm="//input[@name='issuerFlags']";
//	public final static String ClientFirmPage_FirmName="//div[@id='rw_1_input']";
//	public final static String ClientContactsPage_FirstName="//input[@name='userFirstName']";
//	public final static String ClientContactsPage_ClientContactsTab=".inactive-tab > a:nth-child(1)";
//	
//	//Transaction Dashboard page
//	public final static String TransactionsDashboardPage_NewTransaction="//a[@href='/createTrans']";
//	public final static String TransactionsDashboardPage_ParticipantsTab="//a[contains(text(),'Participants')]";
//	
//	// New Transaction Page
//	public final static String NewTransactionPage_Issuer="//div[@id='rw_1_input']"; //"(//div[starts-with(@id,'rw_.*_input')])[1]";
//	public final static String NewTransactionPage_TransactionNameLabel="//input[@name='rfpTranName']";
//	public final static String NewTransactionPage_TransactionType="//select[@name='rfpTranType']";
//	public final static String NewTransactionPage_OtherTransactionType="//input[@name='rfpTranOtherTransactionType']";
//	//public final static String NewTransactionPage_TransactionNameLabel="//p[@class='multiExpLb1']";
//	
//	public final static String NewTransactionPage_PurposeofRFP="//select[@name='rfpTranPurposeOfRequest']";
//	public final static String NewTransactionPage_AssignedTo="div.columns:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1)";
//	public final static String NewTransactionPage_State="//select[@name='rfpTranState']";
//	public final static String NewTransactionPage_County="//select[@name='rfpTranCounty']";
//	public final static String NewTransactionPage_PrimarySector="//select[@name='rfpTranPrimarySector']";
//	public final static String NewTransactionPage_SecondarySector="//select[@name='rfpTranSecondarySector']";
//	public final static String NewTransactionPage_DateHired="//input[@name='rfpTranDateHired']";
//	public final static String NewTransactionPage_StartDate="//input[@name='rfpTranStartDate']";
//	public final static String NewTransactionPage_ExpectedEndDate="//input[@name='rfpTranExpectedEndDate']";
//	public final static String NewTransactionPage_RelatedTransactionAction="//select[@name='rfpTranRelatedType']";
//	public final static String NewTransactionPage_RelatedTransactionNames="";
//	public final static String NewTransactionPage_Notes="//textarea[@name='rfpTransNotes']";
//	public final static String NewTransactionPage_Save=".is-link";//"//button[contains(@text(),'Save')]";
//	public final static String NewTransactionPage_Cancel="//button[contains(@text(),'Cancel')]";
//	
//	
//	//  Transaction Participants Page
//		public final static String ParticipantsPage_Add="//button[contains(text(),'Add')]";
//
//
//	// Existing Transaction Page
//		public final static String DetailsPage_Issuer="//div[@id='rw_1_input']";
//		public final static String DetailsPage_State="//select[@name='dealIssueTranState']";

	
}
