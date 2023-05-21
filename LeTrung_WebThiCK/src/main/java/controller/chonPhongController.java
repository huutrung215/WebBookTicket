package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ChiNhanh;
import bean.Phong;
import bo.ChiNhanhBo;
import bo.phongBo;
import dao.phongDao;

/**
 * Servlet implementation class chonPhong
 */
@WebServlet("/chonPhongController")
public class chonPhongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chonPhongController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		try {
			  long idphim=Long.parseLong(request.getParameter("idphim")); 
			  long idchinhanh=Long.parseLong(request.getParameter("idchinhanh"));
			  
			  String startDate = request.getParameter("startDate");
			  String startTime = request.getParameter("startTime");
			 
			  
			  HttpSession session=request.getSession();
			  session.setAttribute("startDate", startDate);
			  session.setAttribute("startTime", startTime);

			phongBo ph = new phongBo();
			
			  List<Phong> list = ph.getPhong(startTime,startDate,idphim, idchinhanh);
			 
			request.setAttribute("listR", list);
			request.getRequestDispatcher("phongPhim.jsp").forward(request, response);
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
