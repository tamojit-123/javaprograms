package controller;

import dataAccessObject.BankImplement;
import dataAccessObject.IBankDao;
import model.Account;
import model.Customer;
import model.Transaction;

import java.sql.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.println("Enter the number of input from 1 to 10:");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.println("Enter the User Name :");
            String name = scanner.next();

            System.out.println("Enter the User Address :");
            String address = scanner.next();

            System.out.println("Enter the User Mobile Number :");
            long mobile = scanner.nextLong();

            System.out.println("Enter the User Email :");
            String email = scanner.next();

            System.out.println("Enter the User Age :");
            int age = scanner.nextInt();

            customer.setName(name);
            customer.setAddress(address);
            customer.setMobileNumber(mobile);
            customer.setEmailId(email);
            if (age > 18) {
                customer.setAge(age);
                IBankDao bank = new BankImplement();
                bank.addCustomerData(customer);
            } else {
                System.out.println("Age must be more than 18 years");
            }

            Account account = new Account();

            System.out.println("Enter the User Amount :");
            int amount = scanner.nextInt();

            System.out.println("Enter the User Account Type :");
            String accountType = scanner.next();

            System.out.println("Enter the User Customer Id :");
            int cid = scanner.nextInt();

            account.setBalance(amount);
            account.setAccountType(accountType);
            account.setCustomerId(cid);

            IBankDao bank2 = new BankImplement();
            bank2.addAccountData(account);


            Transaction transaction = new Transaction();

            System.out.println("Enter the User Transaction Type :");
            String transactionType = scanner.next();

            System.out.println("Enter the User Account Number :");
            long accountNumber = scanner.nextLong();

            System.out.println("Enter the User Transaction Date :");
            Date transactionDate = Date.valueOf(scanner.next());

            System.out.println("Enter the User Transaction Date :");
            float transactionAmount = scanner.nextFloat();

            transaction.setTransactionType(transactionType);
            transaction.setAccountNumber(accountNumber);
            transaction.setTransactionDate(transactionDate);

            IBankDao bank3 = new BankImplement();
            bank3.addTransactionData(transaction);

        }
    }
}