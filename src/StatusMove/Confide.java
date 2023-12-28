package StatusMove;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1); // Уменьшает атаку противника на 1 ступень
    }

    @Override
    protected String describe() {
        return "использует Confide";
    }
}
