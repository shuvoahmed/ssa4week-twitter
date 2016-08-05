package com.iron.yard.util;

import java.sql.Connection;
import java.sql.Statement;

/**
 * 
 * @author Shuvo Ahmed
 *
 */
public class CreateTables
{
  public void start()
  {
    DBConnection dbConn = new DBConnection();
    Connection conn = dbConn.getConnection();
    Statement stmt = null;
    
    try
    {
    	stmt = conn.createStatement();
    	
    	String dropUserTableSql = "DROP TABLE USER";
    	String dropTweetsTableSql = "DROP TABLE TWEETS";
    	String dropFollowerTableSql = "DROP TABLE FOLLOWER";
    	
    	stmt.executeUpdate(dropUserTableSql);
    	stmt.executeUpdate(dropTweetsTableSql);
    	stmt.executeUpdate(dropFollowerTableSql);
    	
    	String createUserTableSql = "CREATE TABLE USER " +
                   "(USERID 		CHAR(25)	PRIMARY KEY     NOT NULL," +
                   " NAME           CHAR(50)    				NOT NULL, " + 
                   " PASSWORD		CHAR(50)					NOT NULL)"; 

    	String createTweetsTableSql = "CREATE TABLE TWEETS " +
                "(USERID 		CHAR(25)	NOT NULL," +
                " TWEET         CHAR(140)   NOT NULL, " + 
                " DATE			TEXT		NOT NULL)"; 

    	String createFollowerTableSql = "CREATE TABLE FOLLOWER " +
                "(USERID 		CHAR(25)	NOT NULL," +
                " FOLLOWERID    CHAR(140)   NOT NULL)"; 
    	
    	
    	stmt.executeUpdate(createUserTableSql);
    	stmt.executeUpdate(createTweetsTableSql);
    	stmt.executeUpdate(createFollowerTableSql);
    	
    	stmt.close();
    }
    catch(Exception e)
    {
      System.out.println( e.getClass().getName() + ": " + e.getMessage() );
    }
    System.out.println("Tables created successfully");
  }
}