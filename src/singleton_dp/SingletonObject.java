package singleton_dp;

import java.util.Optional;

public class SingletonObject {
    private static final SingletonObject uniqueInstance = new SingletonObject();
    private Object singletonData;

    private SingletonObject() {
    }

    public static SingletonObject instance() {
        return uniqueInstance;
    }

    public Object getSingletonData() {
        return singletonData;
    }

    public String singletonOperation() {
        return "Data: " + Optional.ofNullable(singletonData).orElse("null");
    }

    public void setSingletonData(Object singletonData) {
        this.singletonData = singletonData;
    }
}
