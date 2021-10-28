package dao;

import dao.EmployeeDAO;

public class EmployeeDAOFactory {

    public EmployeeDAO createEmployeeDAO() {
        return new EmployeeDAOJDBCImpl();
    }
}