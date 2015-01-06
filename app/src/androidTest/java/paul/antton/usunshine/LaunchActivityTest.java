package paul.antton.usunshine;

import android.content.Intent;
import android.media.audiofx.BassBoost;
import android.test.ActivityUnitTestCase;

/**
 * Created by Paul's on 06-Jan-15.
 */
public class LaunchActivityTest extends ActivityUnitTestCase<SettingsActivity> {

    Intent mLaunchIntent;

    public LaunchActivityTest(Class<SettingsActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mLaunchIntent = new Intent(getInstrumentation().getTargetContext(), SettingsActivity.class);

        startActivity(mLaunchIntent,null, null);
    }
}
