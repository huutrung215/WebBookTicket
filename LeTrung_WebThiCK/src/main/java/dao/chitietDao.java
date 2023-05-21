package dao;

import java.sql.PreparedStatement;

public class chitietDao {
	public int Them(long hoadon,long lich,String ghe) {
		try {
			ketnoi cs=new ketnoi();
			cs.KetNoi();
			String sql="insert into ChiTietHoaDon(idHoaDon,idLichChieu,maGhe,damua) values(?,?,?,?)";
			PreparedStatement cmd=cs.cn.prepareStatement(sql);
			cmd.setLong(1, hoadon);
			cmd.setLong(2, lich);
			cmd.setString(3, ghe);
			cmd.setBoolean(4, false);
			int kq=cmd.executeUpdate();
			cs.cn.close();
			return kq;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
