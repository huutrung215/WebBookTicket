package bo;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import bean.Phong;
import dao.phongDao;

public class phongBo {
	phongDao phong = new phongDao();
	public ArrayList<Phong> getPhong(String ThoiGianChieu, String NgayChieu, long idphim, long ChiNhanh) throws Exception {
		return phong.getPhong(ThoiGianChieu, NgayChieu, idphim, ChiNhanh);
	}
	public ArrayList<Phong> getPhong1(long idphim, long ChiNhanh) throws Exception {
		return phong.getPhong1(idphim, ChiNhanh);
	}
}
