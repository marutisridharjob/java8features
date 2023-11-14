package java8.example.lamda.demo2;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(201, "Hibernate", 300));
        books.add(new Book(301, "Spring", 200));
        books.add(new Book(401, "WebService", 100));
        return books;
    }
}