package dip.services;

import dip.application.ICustomerService;
import dip.entities.Customer;

import java.util.List;

public class CustomerService implements ICustomerService {

    private final ICustomerDao customerDao;

    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
