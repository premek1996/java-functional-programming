package functionalinterface;

import java.util.function.Function;

public class FunctionExample {

    private static int incrementByOne(int number) {
        return number + 1;
    }

    //UnaryOperator<Integer>
    private static final Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    //UnaryOperator<Integer>
    private static final Function<Integer, Integer> multiplyByTenFunction =
            number -> number * 10;

    public static void main(String[] args) {
        System.out.println(incrementByOne(5));
        System.out.println(incrementByOneFunction.andThen(multiplyByTenFunction)
                .andThen(incrementByOneFunction)
                .apply(5));
    }

}
