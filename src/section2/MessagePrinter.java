package section2;

public class MessagePrinter{

    public static void main(String[] args) {
        MyPrintingFunctionalInterfaceImpl myPrintingFunctionalInterface = new MyPrintingFunctionalInterfaceImpl();
        myPrintingFunctionalInterface.printMessage("hello from the message printer");
    }
}
