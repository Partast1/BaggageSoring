
public class BaggageFactory {

	public Baggage GenerateBaggage() {
		BarcodeFactory barcodeF = new BarcodeFactory();
		Baggage bag = new Baggage(barcodeF.GenerateBarcode());
		return bag;
		
	}
}
