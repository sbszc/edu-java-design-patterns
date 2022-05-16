package com.sbszc.edu.java.design.pattern.creational.builder.complex;

import java.util.ArrayList;

public class House {

    private ArrayList<Room> rooms;

    public House(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                '}';
    }
}
