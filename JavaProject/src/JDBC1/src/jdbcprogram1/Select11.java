package jdbcprogram1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select11 {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bikeshowroom", "root", "root");

			Statement stmnt = con.createStatement();
			ResultSet res = stmnt.executeQuery("select * from customer");

			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4)
						+ " " + res.getString(5) + " " + res.getString(6) + " " + res.getString(7));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
