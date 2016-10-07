package com.example.robolectric.support;

import org.robolectric.RuntimeEnvironment;

/**
 * Created by Anand on 05/10/2016.
 */

public class ResourceLocator {
    public static String getString(int stringId) {
        return RuntimeEnvironment.application.getString(stringId);
    }

}
