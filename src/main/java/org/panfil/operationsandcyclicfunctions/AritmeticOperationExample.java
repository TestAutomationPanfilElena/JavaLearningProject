package org.panfil.operationsandcyclicfunctions;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        int a = 60;
        int c = 3;

        //SUM
        int sum = a + c;
        System.out.println("Suma: " + sum);
        System.out.println("Suma: " + (a + c));

        //Substraction
        int sub = a - c;
        System.out.println("Rezultatul: " + sub);

        //Multiplication
        int result = a * c;
        System.out.println("Inmultirea: " + result);

        //Devision
        result = a / c;
        System.out.println("Impartirea: " + result);

        //The rest of devision
        result = a % c;
        System.out.println("Impartirea cu rest: " + result);
    }
}