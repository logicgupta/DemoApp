package com.logic.dragger2sampleapplication;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {

        Log.e(TAG, "start: PetrolEngine " );
    }
}
