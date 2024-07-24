package dip.application.interfaces;

import dip.entities.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();
}
