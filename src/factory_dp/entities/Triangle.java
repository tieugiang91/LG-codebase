package factory_dp.entities;

public class Triangle implements IPolygon {
    private String name = "Triangle";

    public Triangle() {
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
