package DecoratorPattern;

public class PaneerPizza implements BasePizza{
    BasePizza basePizza ;

    public PaneerPizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+50;
    }
}
