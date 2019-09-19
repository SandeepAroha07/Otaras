package com.otaras.testautomation.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;

public class MongoDBUtil {

	public Document getDocument(String tbl_name,String col_name, String srch_string)
	{
//		tbl_name="tranagencydeals";
//		col_name = "dealIssueTranName";
//        srch_string = "TXDEAl44B027C08C8E11E8";
        Document document=null;
		MongoClient mongo = new MongoClient(new MongoClientURI(ReadTestConfig.Get("DB.URI")));
    	  MongoDatabase database = mongo.getDatabase(ReadTestConfig.Get("DB.NAME")); 
    	  MongoCollection<Document> collection = database.getCollection(tbl_name); 
    	
            BasicDBObject searchObject = new BasicDBObject();
              searchObject.put(col_name, srch_string);
              FindIterable<Document>  resultSubset = database.getCollection(tbl_name).find(searchObject);
            
              Iterator <Document> its = resultSubset.iterator();
              while(its.hasNext()){
              	
              	document = its.next();
              //	 Map<String, Object> map = new HashMap<>(document);
              	System.out.println("Attribute from document is "+document.get(col_name));
//            	  System.out.println(map);
//            	  System.out.println(map.get(col_name).toString());
              }
              mongo.close();
              return (document);
	}
	
	
	public Document getDocumentFromDB(String tbl_name,String col_name, String srch_string)
	{
		Document document=null;  
		
		  String mvnParamdburi = "";
		  mvnParamdburi=System.getProperty("dburi");
	      System.out.println("Reading Maven Command Line Argument : " + mvnParamdburi);

	      if(!(mvnParamdburi==null)){
	    	  if(mvnParamdburi.equalsIgnoreCase(""))
	    		  mvnParamdburi=ReadTestConfig.Get("DB.URI");
	    	  }
	    	else
	    		mvnParamdburi=ReadTestConfig.Get("DB.URI");
	      
	      
		  String mvnParamdbname = "";
		  mvnParamdbname=System.getProperty("dbname");
	      System.out.println("Reading Maven Command Line Argument : " + mvnParamdbname);

	      if(!(mvnParamdbname==null)){
	    	  if(mvnParamdbname.equalsIgnoreCase(""))
	    		  mvnParamdbname=ReadTestConfig.Get("DB.NAME");
	    	  }
	    	else
	    		mvnParamdbname=ReadTestConfig.Get("DB.NAME");
	      
		
		//####################################################MongoClientURI uri = new MongoClientURI(ReadTestConfig.Get("DB.URI"));
	      //MongoClientURI uri;
	      //if (System.getProperty("dburi")!=null)
		//uri = new MongoClientURI(System.getProperty("dburi"));
	    	  MongoClientURI uri = new MongoClientURI(mvnParamdburi);
	     // else
	    	 // uri = new MongoClientURI(ReadTestConfig.Get("DB.URI"));
	      //uri = new MongoClientURI(ReadTestConfig.Get("DB.URI"));

          MongoClient mongoClient = new MongoClient(uri);
//          adminDB = mongoClient.getDatabase("admin");
//          adminCollection = adminDB.getCollection(adminCol);
        //####################################################MongoDatabase database = mongoClient.getDatabase(ReadTestConfig.Get("DB.NAME")); 
//          MongoDatabase database;
//          if (System.getProperty("dbname")!=null)
//          //database = mongoClient.getDatabase(System.getProperty("dbname"));
//          database = mongoClient.getDatabase(System.getProperty("dbname"));
//          else
        	  MongoDatabase database = mongoClient.getDatabase(mvnParamdbname);
          //database = mongoClient.getDatabase(ReadTestConfig.Get("DB.NAME"));
          
    	  MongoCollection<Document> collection = database.getCollection(tbl_name); 
    	
            BasicDBObject searchObject = new BasicDBObject();
              searchObject.put(col_name, srch_string);
              FindIterable<Document>  resultSubset = database.getCollection(tbl_name).find(searchObject);
            
              Iterator <Document> its = resultSubset.iterator();
              while(its.hasNext()){
              	
              	document= its.next();
              //	 Map<String, Object> map = new HashMap<>(document);
              	System.out.println("Attribute from document is "+document.get(col_name));
//            	  System.out.println(map);
//            	  System.out.println(map.get(col_name).toString());
              }
              mongoClient.close();
              return (document);
	}
	
	
//	public Document getDocumentListFromDB(String tbl_name,String col_name, String srch_string)
//	{
//		Document document=null;  
//		MongoClientURI uri = new MongoClientURI(ReadTestConfig.Get("DB.URI"));
//
//          MongoClient mongoClient = new MongoClient(uri);
////          adminDB = mongoClient.getDatabase("admin");
////          adminCollection = adminDB.getCollection(adminCol);
//          MongoDatabase database = mongoClient.getDatabase(ReadTestConfig.Get("DB.NAME")); 
//    	  MongoCollection<Document> collection = database.getCollection(tbl_name); 
//    	
//            BasicDBObject searchObject = new BasicDBObject();
//            List<BasicDBObject> ob = new ArrayList<BasicDBObject>();
//            ob.add(new BasicDBObject(col_name, "Expired"));
//            List<BasicDBObject> foundDocument =   database.find(query)into(new ArrayList<BasicDBObject>());
//              searchObject.put(col_name, srch_string);
//              FindIterable<Document>  resultSubset = database.getCollection(tbl_name).find(searchObject);
//              FindIterable<Document> iterable = collection.find(Document.parse("{\"status.name\": \"Expired\"}"));
//            
//              Iterator <Document> its = resultSubset.iterator();
//              while(its.hasNext()){
//              	
//              	document= its.next();
//              //	 Map<String, Object> map = new HashMap<>(document);
//              	System.out.println("Attribute from document is "+document.get(col_name));
////            	  System.out.println(map);
////            	  System.out.println(map.get(col_name).toString());
//              }
//              mongoClient.close();
//              return (document);
//	}
	
	
	public Document getDocumentObject(String tbl_name,String col_name, String srch_objID)
	{
		   Document document=null;
			MongoClient mongo = new MongoClient(new MongoClientURI(ReadTestConfig.Get("DB.URI")));
	    	  MongoDatabase database = mongo.getDatabase(ReadTestConfig.Get("DB.NAME")); 
	    	  MongoCollection<Document> collection = database.getCollection(tbl_name); 
	    	
	    	  
	    	  BasicDBObject searchObject=new BasicDBObject();
	    	  //ObjectId id=new ObjectId();
	    	  searchObject.put(col_name,new ObjectId(srch_objID));
	    	  FindIterable<Document>  resultSubset = database.getCollection(tbl_name).find(searchObject);
	    	  Iterator <Document> its = resultSubset.iterator();
	    	    while(its.hasNext()){
	              	
	              	document = its.next();
	              //	 Map<String, Object> map = new HashMap<>(document);
	              	System.out.println("Attribute from document is "+document.get(col_name));
//	            	  System.out.println(map);
//	            	  System.out.println(map.get(col_name).toString());
	              }
	              mongo.close();
	              return (document);
	              
	    	  
//	    	  //FindIterable<Document> cursor = collection.find(mongo1);
//	    	  
////	    	  Object id;
////	    	  BasicDBObject query=new BasicDBObject();
////	    	    ObjectId oid=ObjectId.massageToObjectId(id);
////	    	    query.put("_id","5b68917b716ea31ccc9d9cbf");
//	    	  ObjectId oid=ObjectId.massageToObjectId(id);
//	    	  
//	    	  	ObjectId allQuery = new ObjectId();
//	    	  	allQuery..put("_id","5b68917b716ea31ccc9d9cbf");
//	            BasicDBObject searchObject = new BasicDBObject();
//	            
//	            FindIterable<Document> cursor = collection.find(searchObject);
//	            
////	              searchObject.put(col_name, srch_objID);
////	              //FindIterable<Document>  resultSubset = database.getCollection(tbl_name).find(searchObject);
////	              FindIterable<Document>  resultSubset = database.getCollection(tbl_name).find(eq());
////	              //database.getCollection("entityusers").find({"_id":ObjectId("5b68917b716ea31ccc9d9cbf")});
//	              Iterator <Document> its = cursor.iterator();
//	              while(its.hasNext()){
//	              	
//	              	document = its.next();
//	              //	 Map<String, Object> map = new HashMap<>(document);
//	              	System.out.println("Attribute from document is "+document.get(col_name));
////	            	  System.out.println(map);
////	            	  System.out.println(map.get(col_name).toString());
//	              }
//	              mongo.close();
//	              return (document);
	}
	
