package factory_dp.entities;

public class Rectangle implements IPolygon {
    private String name = "Rectangle";

    public Rectangle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "name='" + name + '\'' +
                '}';
    }
}
