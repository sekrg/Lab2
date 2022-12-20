package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.MagicalLeaf;

public class Kirlia extends Ralts {

    public Kirlia (String name, int level) {
        super(name, level);
        setStats(38.0, 35.0, 35.0, 65.0, 55.0, 50.0);
        setType(Type.PSYCHIC, Type.FAIRY);
        addMove(new MagicalLeaf());
    }
}