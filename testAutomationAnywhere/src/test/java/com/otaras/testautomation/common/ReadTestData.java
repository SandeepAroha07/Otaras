package com.otaras.testautomation.common;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;




public class ReadTestData {
	
	 public void readTestDataJson(){
		 
		 if (ReadTestConfig.Get("TESTDATADB.NAME").contains("json")|ReadTestConfig.Get("TESTDATADB.NAME").contains("JSON"))
		 {
//	//*******************WORKING CODE - With booking datasheet **************************
//	//http://www.convertcsv.com/csv-to-json.htm
//	JsonReader jsonReader1 = new JsonReader(new FileReader("C:\\TestData\\JSON\\booking.json"));
//	//JsonReader jsonReader1 = new JsonReader(new FileReader("C:\\TestData\\JSON\\test.json"));  
//	jsonReader1.beginObject();
//
//	    while (jsonReader1.hasNext()) {
//
//	    String name1 = jsonReader1.nextName().trim();
//	    System.out.println(name1);
//	    if (name1.equals("Booking/Verification")) {
//	           //  readApp(jsonReader);
//	        	//jsonReader1.beginObject();
//	    	jsonReader1.beginArray();
//  		jsonReader1.beginObject();
//  		int i=1;
//	        	while (jsonReader1.hasNext()) {
//	        		System.out.println("OBJECT : "+i);
//	        		while  (jsonReader1.hasNext()) {
//	        			
//	        			String name = jsonReader1.nextName();
//	        			if (name!=null)
//	        				System.out.println(name);
//	        			jsonReader1.hasNext();
//	        			name = jsonReader1.nextString();
//	        			if (name!=null)
//	        				System.out.println(name);
//	        		}
//	        		jsonReader1.endObject();
//	        		jsonReader1.beginObject();
//	        		i=i+1;
//	        	}
//	        		
//	    }  
//	    
//	    }
//	  //*******************WORKING CODE **************************
		 }
}

	
	
	 public static ArrayList<String> readTestDataTableColumns(String sTabName) throws Exception{
		  
			ArrayList<String> arrayColumnName;
			String sFilename="";
			//String sTabName="login";
			File classpathRoot = new File(System.getProperty("user.dir"));
			//File app = new File(classpathRoot.getAbsolutePath()+"\\TestData\\", ReadTestConfig.Get("testData.Location"));
			 //  File app = new File(classpathRoot, "src\\test\\resources\\testConfig\\testConfig.properties");
			//File app = new File("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testData\\excel\\sampleprojectname_testdata.xls");
			   File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
			sFilename=app.toString();
			int TEST_SCENARIOS_COUNT;
			Connection connectionDB;
			Recordset recordsetTable;
			String strQuery="";
			Fillo fillo=new Fillo();
			connectionDB=fillo.getConnection(sFilename);
			System.out.println("File Location: "+sFilename);
			
			//strQuery="select login.columns from login";
			strQuery="Select "+""+sTabName+""+".columns from "+sTabName+"";
			
	
			recordsetTable=connectionDB.executeQuery(strQuery);
			arrayColumnName=recordsetTable.getFieldNames(); //returns array of column names - read column name and create hash map.
//			
//			for (int i = 0; i < arrayColumnName.size(); i++){
//		        System.out.println("Element at index " + i + " : "+ arrayColumnName.get(i)); 
//		        TestDataRec.TESTDATACOLUMNSMAP.put("ColumnName"+i, arrayColumnName.get(i).trim());
//			}
			
			return (arrayColumnName);
}

	 public static LinkedHashMap<String, String> mapTestDataTableColumns(ArrayList<String> arrayListTestDataColumns) throws Exception{ 
		 LinkedHashMap<String, String> tableColumnNames=new LinkedHashMap<>();
		for (int i = 0; i < arrayListTestDataColumns.size(); i++){
	        System.out.println("Element at index " + i + " : "+ arrayListTestDataColumns.get(i)); 
	        tableColumnNames.put("ColumnName"+i, arrayListTestDataColumns.get(i).trim());
		}
		return(tableColumnNames);
	 }
	 
	 
 
	 
	 
