package lsp;

public class Rectangle implements Polygon {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int val) {
        this.width = val;
    }

    public void setHeight(int val) {
        this.height = val;
    }

    @Override
    public double area() {
        return width * height;
    }
}
