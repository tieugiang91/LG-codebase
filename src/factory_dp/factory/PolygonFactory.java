package factory_dp.factory;

import factory_dp.entities.*;

public class PolygonFactory implements IPolygonFactory {

    public PolygonFactory() {
    }

    @Override
    public IPolygon getPolygon(PolygonType polygonType) {
        return switch (polygonType) {
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
            case TRIANGLE -> new Triangle();
        };
    }
}
