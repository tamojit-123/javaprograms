package dao;

import model.UserTable;

public interface UserDaoI {
    public void addUser(UserTable user);

    public int updateUser(UserTable user);
}
