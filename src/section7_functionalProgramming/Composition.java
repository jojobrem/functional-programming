package section7_functionalProgramming;

public class Composition {

   /* composition follows a different direction from chaining, in composition the second one get done first*/

    public static void main(String[] args) {
        Function<Square, Integer> fun1 = square -> square.getArea();
        Function<Integer, Double> fun2 = area -> Math.sqrt(area);

        Function<Square, Double> getSide = fun2.compose(fun1);
        Square square = new Square();
        square.setArea(100);

        Double side = getSide.apply(square);

        System.out.println(side);
    }
}
