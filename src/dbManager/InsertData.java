package dbManager;

import java.sql.PreparedStatement;


public class InsertData 
{
	private PreparedStatement pst;

	public void insert()
	{
		String query= "INSERT INTO BOOKS"
				 + " VALUES (1, ?,?)";
		try 
		{
		 
			pst=MySqlCon.getCon().prepareStatement(query);
			pst.setString(2, "kirti");
			System.out.println("Data has been inserted in table Books");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
