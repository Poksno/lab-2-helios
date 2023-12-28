package PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        Status attStatus = att.getCondition();
        if (attStatus.equals(Status.BURN) || attStatus.equals(Status.POISON) || attStatus.equals(Status.PARALYZE)) {
            return 2 * super.calcBaseDamage(att, def); // Удвоенная мощность при определенных статусах
        }
        return super.calcBaseDamage(att, def);
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
