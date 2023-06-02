package org.panfil.zooclubservice;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);

    }

    public void eat() {
        System.out.println(this.getName() + " eats pidigri! ");


    }

    public void makeSound() {
        System.out.println(getName() + " Ham Ham Bau Bau ");

    }
}