package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LichChieu;
import bean.users;
import bo.LichChieuBo;
import bo.chitietBo;
import bo.hoadonBo;

/**
 * Servlet implementation class hoadonController
 */
@WebServlet("/hoadonController")
public class hoadonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hoadonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session=request.getSession();
			users kh = (users)session.getAttribute("kh");
			Long g = (Long)session.getAttribute("gia");
//			Long idlich = (Long)session.getAttribute("idlich");
//			hoadonBo bo = new hoadonBo();
//			chitietBo cbo = new chitietBo();
		
			
			if(kh!=null) {
				String[] check = request.getParameterValues("check");
				long sove = check.length;
				long tongtien = g*sove;
				session.setAttribute("sove", sove);
				session.setAttribute("tongtien", tongtien);
				List<String> vo = new ArrayList<>();
				
				session.setAttribute("check", check);
//				bo.Them(kh.getId());
//				long idu = bo.maxhoadon();
//				for (String i : check)
//					try {
//						cbo.Them(idu,idlich, i);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}

				request.getRequestDispatcher("hoadon.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("dangnhap.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
