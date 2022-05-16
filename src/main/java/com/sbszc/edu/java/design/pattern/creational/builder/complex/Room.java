package com.sbszc.edu.java.design.pattern.creational.builder.complex;

import java.awt.*;

public class Room {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;

    public Room(Dimension dimension, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dimension=" + dimension +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
