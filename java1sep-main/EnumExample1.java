class EnumExample1{  
//defining the enum inside the class  
public enum Season { WINTER, SPRING, SUMMER, FALL }  
//main method  
public static void main(String[] args) {  
//traversing the enum  
for (Season s : Season.values())  
System.out.println(s);  
}
}  

/*
Java Enum internally inherits the Enum class, so it cannot inherit any other class, but it can implement many interfaces. We can have fields, constructors, methods, and main methods in Java enum.
class EnumExample1{  
//defining enum within class  
public enum Season { WINTER, SPRING, SUMMER, FALL }  
//creating the main method  
public static void main(String[] args) {  
//printing all enum  
for (Season s : Season.values()){  
System.out.println(s);  
}  
System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
  
}} 
*/