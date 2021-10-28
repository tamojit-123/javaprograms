import java.util.Scanner;

public class SwapIntegers {

    public static void main(String[] args) {

        SwapIntegers swapIntegers = new SwapIntegers();
        // Declare a scanner object here   
        Scanner sc = new Scanner(System.in); 

            // Get the number value as integer from the console and store in variable 'number'
            long number = 0;
            number=sc.nextInt();
            long swappedNumber = swapIntegers.swapNumbers(number);
            System.out.println("Swapped Number is  : "+swappedNumber);
        }

    // Function accepts number and returns result with each pair of digits swapped.
    public long swapNumbers(long number) {
        long result=0,multiple=1,d1=0,d2=0;
        while(number>0)
        {
            d1=number%10;
            number=number/10;
            if(number==0)
            {
            result=result+multiple*d1; 
            break;
            } 
            d2=number%10;
            number=number/10;
            result=result+d1*10*multiple+d2*multiple;
            multiple=multiple*100;
        }
       return result;  
    }
}