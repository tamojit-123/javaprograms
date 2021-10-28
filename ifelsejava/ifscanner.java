import java.util.Scanner;

class IfScanner {
    public static void main(String[] args) {
        Scanner td = new Scanner(System.in);
        int age;

        System.out.print("Enter the Age:");
        age = td.nextInt();

        if (age >= 18) {
            System.out.println("You are elgible for vaccine");
        } else {
            System.out.println("You are not elgible for vaccine");
        }
    }
}
