
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {

    Random randomNumber = new Random();

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomTable = new ArrayList<>();

        for(int i=0;i<10;i++){
            randomTable.add(randomNumber.nextInt(20)+1);
        }

        return randomTable;
    }

    // 1- Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).
    // 2- Generate a random index between 0-25 and use it to pull a random letter out of the array.
    // 3- Return the random letter.

    public char getRandomLetter(){
        char [] letters = new char[26];

        for(int i=0;i<letters.length;i++){
            letters[i]=(char)('A'+i);

        }

       return letters[randomNumber.nextInt(26)];

    }

    // Write a method that uses the previous method  getRandomLetter to create a random string of eight characters and return that string.

    public String generatePassword(){
        String password = "";
        for (int i=0;i<8;i++){
            password+=getRandomLetter();
        }
        return   password;
    }

    // Write a method that takes an int length as an argument and creates an array of random eight-character words.
    // The array should be the length passed in as an int. Return the array of passwords.

    public String[] getNewPasswordSet(int sizeOfArray){
        String[] arrayOfPassword= new String[sizeOfArray];
        for(int i=0;i<arrayOfPassword.length;i++){
            arrayOfPassword[i]=generatePassword();
        }
        return arrayOfPassword;
    }

    //SENSEI BONUS:
    //shuffleArray
    //Write a method that takes an array and mixes up all the values in a pseudo-random way.
    // we use Generics <T> to pass as parameter any type of array

    public <T> void shuffleArray(T[] array){

        System.out.printf("Original Array: %s \n", Arrays.toString(array));

        for(int i=0;i< array.length;i++){
            int randomIndex = randomNumber.nextInt(array.length);
            T temp = array[i];
            array[i]=array[randomIndex];
            array[randomIndex]=temp;

        }
        System.out.printf("Shuffled Array : %s \n",Arrays.toString(array));

    }








    //Shuffle an Array Using Fisher Yates Method

    public <T> void shuffleArrayFisherYates(T[] array){

        System.out.printf("Original Array: %s \n", Arrays.toString(array));

        for(int i= array.length-1;i>0;i--){
            int randomIndex = randomNumber.nextInt(i+1);
            T temp = array[i];
            array[i]=array[randomIndex];
            array[randomIndex]=temp;

        }
        System.out.printf("Shuffled Array : %s \n",Arrays.toString(array));

    }





}
