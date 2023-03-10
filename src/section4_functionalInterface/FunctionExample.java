package section4_functionalInterface;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionExample {
    //generally used for transformation
    public static void main(String[] args) {

        List<String> list = List.of("kit", "kat", "shake");

//        Function<String, Integer> function= e -> e.length();
//
//        List<Integer> newList = map(list,function);
//        System.out.println(newList);

        System.out.println(list
                .stream()
                .map(e -> e.length())
                .collect(Collectors.toList()));
    }

//    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
//        List<R> newList = new ArrayList<>();
//        for (T t: list) {
//            newList.add(function.apply(t));
//
//
//        }
//        return newList;
//    }

}
