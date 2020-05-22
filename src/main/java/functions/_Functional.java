package functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functional {
    public static void main(String[] args) {

        System.out.println(incrementAndMultiply.apply(1));

        System.out.println(biFunction.apply(4,100));
    }
    static Function<Integer,Integer> increment= number -> number + 1;

    static Function<Integer,Integer> multiply= number -> number * 10;

    static Function<Integer,Integer> incrementAndMultiply= increment.andThen(multiply);

    static BiFunction<Integer,Integer,Integer> biFunction= (add,multiply) -> (add + 1) * multiply;


}
