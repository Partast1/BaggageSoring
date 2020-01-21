import java.util.Random;

public class FlightNumberGenerator {

	
	public int getRandomNumber() {
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);
	    String text = String.format("%06d", number);
	    int finalNumber = Integer.parseInt(text);
	    
	    // this will convert any number sequence into 6 character.
	    return  finalNumber;
	}
	
}
