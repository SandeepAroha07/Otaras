package com.otaras.testautomation.common;

import java.io.File;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;


public class DBTestResultUpdate {

	private WebDriver driver;
	private ExtentTest testReport;
	
	public DBTestResultUpdate(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
	}
	
	public void UpdateTestResultInDB(String sTabName,String sTestID) throws Exception
	{
		
		if (!ReadTestConfig.Get("SKIP.TESTDBLOG").trim().equalsIgnoreCase("yes"))
		{
			Status testingStatus=testReport.getStatus();
			String testFinalStatus=testingStatus.toString();
			Connection connection1;
			String sTestDataUpdQuery="";
			Thread.sleep((long)(Math.random() * 700));
			File classpathRoot = new File(System.getProperty("user.dir"));
			File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
			String sFilename=app.toString();
			Fillo fillo=new Fillo();
			connection1=fillo.getConnection(sFilename);
			
		    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Date date = new Date();
				    	
				    	
			String TESTBY=System.getProperty("user.name");
			String TESTDATE=date.toString();
			String TESTMACHINE=InetAddress.getLocalHost().getHostName();
			//String TESTEXECUTIONTIME=date.toString();
				    	
			Thread.sleep((long)(Math.random() * 700));
			
			sTestDataUpdQuery="Update "+sTabName+" Set TestStatus='"+testFinalStatus  +"'"+", TestBy='"+TESTBY+"'"+", TestMachine='"+TESTMACHINE+"'"+" , TestDate='"+TESTDATE+"'" +" , TestExecutionTime='"+TestDataRec.TESTEXECUTIONTIME+"'"+"where testID = "+"'"+sTestID+"'";
			connection1.executeUpdate(sTestDataUpdQuery);
			Thread.sleep((long)(Math.random() * 700));
			connection1.close();
			testReport.log(Status.PASS, "DB Update Done");
		}
	}
	
	
	
	public void UpdateTestResultExceptionInDB(String sTabName,String sTestID) throws Exception
	{
		
		if (!ReadTestConfig.Get("SKIP.TESTDBLOG").trim().equalsIgnoreCase("yes"))
		{
			testReport.log(Status.FATAL, "TEST SCENARIO EXECUTION INCOMPLETE");
			Status testingStatus=testReport.getStatus();
			String testFinalStatus=testingStatus.toString();
			testFinalStatus="Failed-Incomplete/Exception";
			Connection connection1;
			String sTestDataUpdQuery="";
			Thread.sleep((long)(Math.random() * 700));
			File classpathRoot = new File(System.getProperty("user.dir"));
			File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
			String sFilename=app.toString();
			Fillo fillo=new Fillo();
			connection1=fillo.getConnection(sFilename);
			
		    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Date date = new Date();
				    	
				    	
			String TESTBY=System.getProperty("user.name");
			String TESTDATE=date.toString();
			String TESTMACHINE=InetAddress.getLocalHost().getHostName();
			//String TESTEXECUTIONTIME=date.toString();
				    	
						
			Thread.sleep((long)(Math.random() * 700));
			sTestDataUpdQuery="Update "+sTabName+" Set TestStatus='"+testFinalStatus  +"'"+", TestBy='"+TESTBY+"'"+", TestMachine='"+TESTMACHINE+"'"+" , TestDate='"+TESTDATE+"'" +" , TestExecutionTime='"+TestDataRec.TESTEXECUTIONTIME+"'"+"where testID = "+"'"+sTestID+"'";
			connection1.executeUpdate(sTestDataUpdQuery);
	
			connection1.close();
			testReport.log(Status.PASS, "DB Update Done");
		}
	}
	
	public void UpdateTransactionIDInDB(String sTabName,String sTestID, String sFieldName,String sFieldValue) throws Exception
	{
		if (!ReadTestConfig.Get("SKIP.TESTDBLOG").trim().equalsIgnoreCase("yes"))
		{
		Status testingStatus=testReport.getStatus();
		String testFinalStatus=testingStatus.toString();
		Connection connection1;
		String sTestDataUpdQuery="";
		
		Thread.sleep((long)(Math.random() * 700));
		
		File classpathRoot = new File(System.getProperty("user.dir"));
		File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
		String sFilename=app.toString();
		Fillo fillo=new Fillo();
		connection1=fillo.getConnection(sFilename);
		
	  		
		sTestDataUpdQuery="Update "+sTabName+" Set "+sFieldName+"='"+sFieldValue  +"'"+" where testID = "+"'"+sTestID+"'";
		Thread.sleep((long)(Math.random() * 700));
		connection1.executeUpdate(sTestDataUpdQuery);
		Thread.sleep((long)(Math.random() * 700));
		
		connection1.close();
		}
	}
	
	public void UpdateTransactionIDInDBDelete(String sTabName,String sTestID, String sFieldName,String sFieldValue) throws Exception
	{
		//if (!ReadTestConfig.Get("SKIP.TESTDBLOG").trim().equalsIgnoreCase("yes"))
		//{
		Status testingStatus=testReport.getStatus();
		String testFinalStatus=testingStatus.toString();
		Connection connection1;
		String sTestDataUpdQuery="";
		
		File classpathRoot = new File(System.getProperty("user.dir"));
		File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
		String sFilename=app.toString();
		Fillo fillo=new Fillo();
		connection1=fillo.getConnection(sFilename);
		
	  		
		sTestDataUpdQuery="Update "+sTabName+" Set "+sFieldName+"='"+sFieldValue  +"'"+" where testID = "+"'"+sTestID+"'";
		connection1.executeUpdate(sTestDataUpdQuery);

		connection1.close();
		//}
	}
	
	public void UpdateTestResultExceptionInDB()
	{
		
	}
	
}
