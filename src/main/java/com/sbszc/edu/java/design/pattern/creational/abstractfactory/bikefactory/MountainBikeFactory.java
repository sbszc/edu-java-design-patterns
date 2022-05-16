package com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikefactory;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Handlebar;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Tire;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.mountainbike.MountainBikeHandlebar;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.mountainbike.MountainBikeTire;

public class MountainBikeFactory extends BikeFactory {
    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    public Handlebar createHandlebar() {
        return new MountainBikeHandlebar();
    }
}
