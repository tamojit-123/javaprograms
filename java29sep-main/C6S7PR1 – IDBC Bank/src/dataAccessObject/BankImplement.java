package dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DatabaseConnection;
import model.Customer;
import model.Account;
import model.Transaction;

public class BankImplement implements IBankDao {

    @Override
    public void addCustomerData(Customer customer) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customerTable (CustomerId,Name,Age,Address,MobileNumber,EmailId)values (?,?,?,?,?,?)");
            preparedStatement.setInt(1, customer.getCustomerId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setInt(3, customer.getAge());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setLong(5, customer.getMobileNumber());
            preparedStatement.setString(6, customer.getEmailId());

            int record = preparedStatement.executeUpdate();
            if (record < 0) {
                System.out.println("Record is not added successfully");
            } else {
                System.out.println("record is added successfully");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    @Override
    public void addAccountData(Account account) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into accountTable (AccountNumber,Balance,AccountType,CustomerId)values (?,?,?,?)");
            preparedStatement.setLong(1, account.getAccountNumber());
            preparedStatement.setFloat(2, account.getBalance());
            preparedStatement.setInt(3, account.getCustomerId());

            int record = preparedStatement.executeUpdate();
            if (record < 0) {
                System.out.println("Record is not added successfully");
            } else {
                System.out.println("record is added successfully");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    @Override
    public void addTransactionData(Transaction transaction) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactionLog (TransactionId,TransactionType,AccountNumber,TransactionDate,Amount)values (?,?,?,?,?,?)");
            preparedStatement.setInt(1, transaction.getTransactionId());
            preparedStatement.setString(2, transaction.getTransactionType());
            preparedStatement.setLong(3, transaction.getAccountNumber());
            preparedStatement.setDate(5, transaction.getTransactionDate());
            preparedStatement.setFloat(6, transaction.getAmount());


            int record = preparedStatement.executeUpdate();
            if (record < 0) {
                System.out.println("Record is not added successfully");
            } else {
                System.out.println("record is added successfully");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    @Override
    public float calculateInterest(float balance, float interestRate) {
        return balance * interestRate / 100;

    }

    @Override
    public float withdrawn(float balance, float amountToBeWithdrawn) {
        return balance - amountToBeWithdrawn;

    }

    @Override
    public float deposit(float balance, float amountToBeDeposit) {
        return balance + amountToBeDeposit;

    }

    @Override
    public float checkBalance(float balance) {
        return balance;
    }

    @Override
    public float fundTransfer(float balance, float amountToBeTransfer) {
        return balance - amountToBeTransfer;
    }

}