	 // Fetching all documents from the mongo collection.
    //https://examples.javacodegeeks.com/software-development/mongodb/java-mongodb-query-document-example/
	public void getAllDocuments(MongoCollection<Document> col) {
		System.out.println("Fetching all documents from the collection");

		// Performing a read operation on the collection.
		FindIterable<Document> fi = col.find();
		MongoCursor<Document> cursor = fi.iterator();
		try {
			while(cursor.hasNext()) {
				System.out.println(cursor.next().toJson());
			}
		} finally {
			cursor.close();
		}
	}

	// Fetch a selective document from the mongo collection.
	//String return_Column
	public void getSelectiveDocument(MongoCollection<Document> col, String col_name, String srch_string) {
		System.out.println("Fetching a particular document from the collection");
		//   whereQuery.put("dealIssueTranName", "TXDEAl44B027C08C8E11E8");
		// Performing a read operation on the collection.
		
		FindIterable<Document> fi = col.find(Filters.eq(col_name, srch_string));		
		MongoCursor<Document> cursor = fi.iterator();
		try {
			while(cursor.hasNext()) {
				System.out.println(cursor.next().toJson());
				//System.out.println(col.get);
			}
//			BasicDBObject searchQuery = new BasicDBObject();
//			searchQuery.put(col_name, srch_string);
//			 cursor = col.find(searchQuery); 
            //DBCollection collection1 = (DBCollection) database.getCollection("tranagencydeals");
			System.out.println();
			//DB db = serverConnection.getDB(DATABASE_NAME);
			//return db.getCollection(COLLECTION_NAME);
			//return_Column
		} finally {
			cursor.close();
		}
	}

