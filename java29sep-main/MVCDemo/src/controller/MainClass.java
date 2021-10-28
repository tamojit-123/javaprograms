package controller;

import java.util.Scanner;

import dao.UserDaoI;
import dao.UserDaoImpl;
import model.UserTable;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        UserTable user = new UserTable();
        System.out.println("Enter the User Name :");
        String name = sc.next();
        System.out.println("Enter the password :");
        String pwd = sc.next();
        user.setUname(name);
        user.setPassword(pwd);

        UserDaoI userdao = new UserDaoImpl();
        userdao.addUser(user);

        System.out.println("Enter  the password :");
        String pw = sc.next();
        System.out.println("Enter the user ID");
        int id = sc.nextInt();
        user.setPassword(pw);
        user.setUid(id);
        UserDaoImpl userdao1 = new UserDaoImpl();
        int result = userdao1.updateUser(user);
        System.out.println(result);


    }

}
