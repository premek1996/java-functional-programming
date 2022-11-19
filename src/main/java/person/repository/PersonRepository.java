package person.repository;

import person.model.Gender;
import person.model.Person;

import java.util.List;

public class PersonRepository {

    public static List<Person> getAll() {
        return List.of(
                Person.builder()
                        .name("John")
                        .phoneNumber("99999999999")
                        .gender(Gender.MALE)
                        .build(),
                Person.builder()
                        .name("Maria")
                        .phoneNumber("99999999999")
                        .gender(Gender.FEMALE)
                        .build(),
                Person.builder()
                        .name("Aisha")
                        .phoneNumber("99999999999")
                        .gender(Gender.FEMALE)
                        .build(),
                Person.builder()
                        .name("Alex")
                        .phoneNumber("99999999999")
                        .gender(Gender.MALE)
                        .build(),
                Person.builder()
                        .name("Alice")
                        .phoneNumber("99999999999")
                        .gender(Gender.FEMALE)
                        .build()
        );
    }

}
