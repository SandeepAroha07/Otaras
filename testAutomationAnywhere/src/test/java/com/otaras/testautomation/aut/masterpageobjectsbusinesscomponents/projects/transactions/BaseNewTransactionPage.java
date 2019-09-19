package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.projects.transactions;
//package com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.projects.transactions;
//
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.Status;
//import com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
//import com.companyname.testautomation.aut.testdatarec.TestDataRec;
//import com.companyname.testautomation.objectrepository.OR;
//
//public class BaseNewTransactionPage  extends BasePage{
//	
//	
//
//	
//	   @FindBy(xpath = OR.NewTransactionPage_Issuer)	
//	    public WebElement Issuer;
//	   @FindBy(xpath = OR.NewTransactionPage_TransactionType)	
//	    public WebElement TransactionType;  
//	   @FindBy(xpath = OR.NewTransactionPage_OtherTransactionType)	
//	    public WebElement OtherTransactionType;  
//	   @FindBy(xpath = OR.NewTransactionPage_TransactionNameLabel)	
//	    public WebElement TransactionNameLabel;  
//	   
//	   @FindBy(xpath = OR.NewTransactionPage_PurposeofRFP)	
//	    public WebElement PurposeofRFP; 
//	   @FindBy(css = OR.NewTransactionPage_AssignedTo)	
//	    public WebElement AssignedTo; 
//	   @FindBy(xpath = OR.NewTransactionPage_State)	
//	    public WebElement State; 
//	   @FindBy(xpath = OR.NewTransactionPage_County)	
//	    public WebElement County; 
//	   @FindBy(xpath = OR.NewTransactionPage_PrimarySector)	
//	    public WebElement PrimarySector; 
//	   
//	   @FindBy(xpath = OR.NewTransactionPage_SecondarySector)	
//	    public WebElement SecondarySector;
//	   @FindBy(xpath = OR.NewTransactionPage_DateHired)	
//	    public WebElement DateHired;
//	   @FindBy(xpath = OR.NewTransactionPage_StartDate)	
//	    public WebElement StartDate;
//	   @FindBy(xpath = OR.NewTransactionPage_ExpectedEndDate)	
//	    public WebElement ExpectedEndDate;
//	   @FindBy(xpath = OR.NewTransactionPage_RelatedTransactionAction)	
//	    public WebElement RelatedTransactionAction;
//	   
//	   @FindBy(xpath = OR.NewTransactionPage_RelatedTransactionNames)	
//	    public WebElement RelatedTransactionNames;
//	   @FindBy(xpath = OR.NewTransactionPage_Notes)	
//	    public WebElement Notes;
//	   @FindBy(css = OR.NewTransactionPage_Save)	
//	    public WebElement Save;
//	   @FindBy(xpath = OR.NewTransactionPage_Cancel)	
//	    public WebElement Cancel;
//
//	   public Map<Object, Object> testDataOrig;
//	   
//	    public boolean Exists(){
//	    	return super.Exists(State); 
//	    	
//		}
//	    
//	    public void selectIssuer(String issuer) 
//	    {
//	    	try{
//	    		//Thread.sleep(300);
//	    		if (Exists(driver.findElement(By.cssSelector(".rw-input-reset")))==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+"Issuer");
//	    		if (issuer.equalsIgnoreCase(""))
//	    			issuer=testDataOrig.get("issuer").toString();
//	    		testReport.log(Status.INFO,"Issuer To Select:"+issuer);
//	    		Issuer.click();
////	    		WebElement countryUL= driver.findElement(By.xpath("//[@id='rw_1_input']/div/div/div/ul"));
////	    		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
////	    		for (WebElement li : countriesList) {
////	    		if (li.getText().equals("Florda State")) {
////	    		     li.click();
////	    		   }
////	    		}
//	    		
//	    		//FirmName.sendKeys("Florda State");
//	    		//Thread.sleep(300);
//	    		
//	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys(issuer);
//	    		//Thread.sleep(200);
//	    		driver.findElement(By.xpath("//li[contains(text(),'"+issuer+"')]")).click();
////	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Florda State");
//	    		//driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys(Keys.TAB);
//	    		//Thread.sleep(500);
//	    	//testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Firm Page - clickNewMenu Successful - "+New.toString()+SuccessFontColorSuffix);
//	    	
//		}
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectIssuer - unable to select combobox value"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("selectIssuer not selected");
//    	}
//	}
//	 
//	    public String getTransactionName() 
//	    {
//	    	try{
//	      		if (Exists(TransactionNameLabel)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+TransactionNameLabel.toString());
//	    		
//	    		System.out.println("Transaction Name: "+TransactionNameLabel.getAttribute("value"));
//	    		//TestDataRec.TESTTRANSACTIONDATAMAP.put("TranID", TransactionNameLabel.getAttribute("value"));
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - getTransactionName Successful - "+TransactionNameLabel.toString()+"::"+TransactionNameLabel.getAttribute("value")+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - getTransactionName - unable to Fetch"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("getTransactionName not fetched");
//	    	}
//	    	return (TransactionNameLabel.getAttribute("value"));
//	    }
//	    
//	    public void selectTransactionType(String sTranType) 
//	    {
//	    	try{
////	    		if (sTranType.equalsIgnoreCase(""))
////	    			sTranType=testDataOrig.get("transactionType").toString();
//	    		//TransactionType.sendKeys("Rating Presentation");;
//	    		if (Exists(TransactionType)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+TransactionType.toString());
//	    		TransactionType.sendKeys(sTranType);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectTransactionType Successful - "+TransactionType.toString()+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectTransactionType - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectTransactionType not entered");
//	    	}
//	    }
//	    
////	    public void selectTransactionType() 
////	    {
////	    	try{
////	    		//TransactionType.sendKeys("Rating Presentation");;
////	    		TransactionType.sendKeys(testDataOrig.get("transactionType").toString());
////	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectTransactionType Successful - "+TransactionType.toString()+SuccessFontColorSuffix);
////	    	
////	    	}
////	    	catch (Exception e)
////	    	{
////	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectTransactionType - unable to Select"+e+ErrorFontColorSuffix);
////	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
////	    		throw new NoSuchElementException ("selectTransactionType not entered");
////	    	}
////	    }
//	    
//	    
//	    
//	    public void enterOtherTransactionType(String otherTransactionType) 
//	    {
//	    	try{
//	    		//OtherTransactionType.sendKeys("Anil");;
//	    		//OtherTransactionType.sendKeys(otherTransactionType+testDataOrig.get("testID").toString());
//	      		if (Exists(OtherTransactionType)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+OtherTransactionType.toString());
//	    		OtherTransactionType.sendKeys(otherTransactionType);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterOtherTransactionType Successful - "+OtherTransactionType+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterOtherTransactionType - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterOtherTransactionType not entered");
//	    	}
//	    }
//	    
//	    public void selectPurposeofRFP( String purposeofRFP) 
//	    {
//	    	try{
//	      		if (Exists(PurposeofRFP)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+PurposeofRFP.toString());
//	    		PurposeofRFP.sendKeys(purposeofRFP);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectPurposeofRFP Successful - "+PurposeofRFP+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectPurposeofRFP - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectPurposeofRFP not entered");
//	    	}
//	    }
//	    
//	    
//	    public void selectAssignedTo(String assignedTo) 
//	    {
//	    	try{
//	      		if (Exists(AssignedTo)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+AssignedTo.toString());
//	    		AssignedTo.click();
////	    		WebElement countryUL= driver.findElement(By.xpath("//[@id='rw_1_input']/div/div/div/ul"));
////	    		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
////	    		for (WebElement li : countriesList) {
////	    		if (li.getText().equals("Florda State")) {
////	    		     li.click();
////	    		   }
////	    		}
//	    		
//	    		//FirmName.sendKeys("Florda State");
//	    		//driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Brice");
//	    		Thread.sleep(200);
//	    		driver.findElement(By.xpath("//li[contains(text(),'"+assignedTo+"')]")).click();
//	    		driver.findElement(By.cssSelector("div.columns:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(2) > button:nth-child(1)")).click();
//	    		
////	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Florda State");
//	    		//driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys(Keys.TAB);
//	    		//Thread.sleep(500);
//	    	//testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Firm Page - clickNewMenu Successful - "+New.toString()+SuccessFontColorSuffix);
//	    	
//		}
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectAssignedTo - unable to select combobox value"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("selectAssignedTo not selected");
//    	}
//	}
//	    
//	    
//	    public void selectState(String state) 
//	    {
//	    	try{
//	      		if (Exists(State)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+State.toString());
//	    		State.sendKeys(state);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectState Successful - "+State.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectState - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectState not entered");
//	    	}
//	    }
//	    
//	    public void selectCounty(String county) 
//	    {
//	    	try{
//	      		if (Exists(County)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+County.toString());
//	    		County.sendKeys(county);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectCounty Successful - "+County.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectCounty - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectCounty not entered");
//	    	}
//	    }   
//	    
//	    
//	    public void selectPrimarySector(String primarySector) 
//	    {
//	    	try{
//	      		if (Exists(PrimarySector)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+PrimarySector.toString());
//	    		PrimarySector.sendKeys(primarySector);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectPrimarySector Successful - "+PrimarySector.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectPrimarySector - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectPrimarySector not entered");
//	    	}
//	    }   
//	    
//	    
//	    public void selectSecondarySector(String secondarySector) 
//	    {
//	    	try{
//	      		if (Exists(SecondarySector)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+SecondarySector.toString());
//	    		SecondarySector.sendKeys(secondarySector);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectSecondarySector Successful - "+SecondarySector.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectSecondarySector - unable to Select"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectSecondarySector not entered");
//	    	}
//	    }   
//	    
//	    
//	    public void enterDateHired(String dateHired) 
//	    {
//	    	try{
//	    		//DateHired.click();
//	    		//DateHired.clear();
//	    		//DateHired.click();
//	    		
////	    		 WebElement el = DateHired;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
////			     Actions builder = new Actions(driver);
////			     builder.moveToElement( el ).click( el );
////			     builder.perform();
//	    		
//	      		if (Exists(DateHired)==false)
//		    			throw new NoSuchElementException ("Element Not Found: "+DateHired.toString());
//	    		DateHired.sendKeys(dateHired);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterDateHired Successful - "+DateHired.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterDateHired - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterDateHired not entered");
//	    	}
//	    }
//	
//	    public void enterStartDate(String startDate) 
//	    {
//	    	try{
//	    	//	StartDate.click();
//	    		//StartDate.clear();
//	    		//StartDate.click();
//	    		if (Exists(StartDate)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+StartDate.toString());
//	    		StartDate.sendKeys(startDate);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterStartDate Successful - "+StartDate.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterStartDate - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterStartDate not entered");
//	    	}
//	    }
//	  
//	    public void enterExpectedEndDate(String expectedEndDate) 
//	    {
//	    	try{
//	    		//ExpectedEndDate.click();
//	    		//ExpectedEndDate.clear();
//	    		//ExpectedEndDate.click();
//	    		if (Exists(ExpectedEndDate)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+ExpectedEndDate.toString());
//	    		ExpectedEndDate.sendKeys();
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterExpectedEndDate Successful - "+ExpectedEndDate.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterExpectedEndDate - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterExpectedEndDate not entered");
//	    	}
//	    }
//	    
//	    
//	    public void enterNotes(String notes) 
//	    {
//	    	try{
//	    		if (Exists(Notes)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+Notes.toString());
//	    		Notes.sendKeys(notes);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterNotes Successful - "+"Notes"+Notes.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterExpectedEndDate - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterNotes not entered");
//	    	}
//	    }
//	    
//	    public void selectRelatedTransactionsAction(String relatedTransactionsIds) 
//	    {
//	    	try{
//	    		if (Exists(RelatedTransactionAction)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+RelatedTransactionAction.toString());
//	    		RelatedTransactionAction.sendKeys(relatedTransactionsIds);
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionsAction Successful - "+"RelatedTransactionAction:"+RelatedTransactionAction.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionsAction - unable to Enter"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("selectRelatedTransactionsAction not entered");
//	    	}
//	    }
//	    
//	    public void performAction(String action) 
//	    {
//	    	
//	    	try{
//	    		if (Exists(Save)==false)
//	    			throw new NoSuchElementException ("Element Not Found: "+Save.toString());
//	    		if (action.equalsIgnoreCase("save"))
//	    			Save.click();
//	    		else if (action.equalsIgnoreCase("cancel"))
//	    			Cancel.click();
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - Action Performed: "+action+" Successful - "+"Save: "+Save.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - performAction - unable to click"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("performAction not entered");
//	    	}
//	    }
//	    
//	    
//	    public void enterDealDetails(Map<Object, Object> testData) 
//	    {
//	    	
//	    	try{
//	    		
//	    		selectIssuer(testData.get("issuer").toString());
//				selectTransactionType(testData.get("transactionType").toString());
//				enterOtherTransactionType(testData.get("otherTransactionType").toString());
//				selectPurposeofRFP(testData.get("purposeOfRFP").toString());
//				selectAssignedTo(testData.get("assignedTo").toString());
//				selectState(testData.get("state").toString());
//				selectCounty(testData.get("county").toString());
//				selectPrimarySector(testData.get("primarySector").toString());
//				selectSecondarySector(testData.get("secondarySector").toString());
//				enterDateHired(testData.get("dateHired").toString());
//				enterStartDate(testData.get("startDate").toString());
//				enterExpectedEndDate(testData.get("expectedEndDate").toString());
//				selectRelatedTransactionsAction(testData.get("relatedTransactionsIds").toString());
//				enterNotes(testData.get("notes").toString());
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - v - unable to enter data"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("enterDealDetails - Deal data enty failed");
//	    	}
//	    }
//	    
//}
