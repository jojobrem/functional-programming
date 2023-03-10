package section7_functionalProgramming;

public class FunctionalChaining {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer.accept("Hello");
        consumer2.accept("Hello");

        Consumer<String> consumer3 = s -> {
            consumer.accept(s);
            consumer2.accept(s);
        };

        consumer3.accept("Joanne");

        Consumer<String> c4 = consumer.thenAccept(consumer2);
        c4.accept("HelloAgain");

    }

}
