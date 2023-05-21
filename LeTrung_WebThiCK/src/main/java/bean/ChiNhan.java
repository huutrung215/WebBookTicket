package bean;

public class ChiNhan {
	private long idChiNhanh;
	private String anh;
	private String tenChiNhanh;
	private String diaChi;
	private String dienThoai;
	private long idphim;
	public ChiNhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiNhan(long idChiNhanh, String anh, String tenChiNhanh, String diaChi, String dienThoai, long idphim) {
		super();
		this.idChiNhanh = idChiNhanh;
		this.anh = anh;
		this.tenChiNhanh = tenChiNhanh;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.idphim = idphim;
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
	public long getId() {
		return idphim;
	}
	public void setId(long idphim) {
		this.idphim = idphim;
	}
	
	
}
