package bean;

public class getAllSuatChieu {
	  private String idLichChieu;
	  private String NgayChieu;
	  private String ThoiGianChieu;
	  private String tenphim;
	  private String tenChiNhanh;
	  private String tenPhong;
	  private String gia;
	  private String idChiNhanh;
	  private String idPhong;
	  private String idphim;
	public getAllSuatChieu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public getAllSuatChieu(String idLichChieu, String ngayChieu, String thoiGianChieu, String tenphim,
			String tenChiNhanh, String tenPhong, String gia, String idChiNhanh, String idPhong, String idphim) {
		super();
		this.idLichChieu = idLichChieu;
		NgayChieu = ngayChieu;
		ThoiGianChieu = thoiGianChieu;
		this.tenphim = tenphim;
		this.tenChiNhanh = tenChiNhanh;
		this.tenPhong = tenPhong;
		this.gia = gia;
		this.idChiNhanh = idChiNhanh;
		this.idPhong = idPhong;
		this.idphim = idphim;
	}
	public String getIdLichChieu() {
		return idLichChieu;
	}
	public void setIdLichChieu(String idLichChieu) {
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
	public String getTenphim() {
		return tenphim;
	}
	public void setTenphim(String tenphim) {
		this.tenphim = tenphim;
	}
	public String getTenChiNhanh() {
		return tenChiNhanh;
	}
	public void setTenChiNhanh(String tenChiNhanh) {
		this.tenChiNhanh = tenChiNhanh;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public String getIdChiNhanh() {
		return idChiNhanh;
	}
	public void setIdChiNhanh(String idChiNhanh) {
		this.idChiNhanh = idChiNhanh;
	}
	public String getIdPhong() {
		return idPhong;
	}
	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}
	public String getIdphim() {
		return idphim;
	}
	public void setIdphim(String idphim) {
		this.idphim = idphim;
	}  
	
}

