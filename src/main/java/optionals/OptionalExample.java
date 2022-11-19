package optionals;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        var value = Optional.ofNullable("hello")
                .orElse("default value");
        System.out.println(value);

        Optional.ofNullable("hello234")
                .ifPresent(System.out::println);

        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Value is null"));

        Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("exception"));
    }

}
