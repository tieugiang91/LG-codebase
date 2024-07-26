package ocp;

import java.util.HashMap;
import java.util.Map;
import ocp.entity.BrewingUnit;
import ocp.entity.Coffee;
import ocp.entity.CoffeeException;
import ocp.entity.CoffeeSelection;
import ocp.entity.Configuration;
import ocp.entity.GroundCoffee;

public class BasicCoffeeMachine implements CoffeeMachine {
    private Map<CoffeeSelection, Configuration> configMap;
    private Map<CoffeeSelection, GroundCoffee> groundCoffee;
    private BrewingUnit brewingUnit;

    public BasicCoffeeMachine(Map<CoffeeSelection, GroundCoffee> coffee) {
        this.groundCoffee = coffee;
        this.brewingUnit = new BrewingUnit();
        this.configMap = new HashMap();
        this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
    }

    public Coffee brewCoffee(CoffeeSelection selection) {
        Configuration config = (Configuration)this.configMap.get(selection);
        GroundCoffee groundCoffee = (GroundCoffee)this.groundCoffee.get(selection);
        return this.brewingUnit.brew(selection, groundCoffee, config.getQuantityWater());
    }

    public void addGroundCoffee(CoffeeSelection sel, GroundCoffee newCoffee) throws CoffeeException {
        GroundCoffee existingCoffee = (GroundCoffee)this.groundCoffee.get(sel);
        if (existingCoffee != null) {
            if (!existingCoffee.getName().equals(newCoffee.getName())) {
                throw new CoffeeException("Only one kind of coffee supported for each CoffeeSelection.");
            }

            existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
        } else {
            this.groundCoffee.put(sel, newCoffee);
        }

    }
}