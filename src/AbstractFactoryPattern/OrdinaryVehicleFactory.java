package AbstractFactory;

public class OrdinaryVehicleFactory implements VehicleFactory {


    @Override
    public Vehicle getVehicle(String type) {
        switch (type){
            case "MARUTI": return new Maruti();
            case "HYUNDAI": return new Hyundai();
            default: return null;
        }
    }
}
