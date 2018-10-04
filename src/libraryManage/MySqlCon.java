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
	
	private Connection con; //connection object
	private Statement st; // Statement object
	
	private static MySqlCon object;
	
	private void MySqlCon()
	{
		
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
			Class.forName(jdbcDriver);
			con=DriverManager.getConnection(dbUrl + userPass);
			st=con.createStatement();
			int result=st.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	//Creating Table
	 public void createTable1() 
	 {
	       /*String myTable1 = "CREATE TABLE BOOKS (" 
	            + "bookId INT(64) NOT NULL AUTO_INCREMENT,"  
	            + "title VARCHAR(20)," 
	            + "author VARCHAR(20),"
	            + "primary key (bookId))";  
	        
	        String myTable2= "CREATE TABLE ENTITY ("
	        		+ "uId INT(64) NOT NULL AUTO_INCREMENT,"
	        		+ "uName VARCHAR(30),"
	        		+ "position VARCHAR(10),"
	        		+ "PRIMARY KEY (uId))";*/
	        
	       /* String myTable3= "CREATE TABLE BOOKDETAILS ("
	        		+ "bookId INT(64),"
	        		+ "bookCount INT(64),"
	        		+ "FOREIGN KEY (bookId) REFERENCES BOOKS(bookId))";*/
	        
	        String myTable4= "CREATE TABLE CREDENTIALS ("
	        		+ "uId INT(64) NOT NULL,"
	        		+ "userName VARCHAR(30),"
	        		+ "password VARCHAR(30),"
	        		+ "FOREIGN KEY (uId) REFERENCES ENTITY(uId))";
	        		
	        		
	        
	        try {
	            Class.forName(jdbcDriver);
	            con = DriverManager.getConnection(dbUrl + dbName, uname, pass);
	            st = con.createStatement();
	            //The next line has the issue
	            /*st.executeUpdate(myTable1);
	            System.out.println("Table Books Created");
	            
	            st.executeUpdate(myTable2);
	            System.out.println("Table Entity Created");
	            */
	            /*st.executeUpdate(myTable3);
	            System.out.println("Table BookDetails Created");*/
	            
	            st.executeUpdate(myTable4);
	            System.out.println("Table Credentials Created");
	        }
	        catch (Exception e ) {
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
	
	
}
