package chap05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleDotComTest {

	@Test
	void testCheckYourself() {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        
        int userGuess = 2;
        String excepted = "hit";
        String actual = dot.checkYourself(userGuess);
        
        assertEquals(excepted, actual);
	}

}
