package Moves;

import ru.ifmo.se.pokemon.*;

public class NightSlash extends SpecialMove{
    public NightSlash(){

        super(Type.DARK, 70.0, 100.0);
    }

    @Override
    protected double calcCriticalHit(Pokemon p1, Pokemon p2){
        if( (p1.getStat(Stat.SPEED) * 3.0)/512 > Math.random()){
            return 2.0;
        }
        return 1.0;
    }

    @Override
    protected String describe(){
        return "использует Night Slash";
    }
}