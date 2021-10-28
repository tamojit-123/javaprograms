package dataAccessObject;

import model.Customer;
import model.Account;
import model.Transaction;

public interface IBankDao {

    public void addCustomerData(Customer customer);

    public void addAccountData(Account account);

    public void addTransactionData(Transaction transaction);

    public float interestRate = 2.5F;

    public float checkBalance(float balance);

    public float calculateInterest(float balance, float interestRate);

    public float deposit(float balance, float amountToBeDeposit);

    public float withdrawn(float balance, float amountToBeWithdrawn);

    public float fundTransfer(float balance, float amountToBeTransfer);


}
