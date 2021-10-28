/*=======================================
MultipleInheritance using interface
=======================================*/

interface Add {
    int sum(int i, int j);
}

interface Sub {
    int diff(int a, int b);
}

//multiple  interface
interface calc {
    int mul(int a, int b);
}

//multiple inheritance
class Calculator implements Add, Sub, calc {
    public int sum(int i, int j) {
        return (i + j);
    }

    public int diff(int a, int b) {
        return (a - b);
    }

    public int mul(int a, int b) {
        return (a * b);
    }

    public static void main(String[] ar) {
        Calculator calcobj = new Calculator();
        System.out.println(calcobj.sum(10, 20));
        System.out.println(calcobj.diff(2, 1));
        System.out.println(calcobj.mul(3, 4));
    }
}