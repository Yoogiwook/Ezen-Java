
*<새 작업 진행하실 때는 항상 변경사항을 README에 작성해주세요.>

***************************************************
0722 - 정빈<작성 중>

DGVO 작성
CrawlingMapper.java 작성
CrawlingMapper.xml 작성

CrawlingMapperTests.java 작성 후 테스트 성공

- C Read U D 파트
CrawlingMapper.java 코드 추가 -> public DGVO read(int no);

CrawlingMapper.xml에 아래 코드 추가
<select id="read" resultType="com.oe.domain.DGVO">
  	select * from crawlingTest where no = #{no}
</select>

CrawlingMapperTests.java 읽기 테스트 성공

pom.xml에 jsoup 추가
CrawlingTestController.java 작성

****************************************************
0722 - 정빈

views/includes 폴더에 header.jsp와 footer.jsp 따로 나눠뒀습니다.
<%@ include file="../includes/header.jsp" %> -> header와 footer가 필요하신 페이지에
<%@ include file="../includes/footer.jsp" %> -> 이 코드들을 복붙해주시면 됩니다.

****************************************************

0722 - 기욱<작성 중>
MarketUserController 클래스 작성
MarketUserVO 클래스 작성
MarketUserMapper 인터페이스 작성
MarketUserService 인터페이스 작성
MarketUserServiceImpl 클래스 작성

MarketUserMapper.xml 작성 중

20220721 작업 결과 
	userjoin 성공 데이터베이스 등록 확인.
	인터페이스 서비스 작성
	서비스임플 구현
	컨트롤러 어노테이션 등록
	컨트롤러에서 서비스임플 사용
	매퍼.xml 에서 insert sql문 작성
	실행 오류 => 어드레스1,2,3 VO에서 수정안함. 오류잡기 성공. 디비에 넣기 성공. 집에감.


join.jsp 작성

****************************************************


0722 - 진아 - 마이페이지 유저 정보 수정 확인 중

update.jsp 작성


****************************************************

0722 - 정빈, 수정 - 보드리스트카테고리 정렬

20220722 작업결과 
	디비에서 가져와서 jsp 화면에 크롤링한 데이타 뿌리기
	크롤링하기 전에 디비 딜리트하기 (카테고리를 널값으로 넣어줌)

<해야될 것>
인기상품순 select * from MarketBoard order by heart_count desc;
최신등록순 select * from MarketBoard order by regidate desc;
낮은가격순 select * from MarketBoard order by price;
높은가격순 select * from MarketBoard order by price desc;

오른쪽 네비게이션 바 bookshop에서 참고해서 구현하기
보드리스 pagging처리
상세페이지에서 작성자가 판매자가 판매완료 눌렀을 시 페이지에 판매완료 뜨게 하기
검색페이지 
상품등록페이지만들기



******************************************************

0722 - 정빈, 기욱

메인 페이지 jsp 입력 및 수정. 검색 아이콘 옆 메뉴 바는 카테고리 검색을 위한 부분입니다.(아직 동작 x)


메인 페이지에서 다른 페이지로 넘어가는 부분을 추가했습니다.
WEB-INF 폴더가 브라우저에서 직접적으로 접근 불가능한 폴더이므로 각 컨트롤러에 Mapping을 해줘서
넘어가는 부분을 구현했고,
[다른 페이지에 넘어간 이후에 특정 페이지에 들어가려하면 예를 들어 boardList.jsp에서 login.jsp를
요청하면 경로에 문제가 생겨서 차후에 수정하고자 합니다.]


*******************************************************

0722 - 기욱, 진아

join.jsp 작성
join.jsp 주소 api 추가(시군구 동 만 입력)
MarketUserVO 클래스 수정
address3 삭제

userupdate 성공 데이터베이스 수정 확인.
   한글 깨짐 현상 발생.
   web.xml 에 필터 추가
   <filter>
      <filter-name>encoding</filter-name>
      <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
      <init-param>
         <param-name>encoding</param-name>
         <param-value>UTF-8</param-value>
      </init-param>
   </filter>
   <filter-mapping>
      <filter-name>encoding</filter-name>
      <servlet-name>appServlet</servlet-name>
   </filter-mapping>
   한글 깨짐 현상 조치 완료
   
********************************************


