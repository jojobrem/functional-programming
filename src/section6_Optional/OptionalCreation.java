package section6_Optional;

import java.util.Optional;

public class OptionalCreation {

    String val = null;

    Optional<String> optional = Optional.of(val);
    //empty
    Optional<Integer> empty = Optional.empty();

    //if value may be null
    Optional<String> nullable = Optional.ofNullable(val);
    Optional<String> emptyOptional = Optional.ofNullable( null);



}
