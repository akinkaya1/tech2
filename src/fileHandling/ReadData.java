package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {

        /*
        1. create a new txt file called studentsList
        2. Write all student names below
        Alex
        allen
        Mike
        Tom
        Jane
         */

        File file = new File("studentsList.txt");
        try{
            FileWriter txtWriter = new FileWriter("studentsList.txt");
            txtWriter.write("Alex");
            txtWriter.write("\nallen");
            txtWriter.write("\nMike");
            txtWriter.write("\nTom");
            txtWriter.write("\nJane");
            txtWriter.close();

            //How to read data from the created file
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        }catch (IOException e){
            System.out.println("Error!!! The reason is = " + e.getMessage());
        }


    }
}
