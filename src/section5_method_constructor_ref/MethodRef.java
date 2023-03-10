package section5_method_constructor_ref;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRef {

    //use an already implemented method

    //can also use method ref at place where you use a lambda
    public static void main(String[] args) {
        List<Integer> list = List.of(34, 35, 36);
        Consumer<Integer> consumer = System.out::println;
        list.stream()
                .forEach(i -> consumer.accept(i));

        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());

        BiFunction<String, String, String> biFunction = (a, b) -> A_Class.staticMethod(a, b);
        BiFunction<String, String, String> biFunction2 = A_Class::staticMethod;
        System.out.println(biFunction.apply("Joanne", "Bremner"));
        System.out.println(biFunction2.apply("Joanne", "Bremner"));
    }

    private static class A_Class {
        public static String staticMethod(String a, String b) {
            return a + b;
        }
    }
}
