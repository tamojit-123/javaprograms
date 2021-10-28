class Book1 {
    
   private int ISBNNo;
   private String bookName;
   private String author;
   private String genre;
   private float price;

   //default constructor
   public Book1(){
      ISBNNo = 4567; //localvariables tho this constructurors
      bookName = "Nineteen Eighty-Four";
      author = "George Orwell";
      genre = "Fiction";
      price = 35.5f;
      System.out.println("I am Empty parameterized constructor");
   }

   public  void display(){
      System.out.println("BookISBNNo:="+ISBNNo+"\t BookName:="+bookName+"\t AuthorName:="+author+"\tGenre:="+genre);
   }
   
   // parametarized constructor
   public Book1(int ISBNNo, String bookName, String author, String genre, float price){

      this.ISBNNo=ISBNNo;
      this.bookName=bookName;
      this.author=author;
      this.genre=genre;
      this.price=price;

   }

   //getter and setters
   public void setISBNNo(int ISBNNo){
      this.ISBNNo = ISBNNo;
   }
   public int getISBNNo(){
      return ISBNNo;
   }

   public void setbookName(String bookName){
      this.bookName = bookName;
   }
   public String getbookName(){
      return bookName;
   }

   public void setPrice(float price){
      this.price = price;
   }
   public float getPrice(){
      return price;
   }

   public void setAuthor(String author){
      this.author = author;
   }
   public String getAuthor(){
      return author;
   }
   
   public void setGenre(String genre){
      this.genre = genre;
   }
   public String getGenre(){
      return genre;
   }
}

class BookMain{

   public static void main(String[] args){

      Book1 bookObj = new Book1();

      bookObj.display();

      bookObj.setISBNNo(1234);
      bookObj.setbookName("Alice in wonderland");
      bookObj.setPrice(20.5f);
      bookObj.setAuthor("Lewis Carroll");
      bookObj.setGenre("Novel");

      System.out.println("Book ISBNNo:" +bookObj.getISBNNo());
      System.out.println("Book name:" +bookObj.getbookName());
      System.out.println("Book price:" +bookObj.getPrice());
      System.out.println("Book Author:" +bookObj.getAuthor());
      System.out.println("Book genre:" +bookObj.getGenre());


   }
}