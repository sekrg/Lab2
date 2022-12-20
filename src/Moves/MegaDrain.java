package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MegaDrain extends SpecialMove {
    public MegaDrain() {
        super(Type.GRASS, 40, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setStats(p.getStat(Stat.HP)+20, p.getStat(Stat.ATTACK),
                p.getStat(Stat.DEFENSE),
                p.getStat(Stat.SPECIAL_ATTACK),
                p.getStat(Stat.SPECIAL_DEFENSE),
                p.getStat(Stat.SPEED));
    }

    @Override
    protected String describe() {
        return "использует Mega Drain";
    }
}
