package chap05;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args)
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        
        ArrayList<String> locations = creatLocations(randomNum);
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            System.out.println("Result: " + result);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }

	private static ArrayList<String> creatLocations(int randomNum) {
		ArrayList<String> locations = new ArrayList<String>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum+1));
        locations.add(String.valueOf(randomNum+2));
		return locations;
	}
}
