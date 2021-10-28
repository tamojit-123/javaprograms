import java.util.Scanner;
class SwitchDemo
{
	public  static void main(String[]  ar)
	{
		int a,b,sum,sub,mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A and B values");
		a = sc.nextInt();
		b= sc.nextInt();
		char ch ;
		System.out.println("Enter the + , - ,* ,(Add,Diff,Product),(1,2,3)");
		//ch = sc.next().charAt(0); //345
		//String str = sc.next();
		int choice = sc.nextInt()
		switch(str)
		{
			case 1:
				sum = a+b;
				System.out.println("Sum of two numbers="+sum);	
			break;

			case "Diff":
				sub = a-b;
				System.out.println("Sub of two numbers="+sub);	
			break;
			case "Product":
				mul = a*b;
				System.out.println("mul of two numbers="+mul);	
			break;
			default:
			System.out.println("Invalid input");
		
		}

	}
	
}