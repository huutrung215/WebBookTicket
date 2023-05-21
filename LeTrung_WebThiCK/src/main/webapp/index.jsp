<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Movies Website</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="css/lightslider.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="js/JQuery3.3.1.js"></script>
<script src="js/lightslider.js"></script>
</head>
<body>
	<nav>
		<!--logo  -->
		<a href="htTruyenController" class="logo">
			<img src="images/logo.png" />
		</a>
		<!--menu  -->
		<ul class="menu" style="padding-top: 10px;">
			<li><a href="htTruyenController">Trang chủ</a></li>
			<li><a href="lichsuController">Lịch sử mua vé</a></li>
			<li><a href="">Cá nhân</a></li>
			<li><a href="">Liên hệ</a></li>
		</ul>
		<!--Search  -->
		<!-- <div class="search">
			<input type="text" placeholder="Tìm phim" />
			Search icon 
			<i class="fa-solid fa-magnifying-glass"></i>
		</div> -->
		<ul class="signin" style="display: flex;padding-top: 10px;">
			<c:choose>
				<c:when test="${sessionScope.kh == null}">
					<li class="nav-item" style="padding-right: 30px;">
                        <a href="loginController" class="btn btn-primary">Đăng nhập</a>
            		</li>
		            <li class="nav-item">
		                <a href="signupController" class="btn btn-info">Đăng ký</a>
		            </li>
				</c:when>
				<c:when test="${sessionScope.kh != null}">
					<li class="nav-item" style="padding-right: 30px;">
						<a href="loginController" style="color: #F24638;"><i class="fa-regular fa-circle-xmark"></i>Đăng xuất</a></li>
					<li class="nav-item">
						<a href="#">My Account(<c:out value="${sessionScope.TenDangNhap}"></c:out>)</a>
					</li>
				</c:when>
			</c:choose>
		</ul>
	</nav>
	
	<!-- Phim mới nhất  -->
	<section id="latest" style="padding-top: 80px;">
		<h2 class="showcase-heading">Phim hot</h2>
		<!--slider  -->
		<ul id="autoWidth" class="cs-hidden">
		<c:forEach items="${listP}" var="o">
			<li class="item-a">
		  	<!--showcase box  -->
				<div class="latest-box">
					<div class="latest-b-img">
	                    <img src="${o.getAnh()}">
	                </div>
				</div>
				<a href="chiNhanhController?idphim=${o.id}&tenphim=${o.getTenphim()}" style="text-decoration: none;" name="${o.id}">
				 <div class="latest-b-text">
                    <strong>${o.tenphim }</strong>
                    <p>${o.theloai }</p>
                </div>
			</a>
		  </li>
		</c:forEach>
		</ul>
	</section>
	<!-- movies -->
	<div class="movies-heading" style="margin-top: -14%;">
		<h1>Tất cả</h1>
	</div>
	<section id="movies-list" style="margin-top: 0;">
	<c:forEach items="${listP}" var="o">
		<!-- box-1 -->
		<div class="movies-box">
			<!--img  -->
			<div class="movies-img">
				<img src="${o.getAnh()}">
			</div>
			<!--test  -->
			<a href="chiNhanhController?idphim=${o.id}&tenphim=${o.getTenphim()}" style="text-decoration: none;" name="${o.id}">
				 <div class="latest-b-text">
                    <strong>${o.tenphim}</strong>
                    <p>${o.theloai }</p>
                </div>
			</a>
		</div>
	</c:forEach>
	</section>
	
	
	<footer>
		<p>Going to Internet, Ltd Cusumer Website</p>
		<p>Copyright 2022 - GoingToInternet</p>
	</footer>
	<!-- slider script -->
	<script>
	  $(document).ready(function() {
		    $('#autoWidth').lightSlider({
		        autoWidth:true,
		        loop:true,
		        onSliderLoad: function() {
		            $('#autoWidth').removeClass('cS-hidden');
		        } 
		    });  
		  });
	  
	  $(document).ready(function() {
		    var autoplaySlider = $('#autoplay').lightSlider({
		        auto:true,
		        loop:true,
		        pauseOnHover: true,
		        onBeforeSlide: function (el) {
		            $('#current').text(el.getCurrentSlideCount());
		        } 
		    });
		    $('#total').text(autoplaySlider.getTotalSlideCount());
		});
	</script>
</body>
</html>