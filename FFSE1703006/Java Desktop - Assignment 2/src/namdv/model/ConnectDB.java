package namdv.model;

import java.sql.SQLException;
import java.util.Properties;

import org.gjt.mm.mysql.Driver;

import com.mysql.jdbc.Connection;

public class ConnectDB {

	private String strServer = "localhost";
	private String strDatabase = "myjavaapp";
	private String strUser = "myjavaapp";
	private String strPwd = "myjavaapp";

	public Connection getConnect() {
		Connection conn = null;
		String strConnect = "jdbc:mysql://" + strServer + "/" + strDatabase
				+ "?useUnicode=true&characterEncoding=utf-8";
		Properties pro = new Properties();
		pro.put("user", strUser);
		pro.put("password", strPwd);
		try {
			com.mysql.jdbc.Driver driver = new Driver();
			conn = (Connection) driver.connect(strConnect, pro);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}
