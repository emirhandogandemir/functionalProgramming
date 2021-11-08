package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {


        Customer maria = new Customer("Maria", "99999");
       //Normal Java Function
        greetCustomer(maria);
        //Functional Interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria,false);
    }


    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer,showPhoneNumber) ->
            System.out.println("Hello" + customer.customerName + " thanks for registering phone number"+ (showPhoneNumber ? customer.customerPhoneNumber :"*********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello" + customer.customerName + " thanks for registering phone number");

    static void greetCustomer(Customer customer) {
        System.out.println("Hello" + customer.customerName + " thanks for registering phone number");
    }

    static void greetCustomer(Customer customer,boolean showTelephoneNumber) {
        System.out.println("Hello" + customer.customerName + " thanks for registering phone number");
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
