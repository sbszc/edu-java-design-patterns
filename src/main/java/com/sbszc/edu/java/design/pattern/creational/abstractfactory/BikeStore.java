package com.sbszc.edu.java.design.pattern.creational.abstractfactory;

import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikefactory.BikeFactory;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Handlebar;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.Tire;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.mountainbike.MountainBikeHandlebar;
import com.sbszc.edu.java.design.pattern.creational.abstractfactory.bikeparts.mountainbike.MountainBikeTire;

public class BikeStore {

    public static void main(String[] args) {
        createBikeWithoutAbstractFactory();

        createBikeWithAbstractFactory("road bike");
        createBikeWithAbstractFactory("mountain bike");

        createBikeWithExtensibleAbstractFactory("road bike");
        createBikeWithExtensibleAbstractFactory("mountain bike");
    }

    public static void createBikeWithoutAbstractFactory() {
        MountainBikeTire mountainBikeFrontTire = new MountainBikeTire();
        MountainBikeTire mountainBikeBackTire = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();

        mountainBikeFrontTire.getDescription();
        mountainBikeBackTire.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();
    }

    public static void createBikeWithAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);

        Tire frontTire = bikeFactory.createTire();
        Tire backTire = bikeFactory.createTire();
        Handlebar handlebar = bikeFactory.createHandlebar();

        frontTire.getDescription();
        backTire.getDescription();
        handlebar.getDescription();
        System.out.println();
    }

    public static void createBikeWithExtensibleAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);

        Tire frontTire = (Tire) bikeFactory.create("tire");
        Tire backTire = (Tire) bikeFactory.create("tire");
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");

        frontTire.getDescription();
        backTire.getDescription();
        handlebar.getDescription();
        System.out.println();
    }
}
