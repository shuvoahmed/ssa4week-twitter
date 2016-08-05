package com.iron.yard.util;

import java.sql.Connection;
import java.sql.Statement;

/**
 * 
 * @author Shuvo Ahmed
 *
 */
public class PopulateTables
{
	public void start()
	{
		DBConnection dbConn = new DBConnection();
	    Connection conn = dbConn.getConnection();
	    Statement stmt = null;
	    try
	    {
	    	conn.setAutoCommit(false);
	    	stmt = conn.createStatement();
	    	String insertUserSql = "INSERT INTO USER (USERID,NAME,PASSWORD) " +
	    				 			"VALUES ('shuvo', 'Shuvo Ahmed',   'shuvopassword')," +
	    				 				   "('abu',   'Abu Moinuddin', 'abupassword');"; 
	    	stmt.executeUpdate(insertUserSql);
	    	
	    	String insertFollowerSql = "INSERT INTO FOLLOWER (USERID,FOLLOWERID) " +
	   				                   "VALUES ('shuvo', 'abu');"; 
	    	stmt.executeUpdate(insertFollowerSql);

	    	String insertTweetsSql = "INSERT INTO TWEETS (USERID,TWEET,DATE) " +
   				 					 "VALUES ('shuvo', 'Tweet by Shuvo', 			'2016-08-05 12:45:00'), " +
   				 					 		"('abu',   'Tweet by Abu',   			'2016-08-05 12:46:00'), " +
   				 					 		"('shuvo', 'Another Tweet by Shuvo',    '2016-08-05 12:47:00');"; 
	    	stmt.executeUpdate(insertTweetsSql);
	    	
	    	
	    	stmt.close();
	    	conn.commit();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    System.out.println("Records created successfully");
	}
}