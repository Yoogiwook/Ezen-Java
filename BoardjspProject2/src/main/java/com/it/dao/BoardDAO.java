package com.it.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private Connection conn = null; // db 연결하기위한 변수선언
	private PreparedStatement ps = null; // sql 명령어를 전송하기위한 변수 선언
	
	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC"; // db에 연결하기 위한 URL
	private final String USERNAME = "root"; // db에 연결 할 id
	private final String PASSWORD = "1234"; // db에 연결 할 id의 비밀번호
	
	// 드라이버 등록
	public BoardDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 등록
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// mysql 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); // db에 연결하기 위한 url, username, password 전송
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// mysql 해제
	public void disConnection() {
		try {
			if(ps != null)
				ps.close();
			if(conn != null)
				conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//1. 목록 출력
	public List<BoardVO> boardListData(int page){
		List<BoardVO> list = new ArrayList<>(); // db 데이터를 저장하기 위한 리스트
		
		try {
			getConnection(); // db 연결
			int rowSize = 10; // 목록의 최대 수 설정
			int start = (rowSize * page) - rowSize; //1페이지 0~10, 2페이지 10~20, 3페이지 20~30
			String sql = "select no, subject, name, DATE_FORMAT(regdate, '%Y_%m_%d'), hit "
					+ "from jspBoard2 order by no desc limit ?, ?"; // sql 문장 작성
			
			ps = conn.prepareStatement(sql); // sql 문장 전송
			ps.setInt(1, start); // 빈칸 채우기
			ps.setInt(2, rowSize); // 빈칸 채우기
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
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return list;
	}
	//2. 총 페이지
	public int boardTotalPage() {
		int total = 0;
		
		try {
			getConnection();
			String sql = "select ceil(count(*)/10.0) from jspBoard2";
			
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
	//3. Insert(새글 입력)
	public void boardInsert(BoardVO vo) {
		try {
			getConnection();
			String sql = "insert into jspBoard2(name, subject, content, pwd, regdate) values(?, ?, ?, ?, now())";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getPwd());
			ps.executeUpdate();
		}catch(Exception e)	{
			e.printStackTrace();
		}finally {
			disConnection();
		}
	}
	
	//4. 상세보기
	public BoardVO boardDetailData(int no) {
		BoardVO vo = new BoardVO();
		try {
			getConnection();
			// 조회수 증가
			String sql = "update jspBoard2 set hit=hit+1 where no=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();
			
			
			sql = "select no, name, subject, content, DATE_FORMAT(regdate, '%Y-%m-%d'), hit "
					+ "from jspBoard2 where no=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setDbday(rs.getString(5));
				vo.setHit(rs.getInt(6));
				rs.close();
			}
		}catch(Exception e)	{
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return vo;
	}
	
	//5. 수정하기
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		try {
			getConnection();
			String sql="select no, name, subject, content, DATE_FORMAT(regdate, '%Y-%m-%d'), hit "
					+ "from jspBoard2 where no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setDbday(rs.getString(5));
				vo.setHit(rs.getInt(6));
				rs.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return vo;
	}
	
	//6. 수정한 데이터 데이터베이스에 저장하기
	public boolean boardUpdate(BoardVO vo) {
		boolean chk = false;
		
		try {
			getConnection();
			
			String sql="select pwd from jspBoard2 where no=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ResultSet rs = ps.executeQuery();
			
			String chk_pwd = "";
			if(rs.next()) {
				chk_pwd = rs.getString(1);
				rs.close();
			}
			
			if(chk_pwd.equals(vo.getPwd())) {
				chk = true;
				
				sql = "update jspBoard2 set name=?, subject=?, content=? where no=?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getSubject());
				ps.setString(3, vo.getContent());
				ps.setInt(4, vo.getNo());
				
				ps.executeUpdate();
			}
		}catch(Exception e) {
			
		}finally {
			disConnection();
		}
		return chk;
	}
	
	//7. 삭제
	public boolean boardDelete(int no, String pwd) {
		boolean chk = false;
		try {
			getConnection();
			String sql = "select pwd from jspBoard2 where no=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			
			String chk_pwd = "";
			if(rs.next()) {
				chk_pwd = rs.getString(1);
				rs.close();
			}
			
			if(chk_pwd.equals(pwd)) {
				chk = true;
				sql = "delete from jspBoard2 where no = ?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, no);
				
				ps.executeUpdate();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
		return chk;
	}
	public boolean boardSearch(String qr, String sel) {
		boolean chk_no = false;
		try {
			BoardVO vo = new BoardVO();
			getConnection();
			String chk = "";
			String sql = "select "+sel+" from jspBoard2 where "+sel+"="+qr;
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				chk = rs.getString(1);
				rs.close();
			}
			if(chk.equals(qr)) {
				chk_no = true;
				sql = "select no from jspBoard2 where "+sel+"="+qr;
				ps = conn.prepareStatement(sql);
				vo.setNo(rs.getInt(1));
				ps.executeQuery();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return chk_no;
	}
}
