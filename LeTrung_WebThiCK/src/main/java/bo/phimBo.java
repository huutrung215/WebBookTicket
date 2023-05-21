package bo;

import java.util.ArrayList;
import java.util.List;

import bean.phim;
import bean.slideshow;
import dao.phimDao;

public class phimBo {
	phimDao ph = new phimDao();
	  public ArrayList<phim> getAllMovies() throws Exception {
		  return ph.getAllMovies();
	  }
	  public ArrayList<slideshow> getSlide()throws Exception{
		  return ph.getSlide();
	  }
}

