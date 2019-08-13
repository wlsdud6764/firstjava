package employee.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.app.co.model.Employee;
import employee.common.DAO;

public class EmpDAO {
	PreparedStatement pstmt = null;

	public Employee getEmployee(int empId) {
		Connection conn = DAO.getConnect();
		String sql = "select * from emp_temp where employee_id = ?";
		Employee emp = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
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
		return emp;
	}

	public List<Employee> getEmpList() {
		Connection conn = DAO.getConnect();
		String sql = "select * from emp_temp order by 1";
		Employee emp = null;
		List<Employee> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
				list.add(emp);
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
