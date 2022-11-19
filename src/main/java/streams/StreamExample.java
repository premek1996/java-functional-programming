package streams;

import person.model.Person;
import person.repository.PersonRepository;

import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        printGenders();
        printNamesLength();
        System.out.println(onlyFemales());
    }

    private static void printGenders() {
        PersonRepository.getAll().stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    private static void printNamesLength() {
        PersonRepository.getAll().stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }

    private static boolean onlyFemales() {
        return PersonRepository.getAll()
                .stream()
                .allMatch(Person::isFemale);
    }

}
