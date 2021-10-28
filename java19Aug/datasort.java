/*
Write a program to store the marks of 10 students in an array. Include a function to sort 
the elements of the array by using the bubble sort algorithm. 
After sorting the array, display the sorted list
*/

import java.util.*;

public class datasort {
    // Array of integers to hold values
    int[] marksOfStudents = new int[10];
    // Number of elements in array
    int n;
    // Function to accept array elements
    public final void read() {
        // Get the number of elements to store in the array
        while (true) {
            System.out.print("Enter the number of elements in the array: ");
            String s = new Scanner(System.in).nextLine();//14
	        Scanner sc =new Scanner(System.in);
	        //String  sinput = sc.nextLine();
           // n = Integer.parseInt(s);
	        n = sc.nextInt();
            if (n > 0 && n <= 10) {
                break;
            } else if (n > 10) {
                System.out.println("\nArray can have maximum 10 elements.\n");
            } else if (n < 0) {
                System.out.println("\nEnter positive number.\n");
            }
        }
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println(" Enter the marks  ");
        System.out.println("-----------------------");
        // User inputs for the array
        for (int i = 0; i < n; i++) {
            System.out.print("<" + (i + 1) + "> ");
            //String s1 = new Scanner(System.in).nextLine();
	        Scanner  sc = new Scanner(System.in);
	        marksOfStudents[i]=  sc.nextInt();
           // marksOfStudents[i] = Integer.parseInt(s1);
        }
    }
    public final void display() {
        // Display the sorted array
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println(" Sorted Marks ");
        System.out.println("-----------------------");
        for (int j = 0; j < n; j++) {
            System.out.println(marksOfStudents[j]);
        }
    }
    // Function to sort using Bubble sort
    public final void BubbleSort() {
        for (int i = 1; i < n; i++) // For n – 1 passes
        {
            // In pass i, compare the first n – i elements
            // with their next elements
            for (int j = 0; j < n - i; j++) {
                if (marksOfStudents[j] > marksOfStudents[j + 1]) // If the elements are not in
                {
                    // the correct order
                    // Swap the elements
                    int temp;
                    temp = marksOfStudents[j];
                    marksOfStudents[j] = marksOfStudents[j + 1];
                    marksOfStudents[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] arg) {
        // Creating the object of the BubbleSort class
        datasort myList = new datasort();
        // Function call to accept array elements
        myList.read();
        // Function call to sort array
        myList.BubbleSort();
        // Function call to display the sorted array
        myList.display();
        // To exit from the console
        System.out.println("\n\nPress Enter to exit.");
        new Scanner(System.in).nextLine();
    }
}