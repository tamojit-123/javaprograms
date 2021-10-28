import java.util.Scanner;
 class GradeSystem
{  
public static void main(String[] strings) 
{        
Scanner sc = new Scanner(System.in);  
int math,physics, chemistery,total;
int avgmarks;
System.out.println("Enter the maths, physcis ,chemistery marks");
math=sc.nextInt();
physics = sc.nextInt();
chemistery = sc.nextInt();

total = math+physics+chemistery;
avgmarks = total/3;

System.out.println("total marks="+total+ "\t  avgmarks="+avgmarks);
if(avgmarks>80)
System.out.println("Grade A");
else if (avgmarks >=79 || avgmarks<=60)
System.out.println("Grade B");
else if (avgmarks>=59 || avgmarks<=50)
System.out.println("Grade C");
else if(avgmarks>=49 && avgmarks<=35)
System.out.println("Grade D");
else
System.out.println("Grade F");
    }
}

