package com.oe.service;

import com.oe.domain.MarketUserVO;
import com.oe.domain.MyPageVO;

public interface MyPageService {
	/*	
	 *	<마이페이지 초기값 설정>
	 *	프로필 사진 : 웹페이지의 noimage.gif와 같이 기본 이미지 파일을 지정 후, 이를 초기값으로 부여
	 *	닉네임 : 회원가입시 닉네임을 입력해야 하므로 패스
	 *	자기소개 : "자기소개를 입력해주세요." 문구를 초기값으로 부여
	 *	
	 *	<회원 탈퇴>
	 *	MYPAGE 테이블에서만 회원 데이터 삭제(MARKETUSER 테이블에는 남겨놓음.)
	 */
	public MyPageVO get(String my_id); //해당 id를 갖는 회원의 프로필 정보 보기
	public void profileEdit(MyPageVO vo); //닉네임, 자기소개 수정
	public void withdrawal(MyPageVO vo); //회원 탈퇴
	public MarketUserVO getUserInfo(String my_id); //마이페이지에서 가입일 표시, 회원탈퇴 시 비번 확인
	public int getmyCountHB(String my_id); //마이페이지에서 가입일 표시, 회원탈퇴 시 비번 확인
	public void nickEdit_marketuser(MyPageVO vo); //MARKETUSER 테이블 닉네임 수정
	public void nickEdit_marketboard(MyPageVO vo); //MARKETBOARD 테이블 닉네임 수정
	public void nickEdit_buyboard(MyPageVO vo); //BUYBOARD 테이블 닉네임 수정
	public void nickEdit_sellboard(MyPageVO vo); //SELLBOARD 테이블 닉네임 수정
	public void nickEdit_heartboard(MyPageVO vo); //HEARTBOARD 테이블 닉네임 수정
	public void nickEdit_center(MyPageVO vo); //CENTER 테이블 닉네임 수정
	public void saveWithdrawal(MyPageVO vo); //회원탈퇴 진행 과정에서 입력받은 탈퇴이유, 하고싶은말을 일단 MYPAGE 테이블에 저장한 이후
	public void moveWithdrawal(MyPageVO vo); //WITHDRAWAL 테이블에 옮기기
}