0723 - 수연
▶페이지 디자인 폴더에 회원탈퇴 페이지.jpg & 회원탈퇴 확인 알림창.jpg 추가
▶OEMarketProject에서 생성 및 수정한 파일 목록 (VO 제외)
   ▷MyPageMapper.xml, MyPageMapper.java
   ▷MyPageService.java, MyPageServiceImpl.java, MyPageController.java
   ▷MyPageMapperTests.java, MyPageControllerTests.java
   ▷mypage.jsp, withdrawal.jsp(회원탈퇴 페이지. 비어있음.)
   ▷HeartBoardMapper.java, HeartBoardService.java

**********************************************************************

0725 - 수연
      ▶참조 및 진행 흔적 폴더에 클래스 다이어그램 폴더(발표한 ppt + 이미지 원본) 추가
      ▶마이페이지 로직 수정(프로필 변경 시 이미지, 닉네임, 자기소개가 동시에 업데이트 되도록 변경)
      ▼프로필 변경, 개인정보 페이지 이동, 회원탈퇴 페이지 이동이 잘 동작하도록 파일 수정 후 확인 완료.
         ▼변경한 파일 목록
            ▶MyPageMapper.java, MyPageMapper.xml, Service.java, ServiceImpl.java
            ▶MyPageController.java, mypage.jsp


0725 - 진아

회원가입 시 Mypage테이블에도 등록 되도록 추가
->  MarketUserMapper.xml , MarketUserMapper.java => joinMypage 추가
   MarketUserService.java , MarketUserServiceImpl.java => MyRegister 추가
   MarketUserController.java => (@Post)joinUser에 추가

마이페이지 - 회원탈퇴 기능 구현 완성
비밀번호 확인 후 넘어가도록 구현
마이페이지 테이블에서만 삭제 되고 유저 테이블에는 남아있게 구현
->  MyPageMapper.xml , MyPageMapper.java => getUserPass 추가
   MyPageService.java , MyPageServiceImpl.java => checkPass 추가
   MyPageController.java => (@Get)get에 checkPass추가, (@Post)withdrawal에    withdrawal 추가
   withdrawal.jsp 작성 & 실행 확인 

**********************************************************************

0725 - 기욱 

findId, findPass.jsp 폼 추가 (실행은 안됨;;)
login.jsp, 진아, 수연 작업 하나로 통합

**********************************************************************

0726 - 진아

update 비밀번호 체크 수정 완료 user/update.jsp 닉네임 뺐음 -> 닉네임은 마이페이지에서만 수정 가능

`user/update 주소 수정 시 등록 상품 주소도 바뀌도록 수정 -> MarketUserMapper.java, MarketUserMapper.xml -> updateAdrr 추가 MarketUserService.java, MarketUserServiceImpl.java -> modifyAdrr 추가 MarketUserController.java -> (@Post)updateUser에 modifyAdrr 추가

` MarketUserController.java -> 회원가입 후 인덱스로 이동하게 수정

