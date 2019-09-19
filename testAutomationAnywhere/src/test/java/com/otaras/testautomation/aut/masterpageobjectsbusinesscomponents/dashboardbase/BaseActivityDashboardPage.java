package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.dashboardbase;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseActivityDashboardPage  extends BasePage{

 
    @FindBy(css = OR.DashboardPage_SaveAsDefaultViewButton)	
    public WebElement SaveAsDefaultViewButton;
    @FindBy(xpath = OR.DashboardPage_DashboardTab)	
    public WebElement DashboardTab;
    @FindBy(xpath = OR.DashboardPage_ProjectsTab)	
    public WebElement ProjectsTab;
    @FindBy(xpath = OR.DashboardPage_PatrticipantsTab)	
    public WebElement ParticipantsTab;
    
    public boolean Exists(){
	    return super.Exists(DashboardTab); 
	}
    
   
    
    public void clickProjectsTab() 
    {
    	
    	try{
    		Thread.sleep(1000);
    		Exists(ProjectsTab);
      		if (Exists(ProjectsTab)==false)
    			throw new NoSuchElementException ("Element Not Found: "+ProjectsTab.toString());
      		ProjectsTab.click();
    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterNotes Successful - "+ProjectsTab.toString()+SuccessFontColorSuffix);
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Dashboard Page - clickProjectsTab - unable to Select"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("clickProjectsTab not clicked");
    	}
    }
    
    public void clickParticipantsTab() 
    {
    	
    	try{
      		if (Exists(ParticipantsTab)==false)
    			throw new NoSuchElementException ("Element Not Found: "+ParticipantsTab.toString());
      		ProjectsTab.click();
    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Participants Page - clickParticipantsTab Successful - "+ParticipantsTab.toString()+SuccessFontColorSuffix);
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Dashboard Page - clickParticipantsTab - unable to Select"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("clickParticipantsTab not clicked");
    	}
    }
  
    
}
