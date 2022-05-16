package com.sbszc.edu.java.design.pattern.creational.builder.classic;


import java.awt.*;

public class Bedroom {

    private final Dimension dimension;
    private final int ceilingHeight;
    private final int floorNumber;
    private final Color wallColor;
    private final int numberOfWindows;
    private final int numberOfDoors;
    private final boolean isDouble;
    private final boolean hasEnsuite;

    public Bedroom(Dimension dimension, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "dimension=" + dimension +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", isDouble=" + isDouble +
                ", hasEnsuite=" + hasEnsuite +
                '}';
    }

}
