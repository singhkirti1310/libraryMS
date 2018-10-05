package dbManager;

public class InsertData 
{

	public void data()
	 {
		 String insertBooks= "INSERT INTO BOOKS"
				 + " VALUES (1, 'Harry Potter','J.K Rowling')";
			
		 try 
			{	
			 	MySqlCon.getSt().executeUpdate(insertBooks);
			 	System.out.println("Data has been inserted in table Books");
			}
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 
	 }
}
