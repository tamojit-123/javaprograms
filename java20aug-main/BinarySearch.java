import java.util.Scanner;

class BinarySearch{
	public static void main(String[] args){

		int array[];
		int n;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of elements of the array: ");
		n = sc.nextInt();
		array = new int [n];
		System.out.println("enter the element in sorted order.");

		for (i = 0 ; i<n ; i++){
			System.out.println("Enter the elements: ");
			array[i]=sc.nextInt();
		}
		System.out.println("Elements: ");	

		for (i = 0 ; i<n ; i++){
			System.out.print(array[i]);
		}
		System.out.println("\nSearch element: ");

		int val = sc.nextInt();
		int low; 
		int mid; 
		int high;
		low = 0;
		high = n-1;
		
		while(low <= high) {

			mid = (low + high)/2;
			
			if (val < array[mid]){
				high = mid - 1;
			}else if (val > array[mid]){
				low = mid + 1;
			}else if(val == array[mid]){

				System.out.println("search value found at "+(mid + 1)+" position");
				break;
			}			
		}
		if(low > high)
			System.out.println("No resuts");
	}	
}