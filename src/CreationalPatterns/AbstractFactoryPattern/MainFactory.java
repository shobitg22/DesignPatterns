package AbstractFactory;

public class MainFactory {

    VehicleFactory getVehicleFactory(VehicleFactoryType vehicleFactoryType){

        switch (vehicleFactoryType){
            case LUXUARY: return new LuxuaryVehicleFactory();
            case ORDINARY: return new OrdinaryVehicleFactory();
            default: return null;
        }

    }
}
