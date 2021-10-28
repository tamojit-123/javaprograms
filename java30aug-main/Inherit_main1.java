class  Employee
{
//variables -attributes//datavariables
int empid;
String ename;
}
//datamembers -> attributes(variables) and behaviours(functions) ormethods
class PartTime_Employee  extends Employee
{
//int empid;
//String ename;  in the memory it will occupy the parent properties
int no_of_wages;
int no_of_hours;
void acceptEmp(int eno,String name , int wages, int hours)
{
empid=eno;
ename  = name;
no_of_wages = wages;
no_of_hours= hours;
}
int  calculationwages()
{
int total = ((no_of_wages*no_of_hours )* 25);
return total;
}
void  disp()
{
	System.out.println("EmpID="+empid);
	System.out.println("EmpName="+ename);
	System.out.println("Emp Wages="+no_of_wages);
	System.out.println("Emp Hours="+no_of_hours);
	System.out.println("EmpTotal="+ calculationwages()); //within the funciton calling clacultionwages
}
}
class Inherit_main1
{
public static void  main(String[] ar)
{
	PartTime_Employee  pm =new PartTime_Employee();
	pm.acceptEmp(100,"Steven",45,5);
	pm.disp();
}
}