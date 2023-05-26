package org.panfil.methodstask;

public class ExecutionsService {
    public static void main(String[] args) {


        int randomInt = DataGeneratorUtil.getRandomInt(250, 450);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(250);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(5));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer ionConsumer = new Customer("Ion", 21, "ION@gmail.com");

        System.out.println("Nume obiect Ion:" + ionConsumer.getName());
        System.out.println("Varsta obiect Ion:" + ionConsumer.getAge());
        System.out.println("Email obiect Ion:" + ionConsumer.getEmail());

        ionConsumer.SetName("Ion Brotacel");
        ionConsumer.setAge(27);
        ionConsumer.setEmail("boss.ion@gmail.com");

        System.out.println("Nume obiect Ion: " + ionConsumer.getName());
        System.out.println("Varsta obiect Ion: " + ionConsumer.getAge());
        System.out.println("Email obiect Ion: " + ionConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),
                DataGeneratorUtil.getRandomInt(127), DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.SetName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());
    }

}


