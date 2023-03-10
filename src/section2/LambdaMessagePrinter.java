package section2;

public class LambdaMessagePrinter {

    public static void main(String[] args) {

        MyPrintingFunctionalInterface myPrintingFunctionalInterface = System.out::println;
        myPrintingFunctionalInterface.printMessage("hello from the lambda");
        };
    }

