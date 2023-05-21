package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.AdminInfo;

public class AdminLoginDao {
	ArrayList<AdminInfo> ds = new ArrayList<AdminInfo>();
	private String query;
    private PreparedStatement pst;
    private ResultSet rs;
	public AdminInfo loginAdmin(String name, String password) {
	        try {
	            ketnoi cs = new ketnoi();
	            cs.KetNoi();
	              query = "select * from AdminInfo where TenAdmin=? and password=?";
	                pst = cs.cn.prepareStatement(query);
	                AdminInfo u = null;
	                pst.setString(1, name);
	                pst.setString(2, password);
	                rs = pst.executeQuery();
	                if(rs.next()){
	                    long Id=rs.getLong("idAdmin");
	                    String nam=rs.getString("TenAdmin");
	                    String pass=rs.getString("password");
	                    u = new AdminInfo(Id, nam, pass);
	                }
	                rs.close();
	                cs.cn.close();
	                return u;
	        } catch (SQLException e) {
	            System.out.print(e.getMessage());return null;
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminLoginDao dao = new AdminLoginDao();
    	AdminInfo list = dao.loginAdmin("huu", "123");
    		System.out.print(list);
		
	}
}
