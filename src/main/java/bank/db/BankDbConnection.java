package bank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankDbConnection {
	
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:XE";
	private static String userName="System";
	private static String password="123456789";
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//load driver
		
	}
	
	public static Connection getDbConnection() {
		Connection con=null;	
		try {
			con=DriverManager.getConnection(url,userName,password);//conection to DB
			System.out.println("connection ");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}


}
