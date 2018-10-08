package dbManager;

import java.sql.PreparedStatement;


public class InsertData 
{
	private PreparedStatement pst;
	
	public void insert()
	{
		String query= "INSERT INTO BOOKS (bookId,title,author)"
				 + " VALUES (?,?,?)";
		try 
		{
		 
			pst=MySqlCon.getCon().prepareStatement(query);
			pst.setInt(1,1);
			pst.setString(2,"Harry Potter");
			pst.setString(3,"J.K Rowling");
			pst.executeUpdate();
			pst.setInt(1,2);
			pst.setString(2,"Julius Ceaser");
			pst.setString(3,"Willian Shakespeare");
			pst.executeUpdate();
			
			pst.setInt(1,3);
			pst.setString(2,"Ramayana");
			pst.setString(3,"Valimiki");
			pst.executeUpdate();
			
			System.out.println("Data has been inserted in table Books");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
