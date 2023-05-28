package org.panfil.zooclubservice;

public class Cat extends Animal implements Animalnterface{

    public Cat(String name) {
        super(name);
        System.out.println("A doua linie de cod");


    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "eats the mouse ");

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says meaw, meaw! ");

    }
}
