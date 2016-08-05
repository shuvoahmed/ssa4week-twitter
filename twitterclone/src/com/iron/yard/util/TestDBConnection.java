package com.iron.yard.util;

/**
 * 
 * @author Shuvo Ahmed
 *
 */
public class TestDBConnection {

	public static void main(String[] args) {
		DBConnection twitterConnection = new DBConnection();
		twitterConnection.getConnection();
	}
}