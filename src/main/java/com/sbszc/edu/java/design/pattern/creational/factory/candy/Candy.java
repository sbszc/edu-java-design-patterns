package com.sbszc.edu.java.design.pattern.creational.factory.candy;

import java.util.List;

public abstract class Candy {

    public abstract List<Candy> makePackage(int quantity);
}
