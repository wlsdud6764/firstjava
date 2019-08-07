package collestion.map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class ProperriedExample {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		String path = ProperriedExample.class.getResource("/config/database.properties").getPath();
		path = URLDecoder.decode(path,"utf-8");
		prop.load(new FileReader(path));
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("passwd");
		System.out.println(driver);
		
	}

}
