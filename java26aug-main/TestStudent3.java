//Constructors
class Student
{
	int id;
	String name, address;
	public Student() //Default
	{
		id = 101;
		name = "Aradhana";
		address= "Delhi";
	}
	public Student(int id, String name, String address) //parameterized
	{
		this.id = id; //represents current instance
		this.name = name;
		this.address = address;
	}
	public Student(Student ob3)
	{
		this.id = ob3.id;
		this.name = ob3.name;
		this.address = ob3.address;
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
		ob.display();
		Student ob2 = new Student();
		ob2.display();
		Student ob3 = new Student(102,"Ajay","Mumbai");	
		ob3.display();	
	
		Student ob4 = new Student(ob3);
		ob4.display();
	
		Student ob5 = new Student(106,"Ajinkya","Mumbai");	
		ob5.display();	
	
	}
}