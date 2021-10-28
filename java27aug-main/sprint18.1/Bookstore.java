package com.niit.bookstore;

public class Bookstore {
    String bookStoreName;
    String bookStoreRegistrationId;
    Book[] books;
    // Declare a parameterized constructor to initialize values
    public Bookstore(String bookStoreName, String bookStoreRegistrationId, Book[] books) {
        this.bookStoreName=bookStoreName;
        this.bookStoreRegistrationId=bookStoreRegistrationId;
        this.books=books;

    }
    public String getBookStoreName(){
        return bookStoreName;
    }
    public String getBookStoreRegistrationId(){
        return bookStoreRegistrationId;
    }
    public Book[] getBooks(){
        return books;
    }
    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book,float discountPercentage){  
        float  discountedprice=0;
        
        if((book.genre).equals("FICTION")){ 
            discountedprice=book.price-(book.price*discountPercentage/100f);
        return discountedprice;
        }
        else 
        return book.price;
    }
}