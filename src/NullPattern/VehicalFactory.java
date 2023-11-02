package NullPattern;

public class VehicalFactory {

    static Vehicle getVehicle(Type type){
        switch (type){
            case CAR: return new Car();
            case BIKE: return new Bike();
            default: return new NullType();
        }
    }
}
