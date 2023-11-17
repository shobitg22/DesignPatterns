package BridgePattern;

public abstract class LivingThings {

    private BreathImplementor breathImplementor;

    public LivingThings(BreathImplementor breathImplementor) {
        this.breathImplementor = breathImplementor;
    }

     void breath(){
        breathImplementor.breathe();
     }
}
