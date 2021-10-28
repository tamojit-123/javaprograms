@FunctionalInterface
interface Concat {
    String con(String s1, String s2);
}

public class lambdaEx {
    public static void main(String[] args) {

        // with lambda
        Concat result = (String s1, String s2) -> (s1 + s2);
        System.out.println(result.con("RAM", "LELA"));
    }
}