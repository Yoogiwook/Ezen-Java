<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정 페이지</title>
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
function passChk() {
    if(document.form.passchk.value.length === 0){
       alert("비밀번호를 입력해주세요.");
        form.passchk.focus();
       return false;
    }
    else if((document.form.passchk.value != document.form.us_pass.value)){
       alert("비밀번호가 일치하지 않습니다. 비밀번호를 다시 입력해주세요.");
        form.passchk.focus();
          return false;
    }
    else{
       alert("회원 정보 수정이 완료되었습니다.");
       return true;
    }
 }
</script>
<link rel="stylesheet" href="assets/css/basic.css">

<!-- <script type="text/javascript" src="script/OEM.js"></script> -->

</head>
<body>


   <div align="center">
        <form action="/user/update" method="post" name="form">
        <input type="hidden" readonly="readonly" name="us_id" value='<c:out value="${user.us_id }"/>'>
        <h1>회원정보수정</h1>
        <table >
            <tr>
                <th>아이디</th>
                <td><input type="text" readonly="readonly" value='<c:out value="${user.us_id }"/>' size="35"></td>
            <tr>
                <th>비밀번호</th>
                <td colspan="2"><input type="password" readonly="readonly" name="us_pass" 
                value='<c:out value="${user.us_pass }"/>' size="35"></td>
            </tr>
            <tr>
                <th>비밀번호 확인</th>
                <td colspan="2"><input type="password" name="passchk" size="35"></td>
            </tr>
            <tr>
                <th>이름</th>
                <td colspan="2"><input type="text" name="us_name" value='<c:out value="${user.us_name }"/>' size="35"></td>
            </tr>
            <tr>
                <th>생년 월일</th>
                <td colspan="2"><input type="text" name="us_birth" value='<c:out value="${user.us_birth }"/>' size="35"></td>
            </tr>
            <tr>
                <th>메일주소</th>
                <td colspan="2"><input type="text" name="us_email" value='<c:out value="${user.us_email }"/>' size="35"></td>
            </tr>
            <tr>
                <th>성별</th>
                <td colspan="2">
                    <select name="us_gender">
                        <option value="male">남성</option>
                        <option value="female">여성</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>주소</th>
                <td colspan="2">
                    <input type="text" name="us_address1" value='<c:out value="${user.us_address1 }"/>' 
                    id="sggNm" size="8" readonly="readonly">
                   <input type="text" name="us_address2" value='<c:out value="${user.us_address2 }"/>' 
                   id="emdNm" size="8" readonly="readonly">
                    <input type="button" onClick="goPopup();" value="동네찾기"/>
                </td>
            </tr>
            <tr>
                <th>전화번호</th>
                <td><input type="text" value='<c:out value="${user.us_phone }"/>' name="us_phone" size="35"></td>
            </tr>
            <tr>
                <td colspan="3" align="center">
                    <input type="submit" value="수정하기" onclick="return passChk()">
                    <input type="button" value="목록으로" onclick="location.href='${contextPath}/board/boardList'">
                </td>
            </tr>
            <tr>
                <td colspan="3" align="center">
                    <input type="button" value="홈화면으로" onclick="location.href='${contextPath}/'">
                </td>
            </tr>
        </table>
        </form>
    </div>

</body>
</html>