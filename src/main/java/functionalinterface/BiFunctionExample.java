package functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {

    private static int incrementByOneAndMultiply(int number, int numberToMultiplyBy) {
        return (number + 1) * numberToMultiplyBy;
    }

    //BinaryOperator<Integer>
    private static final BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (number, numberToMultiplyBy) -> (number + 1) * numberToMultiplyBy;

    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply(5, 10));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(5, 10));
    }

}
