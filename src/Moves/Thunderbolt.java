package Moves;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove{
    public Thunderbolt(){

        super(Type.ELECTRIC, 90.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.10) {
            Effect paralyze = (new Effect().condition(Status.PARALYZE));
            p.setCondition(paralyze);
        }}

    @Override
    protected String describe(){
        return "использует Thunderbolt";
    }
}