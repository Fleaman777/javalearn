package tests;

import app.Animal;
import app.Cat;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CatTest {
    @Test
    public void voice() throws Exception {
        Animal cat = new Cat();

        assertEquals(cat.voice(), "Meow");
    }

    @Test
    public void name() throws Exception {
        Animal cat = new Cat();

        assertEquals(cat.name(), "Cat");
    }

}