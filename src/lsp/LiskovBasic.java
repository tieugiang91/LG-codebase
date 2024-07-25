package lsp;

class Rectangle implements PolygonArea{
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
    public int area() {
        return width * height;
    }
}

class Square implements PolygonArea {

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side*side;
    }
}

public class LiskovBasic {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(40, 30);
        Square square = new Square(40);
//        rect.setWidth(50); // The square is no longer a square!
        System.out.println(rect.area());
        System.out.println(square.area());

    }
}