package AbstractFactory;


public class Main {
    public static void main(String[] args) {
        MainFactory mainFactory = new MainFactory();

        VehicleFactory luxuary = mainFactory.getVehicleFactory(VehicleFactoryType.LUXUARY);
        Vehicle Bmw = luxuary.getVehicle("BMW");
        Bmw.getName();

        Vehicle mercedes = luxuary.getVehicle("MERCEDES");
        mercedes.getName();


        VehicleFactory ordinary = mainFactory.getVehicleFactory(VehicleFactoryType.ORDINARY);
        Vehicle maruti = ordinary.getVehicle("MARUTI");
        maruti.getName();

        Vehicle hyundai = ordinary.getVehicle("HYUNDAI");
        hyundai.getName();


    }
}
