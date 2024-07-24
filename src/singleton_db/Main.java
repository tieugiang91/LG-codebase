package singleton_db;

public class Main {

    public static void main(String[] args) {
        SingletonOperation singletonOperation = SingletonOperation.getInstance();
        singletonOperation.showMessage();
    }
}
