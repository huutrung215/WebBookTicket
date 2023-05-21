package bo;

import java.util.ArrayList;

import bean.Ghe;
import dao.gheDao;

public class gheBo {
	gheDao ghe = new gheDao();
	 public ArrayList<String> getGhe(String ThoiGianChieu, String NgayChieu, long idphim, long idChiNhanh, long idphong) throws Exception {
		  return ghe.getGhe(ThoiGianChieu, NgayChieu, idphim, idChiNhanh, idphong);
	  }
	   public ArrayList<String> getAllGhe()throws Exception {
		   return ghe.getAllGhe();
	   }
}
	   
