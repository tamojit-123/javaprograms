package jdbcmypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// to load the driver we need to use Class.forName()method
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded.....");

		// To establish the connection we need to create a reference for
		// connectionobject
		// and through DriverManager class we need to call the getConnection()methood in
		// that
		// we need to specifiy the protcol and subprotcol and url address of database ,
		// user name and password
		// mandatory we need to provide
		// If you Working with Cmd -> we need to setthe classpath
		// set classpath=%classpath%;.;location of jar file

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root@1234");
		System.out.println("Connection Estalished...");

		// creating a statement
		/*
		 * Statement smt = con.createStatement(); boolean result = smt.
		 * execute("create table customer(cid int, cname char(20), caddress varchar(255))"
		 * ); System.out.println(result + "Table doesnot exist");
		 * System.out.println("Table created!!");
		 */

		// dml
		/*
		 * int k
		 * =smt.executeUpdate("insert into customer values(1,'gaurav','delhi,flatno1')"
		 * ); System.out.println(k+"rows effected");
		 */

		String str = "update customer set cname= 'gauravsing ' where cid=1";

		smt.executeUpdate(str);
	}
}