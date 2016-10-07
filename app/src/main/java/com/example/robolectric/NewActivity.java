package com.example.robolectric;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Anand on 07/10/2016.
 */
public class NewActivity extends AppCompatActivity{
    public static Intent newIntent(Context context) {
        return new Intent(context, NewActivity.class);
    }
}
