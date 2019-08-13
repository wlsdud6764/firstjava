package co.yedam.app.comm;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAO {
	public static Connection getConnect() {
		///////////////////
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		///////////////////
		Properties prop = new Properties();
		String path = PropertiesExample.class
				.getResource("/config/database.properties").getPath();
		try {
			path = URLDecoder.decode(path, "utf-8");
			prop.load(new FileReader(path));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String driver = prop.getProperty("driver");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		pw = prop.getProperty("passwd");

		//////////////////
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
