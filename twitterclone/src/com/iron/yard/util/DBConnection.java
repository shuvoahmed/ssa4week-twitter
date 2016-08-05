package com.iron.yard.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author Shuvo Ahmed
 *
 */
public class DBConnection {

	public static Connection conn = null;
	
	public Connection getConnection()
	{
		if(conn == null)
		{
			try
			{
				Class.forName("org.sqlite.JDBC");
				this.conn = DriverManager.getConnection("jdbc:sqlite:twitterClone.db");
			}
			catch(Exception e)
			{
				System.out.println( e.getClass().getName() + ": " + e.getMessage() );
		    }
		    System.out.println("Opened database successfully...");
		}
		return DBConnection.conn;
	}
}