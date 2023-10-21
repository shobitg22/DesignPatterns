package FactoryPattern;

public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle bmw = vehicleFactory.getVehicle(Type.BMW);
        bmw.getName();

        Vehicle maruti = vehicleFactory.getVehicle(Type.MARUTI);
        maruti.getName();

        Vehicle hyundai = vehicleFactory.getVehicle(Type.HYUNDAI);
        hyundai.getName();

        Vehicle mercedes = vehicleFactory.getVehicle(Type.MERCEDES);
        mercedes.getName();
    }
}
