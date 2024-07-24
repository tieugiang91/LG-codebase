package dip.services;

import dip.application.Service;
import dip.entities.Customer;

import java.util.List;

public class ServiceImpl implements Service {
    private SimpleDao simpleDao;

    public ServiceImpl(SimpleDao simpleDao) {
        this.simpleDao = simpleDao;
    }
    @Override
    public List<Customer> findAll() {
        return simpleDao.findAll();
    }
}
