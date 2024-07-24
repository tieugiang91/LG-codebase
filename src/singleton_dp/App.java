package singleton_dp;

public class App {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.instance();
        System.out.println(singletonObject.singletonOperation());
    }
}
