package finalsection;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {
        hello("John", null, firstName -> System.out.println("no lastName provided for " + firstName));
        hello2("John", null, () -> System.out.println("no lastName provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    /*
        Pure functional programming has a set of rules to follow:
        - No state
        - Pure Functions
        - No Side Effects
        - Higher Order Functions:
            * The function takes one or more functions as parameters.
            * The function returns another function as result.
     */

}
