package person.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Person {

    String name;
    String phoneNumber;
    Gender gender;

    public boolean isFemale() {
        return gender == Gender.FEMALE;
    }

}
