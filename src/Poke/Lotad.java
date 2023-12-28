package Poke;
import ru.ifmo.se.pokemon.*;
import StatusMove.*;
import SpecialMove.*;
public class Lotad extends Pokemon {
    public Lotad(String name, int level) {
        super(name, level);
        setStats(40, 30, 30, 40, 50, 30);
        setType(Type.WATER, Type.GRASS);

        // Добавление атак
        addMove(new Confide());
        addMove(new EnergyBall());
    }
}