package factory;

public class Rectangle implements Polygon {
    Rectangle() {
        System.out.println("Rectangle created");
    }

    public String getPolygon() {
        return "Rectangle";
    }
}