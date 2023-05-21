package bo;

import bean.AdminInfo;
import dao.AdminLoginDao;

public class AdminLoginBo {
	AdminLoginDao dao = new AdminLoginDao();
	public AdminInfo loginAdmin(String name, String password) throws Exception{
		return dao.loginAdmin(name, password);
	}

}
