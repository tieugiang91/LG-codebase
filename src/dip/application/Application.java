package dip.application;

import dip.daoimplementations.SimpleDaoImpl;
import dip.entities.Customer;
import dip.services.ServiceImpl;
import dip.services.SimpleDao;

import java.util.HashMap;
import java.util.Map;

public class Application {

    private static SimpleDao mSimpleDaoImpl;
    private static Service mServiceImpl;


    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        mSimpleDaoImpl = new SimpleDaoImpl(customers);
        mServiceImpl = new ServiceImpl(mSimpleDaoImpl);
        mServiceImpl.findAll().forEach(System.out::println);
    }

}
