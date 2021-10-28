// wap to accept two numbers and add them using functions


import java.util.Scanner;

class FunctionThree{

    public static void sum(int a, int b){ //defination
        
        return (a+b);
    }
    public static void main(String[] args){ // calling method

        System.out.println("Hello....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sum(a, b); // called method and calling
        
        System.out.println("Sum="+x);
        System.out.println("Bye....");
    }
}