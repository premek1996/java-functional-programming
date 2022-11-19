package functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {

    private static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    private static final Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    private static final Predicate<String> containsNumber3Predicate =
            phoneNumber -> phoneNumber.contains("3");

    public static void main(String[] args) {
        var phoneNumber1 = "07999999999";
        var phoneNumber2 = "119923599";

        System.out.println(isPhoneNumberValid(phoneNumber1));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber1));

        System.out.println(isPhoneNumberValid(phoneNumber2));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber2));

        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3Predicate)
                .test(phoneNumber2));
    }

}
