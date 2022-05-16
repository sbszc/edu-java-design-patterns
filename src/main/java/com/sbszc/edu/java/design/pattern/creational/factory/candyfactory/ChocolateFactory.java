package com.sbszc.edu.java.design.pattern.creational.factory.candyfactory;

import com.sbszc.edu.java.design.pattern.creational.factory.candy.Candy;
import com.sbszc.edu.java.design.pattern.creational.factory.candy.DarkChocolate;
import com.sbszc.edu.java.design.pattern.creational.factory.candy.WhiteChocolate;

public class ChocolateFactory extends CandyFactory {
    @Override
    public Candy getCandy(String type) {
        switch (type) {
            case "white":
                return new WhiteChocolate();
            default:
                return new DarkChocolate();
        }
    }

}
