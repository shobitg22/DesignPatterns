package DecoratorPattern;

public class FarmHouse implements BasePizza {
    @Override
    public int getCost() {
        return 150;
    }
}
