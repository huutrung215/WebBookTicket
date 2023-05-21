package controller;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LichChieu;
import bo.LichChieuBo;

/**
 * Servlet implementation class lichChieuController
 */
@WebServlet("/lichChieuController")
public class lichChieuController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public lichChieuController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			LichChieuBo cn = new LichChieuBo();

			List<LichChieu> list = cn.getAllLich();
//			List<Date> ls = cn.NgayChieu();
			List<String> lt = cn.ThoiGianChieu();

			long idchinhanh = Long.parseLong(request.getParameter("idchinhanh"));
			String tencn = request.getParameter("tencn");

			HttpSession session = request.getSession();
			session.setAttribute("idchinhanh", idchinhanh);
			session.setAttribute("tencn", tencn);

			
			 LocalDate today = java.time.LocalDate.now();
			 
//			 LocalDate today = LocalDate.parse("2022-12-17"); 
			 ArrayList<LocalDate> listDates = new ArrayList<>(); 
			 listDates.add(today);
			 // Lấy ra 10 ngày tính từ hôm nay 
			 for(int i=1;i<=9;i++){ 
				 today = today.plusDays(1);
				 listDates.add(today); 
			 }
			 

			request.setAttribute("listL", list);
			request.setAttribute("listDates", listDates);
			request.setAttribute("listStartTimes", lt);
			request.getRequestDispatcher("LichChieu.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