  public static Recordset readTestData(String sTabName) throws Exception{
	  
	  String testComplexity=ReadTestConfig.GetProperty("TEST.COMPLEXITY").toString();
	  String mvnParamComp = "";
	  mvnParamComp=System.getProperty("complexity");//System.getProperty("fileName");
      System.out.println("Reading Maven Command Line Argument [Complexity] : " + mvnParamComp);	
	  
      if(!(mvnParamComp==null))
	      if(!mvnParamComp.equalsIgnoreCase(""))
	    	  testComplexity=mvnParamComp;
	    	  
	  		
			String sFilename="";
			//String sTabName="login";
			File classpathRoot = new File(System.getProperty("user.dir"));
			//File app = new File(classpathRoot.getAbsolutePath()+"\\TestData\\", ReadTestConfig.Get("testData.Location"));
			//File app = new File("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testData\\excel\\sampleprojectname_testdata.xls");
			   File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
			sFilename=app.toString();
			//int TEST_SCENARIOS_COUNT;
			Connection connectionDB;
			Recordset recordsetTable;
			String strQuery="";
			Fillo fillo=new Fillo();
			connectionDB=fillo.getConnection(sFilename);
			System.out.println("File Location: "+sFilename);
			
			if (testComplexity.equalsIgnoreCase(""))
				strQuery="Select * from "+sTabName+" where testID<>'' and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";//  and testID in (select distinct testID from "+sTabName+")"; //GROUP BY testID
			else
			strQuery="Select * from "+sTabName+" where testID<>'' and TestComplexity='"+testComplexity+"'"+" and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";// and testID in (select distinct testID from "+sTabName+")"  ;//GROUP BY testID";
			//strQuery="Select * from objectrepository";
	
			recordsetTable=connectionDB.executeQuery(strQuery);
			//TestDataRec.TEST_SCENARIOS_COUNT=recordsetTable.getCount();
			return (recordsetTable);
  }
  
  
  public static Recordset readTestDataBySpecifiedColumnName(String sTabName, String sColumnName, String sColumnValue) throws Exception{
	  
		String testComplexity=ReadTestConfig.GetProperty("TEST.COMPLEXITY").toString();
		  String mvnParamComp = "";
		  mvnParamComp=System.getProperty("complexity");//System.getProperty("fileName");
	      System.out.println("Reading Maven Command Line Argument [Complexity] : " + mvnParamComp);	
		  
	      if(!(mvnParamComp==null))
		      if(!mvnParamComp.equalsIgnoreCase(""))
		    	  testComplexity=mvnParamComp;
		    	  
		
		String sFilename="";
		//String sTabName="login";
		File classpathRoot = new File(System.getProperty("user.dir"));
		//File app = new File(classpathRoot.getAbsolutePath()+"\\TestData\\", ReadTestConfig.Get("testData.Location"));
		//File app = new File("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testData\\excel\\sampleprojectname_testdata.xls");
		   File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
		sFilename=app.toString();
		//int TEST_SCENARIOS_COUNT;
		Connection connectionDB;
		Recordset recordsetTable;
		String strQuery="";
		Fillo fillo=new Fillo();
		connectionDB=fillo.getConnection(sFilename);
		System.out.println("File Location: "+sFilename);
		
		if (testComplexity.equalsIgnoreCase(""))
			strQuery="Select * from "+sTabName+" where "+ sColumnName +"='"+sColumnValue+"' and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";//  and testID in (select distinct testID from "+sTabName+")"; //GROUP BY testID
		else
		strQuery="Select * from "+sTabName+" where "+ sColumnName +"='"+sColumnValue+"' and TestComplexity='"+testComplexity+"'"+" and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";// and testID in (select distinct testID from "+sTabName+")"  ;//GROUP BY testID";
		//strQuery="Select * from objectrepository";

		recordsetTable=connectionDB.executeQuery(strQuery);
		//TestDataRec.TEST_SCENARIOS_COUNT=recordsetTable.getCount();
		return (recordsetTable);
}
  
  
  public static String readTestDataBySpecifiedColumnNameAndReturnSpecificCellValue(String sTabName, String sColumnName, String sColumnValue, String getColumnName) throws Exception{
	  
		String sreadTestDataBySpecifiedColumnNameAndReturnSpecificCellValue;
	  	String testComplexity=ReadTestConfig.GetProperty("TEST.COMPLEXITY").toString();
		String sFilename="";
		//String sTabName="login";
		File classpathRoot = new File(System.getProperty("user.dir"));
		//File app = new File(classpathRoot.getAbsolutePath()+"\\TestData\\", ReadTestConfig.Get("testData.Location"));
		//File app = new File("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testData\\excel\\sampleprojectname_testdata.xls");
		   File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
		sFilename=app.toString();
		//int TEST_SCENARIOS_COUNT;
		Connection connectionDB;
		Recordset recordsetTable;
		String strQuery="";
		Fillo fillo=new Fillo();
		connectionDB=fillo.getConnection(sFilename);
		System.out.println("File Location: "+sFilename);
		
		if (testComplexity.equalsIgnoreCase(""))
			strQuery="Select * from "+sTabName+" where "+ sColumnName +"='"+sColumnValue+"' and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";//  and testID in (select distinct testID from "+sTabName+")"; //GROUP BY testID
		else
		strQuery="Select * from "+sTabName+" where "+ sColumnName +"='"+sColumnValue+"' and TestComplexity='"+testComplexity+"'"+" and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";// and testID in (select distinct testID from "+sTabName+")"  ;//GROUP BY testID";
		//strQuery="Select * from objectrepository";

		recordsetTable=connectionDB.executeQuery(strQuery);
		//TestDataRec.TEST_SCENARIOS_COUNT=recordsetTable.getCount();
		recordsetTable.next();
		sreadTestDataBySpecifiedColumnNameAndReturnSpecificCellValue=recordsetTable.getField(getColumnName);
		return (sreadTestDataBySpecifiedColumnNameAndReturnSpecificCellValue);
}
  
