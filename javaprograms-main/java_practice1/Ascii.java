public class Ascii {
    public static void main(String[] args){
        int ascii;

        System.out.println("A to Z");
        for(ascii=65; ascii<=90; ascii++) {
            System.out.println("Ascii value " +(char)ascii + " = " +ascii);
        }

        System.out.println("\n");

        System.out.println("a to Z");
        for(ascii=97; ascii<=122; ascii++) {
            System.out.println("Ascii value " +(char)ascii + " = " +ascii);
        }
    }
}
