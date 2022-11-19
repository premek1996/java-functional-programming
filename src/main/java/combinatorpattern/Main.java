package combinatorpattern;

import combinatorpattern.customer.model.Customer;
import combinatorpattern.customer.validation.CustomerValidatorService;

import java.time.LocalDate;

import static combinatorpattern.customer.validation.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        var customer = Customer.builder()
                .name("ALice")
                .email("alice@gmail.com")
                .phoneNumber("084326436")
                .dob(LocalDate.of(2000, 10, 25))
                .build();

        System.out.println(new CustomerValidatorService().isValid(customer));

        //using combinator pattern
        var customerRegistrationValidator = isAdult()
                .and(isEmailValid())
                .and(isPhoneNumberValid());

        var validationResult = customerRegistrationValidator.apply(customer);
        System.out.println(validationResult);
    }

}
