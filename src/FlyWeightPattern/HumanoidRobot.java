package FlyWeightPattern;

public class HumanoidRobot implements IRobot{

    // Intrinsic data
    private String type;
    private String body;

    public HumanoidRobot(String type, String body) {
        this.type = type;
        this.body = body;
    }

    @Override
    // Extrinsic data
    public void display(int x, int y) {
        System.out.println("HUMAN: "+x+" , "+y);
    }
}
