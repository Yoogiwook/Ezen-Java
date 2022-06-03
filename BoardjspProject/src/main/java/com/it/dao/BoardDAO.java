package com.it.dao;

import java.util.*;  // List
import java.sql.*;	 // Connection, PreparedStatement, ResultSet

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "1234";

	//드라이버 등록
	public BoardDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 메모리 할당
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//MySQL 연결
	public void getConnection() {
		try {
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); //DB 연결
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//MySQL 해제
	public void disConnection() {
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//1. 목록출력
	// 게시물 정보 한개 : BoardVO, 게시물 여러개 : (List)
	public List<BoardVO> boardListData(int page){
		List<BoardVO> list = new ArrayList<>();
		
		try {
			//1. 연결
			getConnection();
			//2. SQL문장 작성
			int rowSize = 10;
			int start = (rowSize*page) - rowSize;
			// 10*1-10=0,10... 10*2-10=10,10... 10*3-10=20,10...
			String sql = "select no, subject, name, DATE_FORMAT(regdate, '%Y_%m-%d'), hit "
							+ "from jspBoard order by no desc limit ?, ?";
			//3. 전송
			ps = conn.prepareStatement(sql);
			//4. 데이터 채우기
			ps.setInt(1, start);
			ps.setInt(2, rowSize);
			//5. 데이터 실행
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setDbday(rs.getString(4));
				vo.setHit(rs.getInt(5));
				list.add(vo);
			}
			//6. 닫기
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return list;
	}
	
	//2. 총페이지()
	public int boardTotalPage() {
		int total=0;
		
		try {
			getConnection();
			String sql = "select ceil(count(*)/10.0) from jspBoard";
			
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
			rs.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return total;
	}
}
