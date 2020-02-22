
public class Baggage {
	Barcode barcode; 
	private int weight;
	
	
//	public Baggage() {
//		this.weight = 0;
//	}
	public Baggage(Barcode Bar)
	{
		barcode = Bar;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
