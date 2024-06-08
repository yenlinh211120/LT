package ConnetDB;

import java.sql.Connection;
import java.sql.DriverManager;


public class connectDB {
	public static Connection con=null;
	public static connectDB instance=new connectDB();
	public static connectDB getInstance() {
			return instance;				
			}
	
	public static Connection getconnection() {
		return con;
	}
	public static void connect(){
		String url="jdbc:sqlserver://localhost:1433;databasename=QLNV";
		String user="sa";
		String pwd="1";
		try {
			con=DriverManager.getConnection(url,user,pwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	public static void disconnect() {
		if(con!=null) {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
