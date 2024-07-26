package factory;

public class Triangle implements Polygon {
    Triangle() {
        System.out.println("Triangle created");
    }

    public String getPolygon() {
        return "Triangle";
    }
}