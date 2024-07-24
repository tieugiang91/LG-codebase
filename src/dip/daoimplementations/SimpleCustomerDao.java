package dip.daoimplementations;

import dip.entities.Customer;
import dip.application.ICustomerService;
import dip.services.ICustomerDao;

import java.util.*;

public class SimpleCustomerDao implements ICustomerDao {

    private Map<Integer, Customer> customers;

    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
