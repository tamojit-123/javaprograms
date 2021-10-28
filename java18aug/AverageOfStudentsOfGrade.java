import java.util.Scanner;

class AverageOfStudentsOfGrade {
    public static int getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark of Student : ");
        int mark = sc.nextInt();
        return mark;
    }

    public static int calculateTotalMarks() {
        int marksOfSubject = 0;
        int totalMarks = 0;
        System.out.println("Enter the marks of 5 subjects in semester 1 : ");
        for (int i = 0; i < 5; i++) {
            marksOfSubject = getMarks();
            if (marksOfSubject < 0 || marksOfSubject > 100) {
                System.out.println("Marks is less than 0 or greater than 100, Enter the mark again");
                marksOfSubject = getMarks();
                continue;
            }
            totalMarks = totalMarks + marksOfSubject;
        }
        return totalMarks;
    }

    public static int calculateAverage(int totalMarks, int noOfSubjects) {
        return totalMarks / noOfSubjects;
    }

    public static char gradeOfStudent(int averageMarks) {
        if (averageMarks > 80)
            return 'A';
        else if (averageMarks >= 79 || averageMarks <= 60)
            return 'B';
        else if (averageMarks >= 59 || averageMarks <= 50)
            return 'C';
        else if (averageMarks >= 49 && averageMarks <= 35)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        int total = calculateTotalMarks();
        int avg = calculateAverage(total, 5);
        char grade = gradeOfStudent(avg);
        System.out.println("The total marks is : " + total);
        System.out.println("The average marks is : " + avg);
        System.out.println("The grade is : " + grade);
    }
}
