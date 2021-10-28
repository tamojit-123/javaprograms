import java.util.*;

class Account2{

    private String accountHolder;
    private int accountNumber;
    private double accountBalance;

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

}

class AccountMain2{

    public static void main(String[] args){

        Account accountObj = new Account();

        accountObj.setAccountHolder("Ram");
        accountObj.setAccountNumber(123456);
        accountObj.setAccountBalance(20.05d);

        //accountObj.getAccountHolder();
        //accountObj.getAccountNumber();
        //accountObj.getAccountBalance();

        System.out.println("Account Holder Name:" +accountObj.getAccountHolder());
        System.out.println("Account Number:" +accountObj.getAccountNumber());
        System.out.println("Account Balance" +accountObj.getAccountBalance());
        

    }
}