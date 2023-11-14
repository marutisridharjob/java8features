package java8.example.streams.predicate.demo1;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateDemo();
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(7));
    }

    @Override
    public boolean test(Integer i) {
        if (i % 2 == 0)
            return true;
        else
            return false;
    }
}
