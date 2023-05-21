package bean;

public class AdminXnCt {
	private long idUser;
	private long idChiTiet;
	private long idLichChieu;
	private String NgayChieu;
	private String ThoiGianChieu;
	private String NgayTao;
	private long gia;
	private boolean damuaCt;
	public AdminXnCt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminXnCt(long idUser, long idChiTiet, long idLichChieu, String ngayChieu, String thoiGianChieu,
			String ngayTao, long gia, boolean damuaCt) {
		super();
		this.idUser = idUser;
		this.idChiTiet = idChiTiet;
		this.idLichChieu = idLichChieu;
		NgayChieu = ngayChieu;
		ThoiGianChieu = thoiGianChieu;
		NgayTao = ngayTao;
		this.gia = gia;
		this.damuaCt = damuaCt;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public long getIdChiTiet() {
		return idChiTiet;
	}
	public void setIdChiTiet(long idChiTiet) {
		this.idChiTiet = idChiTiet;
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
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public boolean isDamuaCt() {
		return damuaCt;
	}
	public void setDamuaCt(boolean damuaCt) {
		this.damuaCt = damuaCt;
	}
	
	
}
