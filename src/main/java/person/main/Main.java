package person.main;

import person.service.PersonService;

public class Main {

    public static void main(String[] args) {
        System.out.println(PersonService.getFemalesByImperativeApproach());
        System.out.println(PersonService.getFemalesByDeclarativeApproach());
    }

}
