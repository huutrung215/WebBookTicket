package bean;

import java.time.LocalDate;
import java.util.Date;

public class phim {
	private long id;
    private String tenphim;
    private String anh;
    private String theloai;
  
	    
	    
		public phim() {
			super();
			// TODO Auto-generated constructor stub
		}


		public phim(long id, String tenphim, String anh, String theloai) {
			super();
			this.id = id;
			this.tenphim = tenphim;
			this.anh = anh;
			this.theloai = theloai;
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


		public String getAnh() {
			return anh;
		}


		public void setAnh(String anh) {
			this.anh = anh;
		}

		public String getTheloai() {
			return theloai;
		}


		public void setTheloai(String theloai) {
			this.theloai = theloai;
		}

}
