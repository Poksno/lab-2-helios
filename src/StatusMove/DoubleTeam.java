package StatusMove;
import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, +1); // Увеличивает уклонение на 1 ступень
    }

    @Override
    protected String describe() {
        return "использует Double Team";
    }
}

