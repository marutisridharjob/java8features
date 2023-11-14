package java8.example.streams.consumer.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


    /*user defined lamda approach that calls accept() of Consumer Functional Interface*/
    public static void main(String[] args) {


        /*First Approach*/
        Consumer<Integer> consumer = i -> System.out.println("Printing :" + i); /*For single parameter the lamda expression can be :  parameter -> {body};*/
        consumer.accept(10);

        /*Second Approach*/
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        /*the stream function internally calls accept() method*/
        list.stream().forEach(consumer);

    }
}
