package FlyWeightPattern;

public class Main {
    public static void main(String[] args) {
        IRobot human = RoboticFactory.createRobot(TYPE.HUMANOID);
        human.display(1,2);

        IRobot dog = RoboticFactory.createRobot(TYPE.HUMANOID);
        dog.display(3,5);
    }
}
