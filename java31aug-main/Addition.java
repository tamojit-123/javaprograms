//polymorphism example with method overloading

public class Addition {
	public int add(int num1, int num2) {

		System.out.println("=======addition of two integers========");
		return num1 + num2;
	}

	public int add(int num1, int num2, int num3) {

		System.out.println("=======addition of three integers=======");
		return num1 + num2 + num3;
	}

	public double add(double val1, double val2) {

		System.out.println("=======addition of two double value=======");
		return val1 + val2;
	}

	public String add(String s1, String s2) {

		System.out.println("=======concatinating of two strings=======");
		return s1 + s2;
	}

	public float add(float f1, float f2) {

		System.out.println("=======addition of two float value=======");
		return f1 + f2;
	}

	public long add(long l1, long l2) {

		System.out.println("=======addition of two long value=======");
		return l1 + l2;
	}

	public static void main(String arg[]) {

		Addition objAddition = new Addition();

		System.out.println("Two Integer add() Method:" + objAddition.add(100, 200));
		System.out.println("Three Integer add() Method:" + objAddition.add(100, 200, 300));
		System.out.println("Two double add() Method:" + objAddition.add(100.12, 200.23));
		System.out.println("Two String add() Method:" + objAddition.add("John", " Doe"));
		System.out.println("Two float add() Method:" + objAddition.add(100.1f, 200.2f));
		System.out.println("Two long add() Method:" + objAddition.add(123456789L, 789456123L));

	}
}