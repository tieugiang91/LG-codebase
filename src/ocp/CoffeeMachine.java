package ocp;

import ocp.entity.Coffee;
import ocp.entity.CoffeeSelection;

public interface CoffeeMachine {
    Coffee brewCoffee(CoffeeSelection var1);
}