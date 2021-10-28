//Array of Object:

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
		Student ob[]; //Array Decln
		Scanner sc = new Scanner (System.in);
		System.out.println("How many students:: ");
		int n = sc.nextInt();
		ob = new Student[n]; // n =40
		int i;
		/*for (i = 0 ; i<n ;i++)
		{
			ob[i] = new Student(); //
		}*/
		for (i =0 ;i<n ;i++)
		{
			ob[i] = new Student();
			ob[i].input();
		}
		System.out.println("ID\tNAME\tADDRESS");
		for (i =0 ;i<n ;i++)
		{
			ob[i].display();
		}
	}
}