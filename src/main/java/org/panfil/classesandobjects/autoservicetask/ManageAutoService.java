package org.panfil.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage garajulLuiAndrei = new Garage("Lunca Nistrului");
        System.out.println("Adresa garajului lui Andrei este" + garajulLuiAndrei.address);
        garajulLuiAndrei.carCapacity = 322;
        garajulLuiAndrei.hasComputerDiagnostics = true;
        garajulLuiAndrei.numberId = 011;
        garajulLuiAndrei.scheduler = "Luni,Miercuri Vineri";

        System.out.println("Garajul lui Andrei are urmatoarele proprietari: Adresa:" + garajulLuiAndrei.address +
                "CarCapacity: " + garajulLuiAndrei.carCapacity + "NumberId:" + garajulLuiAndrei.numberId +
                " Orarul de luctu:" + garajulLuiAndrei.scheduler + ",hasComputerDiagnostics:" + garajulLuiAndrei.hasComputerDiagnostics);
        System.out.println("-------------------------------------------------------------------------------------------------------");

        Garage garajulLuiGheorghe = new Garage("Lunca Prutului");
        System.out.println("Adresa garajului lui Gheorhge este" + garajulLuiGheorghe.address);
        garajulLuiGheorghe.carCapacity = 699;
        garajulLuiGheorghe.hasComputerDiagnostics = false;
        garajulLuiGheorghe.numberId = 221001;
        garajulLuiGheorghe.scheduler = "Marti,Joi , Simbata ";

        System.out.println("Garajul lui Gheorghe are urmatoarele proprietari: Adresa: " + garajulLuiGheorghe.address +
                "CarCapacity: " + garajulLuiGheorghe.carCapacity + " NumberId:" + garajulLuiGheorghe.numberId +
                "Orarul de luctu: " + garajulLuiGheorghe.scheduler + ",hasComputerDiagnostics: " + garajulLuiGheorghe.hasComputerDiagnostics);

        System.out.println("-------------------------------------------------------------------------------------------------------");

        Garage garajulLuiElenii = new Garage(355);
        garajulLuiElenii.address = "Burebista 45";
        garajulLuiElenii.hasComputerDiagnostics = true;
        garajulLuiElenii.numberId = 221001;
        garajulLuiElenii.scheduler = "Marti,Joi , Duminica ";

        System.out.println("Garajul lui Elena are urmatoarele proprietari: Adresa:" + garajulLuiElenii.address +
                "CarCapacity: " + garajulLuiElenii.carCapacity + "NumberId:" + garajulLuiElenii.numberId +
                "Orarul de luctu:" + garajulLuiElenii.scheduler + "hasComputerDiagnostics:" + garajulLuiElenii.hasComputerDiagnostics);

        System.out.println("Capacitatea garagului elenei" + garajulLuiElenii.carCapacity);

        System.out.println("-------------------------------------------------------------------------------------------------------");
        Car masinaLuiIuliana = new Car("Mercedes", "GLE Class", 2022, "Disel");

        masinaLuiIuliana.carPrice = 50500;
        masinaLuiIuliana.km = 6000000;
        masinaLuiIuliana.gearType = "Automata";
        System.out.println("Masina lui Iulian are probleme si proprietati: Make" + masinaLuiIuliana.make + " , Model:" +
                masinaLuiIuliana.model + " Production year: " + masinaLuiIuliana.productionYear + ", Fueltype:" +
                ", carPrice: " + masinaLuiIuliana.carPrice + " , KM: " + masinaLuiIuliana.km + " , gearType: + " + masinaLuiIuliana.gearType);
        System.out.println("-------------------------------------------------------------------------------------------------------");


        Tool elevatorTool = new Tool(236598745);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;
        System.out.println(" Obiectul Elevator are prioritatiile: "
                + "Cod Unic: " + elevatorTool.uniquieCode
                + "Este Elevator: " + elevatorTool.isElevator
                + "Foloseste electricitate: " + elevatorTool.needsElectricity
                + "Este Utilizat: " + elevatorTool.isUsed);


        Worker lucratorulGavril = new Worker();
        lucratorulGavril.name = "Pavel";
        lucratorulGavril.age = 45;
        lucratorulGavril.isExperinced = true;
        lucratorulGavril.sexType = "Masculin";
        lucratorulGavril.specialization = "Electric Auto";

        System.out.println(" Obiectul lucratorulPavel are prioritatiile: "
                + "Nume: " + lucratorulGavril.name
                + "Virsta : " + lucratorulGavril.age
                + "Are Experienta : " + lucratorulGavril.isExperinced
                + "Sex Type : " + lucratorulGavril.sexType
                + "Specializare : " + lucratorulGavril.specialization);


    }
}
