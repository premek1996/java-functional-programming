package functionalinterface;

import person.model.Gender;
import person.model.Person;

import java.util.function.Consumer;

public class ConsumerExample {

    private static void greetPerson(Person person) {
        System.out.printf("Hello %s!%n", person.getName());
    }

    private static final Consumer<Person> greetPersonConsumer =
            person -> System.out.printf("Hello %s!%n", person.getName());

    public static void main(String[] args) {
        var person = Person.builder()
                .name("John")
                .phoneNumber("99999999999")
                .gender(Gender.MALE)
                .build();
        greetPerson(person);
        greetPersonConsumer.accept(person);
    }

}
