package jdbcmypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded.....");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root1234");
		System.out.println("Connection Estalished...");

		PreparedStatement pst = con.prepareStatement("select * from customer where cid=?");

		System.out.println("Enter the customer id :");
		int id = sc.nextInt();
		pst.setInt(1, id);

		ResultSet rs = pst.executeQuery();

		if (rs.next())
			System.out.println(rs.getInt("cid") + "\t" + rs.getString("cname") + "\t" + rs.getString("caddress"));

	}
}