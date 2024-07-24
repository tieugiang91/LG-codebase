package singleton;

public class SampleSingleton {

    private static SampleSingleton instance;
    private SampleSingleton() {}
    private static Book mBook;
    public static SampleSingleton getInstance() {
        if (instance == null) instance = new SampleSingleton();
        return instance;
    }

    public static Book getBookInstance() {
        if (mBook == null) {
            mBook = new Book("Test", "VN", "NXB");
        }
        return mBook;
    }

}
