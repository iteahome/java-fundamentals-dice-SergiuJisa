import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestingDice {

    public static void main(String[] args) {
        int numberOfGirls = 0;
        int doubleOf_6 = 0;
        Random random = new Random();

        RollADie die = new RollADie(6);
        System.out.println("The initial value of die is: " + die.getFaceValue());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify number of throws");
        int numberOfThrows = scanner.nextInt();
        int[] randomNumbers = new int[numberOfThrows];

        for (int i = 0; i < numberOfThrows; i++) {
            randomNumbers[i] = random.nextInt(6) + 1;

            if (randomNumbers[i] == 6) {
                System.out.println("Congrats!!! You rolled a 6 Throw die again");
                doubleOf_6++;
            } else {
                System.out.println("Next person is throwing dice, and the value is " + randomNumbers[i]);
            }// end If-Else statement

            numberOfGirls++;
        }// enf for statement

        System.out.println("Face values of die are: " + Arrays.toString(randomNumbers));
        System.out.println("Number of girls who are playing this game is: " + (numberOfGirls - doubleOf_6));

        if (randomNumbers[numberOfThrows-1] == 6){
            System.out.println("Array is incomplete!!! Last girl should throw die again");
        }//Conditia pusa in momentul in care ultima cifra din array e 6
    }//End of Main Method
}//End of TestingDice Test Class
