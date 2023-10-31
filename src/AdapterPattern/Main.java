package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        // main is acting as a client
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineServerImpl());
        System.out.println("Weight in KG after conversion is : "+weightMachineAdapter.getWeightInKgForClientUnderstanding());
    }
}
