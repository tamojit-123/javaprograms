import java.util.Scanner;
class BubbleSort {
	public static void main(String []args) {
    int num,swap;
    Scanner in = new Scanner(System.in);
    System.out.println("How many numbers are to be sorted:");
    num = in.nextInt();
    int array[] = new int[num];
    System.out.println("Enter " + num + " integers");
    for (int i = 0; i < num; i++){
		array[i] = in.nextInt();
		for (int i = 0; i < ( num - 1 ); i++) {
			for (int j = 0; j < num - i - 1; j++) {
				if (array[j] > array[j+1]){
					swap       = array[j];
					array[j]   = array[j+1];
					array[j+1] = swap;
				}
			}
		}
	}
    System.out.println("After sorting: ");
    for (int i = 0; i < num; i++){
		System.out.println(array[i]);
	}
	}
}