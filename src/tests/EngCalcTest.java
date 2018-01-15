package tests;

import app.Calc;
import app.EngCalc;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EngCalcTest {
    Calc calc;

    @Before
    public void setUp() throws Exception {
        calc = new EngCalc();

    }

    @Test
    public void sum() throws Exception {

        assertEquals(calc.sum(2, 2), 4);

    }

    @Test
    public void sum1() throws Exception {
        assertEquals(calc.sum(3, 2, 4), 9);
    }

    @Test
    public void diff() throws Exception {
        assertEquals(calc.diff(2, 4), -2);

    }

    @Test
    public void mult() throws Exception {
        assertEquals(calc.mult(3, 3), 9);
    }

    @Test
    public void div() throws Exception {
        assertEquals(calc.div(4, 2), 2);
    }

    @Test
    public void fact() throws Exception {
        assertEquals(calc.fact(2), 2);
        assertEquals(calc.fact(0), 1);
        assertEquals(calc.fact(1), 1);
        assertEquals(calc.fact(3), 6);
    }

    @Test
    public void equation() throws Exception {
        assertEquals(calc.fact((calc.div(calc.mult(calc.sum(2,2),2),2))),24);
        //Value d = new Value(2);
        //Value res = d.sum(2).mul(2).div(2).dif(1).fact();
        //int value = d.sum(2).mul(2).div(2).dif(1).fact().value();
    }

}