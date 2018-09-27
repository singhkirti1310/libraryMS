package libraryManage;

public class Main 
{
	//this is comment
	public static void main(String args[])
	{
		MySqlCon msc=new MySqlCon();
		msc.dbCon();
		msc.createDb();
		//msc.createDatabase();
		msc.createTable1();
	}
}
