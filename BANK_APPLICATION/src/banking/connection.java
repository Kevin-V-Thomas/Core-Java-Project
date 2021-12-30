package banking;

import java.sql.*;

public class connection {
	static Connection con;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
		}
		catch (Exception e) {
			System.out.println("Connection Failed!");
		}

		return con;
	}
}

