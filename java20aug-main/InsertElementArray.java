//insert element at the end of the array
import java.util.Scanner;

public class InsertElementArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element you want to insert at the end: ");
        int key = sc.nextInt();
        int arr[] = new int[5];

        System.out.println("Enter the element: ");

        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        int capacity = 5;
        int n = 4;

        System.out.println("Before data insertion");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        n = insertAtEnd(arr, n , key, capacity);

        System.out.println("After insertion data");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int insertAtEnd(int arr[], int n, int key, int capacity){
        if(n >= capacity){
            return n;
        }
        arr[n] = key;
        return n+1;
    }
}
