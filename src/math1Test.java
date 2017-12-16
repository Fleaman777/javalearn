

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class math1Test {
    @Test
    public void math() {

        math1 prim = new math1();



        assertThat(math1.degree(4,2), is(equalTo(16)));
        assertThat(math1.degree(3, 3), is(equalTo(27)));
        assertThat(math1.degree(100, 0), is(equalTo(1)));
        assertThat(math1.degree(10, 1), is(equalTo(10)));
        assertThat(math1.degree(2, 3), is(equalTo(8)));

    }


}