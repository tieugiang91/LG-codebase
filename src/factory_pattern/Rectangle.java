package factory_pattern;

public class Rectangle implements Polygon{
    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
