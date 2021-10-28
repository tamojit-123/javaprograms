package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbconfig.DBConfiguration;
import model.UserTable;

public class UserDaoImpl implements UserDaoI {

    @Override
    public void addUser(UserTable user) {
        try {
            Connection con = DBConfiguration.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into usertable (uname,password)values (?,?)");
            pst.setString(1, user.getUname());
            pst.setString(2, user.getPassword());
            int k = pst.executeUpdate();
            if (k < 0) {
                System.out.println("Record is not added successfully");
            } else {
                System.out.println("record is added successfully");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }


    }

    @Override
    public int updateUser(UserTable user) {
        int k = 0;
        try {
            Connection con = DBConfiguration.getConnection();
            PreparedStatement pst1 = con.prepareStatement("update usertable set password =? where uid=?");

            pst1.setString(1, user.getPassword());
            pst1.setInt(2, user.getUid());

            k = pst1.executeUpdate();
            if (k == 1)
                System.out.println("Updated record");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return k;
    }

}
