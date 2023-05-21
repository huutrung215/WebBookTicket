package bean;

import java.util.Date;

public class lichsu {
	 private long idUser;
	 private Date NgayChieu;
	 private String ThoiGianChieu;
	 private String maGhe;
	 private String tenphong;
	 private String tenphim;
	 private String tenchinhanh;
	 private long gia;
	 private String NgayTao;
	 private boolean damua;
	public lichsu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lichsu(long idUser, Date ngayChieu, String thoiGianChieu, String maGhe, String tenphong, String tenphim,
			String tenchinhanh, long gia,String NgayTao, boolean damua) {
		super();
		this.idUser = idUser;
		NgayChieu = ngayChieu;
		ThoiGianChieu = thoiGianChieu;
		this.maGhe = maGhe;
		this.tenphong = tenphong;
		this.tenphim = tenphim;
		this.tenchinhanh = tenchinhanh;
		this.gia = gia;
		this.NgayTao = NgayTao;
		this.damua = damua;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public Date getNgayChieu() {
		return NgayChieu;
	}
	public void setNgayChieu(Date ngayChieu) {
		NgayChieu = ngayChieu;
	}
	public String getThoiGianChieu() {
		return ThoiGianChieu;
	}
	public void setThoiGianChieu(String thoiGianChieu) {
		ThoiGianChieu = thoiGianChieu;
	}
	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}
	public String getTenphong() {
		return tenphong;
	}
	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}
	public String getTenphim() {
		return tenphim;
	}
	public void setTenphim(String tenphim) {
		this.tenphim = tenphim;
	}
	public String getTenchinhanh() {
		return tenchinhanh;
	}
	public void setTenchinhanh(String tenchinhanh) {
		this.tenchinhanh = tenchinhanh;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	
	public String getNgayTao() {
		return NgayTao;
	}
	public void setNgayTao(String ngayTao) {
		NgayTao = ngayTao;
	}
	public boolean isDamua() {
		return damua;
	}
	public void setDamua(boolean damua) {
		this.damua = damua;
	}
	 
	 
}
