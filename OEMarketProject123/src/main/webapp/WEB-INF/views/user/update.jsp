<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
<link rel="stylesheet" href="/resources/assets/css/basic.css">
<link rel="stylesheet" href="/resources/assets/css/main.css">
</head>
<body>
   <section class="insert-section">
      <div class="container">
         <div class="row justify-content-center">
            <div class="col-md-6 col-lg-5">
               <div class="insert-wrap">
                  <img src="/resources/assets/images/cucumber.png">
                  <form role="form" action="/user/update" method="post" name="form">
                     <input type="hidden" readonly="readonly" name="us_id" value='<c:out value="${user.us_id }"/>'>
                     <h1>회원정보수정</h1><br>
                     <div class="form-group join_id">
                        <input type="text" class="form-control"  readonly="readonly" value='<c:out value="${user.us_id }"/>' >
                     </div>
                     <div class="form-group join_pass">
                        <input type="password" readonly="readonly" name="us_pass" 
                           value='<c:out value="${user.us_pass }"/>' class="form-control" >
                     </div>
                     <div class="form-group">
                        <input type="password" class="form-control" placeholder="비밀번호확인" required
                           name="passchk">
                     </div>
                     <div class="form-group">
                        <input type="text" name="us_name" value='<c:out value="${user.us_name }"/>' class="form-control" >
                     </div>
                     <div class="form-group">
                        <input type="text" name="us_birth" value='<c:out value="${user.us_birth }"/>'  class="form-control" >
                     </div>
                     <div class="form-group">
                        <input type="text" name="us_email" value='<c:out value="${user.us_email }"/>' size="35" class="form-control" >
                     </div>
                     <div class="form-group">
                        <select name="us_gender" class="form-control">
                           <option value="male">남성</option>
                           <option value="female">여성</option>
                        </select>
                     </div>
                     <div class="form-group">
                        <input type="text" name="us_address1" value='<c:out value="${user.us_address1 }"/>' 
                           id="sggNm" class="form-control" readonly="readonly">
                        <input type="button" class="form-control join_doubleck" onclick="goPopup()" value="동네찾기" />
                     </div>
                     <div class="form-group">
                        <input type="text" name="us_address2" value='<c:out value="${user.us_address2 }"/>' 
                           id="emdNm" class="form-control"  readonly="readonly">
                     </div>
                     <div class="form-group">
                        <input type="text" class="form-control" maxlength="13" onKeyup="addHypen(this);" value='<c:out value="${user.us_phone }"/>' required
                           name="us_phone">
                     </div>
                     <div class="mt-5">
                        <div class="form-group submit">
                           <input type="submit"  class="form-control btn btn-primary"  value="수정하기" onclick="return updateChk()">
                        </div>
                        <div class="form-group submit fr">
                           <button type="button" class="form-control btn btn-primary" onclick="location.href='/'">홈 화면으로</button>
                        </div>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </section>
</body>

<!-- jQuery -->
<script src="/resources/assets/js/jquery.min.js"></script>

<!-- Bootstrap -->
<script src="/resources/assets/js/bootstrap.min.js"></script>

<!-- Plugins -->
<script src="/resources/assets/js/owl-carousel.js"></script>
<script src="/resources/assets/js/slick.js"></script>

<!-- custom -->
<script src="/resources/assets/js/custom.js"></script>

<script>
 // opener관련 오류가 발생하는 경우 아래 주석을 해지하고, 사용자의 도메인정보를 입력합니다. ("팝업API 호출 소스"도 동일하게 적용시켜야 합니다.)
    //document.domain = "abc.go.kr";
    
    function goPopup(){
       // 주소검색을 수행할 팝업 페이지를 호출합니다.
       // 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
       var pop = window.open("/popup/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
       
       // 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.
        //var pop = window.open("/popup/jusoPopup.jsp","pop","scrollbars=yes, resizable=yes"); 
    }
    
    function jusoCallBack(sggNm,emdNm){
          // 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
       
          document.form.sggNm.value = sggNm;
          document.form.emdNm.value = emdNm;
          
    }
    
    function updateChk() {
        if(document.form.us_id.value.length === 0){
           alert("아이디를 입력해주세요.");
            form.us_id.focus();
           return false;
        }
        if(document.form.us_id.value.length < 4){
          alert("아이디는 4자 이상 입력 해 주세요..");
          form.us_id.focus();
          return false;
         }
        if(document.form.us_pass.value.length === 0){
           alert("비밀번호를 입력해주세요.");
            form.us_pass.focus();
           return false;
        }
        if( ( (document.form.us_pass.value.length > 0 ) && (document.form.us_pass.value.length < 8 ) ) || ( document.form.us_pass.value.length > 16) ){
          alert("비밀번호는 8자 이상 16자 이하로 입력해주세요.");
          form.us_pass.focus();
          return false;
         }
        if(document.form.us_name.value.length === 0){
           alert("이름를 입력해주세요.");
            form.us_name.focus();
           return false;
        }
        if(document.form.us_birth.value.length === 0){
           alert("생년월일를 입력해주세요.");
            form.us_birth.focus();
           return false;
        }
        if(document.form.us_birth.value.length < 8){
           alert("생년월일은 YYYYMMDD 형식으로 입력해주세요");
            form.us_birth.focus();
           return false;
        }
        if(document.form.us_email.value.length === 0){
           alert("이메일를 입력해주세요.");
            form.us_email.focus();
           return false;
        }
        if(document.form.us_address1.value.length === 0){
           alert("주소를 입력해주세요.");
            form.us_address1.focus();
           return false;
        }
        if(document.form.us_phone.value.length === 0){
           alert("핸드폰를 입력해주세요.");
            form.us_phone.focus();
           return false;
        } 
      if(document.form.us_phone.value.length != 13) {
         alert("핸드폰번호를 정확하게 입력해주세요");
            form.us_phone.focus();
         return false;
      }
        if(document.form.passchk.value != document.form.us_pass.value){
           alert("비밀번호가 일치하지 않습니다. 비밀번호를 다시 입력해주세요.");
            form.passchk.focus();
              return false;
        }
           alert("회원 정보 수정이 완료되었습니다.");
           return true;
        }
       
    function addHypen(obj) {
       var number = obj.value.replace(/[^0-9]/g, "");
       var phone = "";

       if(number.length < 4) {
           return number;
       } else if(number.length < 7) {
           phone += number.substr(0, 3);
           phone += "-";
           phone += number.substr(3);
       } else if(number.length < 11) {
           phone += number.substr(0, 3);
           phone += "-";
           phone += number.substr(3, 3);
           phone += "-";
           phone += number.substr(6);
       } else {
           phone += number.substr(0, 3);
           phone += "-";
           phone += number.substr(3, 4);
           phone += "-";
           phone += number.substr(7);
       }
       obj.value = phone;
   }
    </script>
</html>