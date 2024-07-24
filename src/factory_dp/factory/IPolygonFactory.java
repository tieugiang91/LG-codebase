package factory_dp.factory;

import factory_dp.entities.IPolygon;
import factory_dp.entities.PolygonType;

public interface IPolygonFactory {
    IPolygon getPolygon(PolygonType polygonType);
}
