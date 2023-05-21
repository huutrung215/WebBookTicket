<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<!-- CSS only -->
  <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap-grid.css">
    <link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
</head>
<body>
<header>
	 <div class="container">
	 	<nav>
 	   <div class="burgerMenu" onclick="myFunction()"></div>
	    <div class="wrapper">
	        <div class="logo"><a href="#">TruyenHay</a></div>
	        <input type="radio" name="slider" id="menu-btn">
	        <input type="radio" name="slider" id="close-btn">
	        <ul class="nav-links">
	            <li><a href="#">Trang chủ</a></li>
	            <li>
	                <a href="#" class="desktop-item"><span><i class="fa-solid fa-list"></i></span>Thể loại</a>
	                <input type="checkbox" id="showMega">
	                <label for="showMega" class="mobile-item">Mega Menu</label>
	                <div class="mega-box">
	                    <div class="content">
	                        <div class="row">
	                                <ul class="mega-links">
	                                    <li><a class="dropdown-item" href="#">Tiên Hiệp</a></li>
	                                    <li><a class="dropdown-item" href="#">Kiếm Hiệp</a></li>
	                                    <li><a class="dropdown-item" href="#">Ngôn Tình</a></li>
	                                    <li><a class="dropdown-item" href="#">Đam Mỹ</a></li>
	                                    <li><a class="dropdown-item" href="#">Quan Trường</a></li>
	                                    <li><a class="dropdown-item" href="#">Võng Du</a></li>
	                                    <li><a class="dropdown-item" href="#">Khoa Huyễn</a></li>
	                                    <li><a class="dropdown-item" href="#">Hệ Thống</a></li>
	                                    <li><a class="dropdown-item" href="#">Huyền Huyễn</a></li>
	                                    <li><a class="dropdown-item" href="#">Dị Giới</a></li>
	                                    <li><a class="dropdown-item" href="#">Dị Năng</a></li>
	                                    <li><a class="dropdown-item" href="#">Quân Sự</a></li>
	                                    <li><a class="dropdown-item" href="#">Lịch Sử</a></li>
	                                </ul>
	                            </div>
	                            <div class="row">
	                                <ul class="mega-links">
	                                   <li><a class="dropdown-item" href="#">Xuyên Không</a></li>
	                                    <li><a class="dropdown-item" href="#">Xuyên Nhanh</a></li>
	                                    <li><a class="dropdown-item" href="#">Trọng Sinh</a></li>
	                                    <li><a class="dropdown-item" href="#">Trinh Thám</a></li>
	                                    <li><a class="dropdown-item" href="#">Thám Hiểm</a></li>
	                                    <li><a class="dropdown-item" href="#">Linh Dị</a></li>
	                                    <li><a class="dropdown-item" href="#">QNgược</a></li>
	                                    <li><a class="dropdown-item" href="#">Sủng</a></li>
	                                    <li><a class="dropdown-item" href="#">Cung Đấu</a></li>
	                                    <li><a class="dropdown-item" href="#">Đông Phương</a></li>
	                                    <li><a class="dropdown-item" href="#">Gia Đấu</a></li>
	                                    <li><a class="dropdown-item" href="#">Đô Thị</a></li>
	                                    <li><a class="dropdown-item" href="#">Nữ Cường</a></li>
	                                </ul>
	                            </div>
	                            <div class="row">
	                                <ul class="mega-links">
	                                    <li><a class="dropdown-item" href="#">Bách Hợp</a></li>
	                                    <li><a class="dropdown-item" href="#">Hài Hước</a></li>
	                                    <li><a class="dropdown-item" href="#">Điền Văn</a></li>
	                                    <li><a class="dropdown-item" href="#">Cổ Đại</a></li>
	                                    <li><a class="dropdown-item" href="#">Mạt Thế</a></li>
	                                    <li><a class="dropdown-item" href="#">Truyện Teen</a></li>
	                                    <li><a class="dropdown-item" href="#">Phương Tây</a></li>
	                                    <li><a class="dropdown-item" href="#">Nữ Phụ</a></li>
	                                    <li><a class="dropdown-item" href="#">Light Novel</a></li>
	                                    <li><a class="dropdown-item" href="#">Việt Nam</a></li>
	                                    <li><a class="dropdown-item" href="#">Đoạn Văn</a></li>
	                                    <li><a class="dropdown-item" href="#">Khác</a></li>
	                                </ul>
	                    </div>
	                </div>
	            </li>
	            <li>
	                <a href="#" class="desktop-item"><span><i class="fa-solid fa-list"></i></span>Phân loại theo chương</a>
	                <input type="checkbox" id="showDrop">
	                <label for="showDrop" class="mobile-item">Dropdown Menu</label>
	                <ul class="drop-menu">
	                    <li><a href="#">Dưới 100 chương</a></li>
	                    <li><a href="#">100 - 500 chương</a></li>
	                    <li><a href="#">500 - 1000 chương</a></li>
	                    <li><a href="#">Trên 1000 chương</a></li>
	                </ul>
	            </li>
	            <li><a href="#"><span><i class="fa-solid fa-gear"></i></span>Tùy chỉnh</a>
	            	<label for="showDrop" class="mobile-item">Dropdown Menu</label>
	                <ul class="drop-menu">
	                    <li><a href="#">Sáng</a></li>
	                    <li><a href="#">Tối</a></li>
	                </ul>
	            </li>
	        </ul>
	        <label for="menu-btn" class="btn menu-btn"><i class="fas fa-bars"></i></label>
	    </div>
	</nav>
	 </div>
