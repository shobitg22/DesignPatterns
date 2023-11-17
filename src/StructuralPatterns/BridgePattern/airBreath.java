package BridgePattern;

public class airBreath implements BreathImplementor {
    @Override
    public void breathe() {
        System.out.println("AIR");
    }
}
