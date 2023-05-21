package dao;

import java.sql.PreparedStatement;

import bean.users;

public class dangkydao {
	  users dk=new users();
	  public int Them(String name, String email, String password) throws Exception{
	    ketnoi kn=new ketnoi();
	    kn.KetNoi();
	    //b1: tao cau lenh sql
	     String sql="insert into users(name, email, password) values (?,?,?)";
	     //B2: Tao ra cau lenh: Preparestatement de thuc thi cau lenh sql
	        PreparedStatement cmd= kn.cn.prepareStatement(sql);
	        //theo thứ tự
	      cmd.setString(1, name);
	      cmd.setString(2, email);
	      cmd.setString(3, password);
	      return cmd.executeUpdate();
	  }
}
