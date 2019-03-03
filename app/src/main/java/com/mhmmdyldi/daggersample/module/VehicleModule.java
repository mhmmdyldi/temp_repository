package com.mhmmdyldi.daggersample.module;

import com.mhmmdyldi.daggersample.model.Motor;
import com.mhmmdyldi.daggersample.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(Motor motor){
        return new Vehicle(motor);
    }

}
