package DecoratorPattern;

public class Veggie implements BasePizza {
    @Override
    public int getCost() {
        return 120;
    }
}
