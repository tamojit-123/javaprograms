class StringDemo
{
	public static void main(String ar[])
	{
		String name  = "India";
		StringBuilder sb = new StringBuilder(name);
		System.out.println("String  = "+name);
		System.out.println("New String  = "+sb);
		sb.append(" is my country");
		System.out.println("Appended String  = "+sb);
		sb.insert(1,'i');
		System.out.println("String after insertion  = "+sb);
		/*sb.delete(1,8);
		System.out.println("String after deletion  = "+sb);*/
	
		char ch = sb.charAt(4);
		System.out.println("Char at 4th index  = "+ch);
		sb.reverse();
		System.out.println("Reverse  = "+sb);
		
		sb.replace(2,7, "Jai Hind");
		System.out.println("Replace  = "+sb);
		System.out.println("Length = "+sb.length());
		int x = sb.indexOf("J");
		System.out.println("Index of J = "+x);
	}
}