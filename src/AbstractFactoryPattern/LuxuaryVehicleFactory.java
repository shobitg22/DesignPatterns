package AbstractFactory;

public class LuxuaryVehicleFactory  implements VehicleFactory{


    @Override
    public Vehicle getVehicle(String type) {
        switch (type){
            case "BMW": return new Bmw();
            case "MERCEDES": return new Mercedes();
            default: return null;
        }
    }
}

