package section4_functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> new String("A String");
        System.out.println(supplier.get());

        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());
    }
}
