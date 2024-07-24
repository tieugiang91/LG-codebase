package ocp;

import ocp.entity.Coffee;
import ocp.entity.CoffeeSelection;
import ocp.entity.Configuration;
import ocp.entity.GroundCoffee;

public interface CoffeeMachine {
    Coffee brewCoffee(CoffeeSelection selection);
    void addGroundCoffee(CoffeeSelection sel, GroundCoffee newCoffee);
}
