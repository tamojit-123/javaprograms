import java.util.*;

class SoccerDemo {

	public static void main(String[] ar) {
		String name[] = new String[5];
		int age[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			name[i] = sc.next();
			age[i] = sc.nextInt();
		}
		System.out.println("Executing................");
		for (int i = 0; i < 5; i++) {
			System.out.println(age[i]);
		}
		for (String n : name) {
			System.out.println(n);
		}

	}
}