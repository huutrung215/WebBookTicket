package bean;

import java.util.List;

public class HoaDon {
	private long idHoaDon;
	private long idUser;
	private String NgayTao;
	private List<chiTietHoaDon> chitiet;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(long idHoaDon, long idUser, String ngayTao, List<chiTietHoaDon> chitiet) {
		super();
		this.idHoaDon = idHoaDon;
		this.idUser = idUser;
		NgayTao = ngayTao;
		this.chitiet = chitiet;
	}
	public long getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(long idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getNgayTao() {
		return NgayTao;
	}
	public void setNgayTao(String ngayTao) {
		NgayTao = ngayTao;
	}
	public List<chiTietHoaDon> getChitiet() {
		return chitiet;
	}
	public void setChitiet(List<chiTietHoaDon> chitiet) {
		this.chitiet = chitiet;
	}
	
}
