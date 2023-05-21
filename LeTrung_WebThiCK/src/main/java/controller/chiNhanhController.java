package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ChiNhan;
import bean.ChiNhanh;
import bo.ChiNhanhBo;

/**
 * Servlet implementation class chiNhanhController
 */
@WebServlet("/chiNhanhController")
public class chiNhanhController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chiNhanhController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			long idphim=Long.parseLong(request.getParameter("idphim"));
			String tenphim = request.getParameter("tenphim");
			/* long idchinhanh=Long.parseLong(request.getParameter("idchinhanh")); */
			
			HttpSession session=request.getSession();
			session.setAttribute("idphim", idphim);
			session.setAttribute("tenphim", tenphim);
			/* session.setAttribute("idchinhanh", idchinhanh); */
			
			ChiNhanhBo cn = new ChiNhanhBo();
			List<ChiNhan> list = cn.getCN(idphim);

			request.setAttribute("listC", list);
			request.getRequestDispatcher("ChiNhanh.jsp").forward(request, response);
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
