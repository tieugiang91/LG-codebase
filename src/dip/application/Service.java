package dip.application;

import dip.entities.Customer;

import java.util.List;

public interface Service {
    List<Customer> findAll();
}
