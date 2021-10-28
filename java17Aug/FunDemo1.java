import java.util.*;
class FunDemo1
{
//function with parameter but there is no return type
static int add(int a, int b)
{
int result;
result = a+b;
System.out.println("Sum of Two Numbers="+result);
return 0;
}

//function with paratmer with return type with return statement 
static float  mul(float i , float j)
{
return (i*j);
}
//function without parameter without return type and without return statement
static void sayHi()
{
System.out.println("Say Hi All");
}
//function without parameters and with return statement 
static String  greet()
{
return "Hello";
}

public static void main(String[] ar)
{
	Scanner s = new Scanner(System.in);
	int a,b;
	a=s.nextInt();
	b = s.nextInt();
	sayHi();
	float result = mul(2.3f,4.5f);		
	System.out.println("Float value="+result);
	String value = greet();
	//System.out.println("Deepak"+greet());
	add(a,b);	
	
}
}