public class UpperLower {
    public static void main(String[] args) {
        char alpha;

        System.out.println("Uppercase: ");

        for(alpha = 'A'; alpha <= 'Z'; alpha++) {
            System.out.println(alpha+" ");
        }

        System.out.println("Lowercase: ");
        for(alpha = 'a'; alpha<='z'; alpha++) {
            System.out.println(alpha+" ");
        }
    }
}
