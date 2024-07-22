package dip.daoimplementations;

import dip.entities.Customer;

import java.util.*;

public class SimpleCustomerDao {

    private Map<Integer, Customer> customers;

    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }


    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }


    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
