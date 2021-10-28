//AbstractEx:

abstract class Vehicle {
    int no;

    Vehicle() {
        System.out.println("I am a constructor");
    }

    void example() {
        no = 2;
        System.out.println("I am not abstract method" + no);
    }

    abstract int getSpeed();
}

class Bike extends Vehicle {
    int getSpeed() {
        return 60;
    }

    void seats() {
        System.out.println("No of seats in bike are two");
    }
}

class Car extends Vehicle {
    int getSpeed() {
        return 70;
    }
}

class TestVehicle_Abstract {
    public static void main(String args[]) {
        Vehicle bike = new Bike(); // creating a object for child class and storing the Parent refference
        Vehicle car = new Car();
        bike.example();//non-abstract method
        bike.seats();// child class methods
        int bikespeed = bike.getSpeed();
        int carspeed = car.getSpeed();
        System.out.println("Speed of Bike is: " + bikespeed + " Km/h");
        System.out.println("Speed of Car is: " + carspeed + " Km/h");
    }
}