package bean;

public class slideshow {
	private long id;
    private String tenphim;
    private String theloai;
    private String anh;
    
	public slideshow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public slideshow(long id, String tenphim, String theloai, String anh) {
		super();
		this.id = id;
		this.tenphim = tenphim;
		this.theloai = theloai;
		this.anh = anh;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTenphim() {
		return tenphim;
	}

	public void setTenphim(String tenphim) {
		this.tenphim = tenphim;
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}
    
}
