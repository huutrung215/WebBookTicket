package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
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
 * Servlet implementation class AdminSuaScCon
 */
@WebServlet("/AdminSuaScCon")
public class AdminSuaScCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSuaScCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			LichChieuBo cn = new LichChieuBo();
	
			List<LichChieu> list = cn.getAllLich();
	//		List<Date> ls = cn.NgayChieu();
			List<String> lt = cn.ThoiGianChieu();
			LocalDate today = java.time.LocalDate.now();
			 
	//		 LocalDate today = LocalDate.parse("2022-12-17"); 
			 ArrayList<LocalDate> listDates = new ArrayList<>(); 
			 listDates.add(today);
			 // Lấy ra 10 ngày tính từ hôm nay 
			 for(int i=1;i<=9;i++){ 
				 today = today.plusDays(1);
				 listDates.add(today); 
			 } 
			request.setAttribute("listL", list);
			request.setAttribute("listNgay", listDates);
			request.setAttribute("listThGian", lt);
			String idsc = request.getParameter("idsc");
			String ngaychieu = request.getParameter("ngaychieu");
			String tgchieu = request.getParameter("tgchieu");
			String movie = request.getParameter("movie");
			String location = request.getParameter("location");
			String price = request.getParameter("price");
			String room = request.getParameter("room");
			
			HttpSession session=request.getSession();
			session.setAttribute("idsc", idsc);
			session.setAttribute("ngaychieu", ngaychieu);
			session.setAttribute("tgchieu", tgchieu);
			session.setAttribute("movie", movie);
			session.setAttribute("location", location);
			session.setAttribute("price", price);
			session.setAttribute("room", room);
			
			request.getRequestDispatcher("AdminSuaSc.jsp").forward(request, response);
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
