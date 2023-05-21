package bo;

import java.util.ArrayList;

import bean.ChiNhan;
import bean.ChiNhanh;
import dao.chiNhanhDao;

public class ChiNhanhBo {
	 chiNhanhDao cn = new chiNhanhDao();
	 public ArrayList<ChiNhanh> getAllCN()  throws Exception {
		 return cn.getAllCN();
	 }
	 public ArrayList<ChiNhan> getCN(long idphim) throws Exception {
		 return cn.getCN(idphim);
	 }
}
