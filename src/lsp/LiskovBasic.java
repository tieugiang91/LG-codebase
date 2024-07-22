package lsp;

class Rectangle {
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

    public int area() {
        return width * height;
    }
}

class Square extends Rectangle {

    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setWidth(int val) {
        /*
         * Here's the issue - how should this method behave? If you do not set the new
         * height, it's no longer a square. If you do, tests might fail.
         */
        super.setWidth(val);
//        super.setHeight(val); // Enable this, then rectangle height * width = width ^ 2
    }
}

public class LiskovBasic {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(40, 30);
        Rectangle rect = new Square(40);
        rect.setWidth(50); // The square is no longer a square!
        System.out.println(rect.area());
    }
}