package libraryManage;

public class Main 
{
	//this is comment
	public static void main(String args[])
	{
		
		MySqlCon.getInstance().dbCon();
		MySqlCon.getInstance().createDb();
		MySqlCon.getInstance().createTable1();
	}
}
