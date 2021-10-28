//importing thelibrary for scanner class 
import java.util.Scanner;

class InputClass
{

public static void main(String[]  args)
{
	//creating a object forscanner class
	Scanner sc = new Scanner(System.in);
	//Declartion of variable
	int age;
	
	System.out.print("Enter the Age:");
	//accepting the agefromuser using scanner class function
	age = sc.nextInt();
	
	if(age>=18)
	System.out.println("You are elgible for vaccine");
	else
	System.out.println("You are not elgible for vaccine");
	
	
}
}