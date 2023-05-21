package bo;

import java.util.ArrayList;
import java.util.Date;

import bean.LichChieu;
import dao.LichChieuDao;

public class LichChieuBo {
	LichChieuDao lc = new LichChieuDao();
	public ArrayList<LichChieu> getAllLich() throws Exception {
		return lc.getAllLich();
	}
	public ArrayList<Date> NgayChieu()  throws Exception{
		return lc.NgayChieu();
	}
	
	 public ArrayList<String> ThoiGianChieu() throws Exception {
		 return lc.ThoiGianChieu();
	 }
	 public long checkLichChieu(String ThoiGianChieu, String NgayChieu, long idPhim, long idChiNhanh, long idPhong) throws Exception {
		 return lc.checkLichChieu(ThoiGianChieu, NgayChieu, idPhim, idChiNhanh, idPhong);
	 }
	 public long checkIdLichChieu(String ThoiGianChieu, String NgayChieu, long idPhim, long idChiNhanh, long idPhong) throws Exception {
		 return lc.checkIdLichChieu(ThoiGianChieu, NgayChieu, idPhim, idChiNhanh, idPhong);
	 }
}
