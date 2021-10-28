class Student {
    String name;
    int marks;
    int roll;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRoll() {
        return roll;
    }

    public Student(String name, int marks, int roll) {
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", roll=" + roll +
                '}';
    }
}