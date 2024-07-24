package ocp;

import ocp.entity.*;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMachineApp implements CoffeeMachine {
    private Map<CoffeeSelection, Configuration> configMap;
    private Map<CoffeeSelection, GroundCoffee> groundCoffee;
    private BrewingUnit brewingUnit;

    public CoffeeMachineApp(Map<CoffeeSelection, GroundCoffee> coffee) {
        this.groundCoffee = coffee;
        this.brewingUnit = new BrewingUnit();

        this.configMap = new HashMap<>();
        this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
    }

    @Override
    public Coffee brewCoffee(CoffeeSelection selection) {
        Configuration config = configMap.get(selection);


        GroundCoffee groundCoffee = this.groundCoffee.get(selection);


        return this.brewingUnit.brew(selection, groundCoffee, config.getQuantityWater());
    }

    @Override
    public void addGroundCoffee(CoffeeSelection sel, GroundCoffee newCoffee) {
        GroundCoffee existingCoffee = this.groundCoffee.get(sel);
        if (existingCoffee != null) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
            } else {
//                throw new CoffeeException("Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.groundCoffee.put(sel, newCoffee);
        }
    }
}
