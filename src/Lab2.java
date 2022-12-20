import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Jangmoo("", 1);
        Pokemon p2 = new Phanpy("", 1);
        Pokemon p3 = new Donphan("", 1);
        Pokemon p4 = new Ralts("", 1);
        Pokemon p5 = new Kirlia("", 1);
        Pokemon p6 = new Gallade("", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }


}
