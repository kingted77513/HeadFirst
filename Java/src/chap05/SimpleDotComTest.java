package chap05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SimpleDotComTest {

	@Test
	void testCheckYourselfWhenHit() {
		DotCom dot = new DotCom();
		ArrayList<String> locations = createSimpleLocations();
        dot.setLocationCells(locations);
        
        String userGuess = "2";
        String excepted = "hit";
        String actual = dot.checkYourself(userGuess);
        
        assertEquals(excepted, actual);
	}

	private ArrayList<String> createSimpleLocations() {
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		return locations;
	}
	
	@Test
	void testCheckYourselfWhenMiss() {
		DotCom dot = new DotCom();
		ArrayList<String> locations = createSimpleLocations();
        dot.setLocationCells(locations);
        
        String userGuess = "5";
        String excepted = "miss";
        String actual = dot.checkYourself(userGuess);
        
        assertEquals(excepted, actual);
	}
	
	@Test
	void testCheckYourselfWhenKill() {
		DotCom dot = new DotCom();
		ArrayList<String> locations = createSingleLocations();
        dot.setLocationCells(locations);
        
        String userGuess = "2";
        String excepted = "kill";
        String actual = dot.checkYourself(userGuess);
        
        assertEquals(excepted, actual);
	}
	
	private ArrayList<String> createSingleLocations() {
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		return locations;
	}

}
