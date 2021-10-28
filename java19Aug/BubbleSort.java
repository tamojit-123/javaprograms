import java.util.Scanner;

class BubbleSort{
    public static void main (String[] args){

        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            System.out.println("Enter the elements: ");
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After sorting: ");
        for (int i = 0; i < a.length; i++){
		System.out.println(a[i]);
	    }
    }
}