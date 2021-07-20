package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*
        TASK
        Create a new txt file called objects
        Write below data in it
            Computer
            Phone
            Table
            Chair
            Mouse
            Screen
            Remote

        Print objects that has r or R as a letter

        EXPECTED OUTPUT
        Computer
        Chair
        Screen
        Remote
         */

        File file = new File("objects.txt");

        try {
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("Computer");
            fileWriter.write("\nPhone");
            fileWriter.write("\nTable");
            fileWriter.write("\nChair");
            fileWriter.write("\nMouse");
            fileWriter.write("\nScreen");
            fileWriter.write("\nRemote");
            fileWriter.close();

            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String nextObject = scanner.nextLine();
                if(nextObject.toLowerCase().contains("r")){
                    System.out.println(nextObject);
                }
            }

            scanner.close();


        } catch (IOException e) {
            System.out.println("Error = " + e.getMessage());
        }
    }
}
