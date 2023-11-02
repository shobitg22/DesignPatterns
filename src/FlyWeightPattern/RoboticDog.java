package FlyWeightPattern;

public class RoboticDog implements IRobot{

    // Intrinsic data
    private String type;
    private String body;

    public RoboticDog(String type, String body) {
        this.type = type;
        this.body = body;
    }


    @Override
    // Extrinsic data
    public void display(int x, int y) {
        System.out.println("DOG: "+x+" , "+y);
    }
}
