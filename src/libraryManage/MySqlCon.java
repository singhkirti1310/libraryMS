package libraryManage;

import java.sql.*;

public class MySqlCon 
{
	private String jdbcDriver ="com.mysql.jdbc.Driver";
	private String dbUrl= "jdbc:mysql://localhost:3306/";
	private String dbName= "library";
	private String uname="root";
	private String pass="";
	 private String userPass = "?user=root&password=";
	
	private Connection con;
	private Statement st; 
	
	public void dbCon()
	{
		try
		{
		Class.forName(jdbcDriver);
		Connection con=DriverManager.getConnection(dbUrl+dbName, uname, pass);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void createDb()
	{
		try
		{
			Class.forName(jdbcDriver);
			Connection con=DriverManager.getConnection(dbUrl + userPass);
			Statement st=con.createStatement();
			int result=st.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	 public void createTable1() 
	 {
	        String myTableName = "CREATE TABLE AgentDetail (" 
	            + "idNo INT(64) NOT NULL AUTO_INCREMENT,"  
	            + "initials VARCHAR(2)," 
	            + "agentDate DATE,"  
	            + "agentCount INT(64),"
	            + "primary key (idNo))";  
	        try {
	            Class.forName(jdbcDriver);
	            con = DriverManager.getConnection(dbUrl + dbName, uname, pass);
	            st = con.createStatement();
	            //The next line has the issue
	            st.executeUpdate(myTableName);
	            System.out.println("Table Created");
	        }
	        catch (SQLException e ) {
	            System.out.println("An error has occurred on Table Creation");
	        }
	        catch (ClassNotFoundException e) {
	            System.out.println("An Mysql drivers were not found");
	        }
	    }
	
	
}
