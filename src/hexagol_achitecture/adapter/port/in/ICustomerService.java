package hexagol_achitecture.adapter.port.in;

import dip.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();
    Optional<Customer> findById(int id);
}
