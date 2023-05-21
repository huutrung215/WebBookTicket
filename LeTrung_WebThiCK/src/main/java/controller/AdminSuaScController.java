package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminThemPhimDao;
import dao.AdminThemScDao;

/**
 * Servlet implementation class AdminSuaScController
 */
@WebServlet("/AdminSuaScController")
public class AdminSuaScController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSuaScController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		long idsc = Long.parseLong((String) session.getAttribute("idsc"));
		String ngaychieu = request.getParameter("ssdate");
		String tgchieu = request.getParameter("sstime");
		long movie = Long.parseLong(request.getParameter("tphim"));
		long location = Long.parseLong(request.getParameter("tchinhanh"));
		long price = Long.parseLong(request.getParameter("tgia"));
		long room = Long.parseLong(request.getParameter("tphong"));
		AdminThemScDao dao = new AdminThemScDao();
		dao.editSuatChieu(idsc, ngaychieu, tgchieu, location, room, movie, price);
		
		System.out.println(idsc+" "+ngaychieu+" "+tgchieu+" "+location+" "+room+" "+movie+" "+price);
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
