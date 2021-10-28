import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args){

        int arr[]; // declaring the array
        int n,i; // declaring the number of array and its elements

        // taking a scanner object to take the number of elements
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of elements: ")

        //taking n as a scanner integer input
        n = sc.nextInt();

        //taking n elements in the array using new object
        arr = new int[n];

        //itterating the value of i elements for nth times using for loop
        for (i =0; i<n; i++){
            //now printing the elements and storing inside the arra[]
            System.out.println("enter the elements");

            //now assigning the elements in the array[]
            arr[i] = sc.nextInt();
        }
        //coming out of the for loop aster storing the elenents

        //now printing the elements using for loop
        System.out.println("Elements are: ");
        for (i=0; i<n; i++){
            System.out.println(arr[i]+"\t");
        }

        //now using linear searching algorithm we will search the given search element
        //using val as the value of the search element

        System.out.println("\nEnter the search element: ");
        //declaring val as integer input
        int val =sc.nextInt();

        //declaring a flag variable as 0
        int flag = 0;
        

    }
}
