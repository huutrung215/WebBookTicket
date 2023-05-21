package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.AdminInfo;
import bo.AdminLoginBo;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String TenDangNhap = request.getParameter("TenAdmin");
			String MatKhau = request.getParameter("passAdmin");
			AdminLoginBo khbo= new AdminLoginBo();
			AdminInfo kh = null;
			   if(TenDangNhap!=null && MatKhau!=null) {
				   HttpSession session=request.getSession();
				   kh=khbo.loginAdmin(TenDangNhap, MatKhau);
		    	  if(kh==null) {  
					   request.getRequestDispatcher("AdminLogin.jsp?kt=1").forward(request, response);
				  } else {
					   session.setAttribute("admin", kh);
					   session.setAttribute("TenAdmin", TenDangNhap);
					   request.getRequestDispatcher("AdminChinh.jsp").forward(request, response);
				  }
			   }else 
				   request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
			   
		} catch (Exception e) {
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
