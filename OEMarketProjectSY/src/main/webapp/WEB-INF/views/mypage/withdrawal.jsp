<%@   page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 탈퇴</title>
   <link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
   <link rel="stylesheet" href="/resources/assets/css/font-awesome.css">
   <link rel="stylesheet" href="/resources/assets/css/basic.css">
   <link rel="stylesheet" href="/resources/assets/css/main.css">
</head>
<body>
   <section class="insert-section">
      <div class="container">
         <div class="row justify-content-center">
            <div class="col-md-6 col-lg-5 shadow">
               <div class="insert-wrap">
                  <img src="/resources/assets/images/warning.png">
                  <h3 class="mb-4 text-center">회원 탈퇴</h3>
                  <form action="/mypage/withdrawal" method="post" name="form">
                     <input type="hidden" name="pass_chk" value="<c:out value="${user.us_pass }" />">
                     <input type="hidden" name="my_id" value="<c:out value="${mypage.my_id}" />">
                     <div class="form-group">
                        <c:out value="${mypage.my_nickname}" />님,<br>그동안 오이마켓과 함께해주셔서 감사했습니다.
                     </div>
                     <div class="form-group">
                        <input type="password" class="form-control" name="pass" placeholder="비밀번호 확인">
                     </div>
                     <div class="form-group">
                        <select class="form-control" id="selectBox" name="wd_reason_pre">
                           <option value="" selected="selected">탈퇴사유 선택</option>
                           <option value="개인 정보 유출이 우려되어서">개인 정보 유출이 우려되어서</option>
                           <option value="이용이 불편해서">이용이 불편해서</option>
                           <option value="이용 빈도가 낮아서">이용 빈도가 낮아서</option>
                           <option value="더 이상 이용하지 않을 예정이어서">더 이상 이용하지 않을 예정이어서</option>
                           <option value="다른 서비스를 이용하기 위해서">다른 서비스를 이용하기 위해서</option>
                           <option value="건의사항이 잘 반영되지 않아서">건의사항이 잘 반영되지 않아서</option>
                           <option value="고객센터 응대가 불친절해서">고객센터 응대가 불친절해서</option>
                           <option value="다른 유저와의 불화로 인해서">다른 유저와의 불화로 인해서</option>
                           <option value="기타">기타</option>
                        </select>
                     </div>
                     <div class="form-group">
                        <textarea rows="5" cols="20" class="form-control" name="wd_remark_pre" placeholder="하고 싶은 말을 적어주세요. (선택사항)"><c:out value="${mypage.wd_remark_pre }"/></textarea>
                     </div>
                     <div class="mt-5">
                        <div class="form-group submit">
                           <button class="form-control btn btn-danger" type="submit" onclick="return withdrawalChk()" style="background-color:#CC3333; border:1px;">회원 탈퇴</button>
                        </div>
                        <div class="form-group submit fr">
                           <button class="form-control btn btn-primary" type="button" onclick="location.href='/mypage/mypage?my_id=<c:out value="${mypage.my_id }" />'">취소</button>
                        </div>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </section>
</body>

<script type="text/javascript">
   function withdrawalChk() {
      if(document.form.pass.value.length === 0){
         alert("비밀번호를 입력해주세요.");
         form.pass.focus();
         return false;
      }else if(document.form.pass.value != document.form.pass_chk.value){
         alert("비밀번호가 일치하지 않습니다. 비밀번호를 다시 입력해주세요.");
         form.pass.focus();
         return false;
      }else if(document.form.wd_reason_pre.value.length === 0) {
         alert("탈퇴사유를 선택해주세요.");
         form.wd_reason_pre.focus();
         return false;
      }else{
         alert("회원 탈퇴가 완료되었습니다. 지금까지 오이마켓과 함께해주셔서 감사합니다.");
         return true;
      }
   }
</script>

<%@ include file="../includes/footer.jsp" %>