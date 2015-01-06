package paul.antton.usunshine;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Paul's on 06-Jan-15.
 */
public class ForecastFragmentTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;
    private ForecastFragment forecastFragment;


    public ForecastFragmentTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mainActivity = (MainActivity) getActivity();
    //    forecastFragment = mainActivity.forecastFragment;

    }

    public void testPreConditions()
    {
        assertNotNull(mainActivity);
//        assertNotNull(forecastFragment);
    }
}
