<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>

<!-- Link -->
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
<link rel="stylesheet" href="/resources/assets/css/basic.css">
<link rel="stylesheet" href="/resources/assets/css/main.css">

</head>
<body>

	<section class="login-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 col-lg-5 shadow">
					<div class="login-wrap">
						<img src="/resources/assets/images/cucumber.png">
						<h3 class="mb-4 text-center">오이마켓 시작하기</h3>
						<form action="${contextPath}/loginUser" class="login-form" method="post">
							<div class="form-group">
								<input type="text" name="us_id" class="form-control" placeholder="아이디" required>
							</div>
							<div class="form-group">
								<input id="password-field" name="us_pass" type="password" class="form-control" placeholder="비밀번호" required>
								<span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
							</div>
							<div class="form-group submit_login">
								<button type="submit" class="form-control btn btn-primary">로그인</button>
							</div>
							<div class="form-group d-md-flex">
								<div class="w-50">
									<label class="checkbox-wrap checkbox-primary">아이디 저장
										<input type="checkbox" checked>
										<span class="checkmark"></span>
									</label>
								</div>
							</div>
							<div class="form-group forgot-password">
								<a href="${contextPath}/user/findId">아이디 찾기</a>/
								<a href="${contextPath}/user/findPass">비밀번호 찾기</a>/
								<a href="${contextPath}/user/join">회원가입</a>
							</div>

							<hr>

							<div class="form-group social d-flex text-center">
								<a href="#"><img src="/resources/assets/images/facebook.png"> 페이스북으로 로그인하기</a>
							</div>
							<div class="form-group social d-flex text-center naver">
								<a href="#"><img src="/resources/assets/images/unnamed.png"> 네이버로 로그인하기</a>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	  <!-- jQuery -->
    <script src="/resources/assets/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="/resources/assets/js/bootstrap.min.js"></script>
    <!-- custom -->
    <script src="/resources/assets/js/custom.js"></script>
    
        <script>
      $(".toggle-password").click(function() {
   
         $(this).toggleClass("fa-eye fa-eye-slash");
         var input = $($(this).attr("toggle"));
         if (input.attr("type") == "password") {
         input.attr("type", "text");
         } else {
         input.attr("type", "password");
         }
      });
      
      var result = '<c:out value="${result}"/>';
      
      if(result === 'no'){
         alert("아이디 혹은 비밀번호를 다시 확인해주세요.")
      } 
      
   </script>

</body>
</html>