package com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikefactory;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.BikePart;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Handlebar;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Tire;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.roadbike.RoadBikeHandlebar;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.roadbike.RoadBikeTire;

public class RoadBikeFactory extends BikeFactory {

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    public Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }

    @Override
    public BikePart create(String type) {
        switch (type) {
            case "tire":
                return new RoadBikeTire();
            case "handlebar":
                return new RoadBikeHandlebar();
            default:
                System.out.println("bad type of bike part");
                return null;
        }
    }
}
