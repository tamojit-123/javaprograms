// wap to accept two numbers and add them using functions
//Abstraction:-
// private, public, protected, default
// method overloading

import java.util.Scanner;

class FunctionTwo {

    public static void sum(int a, int b) {

        int c = a + b;
        System.out.println("Sum = " + c);
    }

    public static void main(String[] args) {

        System.out.println("Hello...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
        System.out.println("Bye...");
    }
}