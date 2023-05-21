package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class hoadonDao {
	public long maxhoadon() {
		try {
			ketnoi cs= new ketnoi();
			cs.KetNoi();
			String sql="select max(idHoaDon) as maxhd from HoaDon";
			PreparedStatement cmd= cs.cn.prepareStatement(sql);
			ResultSet rs= cmd.executeQuery();
			long kq=0;
			if(rs.next()) {//Dang nhap thanh cong
				kq=rs.getLong("maxhd");
			}
			rs.close(); cs.cn.close();
			return kq;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		
		}
	}
	public int Them(long makh) {
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="insert into HoaDon(idUser,NgayTao,damua) values(?,?,?)";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			
			cmd.setLong(1, makh);
			
			Calendar calendar = Calendar.getInstance();
			java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
			
			cmd.setDate(2, date);
			cmd.setBoolean(3, false);
			int kq=cmd.executeUpdate();
			return kq;
		} catch (Exception e) {
		 e.printStackTrace();
		 return 0;
		}
	}
	
	public static void main(String[] args) {
		hoadonDao d = new hoadonDao();
		int t = d.Them(3);
		System.out.println(t);
		
	}
}
