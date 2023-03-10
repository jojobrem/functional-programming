package section6_Optional;

import java.util.Optional;

public class OptionalOperators {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Value");
        Optional<String> emptyString = Optional.empty();
        //map() - if value is present it will be transformed into another optional, according to given function
        Optional<String> optional = optionalString.map(val -> "Replaced");
        System.out.println(optional.get());

        String returnValue = emptyString.map(val -> "Replaced").orElse("Empty");
        System.out.println(returnValue);

        //filter() checks a condition on an and if it's true it will return that optional
        Optional<String> emptyOptional = emptyString.filter(val -> val.equalsIgnoreCase("value"));
        Optional<String> optionalWithValue = optionalString.filter(val -> val.equalsIgnoreCase("value"));
        System.out.println(emptyOptional.orElse("optional was empty"));
        System.out.println(emptyOptional);
        System.out.println(optionalWithValue);
        System.out.println(optionalWithValue.orElse("optional was empty"));

        //flatmap() mapping function result is already an optional
        Optional<String> flatMapOptional = optionalString.flatMap(val -> Optional.of("Replaced"));
        System.out.println(flatMapOptional.get());

        Optional<String> flatMapOptional1 = emptyOptional.flatMap(val -> Optional.of("Replaced"));
        System.out.println(flatMapOptional1);
        System.out.println(flatMapOptional1.orElse("Empty"));


    }
}
