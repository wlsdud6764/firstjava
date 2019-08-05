package boader.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import boader.model.Boader;
import employee.common.DAO;
import employee.model.Employee;

public class UserDAO {
	PreparedStatement pstmt = null;

	public Boader getBoader(int userId) {
		Connection conn = DAO.getConnect();
		String sql = "select * from user_tab where user_id = ?";
		Boader bdr = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				bdr = new Boader();
				bdr.setUserId(rs.getString("userId"));
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

	public List<Boader> getBdrList() {
		Connection conn = DAO.getConnect();
		String sql = "select * from user_tab order by 1";
		Boader bdr = null;
		List<Boader> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				bdr = new Boader();
				bdr.setUserId(rs.getString("userId"));
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
}
