package AdapterPattern;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    private WeightMachineServer weightMachineServer;

    public WeightMachineAdapterImpl(WeightMachineServer weightMachineServer) {
        this.weightMachineServer = weightMachineServer;
    }

    @Override
    public int getWeightInKgForClientUnderstanding() {
        int weightInPounds = weightMachineServer.getWeightInPounds();
        return weightInPounds + 10; // any tweaking
    }
}
