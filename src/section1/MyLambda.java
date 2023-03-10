package section1;

public class MyLambda {

    //properties
    //name of function
    //body of the function
    //return type

//    new Runnable() { can remove name as it will be inferred because thread class constructor accepts runnable
//        @Override
//        public void run() { // can remove method name as runnable only has one method
    //can remove access modifier and return type as compiler can infer these
//            System.out.println("Thread Executed by anonymous class");
//        }
//    }out
    // therefore
public static void main(String[] args) {
    Thread t =new Thread(() -> System.out.println("lambda executed this thread"));
    t.start();

}


}
