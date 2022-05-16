package com.sbszc.edu.java.design.pattern.creational.factory.candyfactory;

import com.sbszc.edu.java.design.pattern.creational.factory.candy.Candy;
import com.sbszc.edu.java.design.pattern.creational.factory.candy.Lollipop;
import com.sbszc.edu.java.design.pattern.creational.factory.candy.PepperMint;

public class HardCandyFactory extends CandyFactory {
    @Override
    public Candy getCandy(String type) {
        switch (type) {
            case "pepper mint":
                return new PepperMint();
            default:
                return new Lollipop();
        }
    }

}
