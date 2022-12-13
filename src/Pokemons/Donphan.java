package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Donphan extends Pokemon {

    public Donphan (String name, int level) {
        super(name, level);
        setStats(90.0, 120.0, 120.0, 60.0, 60.0, 50.0);
        setType(Type.GROUND);
        setMove(new Slam(), new Bulldoze(), new Facade(), new ScaryFace());
    }
}