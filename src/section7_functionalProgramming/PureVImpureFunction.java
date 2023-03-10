package section7_functionalProgramming;

public class PureVImpureFunction {
    private int value = 0;

//   pure function:  idempotent and no side effects (doesn't read from or write to anything), out put depends only on input params
    // and internal algorithm
    //never modifiy shared state of variables

    public int sum( int a, int b){
        return a + b;
        //nothing is modified
    }


    public int impureSum( int nextValue){
       this.value += nextValue;
       return this.value;
       //modifies state of value so it has a side effect
        //output depends on more than input params
    }

}
