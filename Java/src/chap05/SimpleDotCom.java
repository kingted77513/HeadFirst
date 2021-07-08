package chap05;

public class SimpleDotCom {
	private int[] locationCells;
	int numOfHits;
	
	String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell: locationCells)
        {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length)
        {
            result = "kill";
        }
        return result;
	}
	
	void setLocationCells(int[] loc) {
		this.locationCells = loc;
	}

}
