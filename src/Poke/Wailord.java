package Poke;
import StatusMove.*;

public class Wailord extends Wailmer {
        public Wailord(String name, int level) {
            super(name, level);
            addMove(new NobleRoar());
        }
}