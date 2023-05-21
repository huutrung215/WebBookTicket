package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileUploadException;

import dao.AdminThemScDao;

/**
 * Servlet implementation class AdminThemScController
 */
@WebServlet("/AdminThemScController")
public class AdminThemScController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminThemScController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String stime = request.getParameter("stime");
			String sdate = request.getParameter("sdate");
			long tphim = Long.parseLong(request.getParameter("ttphim"));
			long tchinhanh = Long.parseLong(request.getParameter("ttchinhanh"));
			long tphong = Long.parseLong(request.getParameter("ttphong"));
			long tgia = Long.parseLong(request.getParameter("ttgia"));
			
			AdminThemScDao dao = new AdminThemScDao();
			dao.InsertSuatChieu(sdate, stime, tchinhanh, tphong, tphim, tgia);
			System.out.println(sdate+ " " +stime+" "+tchinhanh+ " "+tphong + " "+ tphim+" "+ tgia);
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
