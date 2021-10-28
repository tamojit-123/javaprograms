import java.util.Scanner;

public class MinMax {
    public static void main(String []args){

        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<array.length; i++) {
            System.out.println("Enter the elements: ");
            array[i] = sc.nextInt();
        }
        maxarray(array);
        minarray(array);
    }
    static void maxarray(int maxarr[]){
        int max = maxarr[0];
        for(int i=0; i<maxarr.length; i++){
            if(max<maxarr[i]){
                max = maxarr[i];
            }
        }
        System.out.println("Maximum element= "+max);
    }
    static void minarray(int minarr[]){
        int min = minarr[0];
        for(int i=0; i<minarr.length; i++){
            if(min>minarr[i]){
                min = minarr[i];
            }
        }
        System.out.println("Minimum element= "+min);
    }
}
