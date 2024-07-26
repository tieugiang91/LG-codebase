package lsp;

class Rectangle implements Polygon {
    private int width;
    private int height;

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
        return this.width * this.height;
    }
}