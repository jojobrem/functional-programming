package section4_functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);
        UnaryOperator<Integer> operator = i -> i * 100;
        
        List<Integer> result = mapper(list, operator);
        System.out.println(result);

        System.out.println(list
                .stream()
                .map(integer -> integer * 100)
                .collect(Collectors.toList()));
    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> resultList = new ArrayList<>();
        for (T t: list) {
            resultList.add(operator.apply(t));
        }
        return resultList;
    }
}
