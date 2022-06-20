package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.emp.dto.empVO;

import util.DBManager;

public class empDAO {
public empDAO() {}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private static empDAO instance = new empDAO();
	public static empDAO getInstance() {
		return instance;
	}
	public List<empVO> selectAllemps() {
		List<empVO> list = new ArrayList<empVO>();
		
		String sql = "select * from emps order by enter desc";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				empVO vo = new empVO();
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setLev(rs.getString(4));
				vo.setEnter(rs.getTimestamp(5));
				vo.setGender(rs.getString(6));
				vo.setPhone(rs.getString(7));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt, rs);
		}
		return list;
	}
	public void empWrite(empVO vo) {
		String sql = "insert into emps(id, pass, name, lev, gender, phone) values(?,?,?,?,?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getLev());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getPhone());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt);
		}
	}
	public empVO selectOneById(String id) {
		String sql = "select * from emps where id=?";
		empVO vo = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new empVO();
				vo.setId(rs.getString(1));
				vo.setPass(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setLev(rs.getString(4));
				vo.setEnter(rs.getTimestamp(5));
				vo.setGender(rs.getString(6));
				vo.setPhone(rs.getString(7));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt, rs);
		}
		return vo;
	}
	public void empUpdate(empVO vo) {
		String sql = "update emps set pass=?, name=?, lev=?, gender=?, phone=? where id=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPass());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getLev());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getPhone());
			pstmt.setString(6, vo.getId());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt);
		}
	}
	public void empDelete(String id) {
		String sql = "delete from emps where id=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.closeConnection(conn, pstmt);
		}
	}
	
	
}
