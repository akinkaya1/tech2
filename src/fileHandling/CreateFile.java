package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        File myFirstFile = new File("myFirstFile.doc");
        try {
            myFirstFile.createNewFile();

            System.out.println("File name = " + myFirstFile.getName());
            System.out.println("File absolute path = " + myFirstFile.getAbsolutePath());
            System.out.println("File exists = " + myFirstFile.exists()); // true
            System.out.println("File reads = " + myFirstFile.canRead());
            System.out.println("File writes = " + myFirstFile.canWrite());
            System.out.println("Size is = " + myFirstFile.length());

        } catch (IOException e) {
            System.out.println("Error message = " + e.getMessage());
        }


        /*
            Create a new file called myExcelFile as xls file
            Print file name, absolute path, size, canRead, canWrite
            NOTE: Create it in src not in the project
         */

        File myExcelFile = new File("src/myExcelFile.xls");
        try{
            myExcelFile.createNewFile();
            System.out.println("File name is = " + myExcelFile.getName());
            System.out.println("Absolute path of the file is = " + myExcelFile.getAbsolutePath());
            System.out.println("Size is = " + myExcelFile.length());
            System.out.println("File readable = " + myExcelFile.canRead());
            System.out.println("File writable = " + myExcelFile.canWrite());
        }catch (IOException e){
            System.out.println("Error message = " + e.getMessage());
        }
    }
}
