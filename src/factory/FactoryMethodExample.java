package factory;

abstract class Poly {
    public abstract void display();
}

class Triagle extends Poly {
    @Override
    public void display() {
        System.out.println("ok Triagle");
    }
}


abstract class Creator {
    public abstract Poly factoryMethod();
}

class ConcreteCreator extends Creator {
    @Override
    public Poly factoryMethod() {
        return new Triagle();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Poly PolyA = creator.factoryMethod();
        PolyA.display();
    }
}


