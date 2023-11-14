package java8.example.streams.predicate.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    /*Using Lamda Expression*/
    public static void main(String[] args) {

        /*First approach*/
        Predicate<Integer> predicate = i -> i % 2 == 0;

        System.out.println(predicate.test(4));
        System.out.println(predicate.test(7));

        /*Second approach with list using the Predicate abstract functional method logic*/
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(predicate).forEach(i -> System.out.println("Print even numbers : " + i));

        /*Third approach by adding logic in the filter method*/
        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println("Print even numbers : " + i));
    }
}
