package bo;

import dao.chitietDao;

public class chitietBo {
	chitietDao dao = new chitietDao();
	public int Them(long hoadon,long lich,String ghe) throws Exception{
		return dao.Them(hoadon, lich, ghe);
	}
}
