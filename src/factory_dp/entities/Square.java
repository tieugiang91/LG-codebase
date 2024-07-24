package factory_dp.entities;

public class Square implements IPolygon {
    private String name = "Square";

    public Square() {
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
