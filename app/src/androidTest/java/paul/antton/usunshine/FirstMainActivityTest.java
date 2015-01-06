package paul.antton.usunshine;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Paul's on 06-Jan-15.
 */
public class FirstMainActivityTest
        extends ActivityInstrumentationTestCase2<MainActivity>{


    private MainActivity mMainActivity;
    private FrameLayout mFrameLayout;

    public FirstMainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mMainActivity = getActivity();
        mFrameLayout = (FrameLayout) mMainActivity.findViewById(R.id.container);
    }

    //method for verifying test fixture
    public void testPreconditions ()
    {
        // change below to assertNull to get false condition
        assertNotNull("mMainActivity is null", mMainActivity);
        assertNotNull("mFrameLayout is null", mFrameLayout);
    }

}
