package tut3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalc {

    @Test
    void add() {
        assertEquals(4,Calc.add(1,3));
    }


}