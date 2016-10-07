package com.example.robolectric;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;
import org.robolectric.shadows.ShadowIntent;
import org.robolectric.shadows.ShadowToast;

import static com.example.robolectric.support.Assert.assertViewIsVisible;
import static com.example.robolectric.support.ResourceLocator.getString;
import static com.example.robolectric.support.ViewLocator.getButton;
import static com.example.robolectric.support.ViewLocator.getTextView;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;
import static org.robolectric.shadows.ShadowToast.getTextOfLatestToast;

/**
 * Created by Anand on 03/10/2016.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 22)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveTitle() throws Exception {
        assertThat(activity.getTitle().toString(), equalTo(getString(R.string.app_name)));
    }

    @Test
    public void shouldHaveMainText() throws Exception {
        TextView mainText = getTextView(activity, R.id.main_text);
        assertViewIsVisible(mainText);
        assertThat(mainText.getText().toString(), equalTo(getString(R.string.text_view)));
    }

    @Test
    public void shouldShowToastMessage() throws Exception {
        Button button = getButton(activity, R.id.toast_button);
        button.performClick();
        assertThat(getTextOfLatestToast(), equalTo(getString(R.string.message)));
    }

    @Test
    public void shouldStartNewActivity() throws Exception {
        Button button = getButton(activity, R.id.new_activity_button);
        button.performClick();

        ShadowActivity shadowActivity = shadowOf(activity);
        Intent intent = shadowActivity.getNextStartedActivity();
        ShadowIntent shadowIntent = shadowOf(intent);

        assertEquals(shadowIntent.getIntentClass().getName(), NewActivity.class.getName());
    }
}