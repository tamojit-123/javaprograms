import java.util.Scanner; 

public class check {
    public static void main(String[] args) {

        char character;

        Scanner ch = new Scanner(System.in);  
        System.out.println("Enter a character: ");  
        character = ch.next().charAt(0);
        String output = (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')
        ? character + " is a character" 
        : character + " is not a character";
    
        System.out.println(output);
    }
}
