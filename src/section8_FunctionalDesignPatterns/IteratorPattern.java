package section8_FunctionalDesignPatterns;

public class IteratorPattern {

    /*Access elements without exposing internal representation*/

    public static void main(String[] args) {

        MyArrayList myList = new MyArrayList(new Object[] {1, 3, 5, 67, 8});

        myList.forEach(System.out::println);

    }
}
