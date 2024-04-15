package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcTest {
    Calc newCalc;
    Calc newCalc2;
    Calc newCalc3;
    Calc newCalc4;
    @Test
    void testAdd(){
        newCalc = new Calc();
        assertEquals(10,newCalc.add(4,6));

    }
    @Test
    void testSub(){
        newCalc2 = new Calc();
        assertEquals(2,newCalc2.sub(6,4));

    }

    @Test
    void testDiv(){
        newCalc3 = new Calc();
        assertEquals(2,newCalc3.div(8,4));

    }

    @Test
    void testMul(){
        newCalc4 = new Calc();
        assertEquals(16,newCalc4.mul(8,2));

    }


}
