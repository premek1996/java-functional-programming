package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    private static Function<String, String> upperCaseName = String::toUpperCase;

    private static Function<String, String> upperCaseName2 = name -> {
        if (name.isBlank()) {
            throw new IllegalStateException();
        }
        return name.toUpperCase();
    };

    private static BiFunction<String, Integer, String> upperCaseName3 = (name, age) -> {
        if (name.isBlank()) {
            throw new IllegalStateException();
        }
        System.out.println(age);
        return name.toUpperCase();
    };

    public static void main(String[] args) {
        System.out.println(upperCaseName.apply("Alex"));
        System.out.println(upperCaseName2.apply("Alex"));
        System.out.println(upperCaseName3.apply("Alex", 15));
    }

}
