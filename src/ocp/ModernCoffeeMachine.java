package ocp;

import java.util.HashMap;
import java.util.Map;
import ocp.entity.BrewingUnit;
import ocp.entity.Coffee;
import ocp.entity.CoffeeBean;
import ocp.entity.CoffeeSelection;
import ocp.entity.Configuration;
import ocp.entity.Grinder;
import ocp.entity.GroundCoffee;

public class ModernCoffeeMachine implements CoffeeMachine {
    private Map<CoffeeSelection, Configuration> configMap = new HashMap();
    private BrewingUnit brewingUnit = new BrewingUnit();

    public ModernCoffeeMachine(Map<CoffeeSelection, GroundCoffee> groundCoffee) {
        this.configMap.put(CoffeeSelection.ESPRESSO, new Configuration(30, 480));
    }

    public Coffee brewCoffee(CoffeeSelection selection) {
        Grinder grinder = new Grinder();
        CoffeeBean coffeeBean = new CoffeeBean(selection.name(), 1000);
        GroundCoffee groundCoffee = grinder.grind(coffeeBean, 30);
        Configuration config = (Configuration)this.configMap.get(selection);
        return this.brewingUnit.brew(selection, groundCoffee, config.getQuantityWater());
    }
}