import java.util.Scanner;
class  NestedIFDemo2
{
public static void main(String[] ar)
{
	int sonu,subrata,shubham;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the  3 values ");
	sonu= s.nextInt(); //9
	subrata = s.nextInt(); //9
	shubham  = s.nextInt(); //9
	

	if(sonu>subrata)	
	{
		System.out.println("I amin outer if block");
		if(sonu>shubham)
		{
		System.out.println("sonu is highest");
		}
		else
		{
		System.out.println("shubham  is highest  ");
		}
		
	}
	else
	{
		if(subrata>shubham)
		{
		System.out.println("subrata is highest");
		}
		else
		{
		System.out.println("shubham  is highest  ");
		}	
	}

}
}