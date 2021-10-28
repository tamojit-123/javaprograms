import java.util.Scanner;
class Student
{
	int id;
	String name, address;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:: ");
		id = sc.nextInt();
		System.out.println("Enter name:: ");
		name = sc.next();
		
		System.out.println("Enter Address:: ");
		address = sc.next();
	}
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+address);
	}
}
class TestStudent
{
	public static void main(String ar[])
	{
		Student ob = new Student();
		ob.input();				
		ob.display();
		Student ob2 = new Student();
		ob2.input();				
		ob2.display();
	}
}