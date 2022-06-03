package com.naver.news;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Database1 {
	
	private Connection con; 			//mysql 연결
	private PreparedStatement psmt; 	//spl 문장 전송
	private final String URL = "jdbc:mysql://localhost:3306/NaverNews?serverTimezone=UTC";

	//드라이버 등록 : 한번만 등록하면 된다.
	public Database1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL, "root", "1234"); //경로, 아이디, 비번
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결해제
	public void disConnection() {
		try {
			
			if(psmt != null) psmt.close();
			if(con != null) con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 모든 데이터 조회(select)
	public void mydbListData() {
		try {
			
			//1. Mysql연결
			getConnection();
			
			//2. SQL문장 작성
			String sql = "select * from news";
			
			//3.Mysql로 SQL문장 전송
			psmt = con.prepareStatement(sql);
			
			//4. 실행결과를 받아 온다.
			ResultSet rs = psmt.executeQuery(); //db의 값을 조회
			
			//5. 결과를 출력
			/* no integer auto_increment,
			 * name varchar(34) not null,
			 * sex varchar(10) not null,
			 * content text
			 */
			while(rs.next()) {
				System.out.println(rs.getInt(1)
					+ ", " + rs.getString(2)
					+ ", " + rs.getString(3) + " ");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}

	//추가(Insert)
	public void mydbInsert(String title, String content) {
		try {
			//1. 연결
			getConnection();
			//2. SQL문장 작성
			String sql = "insert into news(no, title, content) "
					+ "values(no,?,?)";
			//3. Mysql로 SQL문장 전송
			psmt = con.prepareStatement(sql);
			
			//4. ????에 값을 채워주기.
			psmt.setString(1, title);
			psmt.setString(2, content);
			
			//5. 실행
			psmt.executeUpdate();  //db 값 변동시에는 executeUpdate 
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	//수정
	public void mydbUpdate(int no, String title, String content) {
		try {
			
			getConnection();
			String sql = "update news set title=?, content=? where no = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, content);
			psmt.setInt(3, no);
			
			psmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	//삭제
	public void mydbDelete(int no) {
		try {
			
			getConnection();
			String sql = "delete from news where no = ? ";
			
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, no);
			
			psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	//선택조회
	public void mydbSelete(int no) {
		try {
			
			getConnection();
			String sql = "select * from news where no=? ";
			
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, no);
			
			ResultSet rs = psmt.executeQuery();
			
			rs.next(); //데이터 조회 후 커서를 맨 앞으로 보내준다 이 문장이 있어야만 데이터 조회 가능
			
			System.out.println(rs.getString(1)
					+ ", " + rs.getString(2)
					+ ", " + rs.getString(3) + " ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
}
public class NaverNewsTest {

	public static void main(String[] args) throws IOException {
		Database1 db = new Database1();
		
		int pages = 3;
		for(int i=1; i<pages; i++) {
		
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=249&sid1=102&mid=shm&date=20220502&page="+i;
			
			Document doc = Jsoup.connect(url).get();
	//		System.out.println(doc);
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
			Element element = elements.get(0);
	//		System.out.println(element);
			
			Elements photoElements = element.getElementsByAttributeValue("class", "photo");
	//		System.out.println(photoElements);
			
			for(int j=0; j<photoElements.size(); j++) {
				
				Element articleElement = photoElements.get(j);
	//			System.out.println(articleElement);
				
				Elements aElements = articleElement.select("a");
				Element aElement = aElements.get(0);
	//			System.out.println(aElements);
				
				String newsUrl = aElement.attr("href");  //기사 링크
	//			System.out.println(newsUrl);
				
				Element imgElement = aElement.select("img").get(0);
				String imgUrl = imgElement.attr("src"); //이미지 링크
	//			System.out.println(imgUrl);
				
				String title = imgElement.attr("alt"); //기사 제목
//				System.out.println(title);
				
				Document detailDoc = Jsoup.connect(newsUrl).get();
				Element contentElement = detailDoc.getElementById("dic_area");
				String content = contentElement.text(); //.text 는 글자만 가져오기 위한 명령어
				
				
//				System.out.println(title);
//				System.out.println(content);
//				System.out.println();
//				db.mydbInsert(title, content);
			}
		}
		db.mydbListData();
	}

}

