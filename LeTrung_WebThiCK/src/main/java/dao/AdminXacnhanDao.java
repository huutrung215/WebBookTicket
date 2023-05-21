package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.AdminXnCt;
import bean.AdminXnHd;


public class AdminXacnhanDao {
	
	public ArrayList<AdminXnCt> getViewxnCt(){
		try {
    		ArrayList<AdminXnCt> ds= new ArrayList<AdminXnCt>();
			ketnoi kn= new ketnoi();
			kn.KetNoi();
			String sql="select * from ViewXacNhan where damuaCt=0";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			ResultSet rs=cmd.executeQuery();
			while(rs.next()) {
				  long idUser=rs.getLong("idUser");
				  long idChiTiet=rs.getLong("idChiTiet");
				  long idLichChieu=rs.getLong("idLichChieu");
				  String NgayChieu=rs.getDate("NgayChieu").toString();
				  String ThoiGianChieu=rs.getString("ThoiGianChieu");
				  String NgayTao=rs.getDate("NgayTao").toString();
				  long gia=rs.getLong("gia");
				  boolean damuaCt=rs.getBoolean("damuaCt");
				  ds.add(new AdminXnCt(idUser, idChiTiet, idLichChieu, NgayChieu, ThoiGianChieu, NgayTao, gia, damuaCt));
			}
			rs.close();kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<AdminXnHd> getViewxnHd(){
		try {
    		ArrayList<AdminXnHd> ds= new ArrayList<AdminXnHd>();
			ketnoi kn= new ketnoi();
			kn.KetNoi();
			String sql="select * from VxacnhanHd where damuaHd=0";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			ResultSet rs=cmd.executeQuery();
			while(rs.next()) {
				  long idUser=rs.getLong("idUser");
				  long idHoaDon=rs.getLong("idHoaDon");
				  long idLichChieu=rs.getLong("idLichChieu");
				  String NgayChieu=rs.getDate("NgayChieu").toString();
				  String ThoiGianChieu=rs.getString("ThoiGianChieu");
				  String NgayTao=rs.getDate("NgayTao").toString();
				  long tongTien=rs.getLong("TongTien");
				  boolean damuaHd=rs.getBoolean("damuaHd");
				  ds.add(new AdminXnHd(idUser, idHoaDon, idLichChieu, NgayChieu, ThoiGianChieu, NgayTao, tongTien, damuaHd));
			}
			rs.close();kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	public boolean xacnhanCT(int xn, long id) {
		try {
			ketnoi kn= new ketnoi();
			kn.KetNoi();
			String sql = "Update ViewXacNhan set damuaCt=? where idChiTiet=?";
			 PreparedStatement st = kn.cn.prepareStatement(sql);
             st.setInt(1, xn);
             st.setLong(2, id);
             int update = st.executeUpdate();
             
            return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean xacnhanHD(int xn, long ihd) {
		try {
			ketnoi kn= new ketnoi();
			kn.KetNoi();
			String sql = "Update ViewXacNhan set damuaHd=? where idHoaDon=?";
			 PreparedStatement st = kn.cn.prepareStatement(sql);
             st.setInt(1, xn);
             st.setLong(2, ihd);
             int update = st.executeUpdate();
             
            return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean xacnhanCtHD(int xn, long ihd) {
		try {
			ketnoi kn= new ketnoi();
			kn.KetNoi();
			String sql = "Update ViewXacNhan set damuaCt=? where idHoaDon=?";
			 PreparedStatement st = kn.cn.prepareStatement(sql);
             st.setInt(1, xn);
             st.setLong(2, ihd);
             int update = st.executeUpdate();
             
            return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ketnoi kn = new ketnoi();
		kn.KetNoi();
		AdminXacnhanDao d = new AdminXacnhanDao();
		
		if (d.xacnhanCT(1, 1)) {
			System.out.print("doi thanh cong");
		}
	}
}
