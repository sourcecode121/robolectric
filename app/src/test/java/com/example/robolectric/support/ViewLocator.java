package com.example.robolectric.support;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Anand on 07/10/2016.
 */

public class ViewLocator {
    public static TextView getTextView(Activity activity, int textViewId) {
        return (TextView) activity.findViewById(textViewId);
    }

    public static Button getButton(Activity activity, int buttonId) {
        return (Button) activity.findViewById(buttonId);
    }
}
