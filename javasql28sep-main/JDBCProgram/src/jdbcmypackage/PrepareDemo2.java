package jdbcmypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded.....");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root1234");
		System.out.println("Connection Estalished...");

		PreparedStatement pst = con.prepareStatement("insert into  customer  values (?,?,?)");

		System.out.println("Enter the customer id , CustName and CustAddress :");
		int id = sc.nextInt();
		pst.setInt(1, id);
		String name = sc.next();
		pst.setString(2, name);
		String add = sc.next();
		pst.setString(3, add);

		pst.executeUpdate();

		/*
		 * ResultSet rs = pst.executeQuery();
		 * 
		 * if(rs.next())
		 * System.out.println(rs.getInt("cid")+"\t"+rs.getString("cname")+"\t"+rs.
		 * getString("caddress"));
		 */

	}
}
