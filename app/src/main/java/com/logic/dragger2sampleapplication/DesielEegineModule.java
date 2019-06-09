package com.logic.dragger2sampleapplication;

import dagger.Module;
import dagger.Provides;

@Module
public class DesielEegineModule {

    private int hoursepower;

    public DesielEegineModule(int hoursepower){
        this.hoursepower=hoursepower;
    }

    @Provides
    Engine provideEngine(){
        return new DesielEngine(hoursepower);
    }
}
