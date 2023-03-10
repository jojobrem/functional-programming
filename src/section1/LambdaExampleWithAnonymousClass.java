package section1;

public class LambdaExampleWithAnonymousClass {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Executed by anonymous class");
            }
        });
        t.start();
    }
}
