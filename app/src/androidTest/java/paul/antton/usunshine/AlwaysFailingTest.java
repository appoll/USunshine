package paul.antton.usunshine;

import android.test.InstrumentationTestCase;

/**
 * Created by Paul's on 06-Jan-15.
 */
public class AlwaysFailingTest extends InstrumentationTestCase {

    public void test() throws Exception{
        final int expected = 1;
        final int reality = 5;

        assertEquals(expected,reality);

    }

}
