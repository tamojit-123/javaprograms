import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
  {
    int number;
    int i;
    int factorial = 1;

    System.out.println("Enter a number: ");
    Scanner input = new Scanner(System.in);

    number = input.nextInt();

      for (i = 1; i <= number; i++){
        factorial = factorial * i;
        System.out.println("Factorial of "+number+" is = "+factorial);
      }
  }
}
