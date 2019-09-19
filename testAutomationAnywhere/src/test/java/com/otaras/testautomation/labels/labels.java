package com.otaras.testautomation.labels;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class labels {
	
	

//	//---------------------------------------------------------------------------------------------------------------------
//	
//	//BankLoanAdd and DebtBondAdd Page
//		public final static String AddDebtPage_ActivitySubtypeLbl="Activity Subtypeanil";
//		public final static String AddDebtPage_IssuerLbl="Issuer/Client Name";
//		public final static String AddDebtPage_LeadAdvisorLbl="Lead Advisor";
//		public final static String AddDebtPage_PrimarySectorLbl="Primary Sector";
//		public final static String AddDebtPage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddDebtPage_IssueNameLbl="Issue Name(if available)";
//		public final static String AddDebtPage_ProjectDescriptionLbl="Project Description";
//		
//	//Contact Page
//		public final static String ContactPage_AssociatedEntityLbl="Associated Entity / Firm ";	
//		public final static String ContactPage_FirstNameLbl="First Name";	
//		public final static String ContactPage_MiddleNameLbl="Middle Name";	
//		public final static String ContactPage_LastNameLbl="Last Name";	
//		public final static String ContactPage_EmailLbl="Email";	
//		public final static String ContactPage_PhoneLbl="Phone";	
//		public final static String ContactPage_FaxLbl="Fax";	
//		
//		public final static String ContactPage_EmployeeIDLbl="Employee ID";
//		public final static String ContactPage_JobTitleLbl="Job Title";
//		public final static String ContactPage_ManagersEmailLbl="Managers Email";
//		public final static String ContactPage_DepartmentLbl="Department";
//		public final static String ContactPage_EmployeeTypeLbl="Employee Type";
//		public final static String ContactPage_CostCenterLbl="Cost Center";
//		
//	//Bond Detail Page
//		public final static String DebtDetailPage_TransactionTypeLbl="Transaction Type";	
//		public final static String DebtDetailPage_StateLbl="State";
//		public final static String DebtDetailPage_CountryLbl="County";
//		public final static String DebtDetailPage_PrimarySectorLbl="Primary Sector";
//		public final static String DebtDetailPage_SecondarySectorLbl="Secondary Sector";
//		public final static String DebtDetailPage_OfferingTypeLbl="Offering Type";
//		public final static String DebtDetailPage_SecurityTypeLbl="Security Type";
//		public final static String DebtDetailPage_BankQualifiedLbl="Bank Qualified";
//		public final static String DebtDetailPage_CorpTypeLbl="Corp Type";
//		public final static String DebtDetailPage_ParAmountLbl="Par Amount";
//		public final static String DebtDetailPage_PricingDateLbl="Pricing Date";
//		public final static String DebtDetailPage_ExpectedAwardDateLbl="Expected Award Date";
//		public final static String DebtDetailPage_ActualAwardDateLbl="Actual Award Date";
//		public final static String DebtDetailPage_SDLCCreditPercentageLbl="SDLC Credit %";
//		public final static String DebtDetailPage_EstimatedRevenueLbl="Estimated Revenue";
//		public final static String DebtDetailPage_UseofProceedsLbl="Use of Proceeds";
//		public final static String DebtDetailPage_PlaceholderLbl="Placeholder";
//	
//		
//	//Bond Detail Page
//		public final static String DebtBondParticipantsPage_UnderwritingTblNameLbl="Underwriting Team";	
//		
//		
//	//Bond Pricing Page
//		public final static String DebtPricingPage_AddSeriesTblNameLbl="Add Series";			
//		public final static String DebtPricingPage_PCPrincipalLbl="Principal*";	
//		public final static String DebtPricingPage_PCSecurityTypeLbl="Security Type*";	
//		
//	//Bond Documents Page
//		public final static String DebtDocumentsPage_CategoryLbl="Category";
//		public final static String DebtDocumentsPage_SubCategoryLbl="Sub-category";
//		public final static String DebtDocumentsPage_TypeLbl="Type";
//		public final static String DebtDocumentsPage_UploadDealsDocumentsTblNameLbl="Upload Transaction Documents";
//		public final static String DebtDocumentsPage_UploadBankDocumentsTblNameLbl="Upload Bank Loan Documents";
//		
//	//Business Development Page
//		public final static String AddBusinessDevelopmentPage_ActivitySubtypeLbl="Activity Subtype";
//		public final static String AddBusinessDevelopmentPage_OtherActivitySubtypeLbl="Other Activity Subtype";
//		public final static String AddBusinessDevelopmentPage_IssuerLbl="Issuer/Client Name";
//		public final static String AddBusinessDevelopmentPage_PrimarySectorLbl="Primary Sector";
//		public final static String AddBusinessDevelopmentPage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddBusinessDevelopmentPage_LeadAdvisorLbl="Lead Advisor";
//		public final static String AddBusinessDevelopmentPage_IssueNameLbl="Issue Name (if available)";
//		public final static String AddBusinessDevelopmentPage_ProjectDescriptionLbl="Project Description";
//		public final static String AddBusinessDevelopmentPage_NotesLbl="Notes / Instructions";
//		
//		
//	//Derivative Page
//		public final static String AddDerivativePage_ActivitySubtypeLbl="Activity Subtype";
//		public final static String AddDerivativePage_OtherActivitySubtypeLbl="Other Activity Subtype";
//		public final static String AddDerivativePage_IssuerLbl="Issuer/Client Name";
//		public final static String AddDerivativePage_PrimarySectorLbl="Primary Sector";
//		public final static String AddDerivativePage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddDerivativePage_LeadAdvisorLbl="Swap (or Lead) Advisor";
//		public final static String AddDerivativePage_IssueNameLbl="Issue Name(if available)";
//		public final static String AddDerivativePage_ProjectDescriptionLbl="Project Description / Transaction Name";
//		
//		
//	//Manage RFP for Client Page
//		public final static String AddManageClientRFPPage_ActivitySubtypeLbl="Activity Subtype";
//		public final static String AddManageClientRFPPage_IssuerLbl="Issuer/Client Name";
//		public final static String AddManageClientRFPPage_PrimarySectorLbl="Primary Sector";
//		public final static String AddManageClientRFPPage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddManageClientRFPPage_LeadAdvisorLbl="Lead Advisor";
//		public final static String AddManageClientRFPPage_IssueNameLbl="Issue Name(if available)";
//		public final static String AddManageClientRFPPage_ProjectDescriptionLbl="Project Description";
//		
//		
//	//Manage RFP for Client Page
//		public final static String AddMARFPPage_IssuerLbl="Issuer/Client Name";
//		public final static String AddMARFPPage_PrimarySectorLbl="Primary Sector";
//		public final static String AddMARFPPage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddMARFPPage_LeadAdvisorLbl="Lead Advisor";
//		public final static String AddMARFPPage_IssueNameLbl="Activity (or RFP) Name";
//		public final static String AddMARFPPage_ProjectDescriptionLbl="Project Description";
//		
//		
//	//Debt Other Activity Page
//		public final static String AddOtherActivityPage_ActivitySubtypeLbl="Activity Subtype";
//		public final static String AddOtherActivityPage_IssuerLbl="Issuer/Client Name";
//		public final static String AddOtherActivityPage_LeadAdvisorLbl="Lead Advisor";
//		public final static String AddOtherActivityPage_PrimarySectorLbl="Primary Sector";
//		public final static String AddOtherActivityPage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddOtherActivityPage_IssueNameLbl="Issue Name(if available)";
//		public final static String AddOtherActivityPage_ProjectDescriptionLbl="Project Description";
//		
//		
//	//Entity - Client and Prospect
//		public final static String AddClientPage_EntityTypeLbl="Entity Type";
//		public final static String AddClientPage_EntityNameLbl="Entity Name";
//		public final static String AddClientPage_PrimarySectorLbl="Primary Sector";
//		public final static String AddClientPage_SecondarySectorLbl="Secondary Sector";
//		public final static String AddClientPage_TaxIDLbl="Tax ID";
//		public final static String AddClientPage_PreviousAdvisorContactInformationTblLbl="Previous Advisor Contact Information";
//		public final static String AddClientPage_FirmsLeadAdvisorLbl="Firm's Lead Advisor";
//		public final static String AddClientPage_PreviousLeadAdvisorLbl="Previous Lead Advisor";
//		public final static String AddClientPage_PreviousAdvisorFirmLbl="Previous Advisor Firm";
//		public final static String AddClientPage_PreviousAdvisoryContractExpiryLbl="Previous Advisory Contract Expiry";
//		public final static String AddClientPage_PrimaryContactNameinEmmaLbl="Primary Contact Name in EMMA";
//		public final static String AddClientPage_PrimaryContactPhoneLbl="Primary Contact Phone";
//		public final static String AddClientPage_PrimaryContactEmailLbl="Primary Contact Email";
//		public final static String AddClientPage_DebtTypeLbl="Primary Contact Email";
//		public final static String AddClientPage_LinkCUSIPTblLbl="Link Cusip";
//		public final static String AddClientPage_RelationshipLbl="Relationship";
//		public final static String AddClientPage_LinkBorrowersObligorsTblLbl="Link Borrowers / Obligors";
//		
//	//Entity - Third Party
//		public final static String AddThirdPartyPage_EntityNameLbl="Entity Name";
//		public final static String AddThirdPartyPage_TaxIDLbl="Tax ID";
//		public final static String AddThirdPartyPage_FirmNameLbl="Firm Name (if not registered)";
//		public final static String AddThirdPartyPage_EntityTypeLbl="Entity Type";
//		public final static String AddThirdPartyPage_MarketRoleLbl="Market Role / Participant Type";
//		
//	// Admin - Add User
//		public final static String AdminAddUsersPage_FirstNameLbl="First Name";
//		public final static String AdminAddUsersPage_MiddleNameLbl="Middle Name";
//		public final static String AdminAddUsersPage_LastNameLbl="Last Name";
//		public final static String AdminAddUsersPage_EmailLbl="Email";
//		public final static String AdminAddUsersPage_PhoneLbl="Phone";
//		public final static String AdminAddUsersPage_FaxLbl="Fax";
//		public final static String AdminAddUsersPage_EmployeeIDLbl="Employee ID";
//		public final static String AdminAddUsersPage_JobTitleLbl="Job Title";
//		public final static String AdminAddUsersPage_ManagersEmailLbl="Manager's Email";
//		public final static String AdminAddUsersPage_JoiningDateLbl="Joining Date";
//		public final static String AdminAddUsersPage_ExitDateLbl="Exit Date";
//		public final static String AdminAddUsersPage_CostCenterLbl="Cost Center";
//		public final static String AdminAddUsersPage_AddressNameLbl="Address Name";
//		public final static String AdminAddUsersPage_AddressLine1Lbl="Address Line 1";
//		public final static String AdminAddUsersPage_CountryLbl="Country";
//		public final static String AdminAddUsersPage_StateLbl="State";
//		public final static String AdminAddUsersPage_CityLbl="City";
//		public final static String AdminAddUsersPage_ZipCodeLbl="Zip Code";
//		
//	// Task
//		public final static String TaskPage_TaskNameLbl="Task name:";
//		public final static String TaskPage_TaskPriorityLbl="Task Priority";
//		public final static String TaskPage_TaskTypeLbl="Task Type";
//		public final static String TaskPage_TaskStartDateLbl="Start Date";
//		public final static String TaskPage_TaskDueDateLbl="Due Date";

		

		
}
