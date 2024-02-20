package javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import mapflatmap.Customer;
import mapflatmap.CustomerDb;

public class OptionalDemo {
    public static Customer getCustomerByEmail(String email){
        List<Customer> customers = CustomerDb.getAll();
        return customers.stream().filter(c->c.getEmail().equals(email)).findFirst().orElse(new Customer());
    }

    public static void main(String[] args) {
         Customer customer = new Customer(102, "john", null, Arrays.asList("898089898", "9898898989"));
    //empty,of,ofNullable
    Optional<Object> empty = Optional.empty();
    System.out.println(empty);
    // Optional<String> email = Optional.of(customer.getEmail());
    // System.out.println(email);
    Optional<String> email2 = Optional.ofNullable(customer.getEmail());
    // if(email2.isPresent())
    System.out.println(email2.orElse("default"));
    System.out.println(email2.map(String::toUpperCase).orElseGet(()->"default"));
    // System.out.println(email2.orElseThrow(()->new IllegalArgumentException("Email not present")));
    getCustomerByEmail("pqr");
    }
   
}
