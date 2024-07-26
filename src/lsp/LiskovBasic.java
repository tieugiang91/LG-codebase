package lsp;

public class LiskovBasic {
    public LiskovBasic() {
    }

    public static void main(String[] args) {
        new Rectangle(40, 30);
        Square square = new Square(40);
        square.setWidth(50);
        System.out.println(square.area());
    }
}