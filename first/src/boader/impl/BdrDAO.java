package boader.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import boader.common.DAO;
import boader.model.Boader;


public class BdrDAO {
	PreparedStatement pstmt = null;

	public Boader getBoarder(String userId) {//아이디로 하나 조회
		Connection conn = DAO.getConnect();
		String sql = "select * from boader where user_id = ?";
		Boader bdr = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
			bdr = new Boader();
			bdr.setBdrno(rs.getInt("bdrno"));
			bdr.setTitle(rs.getString("title"));
			bdr.setContents(rs.getString("contents"));
			bdr.setOrgno(rs.getInt("orgno"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bdr;
	}

	public List<Boader> getBdrList() {//전체조회
		Connection conn = DAO.getConnect();
		String sql = "select * from boader order by 1";
		Boader bdr = null;
		List<Boader> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				bdr = new Boader();
				bdr.setBdrno(rs.getInt("bdrno"));
				bdr.setTitle(rs.getString("title"));
				bdr.setContents(rs.getString("contents"));
				bdr.setOrgno(rs.getInt("orgno"));
				list.add(bdr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	// 게시물 등록
		public void insertBoader(int bdrno,	int orgno, String title,String contents, String creatdate) throws SQLException {
			Connection conn = DAO.getConnect();
			String sql = "insert into boader (border_no, origin_no, title, contents,user_id,create_data) "
							+ "values(?, ?, ?, ?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdrno);
			pstmt.setInt(2, orgno);
			pstmt.setString(3, title);
			pstmt.setString(4, contents);
			pstmt.setString(5, creatdate);
			
			pstmt.executeQuery();
			conn.close();
		}
		
		
}
