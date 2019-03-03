package com.mhmmdyldi.daggersample.model;

import android.util.Log;

import javax.inject.Inject;

public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        boolean injected = motor == null ? false:true;
        Log.i("dagger", "Vehicle, Constructor: motor " + injected);
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
