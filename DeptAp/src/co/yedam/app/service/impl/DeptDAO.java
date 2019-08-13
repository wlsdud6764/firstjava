package co.yedam.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.app.model.Departments;
import co.yedam.app.model.DepartmentsTable;




public class DeptDAO  {// 여기서 구현
	// sigletone
	private static DeptDAO instance = new DeptDAO();// deparments

	public static DeptDAO getInstance() {
		return instance;
	}

//1.등록
	public void insert(Connection conn,Departments dept)throws SQLException {
//2.구문
			String sql = "insert into departments (department_id,department_name,location_id,manager_id )"
					+ "values (?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
//3.파라미터 셋팅
		   pstmt.setInt(1, dept.getDepartment_id());
			pstmt.setString(2, dept.getDepartment_name());
			pstmt.setInt(3, dept.getLocation_id());
			pstmt.setInt(4, dept.getManager_id());
//4.실행
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 처리됨");
		}
//5.연결해제		
			


	 // 업데이트
	public void update(Connection conn, Departments dept) throws SQLException {
		
//		2.구문
			String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_ID=?,DEPARTMENT_NAME=?,LOCATION_ID=?,MANAGER_ID=? WHERE DEPARTMENT_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 3.파라미터 셋팅
			pstmt.setInt(1, dept.getDepartment_id());
			pstmt.setString(2, dept.getDepartment_name());
			pstmt.setInt(3, dept.getLocation_id());
			pstmt.setInt(4, dept.getManager_id());
			pstmt.setInt(5, dept.getDepartment_id());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이업데이트됨");
		
	}

	public void delete(Connection conn, int dept_id) throws SQLException {
		
			String sql="delete from DEPARTMENTS WHERE DEPARTMENT_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept_id);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이삭제됨");
		
	}

//한건조회

	public Departments selectOne(Connection conn,int dept_id) throws SQLException {
		Departments dept =null;
	
			String sql = "SELECT DEPARTMENT_ID,"
					+ "           DEPARTMENT_NAME,"
					+ "				LOCATION_ID,"
					+ "				MANAGER_ID"
					+ " FROM DEPARTMENTS "
					+ "WHERE DEPARTMENT_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,dept_id);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				dept = new Departments();
				dept.setDepartment_id(rs.getInt("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				dept.setLocation_id(rs.getInt("location_id"));
				dept.setManager_id(rs.getInt("manager_id"));
			}
			return dept;
					
		
	}


	public List<Departments> selectAll(Connection conn)throws SQLException {
		Departments dept =null;
		List<Departments> list = new ArrayList<Departments>();
		
			String sql = "SELECT DEPARTMENT_ID,"
					+ "           DEPARTMENT_NAME,"
					+ "				LOCATION_ID,"
					+ "				MANAGER_ID"
					+ " FROM DEPARTMENTS ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next()) {
				dept=new Departments();
				dept.setDepartment_id(rs.getInt("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				dept.setLocation_id(rs.getInt("location_id"));
				dept.setManager_id(rs.getInt("manager_id"));
				list.add(dept);
			}

		
		return list;
	}
	public List<DepartmentsTable> selectAllTable(Connection conn)throws SQLException {
		DepartmentsTable dept =null;
		List<DepartmentsTable> list = new ArrayList<DepartmentsTable>();
		
			String sql = "SELECT DEPARTMENT_ID,"
					+ "           DEPARTMENT_NAME,"
					+ "				LOCATION_ID,"
					+ "				MANAGER_ID"
					+ " FROM DEPARTMENTS ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next()) {
				dept=new DepartmentsTable();
				dept.setDepartment_id(rs.getInt("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				dept.setLocationId(rs.getInt("location_id"));
				dept.setMnagerId(rs.getInt("manager_id"));
				list.add(dept);
			}

		
		return list;
	}
	}


