package bo;

import dao.dangkydao;

public class dangkybo {
	dangkydao dk=new dangkydao();
	   public int Them(String name, String email, String password) throws Exception{
	      return dk.Them(name, email, password);
	     }
}
