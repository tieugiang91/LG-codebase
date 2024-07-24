package factory;

public class Metal implements Product {
    @Override
    public void produce() {
        System.out.printf("I'm a metal product.");
    }
}
