package bo;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.lichsu;
import dao.lichsuDao;

public class lichsuBo {
	lichsuDao dao = new lichsuDao();
	
	public ArrayList<lichsu> getLichSu(long idu) throws Exception {
		return dao.getLichSu(idu);
	}
}
