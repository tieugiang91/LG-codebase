package factory_pattern;

public class Main {
    public static void main(String[] args) {
        PolygonFactory polyFactory = new PolygonFactory();

        Polygon polygon1 = polyFactory.getPolygon("TRIANGLE");
        polygon1.draw();

        Polygon polygon2 = polyFactory.getPolygon("SQUARE");
        polygon2.draw();

        Polygon polygon3 = polyFactory.getPolygon("RECTANGLE");
        polygon3.draw();
    }
}
