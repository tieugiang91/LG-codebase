package dip.services;

import dip.application.interfaces.ICustomerService;
import dip.daoimplementations.SimpleCustomerDao;
import dip.entities.Customer;
import dip.services.interfaces.ICustomerDao;

import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {

    private final ICustomerDao customerDao;

    public CustomerService(Map<Integer, Customer> customers) {
        this.customerDao = new SimpleCustomerDao(customers);
//        this.customerDao = null;
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
