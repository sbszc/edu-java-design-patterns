package com.sbszc.edu.java.design.pattern.creational.singleton;

import com.sbszc.edu.java.design.pattern.creational.singleton.collection.PrintSpooler;
import com.sbszc.edu.java.design.pattern.creational.singleton.multithreading.PrintSpoolerSingleton;

import java.util.Collections;
import java.util.List;

public class ResourceManager {
    public static void main(String[] args) {
        //Multithreading
        Thread threadOne = new Thread(() -> {
            PrintSpoolerSingleton s = PrintSpoolerSingleton.getInstance();
        });
        Thread threadTwo = new Thread(() -> {
            PrintSpoolerSingleton s = PrintSpoolerSingleton.getInstance();
        });
        threadOne.start();
        threadTwo.start();

        //Singleton collection (set, list or map)
        PrintSpooler spooler = new PrintSpooler();
        List<PrintSpooler> spoolers = Collections.singletonList(spooler);//Immutable list containing a single object
    }
}