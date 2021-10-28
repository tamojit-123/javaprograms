import java.util.Scanner;
class LinearSearchDemo
{
	public static void main(String ar[])
	{
		int arr[];
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements:: ");
		n = sc.nextInt();
		arr = new int [n];
		for (i = 0 ; i<n ; i++)
		{
			System.out.println("Enter Element:: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements are :: ");		
		for (i = 0 ; i<n ; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		//Searching.......
		System.out.println("\nEnter the value to be searched:: ");
		int val = sc.nextInt();
		int f = 0;
		for (i = 0 ; i<n ; i++)
		{
			if (arr[i] == val)
			{
				f = 1;
				break;
			}
		}
		if (f == 1)
			System.out.println("Value found at "+(i+1)+" position ");
		else
			System.out.println("Value not found.. ");
	}	
}