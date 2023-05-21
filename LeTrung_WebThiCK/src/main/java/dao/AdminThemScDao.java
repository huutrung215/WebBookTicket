package dao;

import java.sql.PreparedStatement;

public class AdminThemScDao {
	public void InsertSuatChieu(String NgayChieu, String ThoiGianChieu, long chinhanh, long phong, long phim, long gia){
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="insert into LichChieu(NgayChieu,ThoiGianChieu,idChiNhanh, idPhong, idPhim, gia) values(?,?,?,?,?,?)";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			
			cmd.setString(1, NgayChieu);	
			cmd.setString(2, ThoiGianChieu);
			cmd.setLong(3, chinhanh);
			cmd.setLong(4, phong);
			cmd.setLong(5, phim);
			cmd.setLong(6, gia);
			cmd.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteSuatChieu(long idlichchieu) {
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="delete from LichChieu where idlichchieu=?";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			cmd.setLong(1, idlichchieu);	
			cmd.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void editSuatChieu(long idlichchieu, String NgayChieu, String ThoiGianChieu, long chinhanh, long phong, long phim, long gia) {
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="update LichChieu set NgayChieu=?, ThoiGianChieu=?,idChiNhanh=?,idPhong=?,idPhim=?, gia=? where idlichchieu=?";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			cmd.setString(1, NgayChieu);	
			cmd.setString(2, ThoiGianChieu);
			cmd.setLong(3, chinhanh);
			cmd.setLong(4, phong);
			cmd.setLong(5, phim);
			cmd.setLong(6, gia);
			cmd.setLong(7, idlichchieu);
			cmd.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ketnoi kn = new ketnoi();
		kn.KetNoi();
		AdminThemScDao d = new AdminThemScDao();
		
		d.editSuatChieu(17,"2022-12-26", "22:00", 2,5,7,90000);
		
	}
}
