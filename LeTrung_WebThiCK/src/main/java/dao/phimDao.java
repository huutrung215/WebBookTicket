package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.phim;
import bean.slideshow;

public class phimDao {
	private String query;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public ArrayList<phim> getAllMovies() {
    	ArrayList<phim> list = new ArrayList<phim>();
    	try {
    		 ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select * from phim";
	          pst = cs.cn.prepareStatement(sql);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  long id = rs.getLong("id");
	        	  String tenphim = rs.getString("tenphim");
	        	  String anh = rs.getString("anh");
	        	  String theloai = rs.getString("theloai");
	        	  list.add(new phim(id, tenphim, anh, theloai));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	} catch (Exception e) {
    		e.printStackTrace();
			return null;
    	}
    }
    
    public ArrayList<phim> get1Movies(long idphim) {
    	ArrayList<phim> list = new ArrayList<phim>();
    	try {
    		 ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select * from phim where id=?";
	          pst = cs.cn.prepareStatement(sql);
	          pst.setLong(1, idphim);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  long id = rs.getLong("id");
	        	  String tenphim = rs.getString("tenphim");
	        	  String anh = rs.getString("anh");
	        	  String theloai = rs.getString("theloai");
	        	  list.add(new phim(id, tenphim, anh, theloai));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	} catch (Exception e) {
    		e.printStackTrace();
			return null;
    	}
    }
    
    public ArrayList<slideshow> getSlide() {
    	ArrayList<slideshow> list = new ArrayList<slideshow>();
    	try {
   		 ketnoi cs = new ketnoi();
	      cs.KetNoi();
	      String sql = "select * from slideshow";
	      pst = cs.cn.prepareStatement(sql);
	      rs = pst.executeQuery();
	      while(rs.next()) {
	    	  long id = rs.getLong("id");
	    	  String tenphim = rs.getString("tenphim");
	    	  String theloai = rs.getString("theloai");
	    	  String anh = rs.getString("anh");
	    	  list.add(new slideshow(id, tenphim, theloai, anh));
	      }
	      rs.close();
			cs.cn.close();
	    	return list;
   	} catch (Exception e) {
   		e.printStackTrace();
			return null;
   	}
    }
    
    public static void main(String[] args) {
    	phimDao ph = new phimDao();
    	ArrayList<phim> list = ph.get1Movies(1);
    	for (phim p : list) {
    		System.out.println(p);
    	}
    }
}
