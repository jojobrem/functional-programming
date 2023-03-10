package section2;

@FunctionalInterface
public interface MyFunctionalInterface {
    //single abstract method required to execute lambda without ambiguity
    // adding another method it would not compile with annotation
    //could remove annotation but it would not be functional

    public void myMethod();
}
