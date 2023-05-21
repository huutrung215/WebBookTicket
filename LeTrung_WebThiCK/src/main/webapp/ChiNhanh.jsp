<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chi Nhánh</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
        .img-branch {
            height: 400px;
        }
        .branch-item {
            margin-bottom: 50px;
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
		<h2 style="margin-left: 9%;">Chọn Chi Nhánh</h2>
		<div class="d-flex  flex-wrap" style="margin-left: 9%;">
		 <c:forEach items="${listC}" var="c">
         <div class="card branch-item" style="width: 41%; margin-right:9%;">
            <div style="width: 100%;">
            	${c.getAnh()}
            </div>
            <div class="card-body">
                <h4 class="card-title">${c.getTenChiNhanh()} </h4>
                <p class="card-text">Địa Chỉ: ${c.getDiaChi()}</p>
                <p><input value="${c.getIdChiNhanh()}" type="text" name="idchinhanh" readonly></p> 
                <p class="card-text">SĐT: ${c.getDienThoai()}</p>
                <a href="lichChieuController?idchinhanh=${c.getIdChiNhanh()}&tencn=${c.getTenChiNhanh()}&idphim=${sessionScope.idphim}" name="${c.idChiNhanh}" class="btn btn-outline-danger btn-block">Chọn</a>          
            </div> 
        </div>
    </c:forEach>
	</div>
	</section>
</body>
</html>