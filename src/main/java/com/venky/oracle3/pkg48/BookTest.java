package com.venky.oracle3.pkg48;

import java.util.List;
import java.util.stream.Stream;

class Book
{
    String title;
    int price;
    public Book(String title, int price)
    {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}



public class BookTest {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book("Goodbye to Childhood", 19),
                new Book("Farewell to the Land", 35), new Book("City Life", 17));

// OPTION A
        /* Stream< Book > bookStream = books.stream();
        bookStream.peek(a -> a.getPrice() < 20)  .forEach(System.out ::println);
*/

// OPTION B

        books.stream().filter(a -> a.getPrice() < 20)
                .forEach(System.out::println);



        // OPTION C

/*
        Stream bookStream = books.stream();
        bookStream.filter(a -> a.getPrice() < 20).peek(System.out::println);
*/


        // OPTION D

/*

        Stream bookStream = books.stream();
        bookStream.map( (Book a) -> a.getPrice() < 20).forEach(System.out::println);
*/

        Stream bookStream = books.stream();
        bookStream.filter(a -> ((Book) a).getPrice() < 20)
                .forEach(System.out :: println);

    }
}
