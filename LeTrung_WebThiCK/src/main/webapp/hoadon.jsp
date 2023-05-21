<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hóa đơn</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <style type="text/css">
        th {
            padding: 0px 20px 5px 0px;
        }
    </style>
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
	<section style="padding-top: 5%;" class="container">
		<div class="container">
        <h2>Thanh toán hóa đơn</h2>
        <br>
        <div style="display:flex">
            <table>
                <tr>
                    <th><b>Tên Phim: </b></th>
                    <th>${sessionScope.tenphim}</th>
                </tr>
                <tr>
                    <th><b>Tên Chi Nhánh:</b></th>
                    <th>${sessionScope.tencn}</th>
                </tr>
                <tr>
                    <th><b>Giờ Chiếu:</b></th>
                    <th>${sessionScope.startTime}</th>
                </tr>
                <tr>
                    <th><b>Ngày Chiếu:</b></th>
                    <th>${sessionScope.startDate}</th>
                </tr>
                <tr>
                    <th><b>Tên Phòng:</b></th>
                    <th>${sessionScope.tenphong}</th>
                </tr>
                <tr>
                    <th><b>Số Vé:</b></th>
                    <th>${sessionScope.sove}</th>
                </tr>
                <tr>
                    <th><b>Tiền Vé Đơn:</b></th>
                    <th>${sessionScope.gia}</th>
                </tr>
                <tr>
                    <th><b>Tổng:</b></th>
                    <th>${sessionScope.tongtien}</th>
                </tr>
            </table>
            <div style="margin-left:50px">
                <img src="${sessionScope.schedule.movie.smallImageURl}" alt="">
            </div>
            <div style="margin-left:50px; height: 300px;">
                <img style="height: 100%;" src="${sessionScope.schedule.branch.imgURL}" alt="">
            </div>
        </div>
        <br>
        <a href="thanhtoanController" class="btn btn-outline-danger btn-block">Thanh Toán</a>
</div>
	</section>
</body>
</html>