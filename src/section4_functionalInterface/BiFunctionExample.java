package section4_functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
//can do any input type and any return type
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (a, b) -> a.concat(b).length();
        System.out.println(biFunction.apply("Basics", "Strong"));
    }
}
