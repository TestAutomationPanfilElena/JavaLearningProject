package org.panfil.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] tablouDeDateInt = {1, 2, 3, 4, 8, 1, 8, 9, 5, 0, 5, 9, 5, 9, 10,11,45,22,};

        System.out.println(IntArrayManager.getTheMinValueOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheMinValueIndexOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheAverageOfTheElements(tablouDeDateInt));
    }
}