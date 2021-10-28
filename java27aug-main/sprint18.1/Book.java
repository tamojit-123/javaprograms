package com.niit.bookstore;

public class Book {
    int ISBNNo;
    String bookName;
    Author author;
    String genre;
    float price;
    // Declare a parameterized constructor to initialize values
    public Book(int ISBNNo, String bookName, Author author, String genre, float price)
     {
        this.ISBNNo=ISBNNo;
        this.bookName=bookName;
        this.author=author;
        this.genre=genre;
        this.price=price;
      }
    
    // Method to display the details of a book
       public String displayBookDetails(){    
        String result=ISBNNo+"::"+bookName+"::"+author.authorName+"::"+genre+":: $"+price;
        return result;
      }
      
      public int getISBNNo(){
       return ISBNNo;
      }

      public String bookName(){
       return bookName;
      }

      public float getPrice(){
       return price;
      }

      public Author getAuthor(){
       return author;
      }
    
      public String getGenre(){
       return genre;
      }
  
}