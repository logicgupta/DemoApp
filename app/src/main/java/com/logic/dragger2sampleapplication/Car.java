package com.logic.dragger2sampleapplication;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    Engine engine;
    Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Inject
    public void getRemote(Remote remote){
        remote.remote(this);
    }

    public void getDrive(){
        engine.start();
        Log.e(TAG, "getDrive: Driving ...." );
    }


}
