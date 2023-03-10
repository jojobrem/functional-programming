package section4_functionalInterface;

import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> intList = List.of(34,67,8,23,67,89,90);

//        Consumer<Integer> consumer = integer -> System.out.println(integer);
//        consumer.accept(56);
//
//        printElements(intList, consumer);
//        intList.stream().forEach(e -> consumer.accept(e));
        intList.stream().forEach(e -> System.out.println(e));

    }

//    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
//        for(T t: list){
//            consumer.accept(t);
//        }
//    }
}
