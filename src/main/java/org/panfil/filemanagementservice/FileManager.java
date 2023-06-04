package org.panfil.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    //Conține 6 metode statice care primesc în calitate de parametru formal un obiect de tip File:
    //createTheFileIdItDoesNotExist(File file).

    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");

        } else {
            System.out.println("The file does not exist, it has to be created");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("The is an exception: " + e.getMessage());

            }
        }
    }

    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present ");
        } else {
            System.out.println("The file is not present");
        }
    }

    public static void printTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    public static void printTheFileAbsolutePath(File file) {
        System.out.println("The file absolute path: " + file.getAbsoluteFile());
    }

    public static void printIfTheFileIsADirectory(File inputFile) {
        System.out.println("The file is a directory: " + inputFile.isDirectory());

        if (inputFile.isDirectory()) {
            System.out.println("This is a Directory");
        } else {
            System.out.println("This is an uknown");
        }
    }

    public static void deleteTheFileIfExists(File inputFile) {
        if (inputFile.exists()) {
            inputFile.delete();
            System.out.println("The file was deleted");
        } else {
            System.out.println("The file does not exist");
        }
    }

}





