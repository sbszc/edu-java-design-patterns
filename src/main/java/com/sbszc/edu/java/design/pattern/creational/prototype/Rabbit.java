package com.sbszc.edu.java.design.pattern.creational.prototype;

public class Rabbit implements Cloneable {

    private int age;
    private Breed breed;
    private Person owner;

    public Rabbit() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    protected Rabbit clone() {
        try {
            Rabbit rabbit = (Rabbit) super.clone();
            rabbit.owner = owner.clone(); //Mutable properties also have to be cloned
            return rabbit;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }
}
