package exceptionHandling.tryCatchBlocks;

import java.util.Map;
import java.util.TreeMap;

public class TryCatchPractice3 {
    public static void main(String[] args) {

        /*
        Create a TreeMap to store below data
        FirstName = Alex
        LastName = Robert
        PhoneNumber = +1 (312) 123-1234
        Address = Dallas TX
        Id = 123abcd
        null = 1234

        Try printing each entry using for each loop
        Catch any error and give message as "Error caught while processing data " + errorMessage
         */

        try{
            //1. Create TreeMap object
            Map<String, String> userInfo = new TreeMap<>();

            //2. put key value pairs in the created object
            userInfo.put("FirstName", "Alex");
            userInfo.put("LastName", "Robert");
            userInfo.put("PhoneNumber", "+1 (312) 123-1234");
            userInfo.put("Address", "Dallas TX");
            userInfo.put(null, "123");

            //3. print each key and value pair
            for(Map.Entry m: userInfo.entrySet()){
                System.out.println("Key = " + m.getKey() + " --- " + "Value = " + m.getValue());
            }
        }
        catch (Exception e){
            System.out.println("Error caught while processing data " + e.getMessage());
        }

        System.out.println("Rest of the tests");
    }
}
