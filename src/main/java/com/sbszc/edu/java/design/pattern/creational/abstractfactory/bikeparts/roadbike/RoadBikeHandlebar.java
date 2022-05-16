package com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.roadbike;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Handlebar;

public class RoadBikeHandlebar extends Handlebar {

    private static final String type = "DROP";

    @Override
    public void getDescription() {
        System.out.printf("Road bike handlebar type: %s%n", type);
    }
}
