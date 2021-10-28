package customerData;

import java.util.Date;

public class Customer {
    private Date transation_date;
    private double price;
    private String payment_type;
    private String name;
    private String city;
    private String state;
    private Date accountCreated;
    private long zipcode;

    public Customer(Date transation_date, double price, String payment_type, String name, String city, String state,
                    Date accountCreated, long zipcode) {
        super();
        this.transation_date = transation_date;
        this.price = price;
        this.payment_type = payment_type;
        this.name = name;
        this.city = city;
        this.state = state;
        this.accountCreated = accountCreated;
        this.zipcode = zipcode;
    }


    public Customer() {
        super();
    }


    public Date getTransation_date() {
        return transation_date;
    }

    public void setTransation_date(Date transation_date) {
        this.transation_date = transation_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(Date accountCreated) {
        this.accountCreated = accountCreated;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Customer [transation_date=" + transation_date + ", price=" + price + ", payment_type=" + payment_type
                + ", name=" + name + ", city=" + city + ", state=" + state + ", accountCreated=" + accountCreated
                + ", zipcode=" + zipcode + "]";
    }


}
