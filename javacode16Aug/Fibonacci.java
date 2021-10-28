import java.util.Scanner;
public class Fibonacci {
 
	public static void main(String[] args) 
	{
	
		 int number = 0; 
		 int num1 = 0;
		 int num2 = 1;
		 
		    System.out.println("Enter the Number:");
	        Scanner sc = new Scanner(System.in);
	        number = sc.nextInt();
	        System.out.print("Fibonacci Series of "+number+" numbers:");
 
	        for (int i = 1; i <= number; ++i)
	        {
	            System.out.print(num1+" , ");
	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	        }
	}
}