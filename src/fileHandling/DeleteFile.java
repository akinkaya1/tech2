package fileHandling;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {

        //Create a file

        File myLastFile = new File("fileToDelete.xls");

        try {
            if(myLastFile.createNewFile()){
                System.out.println(myLastFile.getName() + " created");
            }
            else{
                System.out.println(myLastFile.getName() + " is not created or already exists");
            }

            if(myLastFile.delete()){
                System.out.println(myLastFile.getName() + " is deleted");
            }
            else{
                System.out.println(myLastFile.getName() + " is not deleted");
            }

        } catch (IOException e) {
            System.out.println("Error = " + e.getMessage());
        }

    }
}
