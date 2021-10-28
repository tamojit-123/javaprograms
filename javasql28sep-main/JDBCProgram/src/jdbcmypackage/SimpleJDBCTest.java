package jdbcmypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class SimpleJDBCTest {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/EmployeeDB";
		String username = "root";
		String password = "mysql@2020";
		String str = "SELECT * FROM Employees WHERE fname = ? and salary >= ?";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement(str);
		ps.setString(1, "S%");
		ps.setInt(2, 10000);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int empID = rs.getInt("ID");
			String first = rs.getString("FirstName");
			String last = rs.getString("LastName");
			Date birthDate = rs.getDate("BirthDate");
			float salary = rs.getFloat("Salary");
			System.out.println("Employee ID:   " + empID + "\n" + "Employee Name: " + first + " " + last + "\n"
					+ "Birth Date:    " + birthDate + "\n" + "Salary:        " + salary);
		}
	}
}