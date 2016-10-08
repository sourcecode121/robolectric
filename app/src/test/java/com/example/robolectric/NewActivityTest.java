package com.example.robolectric;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Created by Anand on 08/10/2016.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 22)
public class NewActivityTest {

    private NewActivity newActivity;

    @Before
    public void setUp() throws Exception {
        newActivity = Robolectric.setupActivity(NewActivity.class);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(newActivity);
    }

    @Test
    public void shouldHaveNewFragment() throws Exception {
        assertNotNull(newActivity.getFragmentManager().findFragmentById(R.id.fragment_new));

    }
}