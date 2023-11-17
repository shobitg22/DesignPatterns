package BridgePattern;

public class Main {
    public static void main(String[] args) {
        LivingThings dog = new Dog(new LandBreath());
        dog.breath();

        LivingThings fish = new Fish(new WaterBreath());
        fish.breath();
    }
}
