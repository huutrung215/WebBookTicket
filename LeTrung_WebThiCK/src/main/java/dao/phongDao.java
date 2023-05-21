package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;

import bean.Phong;

public class phongDao {
	private PreparedStatement pst;
    private ResultSet rs;
	public ArrayList<Phong> getPhong(String ThoiGianChieu, String NgayChieu, long idphim, long ChiNhanh) {
    	ArrayList<Phong> list = new ArrayList<Phong>();
    	
	      LocalDate date = LocalDate.parse(NgayChieu, DateTimeFormatter.ISO_DATE);
	      java.sql.Date da = java.sql.Date.valueOf(date);

    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select * from ViewChonPhong where ThoiGianChieu=? and NgayChieu=? and idphim=? and chiNhanh=?";
	          pst = cs.cn.prepareStatement(sql);
	          pst.setString(1, ThoiGianChieu);
	          pst.setDate(2, da);
	          pst.setLong(3, idphim);
	          pst.setLong(4, ChiNhanh);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  long idPhong = rs.getLong("idPhong");
	        	  String tenPhong = rs.getString("tenPhong");
	        	  String anh = rs.getString("anh");
	        	  long chiNhanh = rs.getLong("chiNhanh");
	        	  int soghe = rs.getInt("soghe");
	        	  list.add(new Phong(idPhong, tenPhong, anh, soghe, chiNhanh));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	}catch (Exception e) {
    		e.printStackTrace();
			return null;
    }
    }
	
	public ArrayList<Phong> getPhong2(String NgayChieu) {
    	ArrayList<Phong> list = new ArrayList<Phong>();
    	  LocalDate date = LocalDate.parse(NgayChieu, DateTimeFormatter.ISO_DATE);
	      java.sql.Date da = java.sql.Date.valueOf(date);
    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select * from ViewChonPhong where NgayChieu=?";
	          pst = cs.cn.prepareStatement(sql);
	          pst.setDate(1, da);
	     
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  long idPhong = rs.getLong("idPhong");
	        	  String tenPhong = rs.getString("tenPhong");
	        	  String anh = rs.getString("anh");
	        	  long chiNhanh = rs.getLong("chiNhanh");
	        	  int soghe = rs.getInt("soghe");
	        	  list.add(new Phong(idPhong, tenPhong, anh, soghe, chiNhanh));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	}catch (Exception e) {
    		e.printStackTrace();
			return null;
    }
    }
	
	public ArrayList<Phong> getPhong1(long ChiNhanh,long idphim) {
    	ArrayList<Phong> list = new ArrayList<Phong>();
    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select * from ViewChonPhong where ChiNhanh=? and idphim=?";
	          pst = cs.cn.prepareStatement(sql);
	          pst.setLong(1, ChiNhanh);
	          pst.setLong(2, idphim);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  long idPhong = rs.getLong("idPhong");
	        	  String tenPhong = rs.getString("tenPhong");
	        	  String anh = rs.getString("anh");
	        	  long chiNhanh = rs.getLong("chiNhanh");
	        	  int soghe = rs.getInt("soghe");
	        	  list.add(new Phong(idPhong, tenPhong, anh, soghe, chiNhanh));
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
		phongDao d = new phongDao();
	      
		ArrayList<Phong> list = d.getPhong("20:00","2022-12-19", 2, 2);
		for (Phong l : list)
    		System.out.print(l);
	  }
}
