package org.panfil.accessmodifiers.peopleevidence;

public class Person {

        // This property is class related - Class variable, it is private - it can be accessed within the Person
        private static int totalNumberOfPersonObjects;
        //IDNP The final key word describes a non access modifier, which means that this property will not be changed during the execution and it has to be initialized once the object is created
        private final long CNP;
        // Gender and name are instances variables becouse they describe objects at the calss.
        // Public means they can be accessed from anywhere in the project
        public String gender;
        public String name;
        public String address;
        // The protected property can be accessed only from classes that belong to the peopleevidence package and subclasses
        protected String phone;
        double height;
        // defaoult property can be accessed only from classes whick belong to the peopleevinde
        String eyeColor;
        double weight;
        String education;
        String nationality;
        boolean isMarried;
        String readingBook;
        String emailAddress;
        String occupation;
        // This is a instance variable and it is declared as private, it can be accessed from Person class
        private int age;

        // There is a constructor with only 1 parameter that is mandatory field
        public Person(long CNPobligatoriuLaCreare) {
            CNP = CNPobligatoriuLaCreare;
            totalNumberOfPersonObjects++;
        }

        // There is a constructor with ultiple parameter that is mandatory fields
        public Person(long CNP, String name, boolean isMarried, int age) {
            this.CNP = CNP;
            this.name = name;
            this.isMarried = isMarried;
            this.age = age;
            totalNumberOfPersonObjects++;
        }

        public static void printNUmberOfPeople() {
            System.out.println("Numarul total de persoane este: " + totalNumberOfPersonObjects);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    ", CNP=" + CNP +
                    ", address='" + address + '\'' +
                    ", phone='" + phone + '\'' +
                    ", height=" + height +
                    ", eyeColor='" + eyeColor + '\'' +
                    ", weight=" + weight +
                    ", education='" + education + '\'' +
                    ", nationality='" + nationality + '\'' +
                    ", isMarried=" + isMarried +
                    ", readingBook='" + readingBook + '\'' +
                    ", emailAddress='" + emailAddress + '\'' +
                    ", occupation='" + occupation + '\'' +
                    '}';
        }
    }

    /*    public void setAge(int imputAge){
        if(imputAge>0){
            if (imputAge<128) {
                this.age = imputAge;
                System.out.println("The age was set: " + imputAge);
            } else {
                System.out.println("Age is exceeded");
            }
        } else {
            System.out.println("The age can not be negative or 0");

        }
        this.age = imputAge;

    } */


