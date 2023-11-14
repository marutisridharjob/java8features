package java8.example.lamda.demo2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSortOrder());
    }


    public List<Book> getBooksInSortOrder() {
        List<Book> books = new BookDAO().getBooks();

        /*First approach with Anonymous class MyComparator*/
//        Collections.sort(books, new MyComparator());

        /*Second Approach with sort function implementation*/
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        /*Third approach with Lamda Expression*/
        Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        return books;
    }


}

class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        /*Ascending Order*/
//      return o1.getName().compareTo(o2.getName());
        /*Descending Order*/
        return o2.getName().compareTo(o1.getName());
    }
}