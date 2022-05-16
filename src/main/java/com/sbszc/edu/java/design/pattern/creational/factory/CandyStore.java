package com.sbszc.edu.java.design.pattern.creational.factory;

import com.sbszc.edu.java.design.pattern.creational.factory.candyfactory.CandyFactory;
import com.sbszc.edu.java.design.pattern.creational.factory.candyfactory.ChocolateFactory;
import com.sbszc.edu.java.design.pattern.creational.factory.candyfactory.HardCandyFactory;

public class CandyStore {
    private static final CandyFactory chocolateFactory = new ChocolateFactory();
    private static final CandyFactory hardCandyFactory = new HardCandyFactory();

    public static void main(String[] args) {
        System.out.println(chocolateFactory.getCandyPackage(5, "dark"));
        System.out.println(chocolateFactory.getCandyPackage(3, "white"));
        System.out.println(hardCandyFactory.getCandyPackage(12, "lollipop"));
        System.out.println(hardCandyFactory.getCandyPackage(32, "pepper mint"));
    }
}
