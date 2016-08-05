package com.iron.yard.util;

/**
 * 
 * @author Shuvo Ahmed
 *
 */
public class SetupDB {

	public static void main(String[] args) {
		
		CreateTables ct = new CreateTables();
		ct.start();
		
		PopulateTables pt = new PopulateTables();
		pt.start();
	}
}
