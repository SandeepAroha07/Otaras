package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.dashboardbase;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseProjectsDashboardPage  extends BasePage{

 
    @FindBy(xpath = OR.DashboardPage_SearchField)	
    public WebElement SearchField;
    @FindBy(xpath = OR.DashboardPage_TransactionsLbl)	
    public WebElement TransactionsLbl;
    

    
    public boolean Exists(){
	    return super.Exists(TransactionsLbl); 
	}
    
   
    
  
  
    
}
