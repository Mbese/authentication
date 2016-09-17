package org.standardbank.backend.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.standardbank.backend.model.LoginDetails;


import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.WriteResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.util.Arrays;

public class LoginDetailsService {
	
	public List<LoginDetails> getLoginDetails(){
		LoginDetails details = new LoginDetails("username1", "password1","a23456", "Grad","Njabulo","Khuzwayo","lungelomelusi@gmail.com");
		LoginDetails details2 = new LoginDetails("username2", "password2","c12345", "Manager", "Sikhuselo","Neno","e.s.neno@gmail.com");
		
		List<LoginDetails> detailsList = new ArrayList<>();
		detailsList.add(details);
		detailsList.add(details2);
		
//................................Database connection here.....................................
	
		try{
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			// Now connect to your databases
			DB db = mongoClient.getDB( "local" );
			System.out.println("Connect to database successfully");

			DBCollection coll = db.getCollection("mycol");
			System.out.println("Collection mycol selected successfully");
			
			BasicDBObject doc = new BasicDBObject("title", "MongoDB").
					append("description", "database").
					append("likes", 100).
					append("url", "http://www.tutorialspoint.com/mongodb/").
					append("by", "tutorials point");
					coll.insert(doc);
					System.out.println("Document inserted successfully");
			
		}
		catch(Exception e){
			
			System.err.println("ERROR MESSAGE ->"+ e.getClass().getName() + ": " + e.getMessage()+" caused by " +e.getCause());
			e.printStackTrace();
		}
					
		return detailsList;
		
	}

}
