package factory;

public class Square implements Polygon {
    Square() {
        System.out.println("Square created");
    }

    public String getPolygon() {
        return "Square";
    }
}