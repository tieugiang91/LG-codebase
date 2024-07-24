package factory;

public class SampleFactoryApp {

    public static void main(String[] args) {
        SampleFactoryPattern sampleFactoryPattern = new SampleFactoryPattern();
        System.out.printf("This is a sample factory pattern\n");
        sampleFactoryPattern.getProduction("paper").produce();
    }
}
