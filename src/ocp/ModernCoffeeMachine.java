package ocp;

import ocp.entity.*;

import java.util.HashMap;
import java.util.Map;

public class ModernCoffeeMachine implements CoffeeMachine {
    private Map<CoffeeSelection, Configuration> configMap;
    private Map<CoffeeSelection, GroundCoffee> groundCoffee;
    private Grinder grinder;
    private BrewingUnit brewingUnit;

    public ModernCoffeeMachine(Map<CoffeeSelection, GroundCoffee> coffee) {
        this.groundCoffee = coffee;
        this.grinder = new Grinder();
        this.brewingUnit = new BrewingUnit();

        this.configMap = new HashMap<>();
        this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
        this.configMap.put(CoffeeSelection.ESPRESSO, new Configuration(30, 480));
    }

    @Override
    public Coffee brewCoffee(CoffeeSelection selection) {
        Configuration config = configMap.get(selection);

        // get the coffee
        GroundCoffee groundCoffee = this.grinder.grind(null, 0);

        // brew a filter coffee
        return this.brewingUnit.brew(selection, groundCoffee, config.getQuantityWater());
    }
}
