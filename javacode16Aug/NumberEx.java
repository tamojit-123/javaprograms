//importing thelibrary for scanner class 
import java.util.Scanner;

class NumberEx
{

public static void main(String[]  args)
{
	//creating a object forscanner class
	Scanner sc = new Scanner(System.in);
	//Declartion of variable
	int number;
	
	System.out.print("Enter the number:");
	//accepting the agefromuser using scanner class function
	number = sc.nextInt();
	
	if(number>0) //5
	System.out.println("PositiveNumber:");
	if(number<0)
	System.out.println("Negeative Number:");
	else
	System.out.println("Number is Zero:");	
}
}