import java.util.Scanner;

class Luca {
    public static void main (String [] args) {
        int number = 0; 
		 int num1 = 0;
		 int num2 = 1;
		 
		    System.out.println("Enter the Number:");
	        Scanner sc = new Scanner(System.in);
	        number = sc.nextInt();
	        System.out.print("luca Series of "+number+ "numbers:");
 
	        for (int i = 1; i <= number; ++i)
	        {
	            System.out.print(num1+" , ");
	            int sum = num1 + num2 + i;
	            num1 = num2;
	            num2 = sum;
	        }
    }
}