</header>
 <div class="container">
 	<div class="sliderBottom">
    <div class="sliderItem">
        <div class="slider">
            <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"></li>
                    <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"></li>
                    <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"></li>
                    <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="img/slide/background-lqmb.png" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="img/truyen/manga/nnt.jpg" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="img/slide/background-onepiece.png" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="img/truyen/manga/aot.jpg" class="d-block w-100" alt="...">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden"></span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden"></span>
                </a>
            </div>
        </div>
        <div class="coming">

            <h2 class="comingSoonTitle">coming soon</h2>
            <div class="mit">
                <div class="scrollItem">
                    <div class="thumbItem">
                        <img src="img/truyen/manga/aot.jpg" alt="">
                        <div class="thumbTitle">
                            <p class="MovieNameThumb"><a href="">bloodshot</a></p>
                            <div class="thumbMovieDetails">
                                <p>generes: <a href="action.html">action</a>,<a href="action">adventure</a></p>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="scrollItem">
                    <div class="thumbItem">
                        <img src="img/truyen/manga/bc.jpg" alt="">
                        <div class="thumbTitle">
                            <p class="MovieNameThumb"><a  href="">black Widow</a></p>
                            <div class="thumbMovieDetails">
                                <p>generes: <a href="action.html">action</a>,<a href="action">adventure</a>,<a href="action">Sci-Fi</a></p>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="scrollItem">
                    <div class="thumbItem">
                        <img src="img/truyen/manga/debby.jpg" alt="">
                        <div class="thumbTitle">
                            <p class="MovieNameThumb"><a  href="">black adam</a></p>
                            <div class="thumbMovieDetails">
                                <p>generes: <a href="action.html">action</a>,<a href="action">adventure</a>,<a href="action">Sci-Fi</a></p>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="scrollItem">
                    <div class="thumbItem">
                        <img src="img/truyen/manga/kingdom.jpg" alt="">
                        <div class="thumbTitle">
                            <p class="MovieNameThumb"><a  href="">loki</a></p>
                            <div class="thumbMovieDetails">
                                <p>generes: <a href="action.html">action</a>,<a href="action">adventure</a>,<a href="action">Sci-Fi</a></p>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="scrollItem">
                    <div class="thumbItem">
                        <img src="img/truyen/manga/aot.jpg" alt="">
                        <div class="thumbTitle">
                            <p class="MovieNameThumb"><a  href="">thor love and thunder</a></p>
                            <div class="thumbMovieDetails">
                                <p>generes: <a href="action.html">action</a>,<a href="action">adventure</a>,<a href="action">Sci-Fi</a></p>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="scrollItem">
                    <div class="thumbItem">
                        <img src="img/truyen/manga/aot.jpg" alt="">
                        <div class="thumbTitle">
                            <p class="MovieNameThumb"><a  href="">wonder woman</a></p>
                            <div class="thumbMovieDetails">
                                <p>generes: <a href="action.html">action</a>,<a href="action">adventure</a>,<a href="action">Sci-Fi</a></p>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
 </div>


<script src="main.js"></script>
</body>
</html>