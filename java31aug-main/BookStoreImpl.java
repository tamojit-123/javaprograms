package com.niit.bookstore;

public class BookStoreImpl {
    public static void main(String[] args) {
        // Declare and initialize author, book and bookstore objects
        String authorName = "";
        String authorPenName = "";
        String bookStoreName = "";
        String bookStoreRegistrationId = "";
        int ISBNNo = 0;
        String bookName = "";
        String genre = "";
        float price = 0;
        float discountPercentage = 0;

        // Use the get and set methods to set values to the variables
        Author au = new Author();
        au.setName(authorName);
        au.setPenName(authorPenName);
        Book bk = new Book();
        bk.setISBN(ISBNNo);
        bk.setName(bookName);
        bk.setAuthName(au);
        bk.setGenre(genre);
        bk.setPrice(price);
        Book bk1 = new Book();
        bk1.setISBN(ISBNNo);
        bk1.setName(bookName);
        bk1.setAuthName(au);
        bk1.setGenre(genre);
        bk1.setPrice(price);
        // Book bookarr[]=new Book[]{bk,bk1};
        Bookstore bs = new Bookstore();
        bs.setBookStoreName(bookStoreName);
        bs.setStoreRegId(bookStoreRegistrationId);

        // Display book details before discount is calculated
        System.out.println("The book details before discount : ");
        bk.displayBookDetails();
        // Calculate discount on the books by calling the methods
        bs.calculateDiscount(bk, discountPercentage);

        // Display book details after discount is calculated
        System.out.println("The book details after discount : ");
        bk.displayBookDetails();
    }

}