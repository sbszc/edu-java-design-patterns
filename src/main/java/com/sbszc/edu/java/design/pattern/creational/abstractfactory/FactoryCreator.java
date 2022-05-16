package com.sbszc.edu.java.design.pattern.creational.abstractfactory;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikefactory.BikeFactory;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikefactory.MountainBikeFactory;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikefactory.RoadBikeFactory;

public class FactoryCreator {

    public static BikeFactory createFactory(String type) {
        if (type.equalsIgnoreCase("mountain bike")) {
            return new MountainBikeFactory();
        } else if (type.equalsIgnoreCase("road bike")) {
            return new RoadBikeFactory();
        } else {
            System.out.println("Please specify a valid type");
            return null;
        }
    }
}
