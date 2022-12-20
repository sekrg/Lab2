package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.NightSlash;

public class Gallade extends Kirlia {

    public Gallade (String name, int level) {
        super(name, level);
        setStats(68.0, 125.0, 65.0, 65.0, 115.0, 80.0);
        setType(Type.PSYCHIC, Type.FAIRY);
        addMove(new NightSlash());
    }
}