package com.logic.dragger2sampleapplication;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "Remote";
    @Inject
    public Remote() {
    }

    public void remote(Car car){
        Log.e(TAG, "remote: Connected ");
    }
}
