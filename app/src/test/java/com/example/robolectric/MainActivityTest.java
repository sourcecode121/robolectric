package com.example.robolectric;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static com.example.robolectric.support.Assert.assertViewIsVisible;
import static com.example.robolectric.support.ResourceLocator.getString;
import static com.example.robolectric.support.ViewLocator.getTextView;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

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
}