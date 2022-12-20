package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.Slam;
import Moves.Bulldoze;
import Moves.Facade;

public class Phanpy extends Pokemon {

    public Phanpy (String name, int level) {
        super(name, level);
        setStats(90.0, 60.0, 60.0, 40.0, 40.0, 40.0);
        setType(Type.GROUND);
        setMove(new Slam(), new Bulldoze(), new Facade());
    }
}