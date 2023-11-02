package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {

    static private Map<String,IRobot> map = new HashMap<>();

    static IRobot createRobot(TYPE type){
        if(map.containsKey("type")){
            return map.get(type.toString());
        }
        if(type.equals(TYPE.HUMANOID)){
            IRobot iRobot = new HumanoidRobot("robot","HUMAN");
            map.put(TYPE.HUMANOID.toString(),iRobot);
            return iRobot;
        }
        else if (type.equals(TYPE.ROBOTICDOG)){
            IRobot iRobot = new HumanoidRobot("robot","DOG");
            map.put(TYPE.ROBOTICDOG.toString(),iRobot);
            return iRobot;
        }
        return null;
    }
}
