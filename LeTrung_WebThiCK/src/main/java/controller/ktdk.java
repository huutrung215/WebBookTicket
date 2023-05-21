package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.dangkybo;

/**
 * Servlet implementation class ktdk
 */
@WebServlet("/ktdk")
public class ktdk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	        String name = request.getParameter("name"); 
	        String email = request.getParameter("email"); 
	        String password1 = request.getParameter("password1"); 
	        String password2 = request.getParameter("password2");
	      
	      if(password1.equals(password2)) {
	      dangkybo tk=new dangkybo();
	      tk.Them(name, email, password1);
		  request.getRequestDispatcher("dangnhap.jsp").forward(request, response); 

	      //RequestDispatcher rd = request.getRequestDispatcher("htsachController");// Chuyen tiep ve trang htsach.jsp
	      //rd.forward(request, response);
	      }else
	      {
			  request.setAttribute("name", name); 
			  request.setAttribute("email", email);
			  request.getRequestDispatcher("dangky.jsp").forward(request, response); 
	       // RequestDispatcher rd = request.getRequestDispatcher("dangkyController");// Chuyen tiep ve trang htsach.jsp
	       // rd.forward(request, response);
	      }
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
