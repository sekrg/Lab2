package Moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0.0, 100.0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect sleep = (new Effect()).condition(Status.SLEEP).turns(2);
        p.setCondition(sleep);
        p.setStats(45.0, p.getStat(Stat.ATTACK),
                p.getStat(Stat.DEFENSE),
                p.getStat(Stat.SPECIAL_ATTACK),
                p.getStat(Stat.SPECIAL_DEFENSE),
                p.getStat(Stat.SPEED));
    }
    @Override
    protected String describe(){

        return "использует Rest";
    }
}