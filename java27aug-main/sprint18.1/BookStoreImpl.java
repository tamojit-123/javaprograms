package com.niit.bookstore;



public class BookStoreImpl {
    public static void main(String[] args) {
        // Declare and initialize author, book and bookstore objects

    Author author=new Author("Margaret Atwood","the Testaments");
    Author author1=new Author("Vasdev Mohi","Chequebook");
    Author author2=new Author("Vishwanathan Anand","the Mind Power");
    Book book=new Book(501,"::the butterflies::",author,"::AUTOBIOGRAPHY::$",500);
    Book book1=new Book(502,"::oceans and rivers::",author1,"::PHILOSOPHY::$",800);
    Book book2=new Book(503,"::legends of timbaktu::",author2,"::FICTION::$",900);
    Book[] books={book,book1,book2};
    Bookstore bookstore1=new Bookstore("Shivam Bookstore","123134456",books);
    //display book details before discount
    System.out.println("The book details before discount:");
    for(Book bk:books)
    {
        System.out.println(bk.displayBookDetails());
    }
    //calculate discounts of the book
    for(Book bk1:books)
    {
        bookstore1.calculateDiscount(bk1,25);
    }
    //display book details after discount is created.
    System.out.println("The book details after discount:");
    for(Book bk2:books)
    {
        System.out.println(bk2.displayBookDetails());
    }
    

    }

}