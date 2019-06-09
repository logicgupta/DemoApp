package com.logic.dragger2sampleapplication;

import android.util.Log;

import javax.inject.Inject;

public class Tires {

    private static final String TAG = "Tires";

    @Inject
    public Tires() {
    }

    @Inject
    public void inflate(){
        Log.d(TAG, "inflate: ");
    }
}
