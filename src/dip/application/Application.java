package dip.application;

import dip.daoimplementations.SimpleCustomerDao;
import dip.daos.CustomerDao;
import dip.entities.Customer;
import dip.services.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new SimpleCustomerDao(customers));
        customerService.findAll().forEach(System.out::println);
    }
}
