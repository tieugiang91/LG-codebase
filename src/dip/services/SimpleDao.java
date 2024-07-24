package dip.services;

import dip.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface SimpleDao {
    Optional<Customer> findById(int id);

    List<Customer> findAll();
}
