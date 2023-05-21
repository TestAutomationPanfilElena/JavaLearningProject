package org.panfil.accessmodifiers;

import org.panfil.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person elenaPanfil = new Person(2003698745l);
        elenaPanfil.address = "Ion Creanga 06";
        elenaPanfil.gender = "Femenin";


        System.out.println(elenaPanfil.toString());
        Person.printNUmberOfPeople();

        Person mihaiEminescu = new Person(221134, "Mihai Eminescu", false, 24);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Masculin";
        System.out.println("Detaliile despre Mihai Eminescu sunt: " + mihaiEminescu.name + "cu genul: " + mihaiEminescu.gender);
        System.out.println(mihaiEminescu.toString());
        Person.printNUmberOfPeople();

        Person mariaZubcu = new Person(147852, "Jorel Bautul", true, 40);
        mariaZubcu.gender = "Femenin";
        mariaZubcu.address = "Valea Dealului 04";
        System.out.println(mariaZubcu.toString());
        Person.printNUmberOfPeople();

        Person ionOnica = new Person(67890543, "Joqwer qweqrr", true, 456);
        ionOnica.gender = "Masculin";
        ionOnica.address = "Mihai Eminescu 4";
        System.out.println(ionOnica.toString());
        Person.printNUmberOfPeople();
    }
}
