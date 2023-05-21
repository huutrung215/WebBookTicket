package dao;

import java.sql.PreparedStatement;

public class AdminThemPhimDao {
	public void InsertPhim(String tenphim, String anh, String theloai){
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="insert into phim(tenphim,anh,theloai) values(?,?,?)";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			
			cmd.setString(1, tenphim);	
			cmd.setString(2, anh);
			cmd.setString(3, theloai);
			cmd.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deletePhim(long idphim) {
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="delete from phim where id=?";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			cmd.setLong(1, idphim);	
			cmd.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void editPhim(long idphim, String tenphim, String anh, String theloai) {
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="update phim set tenphim=?, anh=?, theloai=? where id=?";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			cmd.setString(1, tenphim);	
			cmd.setString(2, anh);
			cmd.setString(3, theloai);	
			cmd.setLong(4, idphim);
			cmd.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ketnoi kn = new ketnoi();
		kn.KetNoi();
		AdminThemPhimDao d = new AdminThemPhimDao();
		
		d.editPhim(1, "Đêm hung tàn", "https://traffic-edge10.cdn.vncdn.io/cinema/img/88247510687324229-2.jpg", "Hài");
		
	}
}
