package tests;

import app.Calculated;
import app.Number;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberTest {
    Calculated n;

    @Before
    public void setUp() throws Exception {
        n = new Number(4);
    }

    @Test
    public void sum() throws Exception {
        assertEquals(n.sum(4).value(), 8);
    }

    @Test
    public void sumVer2() throws Exception {
        assertEquals(n.sumVer2(4).value(), 8);
    }


    @Test
    public void dif() throws Exception {
        assertEquals(n.dif(4).value(), 0);
    }

    @Test
    public void mult() throws Exception {
        assertEquals(n.mult(3).value(), 12);
    }

    @Test
    public void div() throws Exception {
        assertEquals(n.div(2).value(), 2);
    }

    @Test
    public void fact() throws Exception {
        assertEquals(n.fact().value(), 24);
    }

    @Test
    public void factVer2() throws Exception {
        assertEquals(n.factVer2().value(), 24);
    }

    @Test
    public void value() throws Exception {
        assertEquals(n.sum(2).mult(2).div(2).dif(1).fact().value(), 120);

    }

    @Test
    public void valueVer2() throws Exception {
        assertEquals(n.sumVer2(2).multVer2(2).divVer2(2).difVer2(1).factVer2().value(), 120);

    }
}
