package StatusMove;
import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if(p.getHP()<=(int)(p.getStat(Stat.HP))/2){
        p.setMod(Stat.HP, (int) (p.getHP()+ (int)(p.getStat(Stat.HP) / 2)));
        }

    }

    @Override
    protected String describe() {
        return "использует Roost";
    }
}
