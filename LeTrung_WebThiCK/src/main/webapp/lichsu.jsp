<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lich su</title>
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
	<br><br><br>
	<div class="container-fluid">
	<h2>Lịch Sử Mua Vé </h2>
	<br>
    <div>
        <table class="table table-striped" style="width:100%">
            <tr>
                <th>Ngày Chiếu</th>
                <th>Thời Gian Chiếu</th>
                <th>Ghế</th>
                <th>Tên Phòng</th>
                <th>Phim</th>
                <th>Chi Nhánh</th>
                <th>Gía</th>
                <th>Ngày Tạo</th>
                <th>Xác Nhận</th>
            </tr>
            <c:forEach items="${lichsu}" var="ls">
                <tr>
                    <td>${ls.getNgayChieu()}</td>
                    <td>${ls.getThoiGianChieu()}</td>
                    <td>${ls.getMaGhe()}</td>
                    <td>${ls.getTenphong()}</td>
                    <td>${ls.getTenphim()}</td>
                    <td>${ls.getTenchinhanh()}</td>
                    <td>${ls.getGia()}</td>
                    <td>${ls.getNgayTao() }</td>
                    <c:choose>
	                	<c:when test="${ls.isDamua() == false}">
		                  <td>Chưa xác nhận</td>
	                  	</c:when>
	                  	<c:otherwise>
	                  		<td>Đã xác nhận</td>
	                  	</c:otherwise>
                  </c:choose>
                </tr>
            </c:forEach>


        </table>
	</div>
</body>
</html>