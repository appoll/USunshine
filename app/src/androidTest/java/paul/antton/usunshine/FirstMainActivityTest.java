package paul.antton.usunshine;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.FrameLayout;
import android.widget.ListView;

/**
 * Created by Paul's on 06-Jan-15.
 */
public class FirstMainActivityTest
        extends ActivityInstrumentationTestCase2<MainActivity>{


    private MainActivity mMainActivity;
    private ForecastFragment mForecastFragment;

    private FrameLayout mFrameLayout;
    private ListView mListView;
    private Instrumentation mInstrumentation;

    public FirstMainActivityTest() {
        super(MainActivity.class);
    }

    // Note: The purpose of testing initial conditions is not the same as using setUp(). The JUnit setUp() runs once before each test method, and its purpose is to create a clean test environment. The initial conditions test runs once, and its purpose is to verify that the application under test is ready to be tested.
    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);

        mMainActivity = getActivity();
        mFrameLayout = (FrameLayout) mMainActivity.findViewById(R.id.weather_detail_container);
        mListView = (ListView) mMainActivity.findViewById(R.id.listview_forecast);

      //  mForecastFragment = mMainActivity.forecastFragment;
        mInstrumentation = getInstrumentation();
    }




    //method for verifying test fixture
    public void testPreconditions ()
    {
        // change below to assertNull to fail
        assertNotNull("mMainActivity is null", mMainActivity);
        assertNotNull("mFrameLayout is null", mFrameLayout);
        assertNotNull("mListView is null", mListView);
        assertNotNull("mForecastFragment is null", mForecastFragment);
        //assertEquals("list does not have any elements", mListView.getAdapter().getCount(),7);

    }

    /*
    public void testSettingsMenuOption()
    {
        Instrumentation.ActivityMonitor am = getInstrumentation().addMonitor(SettingsActivity.class.getName(), null, false);
        mInstrumentation.sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
        mInstrumentation.invokeMenuActionSync(mMainActivity, R.id.action_settings, 0);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Activity a = getInstrumentation().waitForMonitorWithTimeout(am, 1000);
        assertEquals(true, getInstrumentation().checkMonitorHit(am,1));
        assertNotNull(a);
        assertTrue(a instanceof SettingsActivity);

        a.finish();

    }

*/


/*
    // verify container layout parameters
    public void testLayoutParams()
    {
        final ViewGroup.LayoutParams layoutParams = mFrameLayout.getLayoutParams();

        assertNotNull("layoutParams is null", layoutParams);

        assertEquals("incorrect height", layoutParams.height, WindowManager.LayoutParams.MATCH_PARENT);
        assertEquals("incorrect width", layoutParams.width, WindowManager.LayoutParams.MATCH_PARENT);
    }

    */


}
