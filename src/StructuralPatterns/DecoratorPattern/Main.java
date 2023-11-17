package DecoratorPattern;


public class Main {
    public static void main(String[] args) {

        BasePizza mushroomPlusMargherita = new MushroomPizza(new Margherita());
        System.out.println("Mushroom + Margherita "+ mushroomPlusMargherita.getCost());

        BasePizza pannerPlusFarmHouse = new MushroomPizza(new FarmHouse());
        System.out.println("Panner + FarmHouse "+ pannerPlusFarmHouse.getCost());

        BasePizza mushroomPlusPannerPlusVeggie = new MushroomPizza(new PaneerPizza(new Veggie()));
        System.out.println("Mushroom + Panner + Veggie "+ mushroomPlusPannerPlusVeggie.getCost());

    }
}
