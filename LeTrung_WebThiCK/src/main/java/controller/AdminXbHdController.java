package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminXacnhanDao;

/**
 * Servlet implementation class AdminXbHdController
 */
@WebServlet("/AdminXbHdController")
public class AdminXbHdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminXbHdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
	    if(session.getAttribute("admin")!=null) {
	    	AdminXacnhanDao xnbo=new AdminXacnhanDao();
		    request.setAttribute("viewHd", xnbo.getViewxnHd());
		    request.getRequestDispatcher("AdminXnhd.jsp").forward(request, response);
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
