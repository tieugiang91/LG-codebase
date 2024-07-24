package factory;

public class Handmade implements Product {
    @Override
    public void produce() {
        System.out.printf("I'm a handmade product\n");
    }
}
