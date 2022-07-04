function CreateAccountCheck(){
	if(document.form.id.value.length == 0){
		alert("아이디를 입력 해 주세요.");
		form.id.focus();
		return false;
	} 
	if(document.form.id.value.length < 4){
		alert("4자 이상 입력 해 주세요..");
		form.id.focus();
		return false;
		}
	if(document.form.pass.value.length = 0){
		alert("비밀 번호를 입력 해 주세요.");
		form.pass.focus();
		return false;
	}
	if( ( (document.form.pass.value.length > 0 ) && (document.form.pass.value.length < 8 ) ) || ( document.form.pass.value.length > 16) ){
		alert("비밀번호를 다시 입력 해 주세요.");
		form.pass.focus();
		return false;
		}
	if(document.form.pass.value != document.form.passchk.value){
		alert("비밀번호가 일치하지 않습니다. 비밀번호를 다시 입력 해 주세요. ");
	    form.passchk.focus();
	   	return false;
		}
	if(document.form.uname.value.length == 0){
		alert("회원성명을 입력 해 주세요.");
		form.uname.focus();
		return false;
	}
		
	if(document.form.email.value.length == 0){
		alert("이메일을 입력 해 주세요.");
		form.email.focus();
		return false;
		}
		
	if(document.form.address.value.length == 0){
		alert("주소를 입력 해 주세요.");
		form.address.focus();
		return false;
	}
		
	if(document.form.phone.value.length == 0){
		alert("회원 전화번호를 입력 해 주세요.");
		form.phone.focus();
		return false;
		}
	
	
	return true;
}

function idChk() {
	if(document.form.id.value.length == 0 ){
			alert("아이디를 입력 해 주세요.");
			form.id.focus();
			return false;
		}
	var url = "idChk.jsp?id=" + document.form.id.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizeable=no, width=550, height=250");
}

function idok(){
   opener.form.id.value = document.form.id.value;
   opener.form.reid.value = document.form.id.value;
   self.close();
}
