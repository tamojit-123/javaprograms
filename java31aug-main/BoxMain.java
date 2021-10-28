class Box {

    double width;
    double height;
    double depth;

    public Box() { // default constructor

        width = 10;
        height = 20;
        depth = 30;
    }

    public Box(double w, double h, double d) { // parameterized constructor

        width = w;
        height = h;
        depth = d;
    }

    public double volume() {
        return height * depth * width;
    }

}

class BoxMain {
    public static void main(String[] args) {

        Box obj1 = new Box();
        Box obj2 = new Box(20, 30, 40);
        Box obj3 = new Box(10.23, 20.32, 30.34);

        System.out.println("volume of the default box:" + obj1.volume());
        System.out.println("volume of the parameterized box:" + obj2.volume());
        System.out.println("volume of the box:" + obj3.volume());

    }
}
