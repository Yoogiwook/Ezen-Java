1. juso.go.kr
2.api 신청
3.url(ip) : http://localhost:8080(톰캣 포트)
4.승인키 획득:
----- 이미 승인키 받은상태에서 톰캣포트가 같으면 안받아도 상관없음
5.jsp source 다운
6.jusoPopup.jsp 안에 
function init(){
	var url = location.href;
	var confmKey = "U01TX0FVVEgyMDIyMDYxMzA5NTI1MTExMjY4MTI="; <-승인키 자리에 획득한 승인키 붙여넣기
7.jusoPopup.jsp 안에 
function jusoCallBack(roadFullAddr){
		document.frm.address.value = roadFullAddr;
} 복사해서 index에 붙여넣기 후 address(id) 자리를 input 의 id값과 맞춰준다