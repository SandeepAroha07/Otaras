package com.otaras.testautomation.aut.testdatarec;

import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.otaras.testautomation.common.ReadTestConfig;


public class TestDataRec {

//	public static String URL;
//	public static String BROWSERNAME;
//	public static String APPNAME;
//	public static String LOGINNAME;
//	public static String PASSWORD;
	
	public static String TESTDATANAME="";
	//public static String TESTPAGENAME;
	public static String TESTSCRIPTID="";
	public static String TESTBROWSERNAME="";
	public static String TESTBROWSERNAMEOFPREVIOUSTEST="";
	public static int TEST_SCENARIOS_COUNT=0;
	
	
	public static  HashMap<String, String> TESTDATACOLUMNSMAP = new HashMap<String, String>();	
	public static  HashMap<String, String> TESTDATAMAP = new HashMap<String, String>();
	//public static  HashMap<Object, Object> TESTTRANSACTIONDATAMAP = new HashMap<Object, Object>();
	public static  Map<Object, Object> TESTTRANSACTIONDATAMAP;
	
	public static  HashMap<String, String> TESTDATALOGINCOLUMNSMAP = new HashMap<String, String>();	
	public static  HashMap<String, String> TESTDATALOGINMAP = new HashMap<String, String>();
	
	public static  HashMap<String, String> TESTDATAUICOLUMNSMAP = new HashMap<String, String>();	
	public static  HashMap<String, String> TESTDATAUIMAP = new HashMap<String, String>();



//	public static String TESTBY="";
//	public static String TESTDATE="";
//	public static String TESTMACHINE="";
	public static long TESTEXECUTIONTIME;
	
	
	

}
