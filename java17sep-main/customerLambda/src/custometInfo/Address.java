package custometInfo;

public class Address {
    String city;
    String streetName;
    long pinCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public String toString() {
        return "Address [city=" + city + ", streetName=" + streetName + ", pinCode=" + pinCode + "]";
    }

    public Address(String city, String streetName, long pinCode) {
        super();
        this.city = city;
        this.streetName = streetName;
        this.pinCode = pinCode;
    }

}