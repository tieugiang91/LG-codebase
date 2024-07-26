package dip.services;

import dip.entities.Customer;
import java.util.List;
import java.util.Optional;

public interface ICustomerDao {
    Optional<Customer> findById(int var1);

    List<Customer> findAll();
}