package string;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        String sentencePart1 = “I can”;
        String sentencePart2 = “learn Java”;
        NOTE: Use concat() method for concatenation

        PSEUDO CODE
        Create 2 variables to store given data
        Then concatenate them using concat() method and print the result
        RESULT: I can learn Java
         */

        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";

        String sentence = sentencePart1.concat(" " + sentencePart2);

        System.out.println(sentence);

    }
}
