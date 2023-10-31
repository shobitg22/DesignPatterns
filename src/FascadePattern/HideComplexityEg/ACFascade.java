package FascadePattern.HideComplexityEg;

public class ACFascade {
    private final ACExternalUnit acExternalUnit;
    private final ACInternalUnit acInternalUnit;

    public ACFascade() {
        acInternalUnit = new ACInternalUnit();
        acExternalUnit = new ACExternalUnit();
    }

    void turnOnAC(){
        acInternalUnit.acceptUserOnCmd();
        acInternalUnit.acceptUserTempCmd();
        acExternalUnit.consumeNitrogen();
        acExternalUnit.startCondensor();
        acInternalUnit.acceptUserOffCmd();
    }
}
