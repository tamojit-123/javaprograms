public class PalindromeExmple 
{
	public static String reverseString(String str)
	{
		char ch[]=str.toCharArray();
		String rev="";
		for(int i = ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		return rev;
		
	}
	public static void main(String[] args) 
	{  
		String name = "MadaMa";
		String temp = reverseString(name);
		if (name.equals(temp))
			System.out.println("Palindrome");
		else
			System.out.println(" not Palindrome");
			
		//System.out.println(Reverse.reverseString("HannaA"));     
	}
}