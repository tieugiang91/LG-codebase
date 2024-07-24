package lsp;

public class Square implements Polygon {

    private final int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * width;
    }
}
