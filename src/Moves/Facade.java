package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70.0, 100.0);
    }


    @Override
    protected String describe() {

        return "использует Facade";
    }
}