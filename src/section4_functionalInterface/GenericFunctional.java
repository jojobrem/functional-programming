package section4_functionalInterface;

@FunctionalInterface
public interface GenericFunctional<T, R> {

    R execute(T string);
}
