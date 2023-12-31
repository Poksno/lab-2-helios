package SpecialMove;
import ru.ifmo.se.pokemon.*;

public class WaterPulse extends SpecialMove {
    public WaterPulse() {
        super(Type.WATER, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            Effect.confuse(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Water Pulse";
    }
}
