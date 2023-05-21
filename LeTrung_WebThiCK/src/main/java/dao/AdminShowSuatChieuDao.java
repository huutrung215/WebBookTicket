package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.getAllSuatChieu;


public class AdminShowSuatChieuDao {
	public ArrayList<getAllSuatChieu> getViewAllSuatChieu(){
		try {
    		ArrayList<getAllSuatChieu> ds= new ArrayList<getAllSuatChieu>();
			ketnoi kn= new ketnoi();
			kn.KetNoi();
			String sql="select * from ViewQlSuatChieu";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			ResultSet rs=cmd.executeQuery();
			while(rs.next()) {
				  String idLichChieu= String.valueOf(rs.getLong("idLichChieu"));
				  String NgayChieu=rs.getDate("NgayChieu").toString();
				  String ThoiGianChieu=rs.getString("ThoiGianChieu");
				  String tenphim=rs.getString("tenphim");
				  String tenChiNhanh=rs.getString("tenChiNhanh");
				  String tenPhong=rs.getString("tenPhong");
				  String gia= String.valueOf(rs.getLong("gia"));
				  String idChiNhanh= String.valueOf(rs.getLong("idChiNhanh"));
				  String idPhong= String.valueOf(rs.getLong("idPhong"));
				  String idphim= String.valueOf(rs.getLong("idphim"));
				  ds.add( new getAllSuatChieu(idLichChieu, NgayChieu, ThoiGianChieu, tenphim, tenChiNhanh, tenPhong, gia, idChiNhanh, idPhong, idphim));
			}
			rs.close();kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ketnoi kn = new ketnoi();
		kn.KetNoi();
		AdminShowSuatChieuDao d = new AdminShowSuatChieuDao();
		
		ArrayList<getAllSuatChieu> ls = d.getViewAllSuatChieu();
		for (getAllSuatChieu s: ls)
			System.out.println(s);
	}
}
