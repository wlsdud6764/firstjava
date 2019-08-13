package co.yedam.app.user;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.yedam.app.common.DAO;
import co.yedam.app.dept.Departments;



public class UsDAOImpl extends DAO implements UsDAO {
	// sigletone
		private static UsDAOImpl instance = new UsDAOImpl();

		public static UsDAOImpl getInstance() {
			return instance;
		}

		@Override
		public void insert(User us) {
			try {
				this.connect();
				String sql= "insert into users (USER_ID=?,USER_NAME=?,PWD=? )";
				pstmt=conn.prepareStatement(sql);
				pstmt= setString(1,us.getUSER_ID());
				pstmt= setString(2,us.getUSER_NAME());
				pstmt=setString(3,us.getPWD());
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

		private PreparedStatement setString(int i, int user_ID) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(User us) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(int us_id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Departments selectOne(int us_id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<User> selectAll() {
			// TODO Auto-generated method stub
			return null;
		}

	

	

}
