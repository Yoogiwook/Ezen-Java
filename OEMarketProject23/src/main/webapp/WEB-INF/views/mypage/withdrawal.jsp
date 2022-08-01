<%@	page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.withdrawal{width:400px; margin:0 auto;}
</style>
</head>
<%@ include file="../includes/header.jsp" %>
	<br><br><br><br><br><br><h1 align="center">회원 탈퇴</h1><br>
	<form action="/mypage/withdrawal" method="post" name="form">
		<input type="hidden" name="pass_chk" value="<c:out value="${user.us_pass }" />">
		<input type="hidden" name="my_id" value="<c:out value="${mypage.my_id}" />">
		<table class="withdrawal">
			<tr>
				<td>　　아이디</td>
				<td><c:out value="${mypage.my_id}" /></td>
			</tr>
			<tr>
				<td>　비밀번호</td>
				<td><input type="password" name ="pass"></td>
			</tr>
		</table><br>
		<table class="withdrawal">
			<tr>
				<td>　탈퇴사유 &nbsp;&nbsp;&nbsp;</td>
				<td>
					<select id="selectBox" name="wd_reason_pre">
						<option value="" selected="selected">-------------탈퇴사유 선택-------------</option>
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
				</td>
			</tr>
			<tr>
				<td>하고싶은말<br>　(선택)</td>
				<td><textarea name="wd_remark_pre" rows="4" cols="28"><c:out value="${mypage.wd_remark_pre }"/></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><br><button type="submit" onclick="return withdrawalChk()">회원 탈퇴</button>
					&nbsp;&nbsp;<button type="button" onclick="location.href='/mypage/mypage?my_id=<c:out value="${mypage.my_id }" />'">취소</button></td>
			</tr>
		</table>
	</form>

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