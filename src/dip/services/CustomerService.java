package dip.services;

import dip.application.ICustomerService;
import dip.daoimplementations.SimpleCustomerDao;
import dip.entities.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService implements ICustomerService {
    private static CustomerService instance;
    private final ICustomerDao customerDao;

    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public static synchronized ICustomerService getInstance(ICustomerDao customerDao) {
        if (instance == null) {
            instance = new CustomerService(customerDao);
        }
        return instance;
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.empty();
    }
}
