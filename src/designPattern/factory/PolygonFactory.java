package designPattern.factory;

public class PolygonFactory {
    private static Polygon polygon;

    public static Polygon getPolygon(String name) {

        switch (name) {
            case "Square":
                polygon = new Square();
                break;
            case "Rectangle":
                polygon = new Rectangle();
                break;
            case "Triangle":
                polygon = new Triangle();
                break;
        }
        return polygon;
    }
}
