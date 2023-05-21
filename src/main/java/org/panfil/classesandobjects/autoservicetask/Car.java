package org.panfil.classesandobjects.autoservicetask;

public class Car {

    int km;
    String gearType;
    String make;
    String model;
    int productionYear;
    double carPrice;
    String fuelType;

    Car(String makeParametruDeIntrare, String modelFormalParameter, int productionYear, String fuelType) {
        make = makeParametruDeIntrare;
        model = modelFormalParameter;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        System.out.println("In urma executii acestor construtori cu 4 parametrii " +
                "se creaza un nou obiect despre care nu cunoastem price gearType, km");
    }
        Car(String make, String model) {
        this.model = model;
        this.make = make;
            System.out.println("A fost creat o masina despre " +
                    "care cunoastem marca si model");
        }





    }


