package org.panfil.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
       Animal charlieDog = new Dog("Charlie");

        System.out.println("Numele obiectului charlieDog este : " + charlieDog.getName());
        charlieDog.setName("Charlie Vaccined ");
        System.out.println("Numele actualizat a lui charlieDog este: " + charlieDog.getName());

        charlieDog.eat();
        charlieDog.makeSound();

        Animalnterface rexDog = new Dog("Rex");
        rexDog.makeSound();


        Dog zikDog = new Dog("Zik");
        zikDog.eat();
        zikDog.makeSound();

        System.out.println("Start Execution");
        Cat mitzaPisiPisi = new Cat("Mitza");
        System.out.println("A 3-a linie de cod ");
        mitzaPisiPisi.eat();
        mitzaPisiPisi.makeSound();


    }
}
