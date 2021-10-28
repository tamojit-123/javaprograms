package model;

public class Customer {

    private int CustomerId;
    private String Name;
    private String Address;
    private long MobileNumber;
    private String EmailId;
    private int Age;

    public Customer() {

    }

    public Customer(int CustomerId, String Name, String Address, long MobileNumber, String EmailId, int Age) {
        this.CustomerId = CustomerId;
        this.Name = Name;
        this.Address = Address;
        this.MobileNumber = MobileNumber;
        this.EmailId = EmailId;
        this.Age = Age;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId=" + CustomerId +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", MobileNumber=" + MobileNumber +
                ", EmailId='" + EmailId + '\'' +
                ", Age=" + Age +
                '}';
    }
}
