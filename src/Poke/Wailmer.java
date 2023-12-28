package Poke;
import ru.ifmo.se.pokemon.*;
import PhysicalMove.*;
import SpecialMove.*;
public class Wailmer extends Pokemon {
    public Wailmer(String name, int level) {
        super(name, level);
        setStats(130, 70, 35, 70, 35, 60);
        setType(Type.WATER);

        // Добавление атак
        addMove(new Waterfall());
        addMove(new WaterPulse());
        addMove(new Scald());
    }
}