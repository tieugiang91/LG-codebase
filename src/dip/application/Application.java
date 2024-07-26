package dip.application;

import dip.daoimplementations.SimpleCustomerDao;
import dip.entities.Customer;
import dip.services.CustomerService;
import dip.services.ICustomerDao;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        ICustomerDao customerDao = new SimpleCustomerDao(customers);
        ICustomerService customerService = new CustomerService(customerDao);
        List var10000 = customerService.findAll();
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
    }
}