package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.users;

public class dangnhapdao {
	ArrayList<users> ds = new ArrayList<users>();
	private String query;
    private PreparedStatement pst;
    private ResultSet rs;
	public users loginkUser(String name, String password) {
		 users tk = null;
	        try {
	            ketnoi cs = new ketnoi();
	            cs.KetNoi();
	              query = "select * from users where name=? and password=?";
	                pst = cs.cn.prepareStatement(query);
	                users u = null;
	                pst.setString(1, name);
	                pst.setString(2, password);
	                rs = pst.executeQuery();
	                if(rs.next()){
	                    tk = new users();
	                    long Id=rs.getLong("Id");
	                    String nam=rs.getString("name");
	                    String email=rs.getString("email");
	                    String pass=rs.getString("password");
	                    u = new users(Id, nam, email, pass);
	                    tk.setName("name");
	                    tk.setPassword("password");
	                }
	                rs.close();
	                cs.cn.close();
	                return u;
	        } catch (SQLException e) {
	            System.out.print(e.getMessage());return null;
	        }
	}
	
	public long getUser(String name, String password) {
		 users tk = null;
	        try {
	            ketnoi cs = new ketnoi();
	            cs.KetNoi();
	              query = "select Id from users where name=? and password=?";
	                pst = cs.cn.prepareStatement(query);
	                pst.setString(1, name);
	                pst.setString(2, password);
	                rs = pst.executeQuery();
	                long idu = 0;
	                if(rs.next()){
	                    long Id=rs.getLong("Id");
	                   
	                    idu = Id;
	                }
	                rs.close();
	                cs.cn.close();
	                return idu;
	        } catch (SQLException e) {
	            System.out.print(e.getMessage());
	        }
	        return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	dangnhapdao dao = new dangnhapdao();
    	long list = dao.getUser("trung", "123");
    
    		System.out.print(list);
		
	}
}
