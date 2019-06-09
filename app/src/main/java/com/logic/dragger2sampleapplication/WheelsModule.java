package com.logic.dragger2sampleapplication;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {


    @Provides
    Rims getRim(){
        return new Rims();
    }

    @Provides
    Tires getTire(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheel getInstance(Rims rims,Tires tires){
        return new Wheel(rims,tires);
    }

}
