package model;

import java.sql.Date;
import java.sql.Time;

public class Transaction {

    private int TransactionId;
    private String TransactionType;
    private long AccountNumber;
    private Date TransactionDate;
    private float Amount;

    public Transaction() {
    }

    public Transaction(int TransactionId, String TransactionType, long AccountNumber, int UpdateAmount, Date TransactionDate, float Amount) {

        this.TransactionId = TransactionId;
        this.TransactionType = TransactionType;
        this.AccountNumber = AccountNumber;
        this.TransactionDate = TransactionDate;
        this.Amount = Amount;
    }

    public int getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(int transactionId) {
        TransactionId = transactionId;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long AccountNumber) {
        AccountNumber = AccountNumber;
    }

    public Date getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        TransactionDate = transactionDate;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "TransactionId=" + TransactionId +
                ", TransactionType='" + TransactionType + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", TransactionDate=" + TransactionDate +
                ", Amount=" + Amount +
                '}';
    }
}
