<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chọn lịch xem phim</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
 <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
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
	<section style="padding-top:80px; margin: 0 9%;">
	<form action="chonPhongController?idchinhanh=${sessionScope.idchinhanh}&idphim=${sessionScope.idphim}&date=${sessionScope.startDate}&time=${sessionScope.startTime}" method="post">
		<h2 >Chọn lịch xem phim</h2>
		<br>
        <p>Chọn ngày xem phim</p>
        <select id="listDate" class="form-control form-control-lg" name="startDate" >
            <c:forEach items="${listDates}" var="date">
                <option value="${date}">
                        ${date}
                </option>
            </c:forEach>
        </select>
        <br>
		  <p>Chọn giờ xem phim</p>
        <select id="listTimes" class="form-control form-control-lg" name="startTime">
            <c:forEach items="${listStartTimes}" var="time">
                <option value="${time}">
                        ${time}
                </option>
            </c:forEach>
        </select>
        <br><br>
        <input type="submit" class="btn btn-outline-danger btn-block">
    </form>
	</section>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
    	startDate= $("#listDate").find(":selected").text().trim();
    	startTime= $("#listTimes").find(":selected").text().trim();
    </script>
</body>
</html>