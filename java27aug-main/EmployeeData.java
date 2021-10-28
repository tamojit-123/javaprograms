import java.util.Scanner;
import java.util.Arrays;   

class Employee
{
	int id, salary;
	String name, address, department;

	void input(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id: ");
		id = scanner.nextInt();
        
		System.out.println("Enter Name: ");
		name = scanner.next();

        System.out.println("Enter Department: ");
		department = scanner.next();

        System.out.println("Enter Salary: ");
		salary = scanner.nextInt();
		
		System.out.println("Enter Address: ");
		address = scanner.next();
	}
	void display(){

		System.out.println(id+"\t"+name+"\t"+department+"\t"+salary+"\t"+address);
	}

    void increaseSal(){

        if(salary<=10000){
            salary += 2000;// increasing the salary by 2000
        } else{

        }
    }

    void bubbleSort(int[] arr) {  

        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    
                    temp = arr[j-1];  //swap elements  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
                          
            }  
        }
    }  
}
class EmployeeData
{
	public static void main(String[] args)
	{
		Employee arrObj[]; //Array declaration
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt(); //n is the number of element of employees to enter.
		arrObj = new Employee[n];

		for (int i =0 ;i<n ;i++){
			arrObj[i] = new Employee();
			arrObj[i].input();
		}

        for (int i =0 ;i<n ;i++){
			//arrObj[i] = new Employee();
			arrObj[i].increaseSal(); // calling the increase salary method.
		}

        for (int i =0 ;i<n ;i++){
			arrObj[i].bubbleSort(); //sorting array elements using bubble sort 
		}
         

		System.out.println("ID\tNAME\tDEPAERMENT\tSALARY\tADDRESS");

		for (int i =0 ;i<n ;i++){
			arrObj[i].display();
		}
	}
}


/*==============================output========================

*/