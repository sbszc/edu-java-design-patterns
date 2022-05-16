package com.sbszc.edu.java.design.pattern.creational.factory.candy;

import java.util.LinkedList;
import java.util.List;

public class Lollipop extends Candy {
    @Override
    public List<Candy> makePackage(int quantity) {
        List<Candy> candyPackage = new LinkedList<>();
        for (int i = 0; i < quantity; i++) {
            candyPackage.add(this);
        }
        return candyPackage;
    }

    @Override
    public String toString() {
        return "Lollipop{}";
    }
}
