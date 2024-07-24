package factory_dp;

import factory_dp.entities.IPolygon;
import factory_dp.entities.PolygonType;
import factory_dp.factory.IPolygonFactory;
import factory_dp.factory.PolygonFactory;

public class App {
    public static void main(String[] args) {
        IPolygonFactory polygonFactory = new PolygonFactory();

        IPolygon rectangle = polygonFactory.getPolygon(PolygonType.RECTANGLE);
        System.out.println(rectangle);

        IPolygon square = polygonFactory.getPolygon(PolygonType.SQUARE);
        System.out.println(square);

        IPolygon triangle = polygonFactory.getPolygon(PolygonType.TRIANGLE);
        System.out.println(triangle);
    }
}
