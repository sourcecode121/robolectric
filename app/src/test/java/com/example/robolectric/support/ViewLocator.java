package com.example.robolectric.support;

import android.app.Activity;
import android.widget.TextView;

/**
 * Created by Anand on 07/10/2016.
 */

public class ViewLocator {
    public static TextView getTextView(Activity activity, int textViewId) {
        return (TextView) activity.findViewById(textViewId);
    }
}
