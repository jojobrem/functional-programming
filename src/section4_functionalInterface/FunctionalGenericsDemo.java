package section4_functionalInterface;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

       GenericFunctional<String, String> fun = s -> s.substring(1,5);
        String longstring = fun.execute("longstring");
        System.out.println(longstring);

        GenericFunctional<String, Integer> fun1 = s -> s.length();
        System.out.println(fun1.execute("longstring"));
    }
}
