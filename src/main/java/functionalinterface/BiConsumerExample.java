package functionalinterface;

import person.model.Gender;
import person.model.Person;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    private static final BiConsumer<Person, Boolean> greetPersonBiConsumer = (person, shouldDisplayPhoneNumber) -> {
        if (shouldDisplayPhoneNumber) {
            System.out.printf("Hello %s! Your phone number is: %s%n", person.getName(), person.getPhoneNumber());
        } else {
            System.out.printf("Hello %s!%n", person.getName());
        }
    };

    public static void main(String[] args) {
        var person = Person.builder()
                .name("John")
                .phoneNumber("99999999999")
                .gender(Gender.MALE)
                .build();
        greetPersonBiConsumer.accept(person, true);
        greetPersonBiConsumer.accept(person, false);
    }

}
