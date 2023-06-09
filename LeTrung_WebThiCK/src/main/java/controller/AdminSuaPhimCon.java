package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.phim;
import bo.phimBo;
import dao.AdminThemPhimDao;
import dao.phimDao;

/**
 * Servlet implementation class AdminSuaPhimCon
 */
@WebServlet("/AdminSuaPhimCon")
public class AdminSuaPhimCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSuaPhimCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			long idp = Long.parseLong(request.getParameter("idph"));
			phimDao ph = new phimDao();
			List<phim> lit = ph.get1Movies(idp);	
			
			HttpSession session=request.getSession();
			session.setAttribute("idph", idp);
			request.setAttribute("liP", lit);
			request.getRequestDispatcher("AdminSua.jsp").forward(request, response);
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
