package com.sbszc.edu.java.design.pattern.creational.factory.candy;

import java.util.LinkedList;
import java.util.List;

public class WhiteChocolate extends Candy {
    @Override
    public List<Candy> makePackage(int quantity) {
        List<Candy> candyPackage = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            candyPackage.add(this);
        }
        return candyPackage;
    }

    @Override
    public String toString() {
        return "WhiteChocolate{}";
    }
}
