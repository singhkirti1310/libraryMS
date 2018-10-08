package dbManager;

import java.sql.PreparedStatement;

public class Tables 
{
	


	public void createTable() 
	 {
	      String myTable1 = "CREATE TABLE BOOKS (" 
	            + "bookId INT(64) NOT NULL AUTO_INCREMENT,"  
	            + "title VARCHAR(20)," 
	            + "author VARCHAR(20),"
	            + "primary key (bookId))";  
	        
	        String myTable2= "CREATE TABLE ENTITY ("
	        		+ "uId INT(64) NOT NULL AUTO_INCREMENT,"
	        		+ "uName VARCHAR(30),"
	        		+ "position VARCHAR(10),"
	        		+ "PRIMARY KEY (uId))";
	        
	        String myTable3= "CREATE TABLE BOOKDETAILS ("
	        		+ "bookId INT(64),"
	        		+ "bookCount INT(64),"
	        		+ "FOREIGN KEY (bookId) REFERENCES BOOKS(bookId))";
	        
	        String myTable4= "CREATE TABLE CREDENTIALS ("
	        		+ "uId INT(64) NOT NULL,"
	        		+ "userName VARCHAR(30),"
	        		+ "password VARCHAR(30),"
	        		+ "FOREIGN KEY (uId) REFERENCES ENTITY(uId))";
	        		
	        try {
		            MySqlCon.getSt().executeUpdate(myTable1);
		            System.out.println("Table Books Created");
	        	}
	        catch (Exception e ) 
	        {
	            System.out.println(e);
	        }
	            
	        try {
	        	MySqlCon.getSt().executeUpdate(myTable2);
		            System.out.println("Table Entity Created");
	        	}
	        catch (Exception e ) 
	        {
	            System.out.println(e);
	        }
	            
	        try {
	        	MySqlCon.getSt().executeUpdate(myTable3);
		            System.out.println("Table BookDetails Created");
	        	}
	        catch (Exception e ) 
	        {
	            System.out.println(e);
	        }
	            
	        try {
	        	MySqlCon.getSt().executeUpdate(myTable4);
		            System.out.println("Table Credentials Created");
	        	}
	        
	        catch (Exception e ) 
		        {
		            System.out.println(e);
		        }
	        
	    }
	
	 
}
