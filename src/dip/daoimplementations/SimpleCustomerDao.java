package dip.daoimplementations;

import dip.entities.Customer;
import dip.services.ICustomerDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SimpleCustomerDao implements ICustomerDao {
    private Map<Integer, Customer> customers;

    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    public Optional<Customer> findById(int id) {
        return Optional.ofNullable((Customer)this.customers.get(id));
    }

    public List<Customer> findAll() {
        return new ArrayList(this.customers.values());
    }
}
