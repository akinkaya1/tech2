package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        File myTextFile = new File("myTextFile.txt");
        File myWordFileToWrite = new File("myWordFileToWrite.doc");

        try {
            FileWriter fileWriter = new FileWriter("myTextFile.txt");
            fileWriter.write("Maryna");
            fileWriter.write("\nYasser");
            fileWriter.write("\nRaqi Smith");
            fileWriter.write("\nSarah");
            fileWriter.write("\nSalih");
            fileWriter.close(); // save

            FileWriter fileWriter2 = new FileWriter("myWordFileToWrite.doc");
            fileWriter2.write("Hello this is word document");
            fileWriter2.close();

            System.out.println("Size of the word document = " + myWordFileToWrite.length());

        } catch (IOException e) {
            System.out.println("Error message = " + e.getMessage());
        }
    }
}
