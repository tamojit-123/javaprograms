//create a pojo class of Student.
import java.util.*;
import java.util.List;
public class StudMain {
	public static void main(String [] args)
	{	List<Student> studentList=new ArrayList<>();
		Student s1=new Student("Gaurav",402);
		Student s2=new Student("Saurav",302);
		Student s3=new Student("Paurav",502);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Collections.sort(studentList,(a1,a2)->{return a1.getName().compareTo(a2.getName());});
		for(Student std:studentList)
		{
			System.out.println(std);
		}
		System.out.println("====");
		Collections.sort(studentList,(a1,a2)->{return a2.getMarks()-a1.getMarks();});
		for(Student std:studentList)
		{
			System.out.println(std);
		}
		//
		Collections.sort(studentList, Comparator.comparing((Student s)->s.getName()));
		System.out.println("----------------comparing-=----");
		for(Student ss : studentList)
		{
			System.out.println(ss);
		}
	}
}