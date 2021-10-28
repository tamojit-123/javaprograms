package custometInfo;

public class Customer {
    String customerName;
    int customerId;
    double amount;
    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount + ", Address=" + address + "]";
    }

    public Customer(String customerName, int customerId, double amount, Address address) {
        super();
        this.customerName = customerName;
        this.customerId = customerId;
        this.amount = amount;
        this.address = address;
    }


}