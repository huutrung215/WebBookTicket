package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoi {
	public Connection cn = null;
	public void KetNoi() {
    	try {
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	System.out.print("Xong b1");
    		String url="jdbc:sqlserver://DESKTOP-D4AQUL2:1433;databaseName=webdatvephim;user=sa;password=1234";
    		cn=DriverManager.getConnection(url);
        	System.out.print("Xong b2");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ketnoi kn = new ketnoi();
		kn.KetNoi();
	}
}
