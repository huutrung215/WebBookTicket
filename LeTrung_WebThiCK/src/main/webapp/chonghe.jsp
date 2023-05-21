<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Chọn ghế xem phim</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap-grid.css">
<link rel="stylesheet" href="css/bootstrap-reboot.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>

 .screen {
            background: rgb(71, 165, 209);
            height: 70px;
            width: 70%;
            margin: 15px 10%;
            transform: rotateX(-45deg);
            box-shadow: 0 3px 10px rgba(19, 120, 145, 0.7);
        }

ol {
  list-style: none;
  padding: 0;
  margin: 0;
}

.seats {
  display: flex;
  flex-direction: row;
  flex-wrap: nowrap;
  justify-content: flex-start;
}

.seat label {
  display: block;
  position: relative;
  width: 60%;
  text-align: center;
  font-size: 14px;
  font-weight: bolder;
  line-height: 1.5rem;
  padding: 31px 22px;
  background: #656e65;
  border-radius: 5px; 
  color: black; 
}

.seat label:hover {
  cursor: pointer;
}

.seat{
   width: 165px;
    height: 90px;
    display: flex;
    padding: -7px;
    margin-right: -40px;
    border-radius: 5px;
}

.seat input[type=checkbox] {
  position: absolute;
}
.seat input[type=checkbox]:checked + label {
  background: #5bfc60;
}

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
	
	<section style="padding-top: 5%;" class="container">
		<h2 style="margin-left: 38%;">Màn Hình</h2>
	    <div class="screen"></div>
	    <br><br><br>
	   <!--  nhung ma ghe co trong viewchonghe thi se mau do, ko thi se mau xanh -->
	    <form action="hoadonController" method="post">
        <ol>
            <li>
              <ol class="seats">
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A1')}">
	                  <input type="checkbox" id="A1" value="A1" checked disabled/>
	                  <label style="background: #FF0000;"  for="A1">A1</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A1" name="check" value="A1"/>
	                  	<label for="A1">A1</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A2')}">
	                  <input type="checkbox" id="A2" value="A2" checked disabled/>
	                  <label style="background: #FF0000;"  for="A1">A2</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A2" name="check" value="A2"/>
                 		<label for="A2">A2</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A3')}">
	                  <input type="checkbox" id="A3" value="A3" checked disabled/>
	                  <label style="background: #FF0000;"  for="A3">A3</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A3" name="check" value="A3"/>
                  		<label for="A3">A3</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A4')}">
	                  <input type="checkbox" id="A4" value="A4" checked disabled/>
	                  <label style="background: #FF0000;"  for="A4">A4</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A4" name="check" value="A4"/>
                  		<label for="A4">A4</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A5')}">
	                  <input type="checkbox" id="A5" value="A5" checked disabled/>
	                  <label style="background: #FF0000;"  for="A5">A5</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A5" name="check" value="A5"/>
                  		<label for="A5">A5</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A6')}">
	                  <input type="checkbox" id="A6" value="A6" checked disabled/>
	                  <label style="background: #FF0000;"  for="A6">A6</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A6" name="check" value="A6"/>
                  		<label for="A6">A6</label>
                  	</c:otherwise>
                  </c:choose>  
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A7')}">
	                  <input type="checkbox" id="A7" value="A7" checked disabled/>
	                  <label style="background: #FF0000;"  for="A7">A7</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A7" name="check" value="A7"/>
                  		<label for="A7">A7</label>
                  	</c:otherwise>
                  </c:choose>   
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('A8')}">
	                  <input type="checkbox" id="A8" value="A8" checked disabled/>
	                  <label style="background: #FF0000;"  for="A8">A8</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="A8" name="check" value="A8"/>
                  		<label for="A8">A8</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
              </ol>
            </li>
            <li>
              <ol class="seats">
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B1')}">
	                  <input type="checkbox" id="B1" value="B1" checked disabled/>
	                  <label style="background: #FF0000;"  for="B1">B1</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B1" name="check" value="B1"/>
	                  	<label for="B1">B1</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B2')}">
	                  <input type="checkbox" id="B2" value="B2" checked disabled/>
	                  <label style="background: #FF0000;"  for="A1">B2</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B2" name="check" value="B2"/>
                 		<label for="B2">B2</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B3')}">
	                  <input type="checkbox" id="B3" value="B3" checked disabled/>
	                  <label style="background: #FF0000;"  for="A3">B3</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B3" name="check" value="B3"/>
                  		<label for="B3">B3</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B4')}">
	                  <input type="checkbox" id="B4" value="B4" checked disabled/>
	                  <label style="background: #FF0000;"  for="B4">B4</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B4" name="check" value="B4"/>
                  		<label for="B4">B4</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B5')}">
	                  <input type="checkbox" id="B5" value="B5" checked disabled/>
	                  <label style="background: #FF0000;"  for="B5">B5</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B5" name="check" value="B5"/>
                  		<label for="B5">B5</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B6')}">
	                  <input type="checkbox" id="B6" value="B6" checked disabled/>
	                  <label style="background: #FF0000;"  for="B6">B6</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B6" name="check" value="B6"/>
                  		<label for="B6">B6</label>
                  	</c:otherwise>
                  </c:choose>  
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B7')}">
	                  <input type="checkbox" id="B7" value="B7" checked disabled/>
	                  <label style="background: #FF0000;"  for="B7">B7</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B7" name="check" value="B7"/>
                  		<label for="B7">B7</label>
                  	</c:otherwise>
                  </c:choose>   
                </li>
                <li class="seat">
                <c:choose>
                	<c:when test="${listg.contains('B8')}">
	                  <input type="checkbox" id="B8" value="B8" checked disabled/>
	                  <label style="background: #FF0000;"  for="B8">B8</label>
                  	</c:when>
                  	<c:otherwise>
                  		<input type="checkbox" id="B8" name="check" value="B8"/>
                  		<label for="B8">B8</label>
                  	</c:otherwise>
                  </c:choose>
                </li>
              </ol>
            </li>
            <li>
              <ol class="seats">
                <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C1')}">
              <input type="checkbox" id="C1" value="C1" checked disabled/>
              <label style="background: #FF0000;"  for="C1">C1</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C1" name="check" value="C1"/>
              <label for="C1">C1</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C2')}">
              <input type="checkbox" id="C2" value="C2" checked disabled/>
              <label style="background: #FF0000;"  for="A1">C2</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C2" name="check" value="C2"/>
              <label for="C2">C2</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C3')}">
              <input type="checkbox" id="C3" value="C3" checked disabled/>
              <label style="background: #FF0000;"  for="A3">C3</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C3" name="check" value="C3"/>
              <label for="C3">C3</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C4')}">
              <input type="checkbox" id="C4" value="C4" checked disabled/>
              <label style="background: #FF0000;" for="C4">C4</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C4" name="check" value="C4"/>
              <label for="C4">C4</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C5')}">
              <input type="checkbox" id="C5" value="C5" checked disabled/>
              <label style="background: #FF0000;"  for="C5">C5</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C5" name="check" value="C5"/>
              <label for="C5">C5</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C6')}">
              <input type="checkbox" id="C6" value="C6" checked disabled/>
              <label style="background: #FF0000;"  for="C6">C6</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C6" name="check" value="C6"/>
              <label for="C6">C6</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C7')}">
              <input type="checkbox" id="C7" value="C7" checked disabled/>
              <label style="background: #FF0000;"  for="C7">C7</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C7" name="check" value="C7"/>
              <label for="C7">C7</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('C8')}">
              <input type="checkbox" id="C8" value="C8" checked disabled/>
              <label style="background: #FF0000;"  for="C8">C8</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="C8" name="check" value="C8"/>
              <label for="C8">C8</label>
            </c:otherwise>
          </c:choose>
        </li>
              </ol>
            </li>
            <li>
              <ol class="seats">
                <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D1')}">
	              <input type="checkbox" id="D1" value="D1" checked disabled/>
	              <label style="background: #FF0000;"  for="D1">D1</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D1" name="check" value="D1"/>
	              <label for="D1">D1</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
	        <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D2')}">
	              <input type="checkbox" id="D2" value="D2" checked disabled/>
	              <label style="background: #FF0000;"  for="A1">D2</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D2" name="check" value="D2"/>
	              <label for="D2">D2</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
	        <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D3')}">
	              <input type="checkbox" id="D3" value="D3" checked disabled/>
	              <label style="background: #FF0000;"  for="A3">D3</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D3" name="check" value="D3"/>
	              <label for="D3">D3</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
	        <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D4')}">
	              <input type="checkbox" id="D4" value="D4" checked disabled/>
	              <label style="background: #FF0000;"  for="D4">D4</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D4" name="check" value="D4"/>
	              <label for="D4">D4</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
	        <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D5')}">
	              <input type="checkbox" id="D5" value="D5" checked disabled/>
	              <label style="background: #FF0000;"  for="D5">D5</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D5" name="check" value="D5"/>
	              <label for="D5">D5</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
	        <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D6')}">
	              <input type="checkbox" id="D6" value="D6" checked disabled/>
	              <label style="background: #FF0000;"  for="D6">D6</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D6" name="check" value="D6"/>
	              <label for="D6">D6</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
	        <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D7')}">
	              <input type="checkbox" id="D7" value="D7" checked disabled/>
	              <label style="background: #FF0000;"  for="D7">D7</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D7" name="check" value="D7"/>
	              <label for="D7">D7</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
	        <li class="seat">
	          <c:choose>
	            <c:when test="${listg.contains('D8')}">
	              <input type="checkbox" id="D8" value="D8" checked disabled/>
	              <label style="background: #FF0000;"  for="D8">D8</label>
	            </c:when>
	            <c:otherwise>
	              <input type="checkbox" id="D8" name="check" value="D8"/>
	              <label for="D8">D8</label>
	            </c:otherwise>
	          </c:choose>
	        </li>
     	 </ol>
         </li>
         <li>
      <ol class="seats">
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E1')}">
              <input type="checkbox" id="E1" value="E1" checked disabled/>
              <label style="background: #FF0000;"  for="E1">E1</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E1" name="check" value="E1"/>
              <label for="E1">E1</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E2')}">
              <input type="checkbox" id="E2" value="E2" checked disabled/>
              <label style="background: #FF0000;"  for="A1">E2</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E2" name="check" value="E2"/>
              <label for="E2">E2</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E3')}">
              <input type="checkbox" id="E3" value="E3" checked disabled/>
              <label style="background: #FF0000;"  for="A3">E3</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E3" name="check" value="E3"/>
              <label for="E3">E3</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E4')}">
              <input type="checkbox" id="E4" value="E4" checked disabled/>
              <label style="background: #FF0000;"  for="E4">E4</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E4" name="check" value="E4"/>
              <label for="E4">E4</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E5')}">
              <input type="checkbox" id="E5" value="E5" checked disabled/>
              <label style="background: #FF0000;"  for="E5">E5</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E5" name="check" value="E5"/>
              <label for="E5">E5</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E6')}">
              <input type="checkbox" id="E6" value="E6" checked disabled/>
              <label style="background: #FF0000;"  for="E6">E6</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E6" name="check" value="E6"/>
              <label for="E6">E6</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E7')}">
              <input type="checkbox" id="E7" value="E7" checked disabled/>
              <label style="background: #FF0000;"  for="E7">E7</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E7" name="check" value="E7"/>
              <label for="E7">E7</label>
            </c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <c:choose>
            <c:when test="${listg.contains('E8')}">
              <input type="checkbox" id="E8" value="E8" checked disabled/>
              <label style="background: #FF0000;"  for="D8">D8</label>
            </c:when>
            <c:otherwise>
              <input type="checkbox" id="E8" name="check" value="D8"/>
              <label for="E8">E8</label>
            </c:otherwise>
          </c:choose>
        </li>
      </ol>
    </li>
  </ol>
    <button type="submit" style="width: 88%;" class="btn btn-outline-danger btn-block">Tiếp Tục</button> 
  </form>
    </section>
</body>
</html>