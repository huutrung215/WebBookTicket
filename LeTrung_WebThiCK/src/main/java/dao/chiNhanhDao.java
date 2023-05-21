package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.ChiNhan;
import bean.ChiNhanh;
import bean.phim;

public class chiNhanhDao {
    private PreparedStatement pst;
    private ResultSet rs;
    
    public ArrayList<ChiNhanh> getAllCN() {
    	ArrayList<ChiNhanh> list = new ArrayList<ChiNhanh>();
    	ArrayList<phim> li = new ArrayList<phim>();
    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select * from ViewChonChiNhanh";
	          pst = cs.cn.prepareStatement(sql);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  long idChiNhanh = rs.getLong("idChiNhanh");
	        	  String anh = rs.getString("anh");
	        	  String tenChiNhanh = rs.getString("tenChiNhanh");
	        	  String diaChi = rs.getString("diaChi");
	        	  String dienThoai = rs.getString("dienThoai");
	        	  list.add(new ChiNhanh(idChiNhanh, anh, tenChiNhanh, diaChi, dienThoai));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	}catch (Exception e) {
    		e.printStackTrace();
			return null;
    	}
    }
    public ArrayList<ChiNhan> getCN(long idphim) {
    	ArrayList<ChiNhan> list = new ArrayList<ChiNhan>();
    	try {
    		ketnoi cs = new ketnoi();
	          cs.KetNoi();
	          String sql = "select * from ViewChonChiNhanh where idphim=?";
	          pst = cs.cn.prepareStatement(sql);
	          pst.setLong(1, idphim);
	          rs = pst.executeQuery();
	          while(rs.next()) {
	        	  long idChiNhanh = rs.getLong("idChiNhanh");
	        	  String anh = rs.getString("anh");
	        	  String tenChiNhanh = rs.getString("tenChiNhanh");
	        	  String diaChi = rs.getString("diaChi");
	        	  String dienThoai = rs.getString("dienThoai");
	        	  idphim = rs.getLong("idphim");
	        	  list.add(new ChiNhan(idChiNhanh, anh, tenChiNhanh, diaChi, dienThoai, idphim));
	          }
	          rs.close();
	    		cs.cn.close();
	        	return list;
    	}catch (Exception e) {
    		e.printStackTrace();
			return null;
    }
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	chiNhanhDao dao = new chiNhanhDao();
    	ArrayList<ChiNhan> list = dao.getCN(1);
    	for (ChiNhan l : list)
    		System.out.print(l);
		
	}
}
