package bean;

public class chiTietHoaDon {
	private long idChiTiet;
	private LichChieu lichchieu;
	private Ghe ghe;
	private HoaDon hoadon;
	public chiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chiTietHoaDon(long idChiTiet, LichChieu lichchieu, Ghe ghe, HoaDon hoadon) {
		super();
		this.idChiTiet = idChiTiet;
		this.lichchieu = lichchieu;
		this.ghe = ghe;
		this.hoadon = hoadon;
	}
	public long getIdChiTiet() {
		return idChiTiet;
	}
	public void setIdChiTiet(long idChiTiet) {
		this.idChiTiet = idChiTiet;
	}
	public LichChieu getLichchieu() {
		return lichchieu;
	}
	public void setLichchieu(LichChieu lichchieu) {
		this.lichchieu = lichchieu;
	}
	public Ghe getGhe() {
		return ghe;
	}
	public void setGhe(Ghe ghe) {
		this.ghe = ghe;
	}
	public HoaDon getHoadon() {
		return hoadon;
	}
	public void setHoadon(HoaDon hoadon) {
		this.hoadon = hoadon;
	}
	
	
}
