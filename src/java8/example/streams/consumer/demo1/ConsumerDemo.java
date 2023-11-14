package java8.example.streams.consumer.demo1;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
    /*accept() is the abstract method in Consumer interface*/

    @Override
    public void accept(Integer i) {
        System.out.println("Printing :" + i);
    }


}
