// wap to accept two numbers and add them using functions
//Abstraction:-
// private, public, protected, default

import java.util.Scanner;

class FunctionOne{

    public static void sum(){ //defination

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        System.out.println("Sum= "+c);
    }
    public static void main(String[] args){ // calling method

        System.out.println("Hello....");
        sum(); // called method and calling 
        System.out.println("Bye....");
    }
}