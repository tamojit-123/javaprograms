package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfiguration {

    static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded.....");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@1234");
            System.out.println("Connection Established...");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return con;
    }

}
