package com.sbszc.edu.java.design.pattern.creational.prototype;

/*If creating multiple instances consumes too much memory resources, and their state is very similar,
it's better to clone an already existent object, than create a new one each time*/
public class RabbitField {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);
        rabbit.setOwner(new Person("Sally"));

        Rabbit rabbitCopy = rabbit.clone();
        rabbitCopy.getOwner().setName("Molly");//Changing mutable object inside copy

        System.out.printf("Age of first rabbit: %d%n", rabbit.getAge());
        System.out.printf("Age of clone rabbit: %d%n", rabbitCopy.getAge());
        System.out.printf("Owner of first rabbit: %s%n", rabbit.getOwner().getName());
        System.out.printf("Owner of clone rabbit: %s%n", rabbitCopy.getOwner().getName());
    }
}
