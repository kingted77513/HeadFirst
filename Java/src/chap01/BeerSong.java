package chap01;

public class BeerSong {
    public static void main(String[] args) {
        String word = "bottles";
        for (int beerNum = 99 ; beerNum >= 0 ; beerNum--) {
        	if (beerNum > 0) {
        		if (beerNum == 1) {
        			word = "bottle";
            	}
        		System.out.println(beerNum + " " + word + " of beer on the wall");
            	System.out.println("Take one down.");
                System.out.println("Pass it around.");
        	}else {
        		System.out.println("No more bottles of beer on the wall");
        	}
        }
    }
}