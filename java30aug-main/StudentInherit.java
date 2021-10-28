class Student {

    int rollNumber;
    String studentName;
    String StudentAddress;
}

class StudentEvaluation extends Student {
    int totalMarksgot;
    int fullmarks;
    float MarksPercentage;

    void marksEvaluation(int roll, String name, int marks, int fullmarksOfSubjects) {
        rollNumber = roll;
        studentName = name;
        totalMarksgot = marks;
        fullmarks = fullmarksOfSubjects;
    }

    float calculationPercentage(){
        float totalPercentage = ((totalMarksgot/fullmarks)*100);
        return totalPercentage;
    }

    void display(){
        System.out.println("Rollno="+rollNumber);
        System.out.println("Student Name="+studentName);
        System.out.println("Total marks got="+totalMarksgot);
        System.out.println("Full marks="+fullmarks);
        System.out.println("Percentage="+ calculationPercentage()); //within the funciton calling calculationPercentage

    }
}

class StudentInherit {

    public static void main(String[] args){

        StudentEvaluation studentObj = new StudentEvaluation();
        studentObj.marksEvaluation(12, "Ram", 450, 500);
        studentObj.display();
    }
}