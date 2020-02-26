public class BarcodeFactory {

	BarcodeSerialGenerator barcodeGen = new BarcodeSerialGenerator();
	DestinationFactory desFactory = new DestinationFactory();
	
	public Barcode GenerateBarcode() {

		
		Barcode barcode; 
		barcode = new Barcode(barcodeGen.GetBarcode(), desFactory.Generate());

		return barcode;
	}
}
