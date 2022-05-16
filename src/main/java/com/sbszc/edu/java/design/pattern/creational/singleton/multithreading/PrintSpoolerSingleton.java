package com.sbszc.edu.java.design.pattern.creational.singleton.multithreading;

public class PrintSpoolerSingleton {

    private static final PrintSpoolerSingleton spooler = new PrintSpoolerSingleton();//Java uses lazy loading, so this is not eager loaded
    private static boolean initialized = false;

    private PrintSpoolerSingleton() {
    }

    public static synchronized PrintSpoolerSingleton getInstance() {
        if (initialized) return spooler;

        spooler.init();
        initialized = true;
        return spooler;
    }

    private void init() {

    }
}
