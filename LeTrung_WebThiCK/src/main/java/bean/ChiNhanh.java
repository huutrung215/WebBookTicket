package bean;

import java.util.Date;

public class ChiNhanh {
	private long idChiNhanh;
	private String anh;
	private String tenChiNhanh;
	private String diaChi;
	private String dienThoai;
	public ChiNhanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiNhanh(long idChiNhanh, String anh, String tenChiNhanh, String diaChi, String dienThoai) {
		super();
		this.idChiNhanh = idChiNhanh;
		this.anh = anh;
		this.tenChiNhanh = tenChiNhanh;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
	}
	public long getIdChiNhanh() {
		return idChiNhanh;
	}
	public void setIdChiNhanh(long idChiNhanh) {
		this.idChiNhanh = idChiNhanh;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getTenChiNhanh() {
		return tenChiNhanh;
	}
	public void setTenChiNhanh(String tenChiNhanh) {
		this.tenChiNhanh = tenChiNhanh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	
	
}
