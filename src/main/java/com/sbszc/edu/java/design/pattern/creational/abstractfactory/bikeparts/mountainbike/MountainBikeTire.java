package com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.mountainbike;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Tire;

public class MountainBikeTire extends Tire {

    private static final String width = "NARROW";

    private static final String pressure = "MEDIUM";

    @Override
    public void getDescription() {
        System.out.printf("Mountain bike tire width: %s, pressure: %s%n", width, pressure);
    }
}
