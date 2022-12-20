package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.ScaryFace;

public class Donphan extends Phanpy {

    public Donphan (String name, int level) {
        super(name, level);
        setStats(90.0, 120.0, 120.0, 60.0, 60.0, 50.0);
        setType(Type.GROUND);
        addMove(new ScaryFace());
    }
}