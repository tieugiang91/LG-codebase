package singleton_db;

public class SingletonOperation {

    private static SingletonOperation instance;
    private String singletonData;
    private SingletonOperation() {
        singletonData = "Hello";
    }


    public static SingletonOperation getInstance() {
        if (instance == null) {
            instance = new SingletonOperation();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world 123");
    }
    public String getSingletonData() {
        return singletonData;
    }
}
