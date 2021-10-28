/*Write a class called ShowAllDataType which should display any 
data type values using method overloading.*/

class ShowAllDataType {

	public int data(int num1) {
		return num1;
	}

	public double data(double val1) {
		return val1;
	}

	public String data(String s1) {
		return s1;
	}

	public float data(float f1) {
		return f1;
	}

	public long data(long l1) {
		return l1;
	}

	public static void main(String arg[]) {

		ShowAllDataType datapassObj = new ShowAllDataType();

		System.out.println("Integer data() Method:" + datapassObj.data(100));
		System.out.println("double data() Method:" + datapassObj.data(100.12f));
		System.out.println("String data() Method:" + datapassObj.data("John"));
		System.out.println("float data() Method:" + datapassObj.data(100.123456789));
		System.out.println("long data() Method:" + datapassObj.data(123456789L));

	}
}