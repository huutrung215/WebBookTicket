package bo;

import dao.hoadonDao;

public class hoadonBo {
	hoadonDao dao = new hoadonDao();
	public long maxhoadon() throws Exception {
		return dao.maxhoadon();
	}
	
	public int Them(long makh) throws Exception {
		return dao.Them(makh);
	}
}
