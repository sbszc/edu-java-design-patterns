package com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.roadbike;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Tire;

public class RoadBikeTire extends Tire {

    private static final String width = "NARROW";

    @Override
    public void getDescription() {
        System.out.printf("Road bike tire width: %s%n", width);
    }
}
