package lsp;


public class LiskovBasic {
    public static void main(String[] args) {
        Polygon rectangle = new PolygonFactory().createPolygon("rectangle");
        System.out.println(rectangle.area());
    }
}