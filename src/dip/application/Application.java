package dip.application;

import dip.application.interfaces.ICustomerService;
import dip.entities.Customer;
import dip.services.CustomerService;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        ICustomerService customerService = new CustomerService(customers);
        customerService.findAll().forEach(System.out::println);
    }
}
