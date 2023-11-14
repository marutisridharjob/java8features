package java8.example.lamda.demo1;

public class LamdaCalculatorImpl {
    public static void main(String[] args) {
        /*Lamda Expression*/
//        () -> {body}

        /* switchOn()*/
//        LamdaCalculator calculator = () -> System.out.println("Switch On");
//        calculator.switchOn();

        /*sum(int i)*/
//        LamdaCalculator calculator = (input) -> System.out.println("Sum: " + input);
//        calculator.sum(251);

        /*subtract(int i, int j)*/
        LamdaCalculator calculator = (i, j) -> {
            if (j < i) {
                throw new RuntimeException("Can't subtract!!");
            } else {
                return j - i;
            }

        };
        System.out.println("subtract: " + calculator.substract(8, 10));
    }
}
