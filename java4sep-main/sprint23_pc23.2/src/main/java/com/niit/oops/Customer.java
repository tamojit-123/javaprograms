package com.niit.oops;

public class Customer {

    public Customer() {
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address) {

    }


    @Override
    public boolean equals(Object other) {

        return false;
    }

    public int getCustomerId() {
        return -1;
    }

    public void setCustomerId(int customerId) {

    }

    public String getName() {
        return "";
    }

    public void setName(String name) {

    }

    public String getEmail() {
        return "";
    }

    public void setEmail(String email) {

    }

    public Address getAddress() {
        return null;
    }

    public void setAddress(Address address) {

    }
}
