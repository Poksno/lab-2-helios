package Poke;
import PhysicalMove.*;
public class Lombre extends Lotad {
    public Lombre(String name, int level) {
        super(name, level);
        addMove(new FurySwipes());
    }
}
