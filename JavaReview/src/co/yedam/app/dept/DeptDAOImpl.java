package co.yedam.app.dept;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.app.common.DAO;



public class DeptDAOImpl extends DAO implements DeptDAO {// 여기서 구현
	// sigletone
	private static DeptDAOImpl instance = new DeptDAOImpl();// deparments

	public static DeptDAOImpl getInstance() {
		return instance;
	}

//1.등록
	@Override
	public void insert(Departments dept) {
		try {
			// 1.connnect
			this.connect();// db연결
//2.구문
			String sql = "insert into departments (department_id,department_name,location_id,manager_id )"
					+ "values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
//3.파라미터 셋팅
			pstmt.setInt(1, dept.getDepartment_id());
			pstmt.setString(2, dept.getDepartment_name());
			pstmt.setInt(3, dept.getLocation_id());
			pstmt.setInt(4, dept.getManager_id());
//4.실행
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 처리됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//5.연결해제		
			this.disconnect();

		}
	}

	@Override // 업데이트
	public void update(Departments dept) {
		try {
			// 1.connnect
			this.connect();// db연결
//		2.구문
			String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_ID=?,DEPARTMENT_NAME=?,LOCATION_ID=?,MANAGER_ID=? WHERE DEPARTNAME_ID=?";
			pstmt = conn.prepareStatement(sql);
			// 3.파라미터 셋팅
			pstmt.setInt(1, dept.getDepartment_id());
			pstmt.setString(2, dept.getDepartment_name());
			pstmt.setInt(3, dept.getLocation_id());
			pstmt.setInt(4, dept.getManager_id());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이업데이트됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//5.연결해제		
			this.disconnect();

		}
	}

	@Override
	public void delete(int dept_id) {
		try {
			this.connect();
			String sql="delete from DEPARTMENTS WHERE DEPARTMENT_ID=?";
			pstmt.setInt(1, dept_id);
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이삭제됨");
		} catch (Exception e) {
		}finally {
			this.disconnect();
		}
	}

//한건조회
	@Override
	public Departments selectOne(int dept_id) {
		Departments dept =null;
		try {
			
			this.connect();
			String sql = "SELECT DEPARTMENT_ID,"
					+ "           DEPARTMENT_NAME"
					+ "				LOCATION_ID"
					+ "				MANAGER_ID"
					+ "FROM DEPARTMENTS "
					+ "WHERE DEPARTNAME_ID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,dept_id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dept = new Departments();
				dept.setDepartment_id(rs.getInt("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				dept.setLocation_id(rs.getInt("location_id"));
				dept.setManager_id(rs.getInt("manager_id"));
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return dept;
	}

	@Override
	public List<Departments> selectAll() {
		Departments dept =null;
		List<Departments> list = new ArrayList<Departments>();
		try {
			this.connect();
			String sql = "SELECT DEPARTMENT_ID,"
					+ "           DEPARTMENT_NAME,"
					+ "				LOCATION_ID,"
					+ "				MANAGER_ID"
					+ " FROM DEPARTMENTS ";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while (rs.next()) {
				dept=new Departments();
				dept.setDepartment_id(rs.getInt("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				dept.setLocation_id(rs.getInt("location_id"));
				dept.setManager_id(rs.getInt("manager_id"));
				list.add(dept);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	}


