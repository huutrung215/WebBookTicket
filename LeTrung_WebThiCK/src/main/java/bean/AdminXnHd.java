package bean;

public class AdminXnHd {
	private long idUser;
	private long idHoaDon;
	private long idLichChieu;
	private String NgayChieu;
	private String ThoiGianChieu;
	private String NgayTao;
	private long tongTien;
	private boolean damuaHd;
	public AdminXnHd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminXnHd(long idUser, long idHoaDon, long idLichChieu, String ngayChieu, String thoiGianChieu,
			String ngayTao, long tongTien, boolean damuaHd) {
		super();
		this.idUser = idUser;
		this.idHoaDon = idHoaDon;
		this.idLichChieu = idLichChieu;
		NgayChieu = ngayChieu;
		ThoiGianChieu = thoiGianChieu;
		NgayTao = ngayTao;
		this.tongTien = tongTien;
		this.damuaHd = damuaHd;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public long getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(long idHoaDon) {
		this.idHoaDon = idHoaDon;
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
	public String getNgayTao() {
		return NgayTao;
	}
	public void setNgayTao(String ngayTao) {
		NgayTao = ngayTao;
	}
	public long getTongTien() {
		return tongTien;
	}
	public void setTongTien(long tongTien) {
		this.tongTien = tongTien;
	}
	public boolean isDamuaHd() {
		return damuaHd;
	}
	public void setDamuaHd(boolean damuaHd) {
		this.damuaHd = damuaHd;
	}
	
	
}