  public static Recordset readMasterDataTestDataBySpecifiedColumnName(String sTabName, String sColumnName, String sColumnValue) throws Exception{
	  
		String testComplexity=ReadTestConfig.GetProperty("TEST.COMPLEXITY").toString();
		String sFilename="";
		//String sTabName="login";
		File classpathRoot = new File(System.getProperty("user.dir"));
		//File app = new File(classpathRoot.getAbsolutePath()+"\\TestData\\", ReadTestConfig.Get("testData.Location"));
		//File app = new File("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testData\\excel\\sampleprojectname_testdata.xls");
		   File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
		sFilename=app.toString();
		//int TEST_SCENARIOS_COUNT;
		Connection connectionDB;
		Recordset recordsetTable;
		String strQuery="";
		Fillo fillo=new Fillo();
		connectionDB=fillo.getConnection(sFilename);
		System.out.println("File Location: "+sFilename);
		
		//if (testComplexity.equalsIgnoreCase(""))
			strQuery="Select * from "+sTabName+" where "+ sColumnName +"='"+sColumnValue+"' GROUP BY testID";//  and testID in (select distinct testID from "+sTabName+")"; //GROUP BY testID
		//else
		//strQuery="Select * from "+sTabName+" where "+ sColumnName +"='"+sColumnValue+"' and TestComplexity='"+testComplexity+"'"+" and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";// and testID in (select distinct testID from "+sTabName+")"  ;//GROUP BY testID";
		//strQuery="Select * from objectrepository";

		recordsetTable=connectionDB.executeQuery(strQuery);
		//TestDataRec.TEST_SCENARIOS_COUNT=recordsetTable.getCount();
		return (recordsetTable);
}
  
  public HashMap<String, String> getMasterData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
  {
  	Recordset recordsetTestData;
  	ArrayList<String> arrayListTestDataColumns;
  	//ReadTestData xyz=new ReadTestData();
  	HashMap<String, String> tableColumnNames=new HashMap<>();
  	HashMap<String, String> mastertestdata=new HashMap<>();
  	
  	recordsetTestData=ReadTestData.readMasterDataTestDataBySpecifiedColumnName(sTabName, "key", sColumnValue);
  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns(sTabName);
  	tableColumnNames=ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
  	
 	 //Map<Object, Object> datamap = new HashMap<>();
  	
      	// for (int j = 0; j < lastCellNum; j++) {
      		 //datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
      			recordsetTestData.next();
      		    Set set = tableColumnNames.entrySet();
      		    Iterator iterator = set.iterator();
      		 while(iterator.hasNext()) {
      	         Map.Entry mentry = (Map.Entry)iterator.next();
      	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
      	         System.out.println(mentry.getValue());
      	         sColumnName=mentry.getValue().toString();
      	         
      	         try{
      	         if (!sColumnName.contains("COLUMN_"))
      	        	 System.out.print(recordsetTestData.getField(sColumnName));
      	         mastertestdata.put(sColumnName, recordsetTestData.getField(sColumnName).trim());
      	         }catch(Exception e){}
      	         
      	         
      		 }
      		 System.out.print("Master Test Data: "+mastertestdata);
      		return(mastertestdata); 
  }
  
  
  
