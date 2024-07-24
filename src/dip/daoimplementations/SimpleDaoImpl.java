package dip.daoimplementations;

import dip.entities.Customer;
import dip.services.SimpleDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SimpleDaoImpl implements SimpleDao {

    private Map<Integer, Customer> customers;

    public SimpleDaoImpl(Map<Integer, Customer> customers) {
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
