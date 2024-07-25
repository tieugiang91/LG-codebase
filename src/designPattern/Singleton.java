package designPattern;

public class Singleton {
    private static Singleton uniqueInstance;

    private String singletonData;

    static Singleton Instance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton("singletonData");
        }
        return uniqueInstance;
    }

    private Singleton(String singletonData) {
        this.singletonData = singletonData;
    }

    public String getSingletonData() {
        return singletonData;
    }

    public void SingletonOperation() {
        System.out.println("Singleton log");
    }

}
