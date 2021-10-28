/*Abstract  Notes:
=================================*/
abstract class Animal {
    public abstract void foodHabbits(); // abstract method

    public abstract void sound();

    //non abstract method
    public void tail() {
        System.out.println("I amtail");
    }
}

abstract class Harbi extends Animal {
    public void foodHabbits() {
        System.out.println("I  am  vegetraian");
    }
}

class Cow extends Harbi {
    public void sound() {
        System.out.println("  I will make sound AAAA...");
    }
}

class AbstractEx {
    public static void main(String[] ar) {
        Cow cowobj = new Cow(); // cowobj is object ithas memory
        System.out.println(cowobj);
        cowobj.foodHabbits();
        cowobj.sound();
        cowobj.tail();
        Animal aobj = cowobj; //doesn't have any memory
        aobj.foodHabbits();
        aobj.sound();
    }
}