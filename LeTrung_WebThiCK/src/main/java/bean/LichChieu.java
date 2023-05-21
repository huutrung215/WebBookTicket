package bean;

import java.sql.Time;
import java.util.Date;

public class LichChieu {
	private long idLichChieu;
	private String NgayChieu;
	private String ThoiGianChieu;
	private long idChiNhanh;
	private long idPhong;
	private long idPhim;
	private long gia;
	public LichChieu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LichChieu(long idLichChieu, String ngayChieu, String thoiGianChieu, long idChiNhanh, long idPhong,
			long idPhim, long gia) {
		super();
		this.idLichChieu = idLichChieu;
		NgayChieu = ngayChieu;
		ThoiGianChieu = thoiGianChieu;
		this.idChiNhanh = idChiNhanh;
		this.idPhong = idPhong;
		this.idPhim = idPhim;
		this.gia = gia;
	}
	public long getIdLichChieu() {
		return idLichChieu;
	}
	public void setIdLichChieu(long idLichChieu) {
		this.idLichChieu = idLichChieu;
	}
	public String getNgayChieu() {
		return NgayChieu;
	}
	public void setNgayChieu(String ngayChieu) {
		NgayChieu = ngayChieu;
	}
	public String getThoiGianChieu() {
		return ThoiGianChieu;
	}
	public void setThoiGianChieu(String thoiGianChieu) {
		ThoiGianChieu = thoiGianChieu;
	}
	public long getIdChiNhanh() {
		return idChiNhanh;
	}
	public void setIdChiNhanh(long idChiNhanh) {
		this.idChiNhanh = idChiNhanh;
	}
	public long getIdPhong() {
		return idPhong;
	}
	public void setIdPhong(long idPhong) {
		this.idPhong = idPhong;
	}
	public long getIdPhim() {
		return idPhim;
	}
	public void setIdPhim(long idPhim) {
		this.idPhim = idPhim;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	
	
}
