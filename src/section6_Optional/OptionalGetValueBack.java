package section6_Optional;

import java.util.Optional;

public class OptionalGetValueBack {

    public static void main(String[] args) {
        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);

        //get don't use if it's likely to be null
        Integer integerVal = optional.get();
        System.out.println(integerVal);

        Optional<Integer> emptyOptional = Optional.empty();
//        emptyOptional.get();

        //isPresent
        int i = emptyOptional.isPresent() ? emptyOptional.get() : 0;
        System.out.println(i);

//        orElse, orElseGet (orElseGet only evaulates if optional is empty)

        Integer orElse = emptyOptional.orElse(5);
        System.out.println("Optional OrElse returns :" + orElse);

        Integer orElseGet = emptyOptional.orElseGet(() -> 23);
        System.out.println("Optional OrElseGet returns: " + orElseGet);

        // orElseThrow (if you do specifially want to be alterted)
//        Integer integer = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
//        System.out.println(integer);

    }
}
