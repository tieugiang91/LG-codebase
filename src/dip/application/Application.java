package dip.application;

import dip.daoimplementations.SimpleCustomerDao;
import dip.entities.Customer;
import dip.services.CustomerService;
import dip.services.ICustomerDao;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
//        ICustomerDao customerDao = new SimpleCustomerDao(customers);
        ICustomerService customerService = new CustomerService(new SimpleCustomerDao(customers));
        customerService.findAll().forEach(System.out::println);
    }
}
