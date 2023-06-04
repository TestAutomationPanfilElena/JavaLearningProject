package org.panfil.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {

        File demoFile = new File("C:\\Users\\EPanfil\\IdeaProjects\\JavaLearningProject\\src\\main\\java\\org\\panfil\\filemanagementservice\\test.txt");

        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
//        FileManager.deleteTheFileIfExists(demoFile);

        InputFileReadManager.readDataFromATextFile(demoFile);
        InputFileReadManager.readDataFromATextFileUsingFileReader(demoFile);
        System.out.println();
        InputFileReadManager.readDataFromATextFileUsingBufferedReader(demoFile);

        String contentForTheFile = "New Content for big bosses /n ";
        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, "test");
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Another Text");


    }
}




