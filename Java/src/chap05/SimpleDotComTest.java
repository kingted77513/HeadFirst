package chap05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleDotComTest {

	@Test
	void testCheckYourselfWhenHit() {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        
        String userGuess = "2";
        String excepted = "hit";
        String actual = dot.checkYourself(userGuess);
        
        assertEquals(excepted, actual);
	}
	
	@Test
	void testCheckYourselfWhenMiss() {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        
        String userGuess = "5";
        String excepted = "miss";
        String actual = dot.checkYourself(userGuess);
        
        assertEquals(excepted, actual);
	}
	
	@Test
	void testCheckYourselfWhenKill() {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2};
        dot.setLocationCells(locations);
        
        String userGuess = "2";
        String excepted = "kill";
        String actual = dot.checkYourself(userGuess);
        
        assertEquals(excepted, actual);
	}

}
