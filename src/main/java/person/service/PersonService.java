package person.service;

import person.model.Person;
import person.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public static List<Person> getFemalesByImperativeApproach() {
        List<Person> females = new ArrayList<>();
        for (Person person : PersonRepository.getAll()) {
            if (person.isFemale()) {
                females.add(person);
            }
        }
        return females;
    }

    public static List<Person> getFemalesByDeclarativeApproach() {
        //Predicate<Person> isFemale = Person::isFemale;
        return PersonRepository.getAll().stream()
                .filter(Person::isFemale)
                .toList();
    }

}
