import java.util.*;
class Book
{
//author name
private String author;
//declaring bookname
private String bookname;
private double price;
private int no_of_pages;
private int bookid;
//Encapsulation  :Binding and wrapping the data into single
//public ,private ,protected
// declare the scanner classobject
Scanner scan; //built-in class
public void  acceptBook()
{
scan  =  new Scanner(System.in);
System.out.println("Enter the Book DetailsLike Author , Bname, price , nopages,bookid");
author = scan.next();
bookname= scan.next();
price =scan.nextDouble();
no_of_pages=scan.nextInt();
bookid  = scan.nextInt();
}
public  void display()
{
System.out.println("BookDetails......");
System.out.println("Book ID:="+bookid+"\t BName:"+bookname+"\t Author Name:"+author);
System.out.println("No ofPages="+no_of_pages+"\tPrice :"+price);
}
}
class BookMain
{
public static  void  main(String[]  ar)
{
//create an object or creating an instance(memory) of  the class  at the time of  execution
Book bookobj = new Book ();//first step
//call the behviour of book class
bookobj.acceptBook(); //secondstep
bookobj.display(); //third step
}
}