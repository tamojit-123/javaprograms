package model;

public class Account {

    private long AccountNumber;
    private float Balance;
    private String AccountType;
    private int CustomerId;

    public Account() {
    }

    public Account(long AccountNumber, float Balance, String AccountType, int CustomerId) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.AccountType = AccountType;
        this.CustomerId = CustomerId;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountNumber=" + AccountNumber +
                ", Balance=" + Balance +
                ", AccountType='" + AccountType + '\'' +
                ", CustomerId=" + CustomerId +
                '}';
    }
}
