package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminShowSuatChieuDao;
import dao.AdminXacnhanDao;

/**
 * Servlet implementation class AdminShowSuatChieuCon
 */
@WebServlet("/AdminShowSuatChieuCon")
public class AdminShowSuatChieuCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminShowSuatChieuCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
	    if(session.getAttribute("admin")!=null) {
	    	AdminShowSuatChieuDao xnbo=new AdminShowSuatChieuDao();
		    request.setAttribute("viewSc", xnbo.getViewAllSuatChieu());
		    request.getRequestDispatcher("AdminShowSuatChieu.jsp").forward(request, response);
		 }else
			 request.getRequestDispatcher("AdminChinh.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
