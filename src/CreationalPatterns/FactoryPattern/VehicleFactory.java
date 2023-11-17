package FactoryPattern;

public class VehicleFactory {

    Vehicle getVehicle(Type type){
        switch (type){
            case BMW: return new Bmw();
            case MARUTI: return new Maruti();
            case MERCEDES: return new Mercedes();
            case HYUNDAI: return new Hyundai();
            default: return null;
        }
    }
}
