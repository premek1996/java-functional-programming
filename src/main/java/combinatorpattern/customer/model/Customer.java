package combinatorpattern.customer.model;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder
public class Customer {

    String name;
    String email;
    String phoneNumber;
    LocalDate dob;

}
