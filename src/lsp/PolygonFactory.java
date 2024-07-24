package lsp;

public class PolygonFactory {

    public Polygon createPolygon(String polygonName) {
        if (polygonName == null) return null;
        if (polygonName.equals("rectangle")) {
            System.out.printf("You entered a rectangle.\n");
            System.out.printf("This rectangle has area = ");
            return new Rectangle(30, 60);
        } else {
            System.out.printf("You entered a Square.\n");
            System.out.printf("This Square has area = ");
            return new Square(30);
        }
    }
}
