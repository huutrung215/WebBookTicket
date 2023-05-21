<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chọn phòng xem phim</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
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
			<li><a href="">Lịch sử mua vé</a></li>
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
	<section style="padding-top:80px;">
		<h2 style="margin: 0 9%;">Chọn phòng</h2>
		<div class="d-flex  flex-wrap" style="margin: 0 9%;">
		<br>
        	 <c:forEach items="${listR}" var="room">
			    <div class="card branch-item" style="width:500px; margin-bottom:50px">
			        <img class="card-img-top img-branch"
			             src="${room.anh}"
			             alt="Card image" style="width:100%">
			        <div class="card-body">
			            <h4 class="card-title"> ${room.tenPhong} </h4>
			            <p class="card-text">Sức chứa: ${room.soghe} người </p>
			            <a href="chonGheController?idchinhanh=${sessionScope.idchinhanh}&idphim=${sessionScope.idphim}&date=${sessionScope.startDate}&time=${sessionScope.startTime}&idphong=${room.idPhong}&tenphong=${room.tenPhong}"
			              class="btn btn-outline-danger btn-block">Chọn</a>
			        </div>
			    </div>
			 </c:forEach>
        	
        </div>
        <c:out value="${sessionScope.startDate}" />
        <c:out value="${sessionScope.startTime}" />
	</section>
	
	
</body>
</html>