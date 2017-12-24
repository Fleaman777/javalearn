import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {

    @Test
    public void factRecurs1() throws Exception {

        Factorial fact = new Factorial();

        assertEquals(fact.FactRecurs(3),6);
    }

    @Test
    public void factRecurs2() throws Exception {

        Factorial fact = new Factorial();

        assertEquals(fact.FactRecurs(5),20);
    }
}