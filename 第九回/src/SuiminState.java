package src;

class SuiminState extends DogState {
    private static SuiminState s = new SuiminState();
    private SuiminState() {}
    public static DogState getInstance() {
    return s;
    }
    public void tukareta(Dog moto) {
    // なにもしない
    }
    public void tabeta(Dog moto) {
    }
    public void neta(Dog moto) {
    }
    public void okita(Dog moto) {
        moto.changeState(FutsuuState.getInstance());
    }
    public String toString() {
    return "寝てる状態";
    }
   }