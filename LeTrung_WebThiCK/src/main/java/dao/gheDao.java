package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import bean.Ghe;
import bean.Phong;

public class gheDao {
	private PreparedStatement pst;
    private ResultSet rs;
    // Lay ma ghe trong viewchonghe
    public ArrayList<String> getGhe(String ThoiGianChieu, String NgayChieu, long idPhim, long idChiNhanh, long idPhong) {
    	ArrayList<String> list = new ArrayList<String>();
    	
	      LocalDate date = LocalDate.parse(NgayChieu, DateTimeFormatter.ISO_DATE);
	      java.sql.Date da = java.sql.Date.valueOf(date);

    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select DISTINCT maGhe from ViewChonGhe where ThoiGianChieu=? and NgayChieu=? and idphim=? and idChiNhanh=? and idPhong=?";
	          pst = cs.cn.prepareStatement(sql);
	          pst.setString(1, ThoiGianChieu);
	          pst.setDate(2, da);
	          pst.setLong(3, idPhim);
	          pst.setLong(4, idChiNhanh);
	          pst.setLong(5, idPhong);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  list.add(rs.getString("maGhe"));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	}catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    }
    
    public ArrayList<String> getAllGhe() {
    	ArrayList<String> list = new ArrayList<String>();
    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select maGhe from ghe";
	          pst = cs.cn.prepareStatement(sql);
	          
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  list.add(rs.getString("maGhe"));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	}catch (Exception e) {
    		e.printStackTrace();
    		return null;
    	}

    }
    
    public static void main(String[] args){	
		gheDao d = new gheDao();
	      
		ArrayList<String> list = d.getGhe("18:00","2022-12-19", 1, 1,1);
		ArrayList<String> list1 = d.getAllGhe();
		System.out.println(list1.get(1));
    		System.out.println(list1.contains(list));
    		System.out.println(list.get(1));
    		System.out.println(list.contains("A1"));
	  }
}
