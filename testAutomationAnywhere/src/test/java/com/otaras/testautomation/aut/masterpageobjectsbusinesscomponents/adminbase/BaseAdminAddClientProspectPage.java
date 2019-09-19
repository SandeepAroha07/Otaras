package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.adminbase;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.codoid.products.fillo.Recordset;
import com.mongodb.client.MongoCollection;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.common.ReadTestData;
import com.otaras.testautomation.objectrepository.OR;

public class BaseAdminAddClientProspectPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.AdminAddClientProspectPage_TaxID)	
	    public WebElement TaxID;

	   
	   public boolean Exists(){
	    	return super.Exists(TaxID); 
	    	
		}
//	   public String NameKeyToQueryDB() 
//	    {
//	    	return(testData.get("NameKeyToQueryDB").toString());
//	    }
//	   
//	   
//	   
//	    public String enterNewUserClientData(Map<Object, Object> testData) 
//	    {
//	    	
//	    	try{
//	    		this.selectComboboxByName("Entity Type", testData.get("entityType").toString());
//	    		
//	    		if (testData.get("entityType").toString().equalsIgnoreCase("corporation"))
//	    			enterInputValue(driver.findElement(By.xpath("//*[contains(text(),'Entity Name')]/parent::div//input")),testData.get("entityName").toString());
//	    		else
//	    			this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+"Entity Name"+"')]/parent::div//"+"following-sibling::div/div/div[@role='combobox']")), testData.get("entityName").toString());
//	    		this.selectComboboxByName("Primary Sectors", testData.get("primarySector").toString());
//	    		this.selectComboboxByName("Secondary Sectors", testData.get("secondarySector").toString());
//	    		//driver.findElement(By.xpath("//*[contains(text(),'Tax ID')]/parent::div//"+"following-sibling::div//input"))
//	    		enterInputValue("Tax ID",testData.get("taxID").toString());
//	    		//driver.findElement(By.xpath("//*[contains(text(),\\"Firm's Lead Advisor\\")]/parent::div/div/div")).getAttribute("id")    ---- WORKINg XPATH
//	    		
//	    		//CityIssuer.click();
//	    		String entityType="";
//	    		if (testData.get("entityType").toString().equalsIgnoreCase("governmental entity / issuer")){
//		    		entityType=testData.get("entityType1").toString();
//		    		String array1[]= entityType.split(";");
//		    	       for (String temp: array1){
//		    	          System.out.println(temp);
//		    	          driver.findElement(By.xpath("//input[@value= '"+" "+temp+"']")).click();
//		    	       }
//	    	     }
//	    		
//	    		this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div")), testData.get("leadAdvisor").toString());
//	    		
//	    		Date d=new Date();
//				String timestamp=d.toString().replace(":", "").replace(" ", "");
//	      		testData.put("NameKeyToQueryDB",testData.get("previousLeadAdvisor").toString()+timestamp);
//	    		enterInputValue("Previous Lead Advisor",testData.get("previousLeadAdvisor").toString()+timestamp);
//	    		enterInputValue("Previous Advisor Firm",testData.get("previousAdvisorFirm").toString());
//	    		enterDateInput("Previous Advisory Contract Expiry", testData.get("previousAdvisoryContractExpiry").toString(), ""); 
//	    		enterInputValue("Primary Contact Name in EMMA",testData.get("PrimaryContactNameinEmma").toString());
//	    		enterInputValue("Primary Contact Phone",testData.get("primaryContactPhone").toString());
//	    		enterInputValue("Primary Contact Email",testData.get("primaryContactEmail").toString());
////	    		selectDropdownValue("Activity Subtype",testData.get("activitySubtype").toString());
////	    		
////	    		if (testData.get("activitySubtype").toString().equalsIgnoreCase("Other (please specify)"))
////	    			enterInputValue("Other Activity Subtype",testData.get("otherActivitySubtype").toString());
////	    		
////	    		selectIssuer(testData.get("issuer").toString());
////
////	    		selectDropdownValue("Primary Sector",testData.get("primarySector").toString());
////	    		selectDropdownValue("Secondary Sector",testData.get("secondarySector").toString());
////	    		selectLeadAdvisor(testData.get("leadAdvisor").toString());
////	    		enterIssueName(testData.get("issueName").toString());
////	    		enterInputValue("Project Description / Transaction Name",testData.get("projectDescription").toString());
////	    		selectRelatedTransactionType(testData.get("relatedTransactionType").toString());
////	    		selectRelatedTransactionIds(testData.get("relatedTransactionsIds").toString());
////	    		//enterInputValue("Notes / Instructions",testData.get("notes").toString());
////	    		enterNotes(testData.get("notes").toString());
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDetail_BondIssue: Successful - "+SuccessFontColorSuffix);
//	  
//	    		return(testData.get("NameKeyToQueryDB").toString());
//
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Derivative Transaction Page - enterDebtDetail_Derivative - unable to enter data"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterDebtDetail_Derivative - Deal data enty failed");
//	    	}
//	    }
//	    
//	
//	    
//	    public void enterMaster_LinkCusipData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
//	    {
//	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
//	    	ReadTestData readtestdata=new ReadTestData();
//	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
//	    	
//	    	Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Debt Type"+"')]")));
//	    	
////	    	WebElement tblName=driver.findElement(By.xpath("//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table"));
////	    	List<WebElement> tblRows=tblName.findElements(By.tagName("tr"));
////	    	int tblRowsCount=tblRows.size();
////	    	
////	    	path("//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table//td[2]/div/input")).getAttribute("class")
////	    	//Loop will execute till the last row of table.
////	    	for (int row = 1; row < tblRowsCount; row++) {
////	    	    //To locate columns(cells) of that specific row.
////	    	    List < WebElement > Columns_row = tblRows.get(row).findElements(By.tagName("td"));
////	    	    //To calculate no of columns (cells). In that specific row.
////	    	    int columns_count = Columns_row.size();
////	    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
////	    	    //Loop will execute till the last cell of that specific row.
////	    	    
//////	    	    Columns_row.get(1).findElement(By.xpath("(//div[[@name='rw-input rw-dropdown-list-input']])[1]")).sendKeys("APPROPRIATIONS");
//////	    	    Columns_row.get(1).findElement(By.xpath("(//input[[@name='associatedCusip6']])[1]")).sendKeys("AnilK");
////	    	    //Columns_row.get(1).findElement(By.xpath("//div[[@name='rw-input rw-dropdown-list-input']]")).sendKeys("APPROPRIATIONS");
////	    	    Columns_row.get(1).findElement(By.xpath("//input[[@name='associatedCusip6']]")).sendKeys("AnilK");
////	    	    for (int column = 0; column < columns_count; column++) {
////	    	        // To retrieve text from that specific cell.
////	    	        String celtext = Columns_row.get(column).getText();
////	    	        String celtext1 = Columns_row.get(column).getAttribute("value");
////	    	       // Columns_row.get(column).findElement(by)
////	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
////	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext1);
////	    	    }
////	    	    System.out.println("-------------------------------------------------- ");
////	    	}
//	    	
//	    	//working xpath - driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table//td[2]//input)[2]")).getAttribute("class");
//	    	int i=1; 
//	    	selectCombobox(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table//tr["+i+"]/td[1]//div[@role='combobox'])[1]")),MasterTestDataMap.get("debtType").toString());
//	    	enterInputValue(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Cusip"+"')]/parent::div//"+"following-sibling::div//table//tr["+i+"]/td[2]//input)[1]")),MasterTestDataMap.get("debtType").toString());
//	    
//	    }
//	    
//	    // Working code - driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]//li[contains(text(),'Obligor')]")).getAttribute("class")
//	    public void enterMaster_LinkBorrowersData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
//	    {
//	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
//	    	ReadTestData readtestdata=new ReadTestData();
//	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
//	    	
//	    	Exists(driver.findElement(By.xpath("//*[contains(text(),'"+"Relationship"+"')]")));
//	    	
//	    	WebElement cCombobox=driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]"));
//	    	cCombobox.click();
//	    	Exists(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("relationship").toString().trim()+"')]")));
//	    	WebElement sListItem=driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[1]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("relationship").toString().trim()+"')]"));
//	    	//selectCombobox(cCombobox);
//	    	sListItem.click();
//	    	
//	    	enterInputValue(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[2]//input)[1]")),MasterTestDataMap.get("firmName").toString());
//	    	
//	    	cCombobox=driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[3]//div[@role='combobox'])[1]"));
//	    	cCombobox.click();
//	    	Exists(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[3]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("debtType").toString().trim()+"')]")));
//	    	sListItem=driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[3]//div[@role='combobox'])[1]//li[contains(text(),'"+MasterTestDataMap.get("debtType").toString().trim()+"')]"));
//	    	sListItem.click();
//
//	    	enterInputValue(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[4]//input)[1]")),MasterTestDataMap.get("associatedCusip6").toString());
//	    	
//	    	enterDateInput(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[5]//input)[1]")), MasterTestDataMap.get("startDate").toString(), "");
//	    	
//	    	enterDateInput(driver.findElement(By.xpath("(//*[contains(text(),'"+"Link Borrowers / Obligors"+"')]/parent::div//"+"following-sibling::div//table//tr[1]/td[6]//input)[1]")), MasterTestDataMap.get("endDate").toString(), "");
//	    }
//	    
//
//	    
//	    
////	    public void enterMaster_LinkBorrowersData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
////	    {
////	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
////	    	ReadTestData readtestdata=new ReadTestData();
////	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
////	    	
////	    	selectComboboxByName("Relationship",MasterTestDataMap.get("relationship").toString());
////	    	enterInputValue("Firm Name",MasterTestDataMap.get("firmName").toString());
////	    
////	    }
//	    
////	    public String NameKeyToQueryDB() 
////	    {
////	    	return(testData.get("NameKeyToQueryDB").toString());
////	    }
//
////	    public void getMasterData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
////	    {
////	    	Recordset recordsetTestData;
////	    	ArrayList<String> arrayListTestDataColumns;
////	    	//ReadTestData xyz=new ReadTestData();
////	    	HashMap<String, String> tableColumnNames=new HashMap<>();
////	    	HashMap<String, String> mastertestdata=new HashMap<>();
////	    	
////	    	recordsetTestData=ReadTestData.readMasterDataTestDataBySpecifiedColumnName(sTabName, "key", sColumnValue);
////	    	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns(sTabName);
////	    	tableColumnNames=ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
////	    	
////       	 //Map<Object, Object> datamap = new HashMap<>();
////	    	
////	        	// for (int j = 0; j < lastCellNum; j++) {
////	        		 //datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
////	        			recordsetTestData.next();
////	        		    Set set = tableColumnNames.entrySet();
////	        		    Iterator iterator = set.iterator();
////	        		 while(iterator.hasNext()) {
////	        	         Map.Entry mentry = (Map.Entry)iterator.next();
////	        	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
////	        	         System.out.println(mentry.getValue());
////	        	         sColumnName=mentry.getValue().toString();
////	        	         
////	        	         try{
////	        	         if (!sColumnName.contains("COLUMN_"))
////	        	        	 System.out.print(recordsetTestData.getField(sColumnName));
////	        	         mastertestdata.put(sColumnName, recordsetTestData.getField(sColumnName).trim());
////	        	         }catch(Exception e){}
////	        	         
////	        	         
////	        		 }
////	        		 System.out.print("Master Test Data: "+mastertestdata);
////	    }
	   
}
