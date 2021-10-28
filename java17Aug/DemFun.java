class DemFun
{


static int  fun1(int m,int ph,int ch)
{
return (m+ph+ch);
}

static float avg(int m,int ph ,int ch)
{
int total  = fun1(m,ph,ch); //calling a function 
System.out.println("Total="+total);
return (total/3);
}

static String  grade(float  avg1)
{
if(avg1>=100)
return "OutStanding ";
else if (avg1>80 && avg1<100)
return "Excellent";
else if(avg1>65 && avg1<=80)
return "VeryGood";
else
return "No Grade System";
}

public static void main(String[] ar)
{
float avgmarks = avg(90,80,75);
String  rank  = grade(avgmarks);
System.out.println(rank);
	
}
}



