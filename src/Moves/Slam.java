package Moves;

import ru.ifmo.se.pokemon.*;

public class Slam extends PhysicalMove {
    public Slam() {
        super(Type.NORMAL, 80.0, 75.0);
    }

    @Override
    protected String describe() {
        return "использует Slam";
    }
}