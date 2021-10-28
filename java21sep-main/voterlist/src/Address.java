public class Address {
    String streetname;
    int doorNo;
    int pinCode;

    public Address() {

    }


    public Address(String streetname, int doorNo, int pinCode) {
        super();
        this.streetname = streetname;
        this.doorNo = doorNo;
        this.pinCode = pinCode;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address [streetname=" + streetname + ", doorNo=" + doorNo + ", pinCode=" + pinCode + "]";
    }


}