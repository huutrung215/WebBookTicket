package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.users;
import bo.dangnhapbo;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String TenDangNhap = request.getParameter("TenDangNhap");
			String MatKhau = request.getParameter("MatKhau");
			   dangnhapbo khbo= new dangnhapbo();
			   users kh = null;
			   RequestDispatcher rd;
			   if(TenDangNhap!=null && MatKhau!=null) {
				   HttpSession session=request.getSession();
				   kh=khbo.ktdn(TenDangNhap, MatKhau);
				   long idu = khbo.getUser(TenDangNhap, MatKhau);
		    	  if(kh==null) {
					   rd= request.getRequestDispatcher("dangnhap.jsp?kt=1");	   
				  }     
				else {
					   session.setAttribute("kh", kh);
					   session.setAttribute("idu", idu);
					   session.setAttribute("TenDangNhap", TenDangNhap);
					  rd= request.getRequestDispatcher("htTruyenController");
				  }
			   }else 
				   rd= request.getRequestDispatcher("dangnhap.jsp");
			 
			 rd.forward(request, response);
			   
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