	//>>>>>>>> just uncomment below code - working code copied here from driver script
//	private Document getDocument(String tbl_name,String col_name, String srch_string)
//	{
////		tbl_name="tranagencydeals";
////		col_name = "dealIssueTranName";
////        srch_string = "TXDEAl44B027C08C8E11E8";
//        Document document=null;
//		MongoClient mongo = new MongoClient(new MongoClientURI(ReadTestConfig.Get("DB.URI")));
//    	  MongoDatabase database = mongo.getDatabase(ReadTestConfig.Get("DB.NAME")); 
//    	  MongoCollection<Document> collection = database.getCollection(tbl_name); 
//    	
//            BasicDBObject searchObject = new BasicDBObject();
//              searchObject.put(col_name, srch_string);
//              FindIterable<Document>  resultSubset = database.getCollection(tbl_name).find(searchObject);
//            
//              Iterator <Document> its = resultSubset.iterator();
//              while(its.hasNext()){
//              	
//              	document = its.next();
//              //	 Map<String, Object> map = new HashMap<>(document);
//              	System.out.println("Attribute from document is "+document.get(col_name));
////            	  System.out.println(map);
////            	  System.out.println(map.get(col_name).toString());
//              }
//              mongo.close();
//              return (document);
//	}
	
	
//	  
////	// Creating a Mongo client 
//	//MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://admin:admin123@ds115931.mlab.com:15931/munivisorqa1"));
//  MongoClient mongo = new MongoClient(new MongoClientURI(ReadTestConfig.Get("DB.URI")));
//  
//  
//////    // Creating Credentials 
////    MongoCredential credential; 
////    credential = MongoCredential.createCredential("admin", "munivisorqa1", 
////       "admin123".toCharArray()); 
////    System.out.println("Connected to the database successfully");  
//
//    // Accessing the database DB.NAME
//    MongoDatabase database = mongo.getDatabase(ReadTestConfig.Get("DB.NAME")); 
////	            System.out.println("Credentials ::"+ credential);   
//    	            
//// // Retieving a collection
//    MongoCollection<Document> collection = database.getCollection("tranagencydeals"); 
//    //BasicDBObject whereQuery = new BasicDBObject();
//    //whereQuery.put("dealIssueTranName", "TXDEAl44B027C08C8E11E8");
//    //DBCursor cursor = Collection.find(whereQuery); 
//    //DBCollection collection1 = (DBCollection) database.getCollection("tranagencydeals");
//    
// // Fetching all the documents from the mongodb.
//    getAllDocuments(collection);
// // Fetching a single document from the mongodb based on a search_string.
////    String col_name = "dealIssueTranName";
////    String srch_string = "TXDEAl44B027C08C8E11E8";
//  getSelectiveDocument(collection,col_name,srch_string);
//
//  BasicDBObject searchObject = new BasicDBObject();
//  searchObject.put("dealIssueTranName", "TXDEAl44B027C08C8E11E8");
//  FindIterable<Document>  resultSubset = database.getCollection("tranagencydeals").find(searchObject);
//
//  Iterator <Document> its = resultSubset.iterator();
//  while(its.hasNext()){
//  	
//  	Document document = its.next();
//  	 Map<String, Object> map = new HashMap<>(document);
//  	System.out.println("Attribute from document is "+document.get("dealIssueTranName"));
//	  System.out.println(map);
//	  System.out.println(map.get("dealIssueTranName").toString());
////  	String json = com.mongodb.util.JSON.serialize(its.next());
////  	System.out.println("JSON serialized Document: " + json);
//  	
////  	MongoCollection<Document> table = database.getCollection(its.next());
////  	 for (Document doc: table.find()) {  
////         System.out.println(doc.toJson());
////     }
//  }
//  mongo.close();
//  
//
//  //resultSubset = lotusCollection.find(searchObject,fieldObject);
//  
//  
////    DBCursor cursor = collection1.find(whereQuery);
////    while (cursor.hasNext()) {
////    	  //do something with cursor.next();
////    	}
////    System.out.println("Collection myCollection selected successfully"); 
//    
//// // Getting the iterable object 
//    FindIterable<Document> iterDoc = collection.find(); 
//    int i = 1; 
////    // Getting the iterator 
//    Iterator it = iterDoc.iterator(); 
//  
//    while (it.hasNext()) {  
//       System.out.println(it.next());  
//    i++; 
//    }
//// // UNCOMMENT ABOVE - DB VALIDATION
	
}
