package section6_Optional;

import java.util.Optional;

public class OptionalOperators2 {
    public static void main(String[] args) {
        //if Present
        //if value is present , if present executes a consumer on the value in that optional
        Optional<String> optionalString = Optional.of("Value");
        Optional<String> emptyOptional = Optional.empty();
        optionalString.ifPresent(System.out::println);
        emptyOptional.ifPresent(System.out::println);//does nothing
        //ifPresentOrElse takes a consumer and a runnable
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

        //stream
        //if value is present then stream it
        emptyOptional.stream().forEach(System.out::println);//doesNothing
        optionalString.stream().forEach(System.out::println);

        //or takes a supplier, returns optional if there is a value, or else it returns the supplier
        optionalString.or(() -> Optional.of("New Value")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("New Value")).ifPresent(System.out::println);

        //equals()
        // equals if it is also an optional and both are empty or both contain equal value
        System.out.println(optionalString.equals(Optional.of("Value")));
        System.out.println(Optional.empty().equals(Optional.empty()));

        //hashcode()
        //returns hashcode of value
        System.out.println(optionalString.hashCode());
        System.out.println(emptyOptional.hashCode());


    }


}
