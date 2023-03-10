package section1;

public class LambdaExample1 {
    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass();
        Thread t = new Thread(runnableClass);
//        runnableClass.run();
        t.start();
    }
}
