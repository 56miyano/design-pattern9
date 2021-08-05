package src;

abstract class DogState {
    public abstract void tukareta(Dog yobidashimoto); //疲れた！
    public abstract void tabeta(Dog yobidashimoto); //食べた！
    public abstract void neta(Dog yobidashimoto);
    public abstract void okita(Dog yobidashimoto);
   }