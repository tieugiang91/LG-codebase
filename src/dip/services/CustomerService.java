package dip.services;

import dip.daoimplementations.SimpleCustomerDao;
import dip.daos.CustomerDao;
import dip.entities.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(SimpleCustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Optional<Customer> findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
