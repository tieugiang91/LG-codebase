package dip.services;

import dip.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ICustomerDao {

    public Optional<Customer> findById(int id);


    public List<Customer> findAll();
}
