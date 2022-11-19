package functionalinterface;

import person.model.Gender;
import person.model.Person;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    private static final BiPredicate<Person, Person> haveTheSameGenderPredicate =
            (person1, person2) -> person1.getGender() == person2.getGender();

    public static void main(String[] args) {
        var person1 = Person.builder()
                .name("John")
                .phoneNumber("99999999999")
                .gender(Gender.MALE)
                .build();
        var person2 = Person.builder()
                .name("Maria")
                .phoneNumber("99999999999")
                .gender(Gender.FEMALE)
                .build();
        var person3 = Person.builder()
                .name("Aisha")
                .phoneNumber("99999999999")
                .gender(Gender.FEMALE)
                .build();

        System.out.println(haveTheSameGenderPredicate.test(person1, person2));
        System.out.println(haveTheSameGenderPredicate.test(person2, person3));
    }

}
