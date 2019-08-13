package boader.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import boader.model.Boader;
import co.yedam.app.co.model.Employee;
import employee.common.DAO;

public class UserDAO {
	public void getMemberByDept(Boader bdr) throws SQLException {
		Connection conn = DAO.getConnect();
		
	}

	public Map<String, String> getUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
