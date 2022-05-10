package com.it.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {
	
	private Connection con; 			//mysql 연결
	private PreparedStatement psmt; 	//spl 문장 전송
	private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";

	//드라이버 등록 : 한번만 등록하면 된다.
	public Database() {
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
	
	public void mydbListData() {
		try {
			
			//1. Mysql연결
			getConnection();
			
			//2. SQL문장 작성
			String sql = "select * from member";
			
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
					+ ", " + rs.getString(3)
					+ ", " + rs.getString(4) + " ");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}

	//추가(Insert)
	public void mydbInsert(int no, String name, String sex, String content) {
		try {
			//1. 연결
			getConnection();
			//2. SQL문장 작성
			String sql = "insert into member(no, name, sex, content) "
					+ "values(?,?,?,?)";
			//3. Mysql로 SQL문장 전송
			psmt = con.prepareStatement(sql);
			
			//4. ????에 값을 채워주기.
			psmt.setInt(1, no);
			psmt.setString(2, name);
			psmt.setString(3, sex);
			psmt.setString(4, content);
			
			//5. 실행
			psmt.executeUpdate();  //db 값 변동시에는 executeUpdate 
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	//수정
	public void mydbUpdate(int no, String name1, String sex1, String content1) {
		try {
			
			getConnection();
			String sql = "update member set name=?, sex=?, content=? where no = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, name1);
			psmt.setString(2, sex1);
			psmt.setString(3, content1);
			psmt.setInt(4, no);
			
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
			String sql = "delete from member where no = ? ";
			
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
			String sql = "select * from member where no=? ";
			
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, no);
			
			ResultSet rs = psmt.executeQuery();
			
			rs.next(); //데이터 조회 후 커서를 맨 앞으로 보내준다 이 문장이 있어야만 데이터 조회 가능
			
			System.out.println(rs.getInt(1)
					+ ", " + rs.getString(2)
					+ ", " + rs.getString(3)
					+ ", " + rs.getString(4) + " ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	public static void main(String[] args) {
		Database db = new Database();
//		db.getConnection();
//		db.mydbListData();
		System.out.println("-----------------------");
//		db.mydbInsert(11, "최원태", "남성", "키움투수");
//		System.out.println("-----------------------");
//		db.mydbUpdate(15, "김연경", "여성", "배구선수");
//		db.mydbDelete(15);
//		db.mydbListData();
		
		db.mydbSelete(4);
		
	}
}
