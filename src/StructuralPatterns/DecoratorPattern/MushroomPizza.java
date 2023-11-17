package DecoratorPattern;

public class MushroomPizza implements BasePizza{

    BasePizza basePizza;

    public MushroomPizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+20;
    }
}