  public static Recordset readTestData(String sTabName, String sTestID, String sTransactionID) throws Exception{
	  
		//String testComplexity=ReadTestConfig.GetProperty("TEST.COMPLEXITY").toString();
		String sFilename="";
		//String sTabName="login";
		File classpathRoot = new File(System.getProperty("user.dir"));
		//File app = new File(classpathRoot.getAbsolutePath()+"\\TestData\\", ReadTestConfig.Get("testData.Location"));
		//File app = new File("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testData\\excel\\sampleprojectname_testdata.xls");
		   File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
		sFilename=app.toString();
		//int TEST_SCENARIOS_COUNT;
		Connection connectionDB;
		Recordset recordsetTable;
		String strQuery="";
		Fillo fillo=new Fillo();
		connectionDB=fillo.getConnection(sFilename);
		System.out.println("File Location: "+sFilename);
		
//		if (!sTestID.equalsIgnoreCase(""))
//			strQuery="Select * from "+sTabName+" where testID='"+sTestID+"' and "+"testTransactionID='"+ sTransactionID +"' and TestType='Automated' and (TestInScope<> 'SKIP')";// GROUP BY testID";//  and testID in (select distinct testID from "+sTabName+")"; //GROUP BY testID
//		else
			strQuery="Select * from "+sTabName+" where testTransactionID='"+ sTransactionID +"' and TestType='Automated' and (TestInScope<> 'SKIP')";
		//	else
	//	strQuery="Select * from "+sTabName+" where testID<>'' and TestComplexity='"+testComplexity+"'"+" and TestType='Automated' and (TestInScope<> 'SKIP') GROUP BY testID";// and testID in (select distinct testID from "+sTabName+")"  ;//GROUP BY testID";
		//strQuery="Select * from objectrepository";

		recordsetTable=connectionDB.executeQuery(strQuery);
		//TestDataRec.TEST_SCENARIOS_COUNT=recordsetTable.getCount();
		return (recordsetTable);
}
  
  
  public static void mapTestData(Recordset recordsetTestData) throws Exception{
	  
		String sColumnName="";
		//TestDataRec.TESTDATAMAP=null;
		
		recordsetTestData.next();
	    Set set = TestDataRec.TESTDATACOLUMNSMAP.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	         sColumnName=mentry.getValue().toString();
	         
	         try{
	         System.out.print(recordsetTestData.getField(sColumnName));
	         TestDataRec.TESTDATAMAP.put(sColumnName, recordsetTestData.getField(sColumnName).trim());
	         }catch (Exception e){}
	      }
		
  }
  
  
  public static Object[][] mapAllTestData(Recordset recordsetTestData) throws Exception{
	  
		String sColumnName="";
		//TestDataRec.TESTDATAMAP=null;
		
	
	   
	         
	         //try{
	        
	         int lastCellNum = TestDataRec.TESTDATACOLUMNSMAP.size();
	         int lastRowNum=recordsetTestData.getCount();//TestDataRec.TEST_SCENARIOS_COUNT;
	         Object[][] obj = new Object[lastRowNum][1];
	         //recordsetTestData.moveFirst();
	         for (int i = 0; i < lastRowNum; i++) {
	        	 LinkedHashMap<Object, Object> datamap = new LinkedHashMap<>();
	        	// for (int j = 0; j < lastCellNum; j++) {
	        		 //datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
	        			recordsetTestData.next();
	        		    Set set = TestDataRec.TESTDATACOLUMNSMAP.entrySet();
	        		    Iterator iterator = set.iterator();
	        		 while(iterator.hasNext()) {
	        	         Map.Entry mentry = (Map.Entry)iterator.next();
	        	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	        	         System.out.println(mentry.getValue());
	        	         sColumnName=mentry.getValue().toString();
	        	         
	        	         try{
	        	         if (!sColumnName.contains("COLUMN_"))
	        	        	 System.out.print(recordsetTestData.getField(sColumnName));
	        	        	 datamap.put(sColumnName, recordsetTestData.getField(sColumnName).trim());
	        	         }catch(Exception e){}
	        	         
	        	         
	        		 }
        	         // Get TaxID > retrieve data from customerKeyData > add to transaction record
	        	// }
	        		 obj[i][0] = datamap;
	         }
	         
	         //}catch (Exception e){}
	         return obj;
  }
  
  public static Recordset readLoginTestData(String sTabName) throws Exception{
	  

	  
	  String testEnvironment=ReadTestConfig.GetProperty("TEST.ENVIRONMENT");
		String loginName=ReadTestConfig.GetProperty("TEST.USERLOGINNAME");
		String loginRole=ReadTestConfig.GetProperty("TEST.USERROLE");
		String sEnvironment=ReadTestConfig.GetProperty("TEST.ENVIRONMENT");
		String sFilename="";
		//String sTabName="login";
		File classpathRoot = new File(System.getProperty("user.dir"));
		//File app = new File(classpathRoot.getAbsolutePath()+"\\TestData\\", ReadTestConfig.Get("testData.Location"));
		//File app = new File("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testData\\excel\\sampleprojectname_testdata.xls");
		//File app = new File(classpathRoot.getAbsolutePath()+"\\src\\test\\resources\\testData\\excel\\", ReadTestConfig.Get("TESTDATADB.NAME"));
		File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testData//excel//", ReadTestConfig.Get("TESTDATADB.NAME"));
		
		
		sFilename=app.toString();
		int TEST_SCENARIOS_COUNT;
		Connection connectionDB;
		Recordset recordsetTable;
		String strQuery="";
		Fillo fillo=new Fillo();
		connectionDB=fillo.getConnection(sFilename);
		System.out.println("File Location: "+sFilename);
		
		//strQuery="Select * from "+sTabName+" where TestScriptID<>'' and TestComplexity='"+testComplexity+"'"+" and TestType='Automated' and (TestInScope<> 'SKIP')";
		if (sTabName.equalsIgnoreCase("login"))
			//strQuery="Select * from login";  //where userName=from config file
			strQuery="Select * from login where loginName='"+loginName+"'"+" and loginRole='"+loginRole+"'"+"";
		else if (sTabName.equalsIgnoreCase("environment"))
			//strQuery="Select * from environment"; //where testenvironment=from config file
			strQuery="Select * from environment where environment='"+sEnvironment+"'"+"";
		
		recordsetTable=connectionDB.executeQuery(strQuery);
		TEST_SCENARIOS_COUNT=recordsetTable.getCount();
		return (recordsetTable);
}
	 public static void mapLoginTestDataTableColumns(ArrayList<String> arrayListTestDataColumns) throws Exception{ 
		 
		 int j=TestDataRec.TESTDATALOGINCOLUMNSMAP.size();
		 if (j>0)
			 j=j+1;
		 int k=0;
		for (int i = j; i < arrayListTestDataColumns.size()+j; i++){
	        System.out.println("Element at index " + j + " : "+ arrayListTestDataColumns.get(k)); 
	        TestDataRec.TESTDATALOGINCOLUMNSMAP.put("ColumnName"+i, arrayListTestDataColumns.get(k).trim());
	        k=k+1;
		}
	 }
	 
	  public static void mapLoginTestData(Recordset recordsetTestData) throws Exception{
		  
			String sColumnName="";
				
			recordsetTestData.next();
		    Set set = TestDataRec.TESTDATALOGINCOLUMNSMAP.entrySet();
		    Iterator iterator = set.iterator();
		    while(iterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
		         System.out.println(mentry.getValue());
		         sColumnName=mentry.getValue().toString();
		         try{
		         if (recordsetTestData.getField(sColumnName)!=null){
		        	 System.out.print(recordsetTestData.getField(sColumnName));
		         	TestDataRec.TESTDATALOGINMAP.put(sColumnName, recordsetTestData.getField(sColumnName).trim());}
		         }catch (Exception e){}
		      }
			
	  }
	  
	  
	  public static void captureLoginEnvirnmentTestData() throws Exception{ 
//		  String fileName = System.getProperty("urla");//System.getProperty("fileName");
//	        System.out.println("Reading config file : - captureLoginEnvirnmentTestData" + fileName);
		ArrayList<String> arrayListTestDataColumns;
		Recordset recordsetTestData;
		arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("login");
		ReadTestData.mapLoginTestDataTableColumns(arrayListTestDataColumns);
		recordsetTestData=ReadTestData.readLoginTestData("login");
		ReadTestData.mapLoginTestData(recordsetTestData);
		
		arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("environment");
		ReadTestData.mapLoginTestDataTableColumns(arrayListTestDataColumns);
		recordsetTestData=ReadTestData.readLoginTestData("environment");
		ReadTestData.mapLoginTestData(recordsetTestData);
	  }
	  
	  
}
