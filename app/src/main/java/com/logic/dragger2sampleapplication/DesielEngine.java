package com.logic.dragger2sampleapplication;

import android.util.Log;


public class DesielEngine implements Engine {

    private static final String TAG = "DesielEngine";

    private int hoursePower;

    public DesielEngine(int hoursePower) {
        this.hoursePower=hoursePower;
    }

    @Override
    public void start() {
        Log.e(TAG, "start: "+hoursePower );
    }
}
