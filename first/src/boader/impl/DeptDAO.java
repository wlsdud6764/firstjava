package boader.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;

import employee.common.DAO;
import employee.model.Employee;

public class DeptDAO {
	public void getMemberByDept(Employee emp) throws SQLException {
		Connection conn = DAO.getConnect();
		String sql = "update employee " + "  set first_name = first_name";

		if (emp.getDepartmentId() != 0)
			sql += ", department_id = ?";
		if (emp.getPhoneNumber() != null || !emp.getPhoneNumber().equals(""))
			sql += ", phone_number = ?";

		sql += " where employee_id = ?";
		int r = 1;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		if (emp.getDepartmentId() != 0)
			pstmt.setInt(r++, emp.getDepartmentId());
		if (emp.getPhoneNumber() != null || !emp.getPhoneNumber().equals(""))
			pstmt.setString(r++, emp.getPhoneNumber());
	}

	public Map<Integer, String> getDept() {
		Connection conn = DAO.getConnect();
		Map<Integer, String> map = new TreeMap<Integer, String>();
		try {
			PreparedStatement pst = conn.prepareStatement("select department_id, department_name from departments");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				map.put(rs.getInt("department_id"), rs.getString("department_name"));
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
		return map;
	}
}
