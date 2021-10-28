public class Voter {
    private String vName;
    private int age;
    private Address add;

    public Voter() {

    }

    public Voter(String vName, int age, Address add) {
        super();
        this.vName = vName;
        this.age = age;
        this.add = add;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Voter [vName=" + vName + ", age=" + age + ", add=" + add + "]";
    }


}