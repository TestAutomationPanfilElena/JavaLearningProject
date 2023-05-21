package org.panfil.classesandobjects.autoservicetask;

public class Garage {
    String address;
    boolean hasComputerDiagnostics;
    int carCapacity;
    int numberId;
    String scheduler;

Garage(String adresaDataLaCreare) {
    this.address = adresaDataLaCreare;
    System.out.println("A fost creat un garaj");
}

    Garage(int carCapacity){
this.carCapacity = carCapacity;
    }
}




