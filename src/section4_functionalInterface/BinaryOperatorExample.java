package section4_functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    //same type input and return
    public static void main(String[] args) {
        BinaryOperator<String> operator = (a, b) -> a.concat(b);

        System.out.println(operator.apply("Joanne ", "Ainsbury"));
    }
}