`include/header.jsp 에 아래거 집어넣음 ㅜㅜㅜ 제이쿼리 작동됨 ㅜ => <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

(합친 후에 마이페이지 폼,버튼 제이쿼리로 정리 해야함)

0726 - 수연 ▶1 - DB, VO 클래스들 내용 입력 및 수정 ▼1에서 입력 및 수정한 파일 목록 (domain 패키지 이걸로 싹 갈아엎어주세여) ▶BuyBoardVO.java, CenterVO.java, HeartBoardVO.java, MarketBoardVO.java , MarketUserVO.java, MyPageVO.java, SellBoardVO.java ▶2 - 마이페이지 로직 수정 ▼2-1. 로직 변경 사항 ▶2-1-1. 프로필 변경 시 다른 테이블들에서도 동시에 닉네임 수정이 처리되도록 변경 ▶2-1-2. 마이페이지에서 회원 닉네임, 가입일자, 찜 갯수가 표시되도록 함 ▼2-2. 2에서 변경한 파일 목록 ▶MyPageMapper.java, MyPageMapper.xml, MyPageService.java, MyPageServiceImpl.java , MyPageController.java, mypage.jsp ▶3 - 찜 목록 구현 시작 ▼생성 및 수정한 파일 목록 ▶HeartBoardMapper.java, HeartBoardMapper.xml, HeartBoardController.java , HeartBoardService.java, HeartBoardServiceImpl.java

**********************************************************************
0727 - 기욱, 신영

login, logout 구현 완성
로그인 시 유저테이블, 마이페이지 id 비교해서 마이페이지에 데이터가 있어야지만 로그인 가능
회원 탈퇴시 유저테이블 데이터 잔존 마이페이지에만 데이터 삭제 회원 탈퇴시 로그인 불가능
login 후 다른페이지 넘어가도 세션 유지 가능
관리자 페이지 작성중.
join.jsp css작업 - js에 동네찾기 api 넣었을때 작동 안함 -> 일단 jsp 파일에 js 같이 놓으면 사용가능
join.jsp js작업중.

**********************************************************************

0727 - 기욱, 진아

채팅 api 프로젝트에 적용중, 채팅방 생성은 되는데 채팅 전송이 안됨 확인중..
config 패키지 - WebSocketConfig
handler 패키지 - SocketHandler
view-chat-chat.jsp, room.jsp 작성
지금까지 작업한것들 하나로 취합

0727 - 수정, 진아, 기욱 파일 다중 업로드 진행 완료

**1. pom.xml에 fileupload DI 추가

commons-fileupload commons-fileupload 1.4 commons-io commons-io 2.5 **2. servlet-context.xml에 아래 추가

<beans:bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver"> <beans:property name="maxUploadSize" value="5242880" /> <beans:property name="maxInMemorySize" value="1048576" /> </beans:bean>

**3. c드라이브에 oe_Upload 폴더 생성 - 그림 파일이 저장될 공간

**4. boardInsert.jsp의 아래 코드 value 값 변경.(marketuser 테이블에 등록된 것으로)

**5. boardInsert.jsp form에 multiple="multiple" 추가와 MarketBoardController.java 작성 후 실행

/* 단일 파일 업로드 코드 */ @PostMapping("boardRegister.do") public String boardRegister(MultipartHttpServletRequest mtfRequest) {

MultipartFile mf = mtfRequest.getFile("bo_image1");
String bo_id = mtfRequest.getParameter("bo_id");
String bo_title = mtfRequest.getParameter("bo_title");
String bo_price = mtfRequest.getParameter("bo_price");
String bo_content = mtfRequest.getParameter("bo_content");
String bo_nickname = mtfRequest.getParameter("bo_nickname");
String bo_address1 = mtfRequest.getParameter("bo_address1");
String bo_address2 = mtfRequest.getParameter("bo_address2");


String path = "C:\\oe_Upload\\";

String originFileName = mf.getOriginalFilename(); // 원본 파일 명
long fileSize = mf.getSize(); // 파일 사이즈

System.out.println("originFileName : " + originFileName);
System.out.println("fileSize : " + fileSize);

String safeFile = path + originFileName;

try {
    mf.transferTo(new File(safeFile));
} catch (IllegalStateException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}

MarketBoardVO vo = new MarketBoardVO();
vo.setBo_image1(safeFile);
vo.setBo_id(bo_id);
vo.setBo_nickname(bo_nickname);
vo.setBo_title(bo_title);
vo.setBo_price(Long.parseLong(bo_price));
vo.setBo_content(bo_content);
vo.setBo_address1(bo_address1);
vo.setBo_address2(bo_address2);
service.register(vo);

return "redirect:/board/boardList"; }

----> marketboard 테이블의 id값과 이어지는 fileUpload 테이블을 따로 만들어야 한다.

0727 - 정빈, 수정 boardList.jsp에 새 상품 등록되게 작업 완료

**1. server.xml에 아래 코드 추가

**2. servlet-context.xml에 아래 코드 추가

**3. MarketBoardController.java

@GetMapping("/boardList") public String list(DGVO vo, Model model){

model.addAttribute("mb_list", service.getListBoard()); // 추가

}

// boardInsert.jsp에서 boardList.jsp로 이동 / 파일 다중 업로드 --> 부분 작성

**vo.setBo_image(originFileName); // 파일 이름만 나오게 수정

**4. 이미지 파일 나오는 부분 아래처럼 수정

0728 - 정빈, 수정

그림 파일 사이즈 조절 작업. fileUpload에 bo_num 넣기 성공






