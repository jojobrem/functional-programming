package section7_functionalProgramming;

public class Closures {

   /* A closure is a function that refers to free variables in its lexical code*/

    public static void main(String[] args) {

        final int val = 111;

        Task lambda = () -> {

            System.out.println(val);
            System.out.println("Task competed");
        };
        printValue(lambda);
    }

    private static void printValue(Task lambda) {
        lambda.doTask();
        //jre is keeping track of val and passing it to the method this is a closure
//        closures control what is in the scope of a function
    }
}
