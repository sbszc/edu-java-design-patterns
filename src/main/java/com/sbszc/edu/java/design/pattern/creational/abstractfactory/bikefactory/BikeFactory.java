package com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikefactory;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.BikePart;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Handlebar;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Tire;

public abstract class BikeFactory {

    public abstract Tire createTire();

    public abstract Handlebar createHandlebar();

    public abstract BikePart create(String type);
}
