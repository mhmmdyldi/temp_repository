package com.mhmmdyldi.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mhmmdyldi.daggersample.model.Vehicle;
import com.mhmmdyldi.daggersample.module.DaggerVehicleComponent;
import com.mhmmdyldi.daggersample.module.VehicleComponent;
import com.mhmmdyldi.daggersample.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();
        boolean injected = vehicle == null ? false: true;
        Log.i("dagger", "MainActivity, onCreate: vehicle " + String.valueOf(injected));
        Log.i("dagger", "MainActivity, onCreate: speed " + vehicle.getSpeed());

    }
}
