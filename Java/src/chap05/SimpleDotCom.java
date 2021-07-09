package chap05;

import java.util.ArrayList;

public class SimpleDotCom {
	private ArrayList<String> locationCells;
	int numOfHits;
	
	String checkYourself(String userInput) {
		String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            }
            else
            {
                result = "hit";
            }
        }
        return result;
	}
	
	void setLocationCells(ArrayList<String> loc) {
		this.locationCells = loc;
	}

}
