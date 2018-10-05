package dbManager;

import java.sql.*;


public class MySqlCon 
{
	private String jdbcDriver ="com.mysql.jdbc.Driver";
	private String dbUrl= "jdbc:mysql://localhost:3306/";
	private String dbName= "library";
	private String uname="root";
	private String pass="";
	private String userPass = "?user=root&password=";
	
	private static Connection con; //static connection object
	private static Statement st; // static Statement object
	
	private static MySqlCon object; // static object of class type
	
	private void MySqlCon()
	{
		
	}
	
	//Getter statement
	public static Statement getSt() 
	{
		return st;
	}

	//Setter statement
	public static void setSt(Statement st) 
	{
		MySqlCon.st = st;
	}
	
	
	//Establishing Connection
	public void dbCon()
	{
		try
		{
		Class.forName(jdbcDriver);
		con=DriverManager.getConnection(dbUrl+dbName, uname, pass);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	//Creating Database
	public void createDb()
	{
		try
		{
			setSt(getCon().createStatement());
			int result=getSt().executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName); // why int?
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	 
	 public static MySqlCon getInstance()
	 {
		 if (object == null)
		 {
			 object = new MySqlCon();
		 }
		 return object;
	 }

	public static Connection getCon() {
		return con;
	}


	
	
}
