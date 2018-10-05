package libraryManage;

import dbManager.MySqlCon;
import dbManager.Tables;
import dbManager.InsertData;

public class Main 
{
	//this is comment
	public static void main(String args[])
	{
		
		MySqlCon.getInstance().dbCon();
		MySqlCon.getInstance().createDb();
		Tables tb=new Tables();
		tb.createTable();
		InsertData insert=new InsertData();
		insert.data();
		
		
	}
}
