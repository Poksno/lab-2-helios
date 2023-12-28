package Poke;
import PhysicalMove.*;
public class Ludicolo extends Lotad {
    public Ludicolo(String name, int level) {
        super(name, level);
        addMove(new FurySwipes());
    }
}
