import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class TestPuzzleJava {

    public static void main(String[] args) {
        // create an instance of class PuzzleJava
        PuzzleJava generator = new PuzzleJava();

        // #################################### App Test Cases ##############################

        System.out.println("\n-----An array with 10 random numbers between 1 and 20 inclusive---");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);


        System.out.println("-----Random letter ---");

        System.out.printf(" Letter for random index of letters table: %c \n\n",generator.getRandomLetter());


        System.out.println("-----generate Password ---");
        System.out.printf("password : %s \n\n",   generator.generatePassword());




        System.out.println("-----generate array of Passwords ---");

        int sizeOfArray = 10;
        String[] passwords = generator.getNewPasswordSet(sizeOfArray);


        System.out.printf("Array of %d passwords : %s \n\n",sizeOfArray,Arrays.toString(passwords));


        // Shuffle array

        String[] stringArray = {"aaa","bbb","ccc","ddd","eee","fff","ggg"};
        Integer [] numbersArray = {1,2,3,4,5,6,7,8,9};


        System.out.println("------------------------Shuffle array -------------------------");


        generator.shuffleArray(stringArray);
        generator.shuffleArray(numbersArray);


        // Shuffle with Fisher Yates Method
        System.out.println("------------------------Shuffle array Fisher Yates-------------------------");


        generator.shuffleArrayFisherYates(stringArray);
        generator.shuffleArrayFisherYates(numbersArray);










    }
}
