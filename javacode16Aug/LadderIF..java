import java.util.Scanner;
class  LadderIF
{
public static void main(String[] ar)
{
int day;
Scanner  s =new Scanner(System.in);
System.out.println("Enter  the Day number:");
day = s.nextInt();
if(day==1)
{
System.out.println("Sunday");
}
else if(day==2)
{
System.out.println("Monday");
}
else  if(day==3)
{
System.out.println("Tuesday");
}
else
{
System.out.println("I have not mentioned");
}

}
}