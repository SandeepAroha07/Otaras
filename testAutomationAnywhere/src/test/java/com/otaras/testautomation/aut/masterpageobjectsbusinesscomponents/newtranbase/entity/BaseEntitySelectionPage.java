package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.entity;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseEntitySelectionPage  extends BasePage{
	
	
	   @FindBy(xpath = OR.EntitySelectionPage_Client)	
	    public WebElement Client;
	   @FindBy(xpath = OR.EntitySelectionPage_Prospect)	
	    public WebElement Prospect;
	   @FindBy(xpath = OR.EntitySelectionPage_ThirdParty)	
	    public WebElement ThirdParty;
	   
	   
	   public boolean Exists(){
	    	return super.Exists(Client); 
	    	
		}
	   
	    public void clickClientOrProspect(String sClientOrProspectValue) 
	    {
	    	if (sClientOrProspectValue.equalsIgnoreCase("Client"))
	    		clickElement(Client);
	    	else if (sClientOrProspectValue.equalsIgnoreCase("Prospect"))
	    		clickElement(Prospect);
	    	else if (sClientOrProspectValue.equalsIgnoreCase("thirdparty"))
	    		clickElement(ThirdParty);
	    }

	   
}
