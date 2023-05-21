<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Thêm phim</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="css/lightslider.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="js/JQuery3.3.1.js"></script>
<script src="js/lightslider.js"></script>
<style>
.dropbtn {
  background-color: #000080;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 200px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown:hover .dropbtn {
  background-color: #3e8e41;
}
</style>
</head>
<body>
<nav>
		<!--logo  -->
		<a href="AdminChinhController" class="logo">
			<img src="images/logo.png" />
		</a>
		<!--menu  -->
		<ul class="menu" style="padding-top: 10px;">
			<li><a href="AdminChinhController">Trang chủ</a></li>
			<li class="nav-item">
        	<div class="dropdown">
			  <a href="#" >Quản lý phim<span><i class="fa-solid fa-chevron-down"></i></span></a>
			  <div class="dropdown-content">
			      <a href="AdminUpPhimController">Thêm</a>
                  <a href="AdminSuaPhimCon">Sửa</a>
                  <a href="AdminXoaController">Xóa</a>
			  </div>
			</div>
			</li>
			<li class="nav-item">
        	<div class="dropdown">
			  <a href="#" >Quản lý suất chiếu<span><i class="fa-solid fa-chevron-down"></i></span></a>
			  <div class="dropdown-content">
			      <a href="AdminThemScCon">Thêm</a>
                  <a href="">Sửa</a>
                  <a href="#">Xóa</a>
			  </div>
			</div>
			</li>
			<li class="nav-item">
	        	<div class="dropdown">
				   <a href="xacnhanController"></span>Xác nhận<span><i class="fa-solid fa-chevron-down"></i></span></a>
				  <div class="dropdown-content">
				      <a href="AdminXnCtController">Xác nhận chi tiết hóa đơn</a>
	                  <a href="AdminXbHdController">Xác nhận hóa đơn</a>
				  </div>
				</div>
        	</li>
		</ul>
		<!--Search  -->
		<!-- <div class="search">
			<input type="text" placeholder="Tìm phim" />
			Search icon 
			<i class="fa-solid fa-magnifying-glass"></i>
		</div> -->
		<ul class="signin" style="display: flex;padding-top: 10px;">
			<c:choose>
				<c:when test="${sessionScope.admin == null}">
					<li class="nav-item" style="padding-right: 30px;">
                        <a href="AdminLoginController" class="btn btn-primary">Đăng nhập</a>
            		</li>
		           <!--  <li class="nav-item">
		                <a href="signupController" class="btn btn-info">Đăng ký</a>
		            </li> -->
				</c:when>
				<c:when test="${sessionScope.admin != null}">
					<li class="nav-item" style="padding-right: 30px;">
						<a href="logoutController" style="color: #F24638;"><i class="fa-regular fa-circle-xmark"></i>Đăng xuất</a></li>
					<li class="nav-item">
						<a href="#">My Account(<c:out value="${sessionScope.TenAdmin}"></c:out>)</a>
					</li>
				</c:when>
			</c:choose>
		</ul>
	</nav>
	<br><br><br>
<section class="container">
	<form method="post" action="AdminThemPhimController" enctype= "multipart/form-data">

  <div class="mb-3 mt-3">
    <label for="tenphim" class="form-label">Tên phim:</label>
    <input type="text" class="form-control" id="tenphim" placeholder="Nhập tên phim" name="txtphim">
  </div>
  <div class="mb-3">
    <label for="chonanh" class="form-label">Chọn ảnh:</label>
    <input id="chonanh" type="file" name="txtfile">
  </div>
  <div class="mb-3 mt-3">
    <label for="loai" class="form-label">Thể loại:</label>
      <input type="text" class="form-control" id="loai" placeholder="Nhập thể loại" name="txtloai">
    </label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
  </form> 
</section>
</body>
</html>