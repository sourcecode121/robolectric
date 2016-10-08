package com.example.robolectric;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static android.R.attr.start;
import static org.junit.Assert.*;
import static org.robolectric.util.FragmentTestUtil.startFragment;

/**
 * Created by Anand on 08/10/2016.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 22)
public class NewFragmentTest {
    @Test
    public void shouldNotBeNull() throws Exception {
        NewFragment newFragment = NewFragment.newInstance();
        startFragment(newFragment);
        assertNotNull(newFragment);
    }
}