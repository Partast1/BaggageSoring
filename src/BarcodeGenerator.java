import java.util.Random;

public class BarcodeGenerator {

	public int GetBarcode() {

	    Random rnd = new Random();
	    int number = rnd.nextInt(99999999);
	    String text = String.format("%06d", number);
	    int finalNumber = Integer.parseInt(text);

	    return  finalNumber;
		
	}
}
