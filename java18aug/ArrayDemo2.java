import java.util.*;

class ArrayDemo2 {

	public static void main(String[] ar) {
		// declaration of array or creating an array with size 5
		int age[] = new int[5];
		int count = 0; // total no of players age b/w 18 and 20
		System.out.println("Enter the age of plyers");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < age.length; i++) {
			age[i] = s.nextInt();
			if (age[i] >= 18 && age[i] <= 20) {
				count = count + 1;
			}

		}
		System.out.println("Total players" + count);

	}
}