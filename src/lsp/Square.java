package lsp;

class Square implements Polygon {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public void setWidth(int val) {
        this.width = val;
    }

    public int area() {
        return this.width * this.width;
    }
}