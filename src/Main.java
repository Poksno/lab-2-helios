import Poke.*;
import  ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Lugia Lugia= new Lugia("Lugia", 1);
        Wailmer Wailmer= new Wailmer("Wailmer", 1);
        Wailord Wailord= new Wailord("Wailord", 1);
        Lotad Lotad= new Lotad  ("Lotad", 1);
        Lombre Lombre= new Lombre ("Lombre", 1);
        Ludicolo Ludicolo= new Ludicolo ("Ludicolo", 1);


        b.addAlly(Lugia);
        b.addAlly(Wailmer);
        b.addAlly(Wailord);
        b.addFoe(Lotad);
        b.addFoe(Lombre);
        b.addFoe(Ludicolo);

        b.go();
    }
}
