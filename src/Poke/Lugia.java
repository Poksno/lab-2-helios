package Poke;
import ru.ifmo.se.pokemon.*;
import StatusMove.*;
import PhysicalMove.*;

public class Lugia extends Pokemon {
    public Lugia(String name, int level) {
        super(name, level);
        super.setStats(106,90,130,90,154,110);
        super.setType(Type.NORMAL, Type.FLYING);
        addMove(new Swagger());
        addMove(new Roost());
        addMove(new Facade());
        addMove(new DoubleTeam());
    }
}