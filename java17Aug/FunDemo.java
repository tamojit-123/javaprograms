import java.util.Scanner;
class  FunDemo
{

	static void sayHello()
	{
	System.out.println("Hi Every one");
	} 
	static  void  add(int a, int b)
	{
	System.out.println(a+b);
		
	}
	public static void  main(String[] args)
	{
		int a,b;
		sayHello(); //calling  a funcion 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Number:");
		 a =sc.nextInt();
		System.out.println("Enter the Second Number:");
		  b=sc.nextInt();
		add(a,b);
	}
	

}

/* startwith letters 
in our function name two words  are there 
1)startword always small letter  secondwordshouldstart with camel letter
2) we can give a combination (_) ,  digits 
*/