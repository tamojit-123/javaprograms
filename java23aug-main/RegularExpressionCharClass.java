// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class RegularExpressionCharClass
// {
// 	public static void main(String ar[])
// 	{
// 		String s = "It wrs the best of tomes";
// 		Pattern p;
// 		Matcher m;
// 		p = Pattern.compile("w[aeiou]s");
// 		m = p.matcher(s);
// 		if(m.find())
// 			System.out.println("Found... "+m.group());
// 		else
// 			System.out.println("Not Found... ");
// 		p = Pattern.compile("t[^aeou]mes");
// 		m = p.matcher(s);
// 		if(m.find())
// 			System.out.println("Found... "+m.group());
// 		else
// 			System.out.println("Not Found... ");
// 		p = Pattern.compile("w.s");
// 		m = p.matcher(s);
// 		if(m.find())
// 			System.out.println("Found... "+m.group());
// 		else
// 			System.out.println("Not Found... ");
// 	}
// }
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class RegularExpressionCharClass
{
	public static void main(String ar[])
	{
		String s = "It is 12 will meet at 30. It is over";
		Pattern p;
		Matcher m;
		p = Pattern.compile("\\d\\d");
		m = p.matcher(s);
		while(m.find())
			System.out.println("Found... "+m.group());
//		p = Pattern.compile("");
		
	}
}