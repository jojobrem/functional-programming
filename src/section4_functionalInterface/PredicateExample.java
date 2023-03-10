package section4_functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("basics");
        list.add("");
        list.add("strong");
        list.add("strong");
        list.add("");
        list.add("BasicsStrong");

        List<Integer> intList = List.of(1, 2, 4, 8, 7);

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        Predicate<String> filter = s -> s.contains("Basics");
        List<String> strings = filterList(list, filter);
        System.out.println(strings);

        Predicate<Integer> intFilter = integer -> integer % 2 == 0;

        List<Integer> evens = filterList(intList, intFilter);
        System.out.println(evens);
        //same as above using streams

        System.out.println(list
                .stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList()));

        System.out.println(list
                .stream()
                .filter(s -> s.contains("Basics"))
                .collect(Collectors.toList()));

        System.out.println(intList
                .stream()
                .filter( integer -> integer % 2 == 0)
                .collect(Collectors.toList()));
    }



    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();

        for (T string: list){
            if (predicate.test(string)){
                newList.add(string);
            }
        }
        return newList;
    }
}
