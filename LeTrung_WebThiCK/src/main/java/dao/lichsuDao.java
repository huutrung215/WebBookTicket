package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.lichsu;

public class lichsuDao {
	
	public ArrayList<lichsu> getLichSu(long idu) {
		ArrayList<lichsu> ds = new ArrayList<lichsu>();
	    ketnoi kn=new ketnoi();
	    kn.KetNoi();
        try {
            String query = "select DISTINCT * from ViewLichSu where idUser=?";
            PreparedStatement pst = kn.cn.prepareStatement(query);
            pst.setLong(1, idu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                long idUser = rs.getLong(1);
                Date NgayChieu = rs.getDate(2);
                String ThoiGianChieu = rs.getString(3);
                String maGhe = rs.getString(4);
                String tenphong = rs.getString(5);
                String tenphim = rs.getString(6);
                String tenchinhanh = rs.getString(7);
                long gia = rs.getLong(8);
                String ngaytao = rs.getString(9);
                boolean damua = rs.getBoolean(10);
                
                ds.add(new lichsu(idUser, NgayChieu, ThoiGianChieu, maGhe, tenphong, tenphim, tenchinhanh, gia, ngaytao, damua));
            }
            rs.close();
    		kn.cn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
		return ds;
    }
	
	public static void main(String[] args) throws SQLException {
		lichsuDao ph = new lichsuDao();
		ArrayList<lichsu> list = ph.getLichSu(1);
    		System.out.println(list);
    }

}
