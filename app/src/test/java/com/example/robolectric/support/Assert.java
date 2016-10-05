package com.example.robolectric.support;

import android.view.View;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Anand on 05/10/2016.
 */

public class Assert {
    public static void assertViewIsVisible(View view) {
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }
}
