package bean;

public class Phong extends ChiNhanh {
	private long idPhong;
	private String tenPhong;
	private String anh;
	private int soghe;
	private long idChiNhanh;
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phong(long idPhong, String tenPhong, String anh, int soghe, long idChiNhanh) {
		super();
		this.idPhong = idPhong;
		this.tenPhong = tenPhong;
		this.soghe = soghe;
		this.idChiNhanh = idChiNhanh;
		this.anh = anh;
	}
	public long getIdPhong() {
		return idPhong;
	}
	public void setIdPhong(long idPhong) {
		this.idPhong = idPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public int getSoghe() {
		return soghe;
	}
	public void setSoghe(int soghe) {
		this.soghe = soghe;
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
	
}
