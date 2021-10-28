import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Conan", 180, 1));
        studentList.add(new Student("Dona", 450, 3));
        studentList.add(new Student("Abby", 470, 5));
        studentList.add(new Student("Bruno", 380, 10));
        studentList.add(new Student("Lucy", 280, 11));


        System.out.println("After Sorting the student data by Name:");

        studentList.sort((Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));

        studentList.forEach((s) -> System.out.println(s));

        System.out.println("=================================================================");

        System.out.println("After Sorting the student data by Marks:");

        studentList.sort((Student s1, Student s2) -> s1.getMarks() - s2.getMarks());

        studentList.forEach((s) -> System.out.println(s));
        
    }
}