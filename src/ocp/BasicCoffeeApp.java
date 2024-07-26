package ocp;

import java.util.HashMap;
import java.util.Map;
import ocp.entity.Coffee;
import ocp.entity.CoffeeException;
import ocp.entity.CoffeeSelection;
import ocp.entity.GroundCoffee;

public class BasicCoffeeApp {
    private CoffeeMachine coffeeMachine;

    public BasicCoffeeApp(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee prepareCoffee(CoffeeSelection selection) throws CoffeeException {
        Coffee coffee = this.coffeeMachine.brewCoffee(selection);
        System.out.println("Coffee is ready!");
        return coffee;
    }

    public static void main(String[] args) {
        Map<CoffeeSelection, GroundCoffee> beans = new HashMap();
        beans.put(CoffeeSelection.FILTER_COFFEE, new GroundCoffee("My favorite filter coffee bean", 1000));
        CoffeeMachine modernMachine = new ModernCoffeeMachine(beans);
        BasicCoffeeApp app = new BasicCoffeeApp(modernMachine);

        try {
            app.prepareCoffee(CoffeeSelection.ESPRESSO);
        } catch (CoffeeException var5) {
            CoffeeException e = var5;
            e.printStackTrace();
        }

    }
}