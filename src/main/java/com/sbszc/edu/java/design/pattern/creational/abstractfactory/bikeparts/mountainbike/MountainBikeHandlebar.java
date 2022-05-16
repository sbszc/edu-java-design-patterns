package com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.mountainbike;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Handlebar;

public class MountainBikeHandlebar extends Handlebar {

    private static final String type = "FLAT";

    @Override
    public void getDescription() {
        System.out.printf("Mountain bike handlebar type: %s%n", type);
    }
}
