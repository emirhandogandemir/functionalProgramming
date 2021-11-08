package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice","+0545454545","alice@gmail.com", LocalDate.of(2000,1,12));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        //System.out.println(validatorService.isValid(customer));




        // if valid  We can store customer in db


        //Using combinator pattern
         CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isEmailValid())
                 .apply(customer);

    }
}
