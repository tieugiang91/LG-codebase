package dip.application;

import dip.entities.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}