package section5_method_constructor_ref;

import java.util.function.Function;

public class ConstructorRef {

    public static void main(String[] args) {
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable task1 = () -> System.out.println("Task 1 executed");
        Runnable task2 = () -> System.out.println("Task 2 executed");

        Thread thread1 = threadGenerator.apply(task1);
        Thread thread2 = threadGenerator.apply(task2);

        thread1.start();
        thread2.start();

        //more compact
        threadGenerator
                .apply(() -> System.out.println("Task 3 executed"))
                .start();

    }
}
