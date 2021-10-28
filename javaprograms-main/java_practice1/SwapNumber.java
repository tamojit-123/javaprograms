import java.util.Scanner; 

class SwapNumber {  
    public static void main(String[] args) {  
       int a;
       int b; 
       Scanner swap = new Scanner(System.in);  
       System.out.println("Enter the value of a and b");  
       a = swap.nextInt();  
       b = swap.nextInt();  
       System.out.println("previous numbers: "+a +"  "+ b);  
        a = a + b;
        b = a - b;
        a = a - b;  
       System.out.println("swapping: "+a +"   " + b);  
       System.out.println( );  
    }    
}  