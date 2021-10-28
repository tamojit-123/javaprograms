import java.util.Scanner;
class  NestedIFDemo1
{
public static void main(String[] ar)
{
	if(true)	
	{
		System.out.println("I amin outer if block");
		if(false)
		{
		System.out.println("I am  in InnerBlock");
		}
		else
		{
		System.out.println("i amin else block of if ");
		}
		
	}
	else
	{
		System.out.println("I  am outer else");	
	}

}
}