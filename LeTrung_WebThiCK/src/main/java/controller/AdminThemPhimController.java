package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dao.AdminThemPhimDao;

/**
 * Servlet implementation class AdminThemPhimController
 */
@WebServlet("/AdminThemPhimController")
public class AdminThemPhimController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminThemPhimController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("UTF-8");
		    response.setContentType("text/html; charset=UTF-8");
		    
		 DiskFileItemFactory factory = new DiskFileItemFactory();
		 DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		 ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		 String dirUrl1 = request.getServletContext().getRealPath("") +  File.separator + "images";
//		 response.getWriter().println(dirUrl1);
		try {
			 String tenphim = "";
		     String loai = "";
		     String nameimg = "";

			List<FileItem> fileItems = upload.parseRequest(request);//Lấy về các đối tượng gửi lên
			//duyệt qua các đối tượng gửi lên từ client gồm file và các control
			for (FileItem fileItem : fileItems) {
 			 if (!fileItem.isFormField()) {//Nếu ko phải các control=>upfile lên
				// xử lý file
				nameimg = fileItem.getName();
				if (!nameimg.equals("")) {
			           //Lấy đường dẫn hiện tại, chủ ý xử lý trên dirUrl để có đường dẫn đúng
					String dirUrl = request.getServletContext().getRealPath("/images");
//					 +  File.separator + "images"
					File dir = new File(dirUrl);
					if (!dir.exists()) {//nếu ko có thư mục thì tạo ra
						dir.mkdir();
					}
//		           String fileImg = dirUrl + File.separator + nameimg;
			           String fileImg = dirUrl + "/" + nameimg;

		           File file = new File(fileImg);//tạo file
		            try {
		               fileItem.write(file);//lưu file
//		            	part.write(dirUrl+"/"+filename);
		              System.out.println("UPLOAD THÀNH CÔNG...!");
		              System.out.println("Đường dẫn lưu file là: "+dirUrl);
		              System.out.println(nameimg);

				 } catch (Exception e) {
				    e.printStackTrace();
				}
			}
		 }
			else//Neu la control
			{
				String tentk=fileItem.getFieldName();
				if(tentk.equals("txtphim")) {
//					response.getWriter().println(fileItem.getString());
				    tenphim = fileItem.getString();
				}
				if(tentk.equals("txtloai"))
				{
//					response.getWriter().println(fileItem.getString());
					loai = fileItem.getString();
					AdminThemPhimDao dao = new AdminThemPhimDao();
					dao.InsertPhim(tenphim,"images/"+nameimg, loai);
					request.getRequestDispatcher("AdminChinh.jsp").forward(request, response);
				}       
			}
		}
		
		} catch (FileUploadException e) {
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
