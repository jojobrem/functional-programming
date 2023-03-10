package section2;

public class MyFunctionalIntDemo {
    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface1 = new MyFunctInterfaceImpl();
        functionalInterface1.myMethod();

        MyFunctionalInterface functionalInterface = () -> System.out.println("hello from my lambda");
        functionalInterface.myMethod();
    }
}
