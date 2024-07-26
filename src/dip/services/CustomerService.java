package dip.services;

import dip.application.ICustomerService;
import dip.entities.Customer;
import java.util.List;

public class CustomerService implements ICustomerService {
    private final ICustomerDao customerDao;

    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> findAll() {
        return this.customerDao.findAll();
    }
}