package com.mhmmdyldi.daggersample.module;

import com.mhmmdyldi.daggersample.model.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
