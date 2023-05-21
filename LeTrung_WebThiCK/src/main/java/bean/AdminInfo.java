package bean;

public class AdminInfo {
	private long idAmin;
	private String TenDangNhap;
	private String MatKhau;
	public AdminInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminInfo(long idAmin,String tenDangNhap, String matKhau) {
		super();
		this.idAmin = idAmin;
		this.TenDangNhap = tenDangNhap;
		this.MatKhau = matKhau;
	}
	
	public long getIdAmin() {
		return idAmin;
	}
	public void setIdAmin(long idAmin) {
		this.idAmin = idAmin;
	}
	public String getTenDangNhap() {
		return TenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		TenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	
	
}
