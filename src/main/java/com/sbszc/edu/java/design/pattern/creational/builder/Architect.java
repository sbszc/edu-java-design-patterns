package com.sbszc.edu.java.design.pattern.creational.builder;

import com.sbszc.edu.java.design.pattern.creational.builder.classic.Bedroom;
import com.sbszc.edu.java.design.pattern.creational.builder.classic.BedroomBuilder;
import com.sbszc.edu.java.design.pattern.creational.builder.complex.House;
import com.sbszc.edu.java.design.pattern.creational.builder.complex.Room;
import com.sbszc.edu.java.design.pattern.creational.builder.complex.RoomListBuilder;
import com.sbszc.edu.java.design.pattern.creational.builder.lombokstyle.Kitchen;

import java.util.ArrayList;

public class Architect {
    public static void main(String[] args) {
        //Classic builder
        Bedroom bedroom = new BedroomBuilder()
                .setFloorNumber(2)
                .createBedroom();
        System.out.println(bedroom);

        //Lombok style builder
        Kitchen kitchen = Kitchen.builder()
                .ceilingHeight(3)
                .build();
        System.out.println(kitchen);

        //Complex builder
        ArrayList<Room> rooms = new RoomListBuilder()
                .roomBuilder().setFloorNumber(2).buildRoom()
                .roomBuilder().setCeilingHeight(3).buildRoom()
                .buildRoomList();
        House house = new House(rooms);
        System.out.println(house);
    }
}
