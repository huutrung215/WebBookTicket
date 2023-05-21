package bo;

import bean.users;
import dao.dangnhapdao;

public class dangnhapbo {
	dangnhapdao dn = new dangnhapdao();
    public users ktdn(String name, String password) throws Exception {
    	return dn.loginkUser(name, password);
    }
    
    public long getUser(String name, String password)throws Exception {
    	return dn.getUser(name, password);
    }
}
