import java.util.Random;

public class RollADie {
    private int numberOfSides;
    private int faceValue;

    public RollADie(int numOfSides){
        numberOfSides = numOfSides;
        Random randomFace = new Random();
        faceValue = randomFace.nextInt(numberOfSides)+1;
    }

    public void rollDice(){
        Random randomFace = new Random();
        faceValue = randomFace.nextInt(numberOfSides) + 1;
    } //end of rollDice method

    public int getFaceValue(){
        return faceValue;
    } // end of getFaceValue method
} // end of RollADie Class

