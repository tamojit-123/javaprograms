import java.util.*;

class Account{

    private String accountHolder;
    private int accountNumber;
    private double accountBalance;

    Scanner scanner;

    public void accountDetails(){

        scanner = new Scanner(System.in);
        System.out.println("Enter the account details: ");

        accountHolder = scanner.next();
        accountNumber =  scanner.nextInt();
        accountBalance = scanner.nextDouble();
    }

    public void accountDisplay(){

        System.out.println("Account Details");
        System.out.println("AccountHolder="+accountHolder+"\tAccountNumber="+accountNumber+"\tAccountBalance"+accountBalance);
    }
}

class AccountMain{

    public static void main(String[] args){

        Account accountObj = new Account();

        accountObj.accountDetails();
        accountObj.accountDisplay();
    }
}