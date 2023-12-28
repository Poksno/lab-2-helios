package PhysicalMove;
import ru.ifmo.se.pokemon.*;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 80); // Указываем тип, мощность и точность атаки
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        int hitCount = 2 + (int) (Math.random() * 3); // Атака попадает от 2 до 4 раз
        for (int i = 0; i < hitCount; i++) {
            super.applyOppDamage(def, damage); // Наносим урон за каждый удар
        }
    }

    @Override
    protected String describe() {
        return "использует Fury Swipes";
    }
}
