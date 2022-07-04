package com.ezen.market.OEM.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ezen.market.OEM.OEMarketUserVO;
import com.ezen.market.common.JDBCUtil;

public class OEMarketDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private final String USER_GET = "select * from marketuser where id=? and pass=?";
	
	public OEMarketUserVO getUser(OEMarketUserVO vo) {
		OEMarketUserVO user = null;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user.setNum(rs.getInt("num"));
				user.setId(rs.getString("id"));
				user.setPass(rs.getString("pass"));
				user.setUname(rs.getString("uname"));
				user.setNickname(rs.getString("nickname"));
				user.setBirth(rs.getString("birth"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				user.setPhone(rs.getString("phone"));
				user.setUdate(rs.getDate("udate"));
				user.setAdmin(rs.getInt("admin"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return user;
	}
}
