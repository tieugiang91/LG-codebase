package dip.services;

import dip.daoimplementations.SimpleCustomerDao;
import dip.entities.Customer;

import java.util.List;

public class CustomerService {

    private final SimpleCustomerDao customerDao;

    public CustomerService(SimpleCustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
