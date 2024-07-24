package factory;

import java.awt.print.Book;

public class SampleFactoryPattern {
    public Product getProduction(String type) {
        if (type == null) return null;
        if (type.equals("paper")) return new Handmade();
        else return new Metal();
    }
}
