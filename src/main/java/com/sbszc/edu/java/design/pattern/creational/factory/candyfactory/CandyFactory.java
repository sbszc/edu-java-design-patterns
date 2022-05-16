package com.sbszc.edu.java.design.pattern.creational.factory.candyfactory;

import com.sbszc.edu.java.design.pattern.creational.factory.candy.Candy;

import java.util.List;

public abstract class CandyFactory {
    public abstract Candy getCandy(String type);

    public List<Candy> getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        return candy.makePackage(quantity);
    }
}
