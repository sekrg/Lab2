package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.Psychic;
import Moves.Thunderbolt;

public class Ralts extends Pokemon {

    public Ralts (String name, int level) {
        super(name, level);
        setStats(28.0, 25.0, 25.0, 45.0, 35.0, 40.0);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Psychic(), new Thunderbolt());
    }
}