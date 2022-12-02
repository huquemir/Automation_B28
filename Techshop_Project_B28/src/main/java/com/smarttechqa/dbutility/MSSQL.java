package com.smarttechqa.dbutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MSSQL {
	
	static String username = "smarttechqa_SQLLogin_1";
	static String password = "9ryk2qzaeu";
	static String connection = "jdbc:sqlserver://techshop.mssql.somee.com:1433;DatabaseName=techshop";
	//static String oracle = "jdbc:oracle:thin:@servername:1521/databaseName";
	static String query = "select * from products";
	
	
	//How to connect to your database using automation?
	
	public static void getDataTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //Which type of server we are going to connect
		//Next we need to open a connection the the database. You have use the 
		//Connection interface and the DriverManager Class with the getConnection 
		//method. In the method, we have to pass the username, password, and the 
		//jdbc connection string with the server. It will be given by the developer
		Connection connect = DriverManager.getConnection(connection, username, password);
		//Then I use the Statement Interface and use the connect reference variable and the
		//createStatement Method. 
		Statement statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		//Then I use the Resultset object to store the statement query using the
		//executeQuery Method. 
		ResultSet result = statement.executeQuery(query);
		
		while(result.next()) {
		System.out.println(result.getString(2));
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MSSQL.getDataTable();
	}

}
