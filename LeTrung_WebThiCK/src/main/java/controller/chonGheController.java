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

import bean.Ghe;
import bean.LichChieu;
import bean.Phong;
import bo.LichChieuBo;
import bo.gheBo;
import bo.phongBo;

/**
 * Servlet implementation class chonGheController
 */
@WebServlet("/chonGheController")
public class chonGheController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chonGheController() {
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
			  long idphong = Long.parseLong(request.getParameter("idphong"));
			  
			  String startDate = request.getParameter("date");
			  String startTime = request.getParameter("time");
			  String tenphong = request.getParameter("tenphong");
			 
			  HttpSession session=request.getSession();
			  session.setAttribute("idphong", idphong);
			  session.setAttribute("tenphong", tenphong);

			gheBo ghe = new gheBo();
			
			LichChieuBo lic = new LichChieuBo();
			long gia = lic.checkLichChieu(startTime,startDate, idphim, idchinhanh, idphong);
			long idlich = lic.checkIdLichChieu(startTime, startDate, idphim, idchinhanh, idphong);
			
			ArrayList<String> listGheChon = ghe.getGhe(startTime,startDate,idphim, idchinhanh, idphong);
			ArrayList<String> listAllGhe = ghe.getAllGhe(); 
			request.setAttribute("listg", listGheChon);
			
			session.setAttribute("gia", gia);
			session.setAttribute("idlich", idlich);
//			request.setAttribute("list", listGheChon);
			request.getRequestDispatcher("chonghe.jsp").forward(request, response);
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
