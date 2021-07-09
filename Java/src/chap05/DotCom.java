package chap05;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	int numOfHits;
	private String name;
	
	public void setName(String string) {
        name = string;
    }
	
	void setLocationCells(ArrayList<String> loc) {
		this.locationCells = loc;
	}
	
	String checkYourself(String userInput) {
		String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : (");
            }
            else
            {
                result = "hit";
            }
        }
        return result;
	}
}
