package Moves;

import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove{
    public ScaryFace(){

        super(Type.NORMAL, 0.0, 100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){

        p.setMod(Stat.SPEED, -2);
    }
    @Override
    protected String describe(){

        return "использует Scary Face";
    }
}