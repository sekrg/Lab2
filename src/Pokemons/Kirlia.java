package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Pokemon {

    public Kirlia (String name, int level) {
        super(name, level);
        setStats(38.0, 35.0, 35.0, 65.0, 55.0, 50.0);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Psychic(), new Thunderbolt(), new MagicalLeaf());
    }
}