package NullPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle car = VehicalFactory.getVehicle(Type.CAR);
        Vehicle bike = VehicalFactory.getVehicle(Type.BIKE);
        Vehicle random = VehicalFactory.getVehicle(Type.NUll);

        System.out.println("CAR: "+car.getKm());
        System.out.println("BIKE: "+bike.getKm());
        System.out.println("NULL: "+random.getKm());
    }
}
