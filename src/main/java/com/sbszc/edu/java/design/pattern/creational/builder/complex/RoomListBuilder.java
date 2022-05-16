package com.sbszc.edu.java.design.pattern.creational.builder.complex;

import java.util.ArrayList;

public class RoomListBuilder {
    private ArrayList<Room> rooms;

    public RoomListBuilder() {
        rooms = new ArrayList<>();
    }

    public RoomBuilder roomBuilder() {
        return new RoomBuilder(this);
    }

    public RoomListBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public ArrayList<Room> buildRoomList() {
        return rooms;
    }

}
