package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.menubase;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseMenuPage   extends BasePage{

	
	   @FindBy(xpath = OR.MenuPage_UserDashboard)	
	    public WebElement UserDashboard;
	   @FindBy(xpath = OR.MenuPage_Projects)	
	    public WebElement Projects;
	   @FindBy(xpath = OR.MenuPage_New)	
	   //@FindBy(css = "div.navbar-item:nth-child(2) > a:nth-child(1)")
	    public WebElement New;
	   @FindBy(xpath = OR.MenuPage_NewEntity)	
	    public WebElement NewEntity;
	   @FindBy(xpath = OR.MenuPage_NewTask)	
	    public WebElement NewTask;
	   
	   @FindBy(xpath = OR.MenuPage_NewActivity)	
	    public WebElement NewActivity;
	   @FindBy(xpath = OR.MenuPage_Admin)	
	    public WebElement Admin;
	   @FindBy(xpath = OR.MenuPage_Contact)	
	    public WebElement Contact;
	   @FindBy(xpath = OR.MenuPage_Tools)	
	    public WebElement Tools;  
	   @FindBy(xpath = OR.MenuPage_Billing)	
	    public WebElement Billing;
	   @FindBy(xpath = OR.MenuPage_Documents)	
	    public WebElement Documents;
	   @FindBy(xpath = OR.MenuPage_Compliance)	
	    public WebElement Compliance;
	   @FindBy(xpath = OR.MenuPage_ComplianceActionCenter)	
	    public WebElement ComplianceActionCenter;
	   
	   
	   
	   
//	    public boolean Exists(){
//	    	//testElement.sendKeys("anil");
//		    //return super.Exists(existemail); 
//	    	return super.Exists(LoginIcon); 
//	    	
//		}
	    
	    
	    public void clickNewMenu() 
	    {
	    	
//	    	  try{
//				  WebElement el = driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
//				     Actions builder = new Actions(driver);
//				     builder.moveToElement( el ).click( el );
//				     builder.perform();
//			  }catch(Exception e){}
//	    	
	    	
	    	try{
	    		//New.click();
	    		 //WebElement el = driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
	    		verifyAppLoading();
	    		verifyAppLoading();
	    		verifyAppLoading();
	    		if (Exists(New)==false)
	    			//if (Exists(New)==false)
	    				throw new NoSuchElementException ("Element Not Found: "+New.toString());
	    		WebElement el = New;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
			     Actions builder = new Actions(driver);
			     builder.moveToElement( el ).click( el );
			     builder.perform();
			     testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickNewMenu Successful - "+New.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		try{
	    			
	    			verifyAppLoading();
		    		verifyAppLoading();
		    		verifyAppLoading();
		    		if (Exists(New)==false)
		    			//if (Exists(New)==false)
		    				throw new NoSuchElementException ("Element Not Found: "+New.toString());
		    		WebElement el = New;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
				     Actions builder = new Actions(driver);
				     builder.moveToElement( el ).click( el );
				     builder.perform();
	    			
	    		}catch(Exception e1){
	    			
	    			
	    			
	    		}
	    		
	    		
	    		
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickNewMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
	    
	    public void clickUserDashboardMenu() 
	    {
	    	try{
	    		//New.click();
	    		 //WebElement el = driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
	    		 
	    		if (Exists(UserDashboard)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+UserDashboard.toString());
	    		 WebElement el = UserDashboard;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
			     Actions builder = new Actions(driver);
			     builder.moveToElement( el ).click( el );
			     builder.perform();
			     testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickUserDashboardMenu Successful - "+Projects.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickUserDashboardMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
	    
	    public void clickEntitySubMenu() 
	    {
	    	try{
	    		if (Exists(NewEntity)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+NewEntity.toString());
	    		NewEntity.click();
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - NewEntity Successful - "+NewEntity.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - NewEntity - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	   
	    public void clickProjectsSubMenu() 
	    {
	    	try{
	    		if (Exists(Projects)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+Projects.toString());
	    			Projects.click();
	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickProjectsSubMenu Successful - "+Projects.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickProjectsSubMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	   
	    public void clickActivitySubMenu() 
	    {
	    	try{
	    		if (Exists(NewActivity)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+NewActivity.toString());
	    		NewActivity.click();
	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickProjectsSubMenu Successful - "+NewActivity.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickProjectsSubMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
	    public void clickAdminMenu() 
	    {
	    	try{
	    		if (Exists(Admin)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+Admin.toString());
	    		Admin.click();
	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickProjectsSubMenu Successful - "+NewActivity.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickProjectsSubMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
	    public void clickContactSubMenu() 
	    {
	    	try{
	    		if (Exists(Contact)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+Contact.toString());
	    		Contact.click();
	    		//driver.navigate().refresh();
	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickContactSubMenu Successful - "+Contact.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickContactSubMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("clickContactSubMenu not launched");
	    	}
	    }
	    
	    
	    public void clickTaskSubMenu() 
	    {
	    	try{
	    		if (Exists(NewTask)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+NewTask.toString());
	    		NewTask.click();
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - NewEntity Successful - "+NewTask.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - NewTask - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
	    
	    
	    public void clickToolsMenu() 
	    {

	    	
	    	try{
	    		//New.click();
	    		 //WebElement el = driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
	    		verifyAppLoading();
	    		verifyAppLoading();
	    		verifyAppLoading();
	    		if (Exists(Tools)==false)
	    			//if (Exists(New)==false)
	    				throw new NoSuchElementException ("Element Not Found: "+Tools.toString());
	    		WebElement el = Tools;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
			     Actions builder = new Actions(driver);
			     builder.moveToElement( el ).click( el );
			     builder.perform();
			     testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickNewMenu Successful - "+Tools.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		try{
	    			
	    			verifyAppLoading();
		    		verifyAppLoading();
		    		verifyAppLoading();
		    		if (Exists(Tools)==false)
		    			//if (Exists(New)==false)
		    				throw new NoSuchElementException ("Element Not Found: "+Tools.toString());
		    		WebElement el = Tools;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
				     Actions builder = new Actions(driver);
				     builder.moveToElement( el ).click( el );
				     builder.perform();
	    			
	    		}catch(Exception e1){
	    			
	    			
	    			
	    		}
	    		
	    		
	    		
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickNewMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
	    public void clickBillingSubMenu() 
	    {
	    	try{
	    		if (Exists(Billing)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+Billing.toString());
	    		Billing.click();
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - NewEntity Successful - "+Billing.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - Billing - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("URL not launched");
	    	}
	    }
	    
	    public void clickDocumentsSubMenu() 
	    {
	    	try{
	    		if (Exists(Documents)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+Documents.toString());
	    		Documents.click();
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - NewEntity Successful - "+Documents.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - Documents - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("Documents not clicked");
	    	}
	    }
	    
	    
	    public void clickomplianceMenu() 
	    {

	    	
	    	try{
	    		//New.click();
	    		 //WebElement el = driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
	    		verifyAppLoading();
	    		verifyAppLoading();
	    		verifyAppLoading();
	    		if (Exists(Compliance)==false)
	    			//if (Exists(New)==false)
	    				throw new NoSuchElementException ("Element Not Found: "+Compliance.toString());
	    		WebElement el = Compliance;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
			     Actions builder = new Actions(driver);
			     builder.moveToElement( el ).click( el );
			     builder.perform();
			     testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - clickomplianceMenu Successful - "+Compliance.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		try{
	    			
	    			verifyAppLoading();
		    		verifyAppLoading();
		    		verifyAppLoading();
		    		if (Exists(Compliance)==false)
		    			//if (Exists(New)==false)
		    				throw new NoSuchElementException ("Element Not Found: "+Compliance.toString());
		    		WebElement el = Compliance;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
				     Actions builder = new Actions(driver);
				     builder.moveToElement( el ).click( el );
				     builder.perform();
	    			
	    		}catch(Exception e1){
	    			
	    			
	    			
	    		}
	    		
	    		
	    		
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickNewMenu - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("Compliance not launched");
	    	}
	    }
	    
	    public void clickComplianceActionCenterSubMenu() 
	    {
	    	try{
	    		if (Exists(ComplianceActionCenter)==false)
	    			throw new NoSuchElementException ("Element Not Found: "+ComplianceActionCenter.toString());
	    		ComplianceActionCenter.click();
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Menu Selection Page - NewEntity Successful - "+ComplianceActionCenter.toString()+SuccessFontColorSuffix);
	    	
	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - ComplianceActionCenter - unable to Click"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("ComplianceActionCenter not clicked");
	    	}
	    }
	    
//	    pages.MenuPage.clickUserDashboardMenu();
//		  pages.MenuPage.clickProjectsSubMenu();
}
