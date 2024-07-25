package designPattern;

import designPattern.factory.Polygon;
import designPattern.factory.PolygonFactory;
import dip.application.ICustomerService;
import dip.entities.Customer;
import dip.services.CustomerService;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.Instance();
        System.out.println(singleton.getSingletonData());
        singleton.SingletonOperation();
        Polygon polygon =  PolygonFactory.getPolygon("Square");

        System.out.println(polygon.getName());
    }
}
