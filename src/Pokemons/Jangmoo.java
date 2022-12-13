package Pokemons;

import Moves.Confide;
import Moves.Rest;
import Moves.DoubleTeam;
import Moves.MegaDrain;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jangmoo extends Pokemon {

    public Jangmoo (String name, int level) {
        super(name, level);
        setStats(45.0, 55.0, 65.0, 45.0, 45.0, 45.0);
        setType(Type.DRAGON);
        setMove(new  Confide(), new Rest(), new DoubleTeam(), new MegaDrain());
    }
}