package section2;

import java.util.stream.IntStream;

public class MyImperativeVDeclarative {

    public static void main(String[] args) {

        //Imperative
        int sumOfEvens = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvens = sumOfEvens + i;
            }
        }
        System.out.println(sumOfEvens);


        //declarative
        int evenNumbersTotal = IntStream.rangeClosed(0, 100)
                .filter((i) -> i % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();
        System.out.println(evenNumbersTotal);

    }


}
