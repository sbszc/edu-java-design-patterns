package com.sbszc.edu.java.design.pattern.creational.builder.lombokstyle;

import java.awt.*;

public class Kitchen {

    private final Dimension dimension;
    private final int ceilingHeight;
    private final int floorNumber;
    private final Color wallColor;
    private final int numberOfWindows;
    private final int numberOfDoors;
    private final boolean hasMicrowave;
    private final boolean hasDishwasher;

    public Kitchen(Dimension dimension, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasMicrowave, boolean hasDishwasher) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.hasMicrowave = hasMicrowave;
        this.hasDishwasher = hasDishwasher;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "dimension=" + dimension +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", hasMicrowave=" + hasMicrowave +
                ", hasDishwasher=" + hasDishwasher +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Dimension dimension;
        private int ceilingHeight;
        private int floorNumber;
        private Color wallColor;
        private int numberOfWindows;
        private int numberOfDoors;
        private boolean hasMicrowave;
        private boolean hasDishwasher;

        public Builder dimension(Dimension dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder ceilingHeight(int ceilingHeight) {
            this.ceilingHeight = ceilingHeight;
            return this;
        }

        public Builder floorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public Builder wallColor(Color wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public Builder numberOfWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public Builder numberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder hasMicrowave(boolean hasMicrowave) {
            this.hasMicrowave = hasMicrowave;
            return this;
        }

        public Builder hasDishwasher(boolean hasDishwasher) {
            this.hasDishwasher = hasDishwasher;
            return this;
        }

        public Kitchen build() {
            return new Kitchen(dimension, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, hasMicrowave, hasDishwasher);
        }
    }
}
