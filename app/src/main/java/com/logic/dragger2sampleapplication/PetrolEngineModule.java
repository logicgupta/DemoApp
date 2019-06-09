package com.logic.dragger2sampleapplication;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPertrolEngine(PetrolEngine petrolEngine);
}
