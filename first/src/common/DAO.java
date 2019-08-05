package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	static Connection conn;

	protected static void getCon() throws ClassNotFoundException, SQLException {
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);
	}

	public static void insertEmp(Employee emp) {
		try {
			getCon();
		} catch (ClassNotFoundException | SQLException e) {
		}
		String sq1 = "insert INTO emp_temp" + "(employee_id, last_name, email, hire_date, job_id)"
				+ "values(?,?,?,?,?)";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sq1);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastname());
			pstmt.setString(3, emp.getEmail());
			pstmt.setString(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateEmp(Employee emp) {
		try {
			getCon();
		} catch (ClassNotFoundException | SQLException e) {
		}
		String sq1 = "update emp_temp SET salary=? WHERE employee_id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sq1);
			pstmt.setInt(2, emp.getEmployeeId());
			pstmt.setInt(1, emp.getSalary());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteEmp(Employee emp) {
		try {
			getCon();
		} catch (ClassNotFoundException | SQLException e) {
		}
		String sq1 = "DELETE FROM emp_temp" + "WHERE employee_id=?";

	}

	public static List<Department> getDeptList() throws ClassNotFoundException, SQLException {
		getCon();
		List<Department> dlist = new ArrayList<>();
		Department dpm = null;
		String sq2 = "select department_id,department_name,manager_id,location_id from departments";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sq2);
			ResultSet rs2 = pstmt.executeQuery();
			while (rs2.next()) {
				dpm = new Department();
				dpm.setDepartmentId(rs2.getInt("department_id"));
				dpm.setDepartmentname("department_name");
				dpm.setManagerId(rs2.getInt("manager_id"));
				dpm.setLocationId(rs2.getInt("location_id"));
				dlist.add(dpm);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dlist;
	}

	public static List<Employee> getEmplist() throws ClassNotFoundException, SQLException {
		getCon();
		List<Employee> list = new ArrayList<>();
		Employee emp = null;
		String sql = "select employee_id, first_name, last_name, salary from emp_temp order by 1 ";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();// 값받아오는
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstname(rs.getString("first_name"));
				emp.setLastname(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee emp = new Employee();
//		emp.setEmployeeId(777);
//		emp.setLastname("last_name");
//		emp.setEmail("LASTNAME");
//		emp.setJobId("IT_PROD");
//		emp.setHireDate("2010-05-10");
//		insertEmp(emp);

		emp.setEmployeeId(777);
		emp.setSalary(1500);
		updateEmp(emp);
//		
//		emp.setEmployeeId(99);
//		deleteEmp(emp);

		System.out.println();
		List<Employee> list = getEmplist();
		for (Employee str : list) {
			System.out.println("사번" + str.getEmployeeId() + "성:" + str.getLastname() + "이름: " + str.getFirstname()
					+ "급여" + str.getSalary());
		}

		System.out.println();
		List<Department> dlist = getDeptList();
		for (Department str2 : dlist) {
			System.out.println("부서번호" + str2.getDepartmentId() + "부서" + str2.getDepartmentname() + "매니저아이디 "
					+ str2.getManagerId());

		}
	}

}
