package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import bean.LichChieu;

public class LichChieuDao {
	private PreparedStatement pst;
    private ResultSet rs;
    
    public ArrayList<LichChieu> getAllLich() {
    	ArrayList<LichChieu> list = new ArrayList<LichChieu>();
    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "SELECT DISTINCT ThoiGianChieu from LichChieu";
	          pst = cs.cn.prepareStatement(sql);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  String ThoiGianChieu = rs.getString("ThoiGianChieu");
	        	  list.add(new LichChieu(0, "", ThoiGianChieu, 
	        			  0, 0,0, 0));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	}catch (Exception e) {
    		e.printStackTrace();
			return null;
    	}
    }
    public ArrayList<Date> NgayChieu() {
     	ArrayList<Date> list = new ArrayList<Date>();
	   try {
			ketnoi cs= new ketnoi();
			cs.KetNoi();
			String sql="SELECT DISTINCT NgayChieu from LichChieu";
			PreparedStatement cmd= cs.cn.prepareStatement(sql);
			ResultSet rs= cmd.executeQuery();
			while(rs.next()) {
	        	  list.add(rs.getDate("NgayChieu"));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		
		}
   }
    
    public ArrayList<String> ThoiGianChieu() {
     	ArrayList<String> list = new ArrayList<String>();
	   try {
			ketnoi cs= new ketnoi();
			cs.KetNoi();
			String sql="SELECT DISTINCT ThoiGianChieu from LichChieu";
			PreparedStatement cmd= cs.cn.prepareStatement(sql);
			ResultSet rs= cmd.executeQuery();
			while(rs.next()) {
	        	  list.add(rs.getString("ThoiGianChieu"));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		
		}
   }
    public 	long checkLichChieu(String ThoiGianChieu, String NgayChieu, long idPhim, long idChiNhanh, long idPhong) {
    	LocalDate date = LocalDate.parse(NgayChieu, DateTimeFormatter.ISO_DATE);
	      java.sql.Date da = java.sql.Date.valueOf(date);
    	try {
    		ketnoi cs = new ketnoi();
            cs.KetNoi();
            String sql = "select DISTINCT gia from LichChieu where ThoiGianChieu=? and NgayChieu=? and idphim=? and idChiNhanh=? and idPhong=?";
            pst = cs.cn.prepareStatement(sql);
            long price = 0;
            pst.setString(1, ThoiGianChieu);
	          pst.setDate(2, da);
	          pst.setLong(3, idPhim);
	          pst.setLong(4, idChiNhanh);
	          pst.setLong(5, idPhong);
	          rs = pst.executeQuery();
	          if(rs.next()){
	        	  long gia = rs.getLong("gia");
	        	  
	        	  price = gia;
	          }
	          rs.close();
	    		cs.cn.close();
	        	return price;
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
		return 0;    	
    }
    
    public 	long checkIdLichChieu(String ThoiGianChieu, String NgayChieu, long idPhim, long idChiNhanh, long idPhong) {
    	LocalDate date = LocalDate.parse(NgayChieu, DateTimeFormatter.ISO_DATE);
	      java.sql.Date da = java.sql.Date.valueOf(date);
    	try {
    		ketnoi cs = new ketnoi();
            cs.KetNoi();
            String sql = "select DISTINCT idLichChieu from LichChieu where ThoiGianChieu=? and NgayChieu=? and idphim=? and idChiNhanh=? and idPhong=?";
            pst = cs.cn.prepareStatement(sql);
            long price = 0;
            pst.setString(1, ThoiGianChieu);
	          pst.setDate(2, da);
	          pst.setLong(3, idPhim);
	          pst.setLong(4, idChiNhanh);
	          pst.setLong(5, idPhong);
	          rs = pst.executeQuery();
	          if(rs.next()){
	        	  long gia = rs.getLong("idLichChieu");
	        	  
	        	  price = gia;
	          }
	          rs.close();
	    		cs.cn.close();
	        	return price;
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
		return 0;    	
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	LichChieuDao dao = new LichChieuDao();
    	long list = dao.checkIdLichChieu("18:00", "2022-12-19", 1, 1, 1);
    
    		System.out.print(list);
		
	}
}
